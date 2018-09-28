package com.DarwinsNatura.common.entities.terrestrial.tortoise;

import java.util.Set;

import com.DarwinsNatura.common.entities.EntityGender;
import com.DarwinsNatura.common.entities.ai.EntityAIEatWheat;
import com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.EntityGalapagosHawk;
import com.google.common.collect.Sets;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityTortoiseBase extends EntityGender {
	private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(Items.WHEAT_SEEDS, Items.MELON_SEEDS,
			Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS, Items.WHEAT);
	
	public EntityTortoiseBase(World worldIn) {
		super(worldIn);
	}

	@Override
	public float getEyeHeight() {
		return this.height;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.15D);
	}

	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.3D));
		this.tasks.addTask(2, new EntityAIMate(this, 1D));
		this.tasks.addTask(3, new EntityAIFollowParent(this, 1.1D));
		this.tasks.addTask(4, new EntityAIWanderAvoidWater(this, 1D));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityVillager.class, 6.0F));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityWolf.class, 6.0F));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityOcelot.class, 6.0F));
		this.tasks.addTask(0, new EntityAIAvoidEntity<EntityPlayer>(this, EntityPlayer.class, 10.0F, 1D, 1D));
		this.tasks.addTask(0, new EntityAIAvoidEntity<EntityVillager>(this, EntityVillager.class, 10.0F, 1D, 1D));
		this.tasks.addTask(0, new EntityAIAvoidEntity<EntityWolf>(this, EntityWolf.class, 10.0F, 1D, 1D));
		this.tasks.addTask(0, new EntityAIAvoidEntity<EntityOcelot>(this, EntityOcelot.class, 10.0F, 1D, 1D));
		this.tasks.addTask(0, new EntityAIAvoidEntity<EntityOcelot>(this, EntityOcelot.class, 10.0F, 1D, 1D));
		this.tasks.addTask(0, new EntityAIAvoidEntity<EntityGalapagosHawk>(this, EntityGalapagosHawk.class, 4.0F, 1D, 1D));
		this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(8, new EntityAITempt(this, 1.0D, false, TEMPTATION_ITEMS));
		this.tasks.addTask(4, new EntityAIMoveIndoors(this));
		this.tasks.addTask(1, new EntityAIEatWheat(this));
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityTortoiseBase(this.world);
	}

}
