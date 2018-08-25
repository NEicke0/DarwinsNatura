package com.DarwinsNatura.common.entities.terrestrial.rodent;

import java.util.Set;

import com.DarwinsNatura.common.entities.EntityGender;
import com.DarwinsNatura.common.entities.ai.EntityAIEatWheat;
import com.google.common.collect.Sets;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHarvestFarmland;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityRodentBase extends EntityGender {
	private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(Items.WHEAT_SEEDS, Items.MELON_SEEDS,
			Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS, Items.BREAD, Items.EGG, Items.CHICKEN, Items.COOKED_CHICKEN);
	private static final DataParameter<Byte> CLIMBING = EntityDataManager.<Byte>createKey(EntityRodentBase.class,
			DataSerializers.BYTE);
	private final InventoryBasic rodentInventory;

	public EntityRodentBase(World worldIn) {
		super(worldIn);
		this.rodentInventory = new InventoryBasic("Items", false, 8);
	}

	@Override
	public float getEyeHeight() {
		return this.height;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1D);
	}

	public void entityInit() {
		super.entityInit();
		this.dataManager.register(CLIMBING, Byte.valueOf((byte) 0));
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < this.rodentInventory.getSizeInventory(); ++i) {
			ItemStack itemstack = this.rodentInventory.getStackInSlot(i);

			if (!itemstack.isEmpty()) {
				nbttaglist.appendTag(itemstack.writeToNBT(new NBTTagCompound()));
			}
		}

		compound.setTag("Inventory", nbttaglist);
	}

	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 0.30D));
		this.tasks.addTask(2, new EntityAIMate(this, 0.26D));
		this.tasks.addTask(3, new EntityAIFollowParent(this, 0.27D));
		this.tasks.addTask(4, new EntityAIWanderAvoidWater(this, 0.26D));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityVillager.class, 6.0F));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityWolf.class, 6.0F));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityOcelot.class, 6.0F));
		this.tasks.addTask(0, new EntityAIAvoidEntity<EntityPlayer>(this, EntityPlayer.class, 10.0F, 0.30D, 0.30D));
		this.tasks.addTask(0, new EntityAIAvoidEntity<EntityVillager>(this, EntityVillager.class, 10.0F, 0.30D, 0.30D));
		this.tasks.addTask(0, new EntityAIAvoidEntity<EntityWolf>(this, EntityWolf.class, 10.0F, 0.30D, 0.30D));
		this.tasks.addTask(0, new EntityAIAvoidEntity<EntityOcelot>(this, EntityOcelot.class, 10.0F, 0.30D, 0.30D));
		this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(8, new EntityAITempt(this, 1.0D, false, TEMPTATION_ITEMS));
		this.tasks.addTask(4, new EntityAIMoveIndoors(this));
		this.tasks.addTask(1, new EntityAIEatWheat(this));
	}

	public void onUpdate() {
		super.onUpdate();

		if (!this.world.isRemote) {
			this.setBesideClimbableBlock(this.collidedHorizontally);
		}
	}

	public void fall(float distance, float damageMultiplier) {
	}

	public boolean isOnLadder() {
		return this.isBesideClimbableBlock();
	}

	public boolean isBesideClimbableBlock() {
		return (((Byte) this.dataManager.get(CLIMBING)).byteValue() & 1) != 0;
	}

	public void setBesideClimbableBlock(boolean climbing) {
		byte b0 = ((Byte) this.dataManager.get(CLIMBING)).byteValue();

		if (climbing) {
			b0 = (byte) (b0 | 1);
		} else {
			b0 = (byte) (b0 & -2);
		}

		this.dataManager.set(CLIMBING, Byte.valueOf(b0));
	}

	protected void updateEquipmentIfNeeded(EntityItem itemEntity) {
		ItemStack itemstack = itemEntity.getItem();
		Item item = itemstack.getItem();

		if (this.canRodentPickupItem(item)) {
			ItemStack itemstack1 = this.rodentInventory.addItem(itemstack);

			if (itemstack1.isEmpty()) {
				itemEntity.setDead();
			} else {
				itemstack.setCount(itemstack1.getCount());
			}
		}
	}

	private boolean canRodentPickupItem(Item itemIn) {
		return itemIn == Items.BREAD || itemIn == Items.POTATO || itemIn == Items.CARROT || itemIn == Items.WHEAT
				|| itemIn == Items.WHEAT_SEEDS || itemIn == Items.BEETROOT || itemIn == Items.BEETROOT_SEEDS
				|| itemIn == Items.EGG;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityRodentBase(this.world);
	}

}
