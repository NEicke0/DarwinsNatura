package com.DarwinsNatura.common.entities.terrestrial.rodent;

import com.DarwinsNatura.common.entities.EntityGender;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityRodentBase extends EntityGender {
	private static final DataParameter<Byte> CLIMBING = EntityDataManager.<Byte>createKey(EntitySpider.class,
			DataSerializers.BYTE);

	public EntityRodentBase(World worldIn) {
		super(worldIn);
	}
	
	@Override
	public float getEyeHeight() {
		return this.height;
	}

	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(CLIMBING, Byte.valueOf((byte) 0));
	}

	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 0.30D));
		this.tasks.addTask(2, new EntityAIMate(this, 0.26D));
		this.tasks.addTask(3, new EntityAIFollowParent(this, 0.27D));
		this.tasks.addTask(4, new EntityAIWanderAvoidWater(this, 0.26D));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
		this.tasks.addTask(7, new EntityAIAvoidEntity<EntityPlayer>(this, EntityPlayer.class, 10.0F, 0.30D, 0.30D));
	}

	public void onUpdate() {
		super.onUpdate();

		if (!this.world.isRemote) {
			this.setBesideClimbableBlock(this.collidedHorizontally);
		}
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

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityRodentBase(this.world);
	}

}
