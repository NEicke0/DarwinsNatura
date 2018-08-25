package com.DarwinsNatura.common.entities.ai;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIDoorInteract;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityAIEatWheat extends EntityAIBase{
	 private static final Predicate<IBlockState> IS_WHEAT = BlockStateMatcher.forBlock(Blocks.WHEAT);
	    /** The entity owner of this AITask */
	    private final EntityLiving wheatEaterEntity;
	    /** The world the grass eater entity is eating from */
	    private final World entityWorld;
	    /** Number of ticks since the entity started to eat grass */
	    int eatingWheatTimer;

	    public EntityAIEatWheat(EntityLiving grassEaterEntityIn)
	    {
	        this.wheatEaterEntity = grassEaterEntityIn;
	        this.entityWorld = grassEaterEntityIn.world;
	        this.setMutexBits(7);
	    }

	    /**
	     * Returns whether the EntityAIBase should begin execution.
	     */
	    public boolean shouldExecute()
	    {
	        if (this.wheatEaterEntity.getRNG().nextInt(this.wheatEaterEntity.isChild() ? 50 : 1000) != 0)
	        {
	            return false;
	        }
	        else
	        {
	            BlockPos blockpos = new BlockPos(this.wheatEaterEntity.posX, this.wheatEaterEntity.posY, this.wheatEaterEntity.posZ);

	            if (IS_WHEAT.apply(this.entityWorld.getBlockState(blockpos)))
	            {
	                return true;
	            }
	            else
	            {
	                return this.entityWorld.getBlockState(blockpos.down()).getBlock() == Blocks.WHEAT;
	            }
	        }
	    }

	    /**
	     * Execute a one shot task or start executing a continuous task
	     */
	    public void startExecuting()
	    {
	        this.eatingWheatTimer = 40;
	        this.entityWorld.setEntityState(this.wheatEaterEntity, (byte)10);
	        this.wheatEaterEntity.getNavigator().clearPath();
	    }

	    /**
	     * Reset the task's internal state. Called when this task is interrupted by another one
	     */
	    public void resetTask()
	    {
	        this.eatingWheatTimer = 0;
	    }

	    /**
	     * Returns whether an in-progress EntityAIBase should continue executing
	     */
	    public boolean shouldContinueExecuting()
	    {
	        return this.eatingWheatTimer > 0;
	    }

	    /**
	     * Number of ticks since the entity started to eat grass
	     */
	    public int getEatingWheatTimer()
	    {
	        return this.eatingWheatTimer;
	    }

	    /**
	     * Keep ticking a continuous task that has already been started
	     */
	    public void updateTask()
	    {
	        this.eatingWheatTimer = Math.max(0, this.eatingWheatTimer - 1);

	        if (this.eatingWheatTimer == 4)
	        {
	            BlockPos blockpos = new BlockPos(this.wheatEaterEntity.posX, this.wheatEaterEntity.posY, this.wheatEaterEntity.posZ);

	            if (IS_WHEAT.apply(this.entityWorld.getBlockState(blockpos)))
	            {
	                if (net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.entityWorld, this.wheatEaterEntity))
	                {
	                    this.entityWorld.destroyBlock(blockpos, false);
	                }

	                this.wheatEaterEntity.eatGrassBonus();
	            }
	            else
	            {
	                BlockPos blockpos1 = blockpos.down();

	                if (this.entityWorld.getBlockState(blockpos1).getBlock() == Blocks.WHEAT)
	                {
	                    if (net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.entityWorld, this.wheatEaterEntity))
	                    {
	                        this.entityWorld.playEvent(2001, blockpos1, Block.getIdFromBlock(Blocks.WHEAT));
	                        this.entityWorld.setBlockState(blockpos1, Blocks.FARMLAND.getDefaultState(), 2);
	                    }

	                    this.wheatEaterEntity.eatGrassBonus();
	                }
	            }
	        }
	    }
	}

 