package com.DarwinsNatura.common.entities.aquatic.bird;

import com.DarwinsNatura.common.entities.EntityGender;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityPenguinBase extends EntityGender {

	public EntityPenguinBase(World worldIn) {
		super(worldIn);
		setPathPriority(net.minecraft.pathfinding.PathNodeType.WATER, 0.0F);
	}

	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1D));
		this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAIFollowParent(this, 1.1D));
		this.tasks.addTask(4, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(5, new EntityAIAvoidEntity<EntityPlayer>(this, EntityPlayer.class, 10.0F, 0.30D, 0.30D));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));

	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(7.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30D);
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (this.isInWater()) {
			this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.9D);
		}
	}
	
    public boolean isPushedByWater()
    {
        return false;
    }

	public boolean canBreatheUnderwater() {
		return true;
	}

}
