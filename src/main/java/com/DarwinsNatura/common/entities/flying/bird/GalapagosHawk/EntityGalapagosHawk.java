package com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk;

import com.DarwinsNatura.common.entities.flying.bird.EntityBirdBase;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.google.common.base.Predicate;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityGalapagosHawk extends EntityBirdBase{
	
	private boolean hunting=true;
	
	public EntityGalapagosHawk(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 0.6F);
	}
	
    public boolean isHunting() {
		return hunting;
	}

	public void setHunting(boolean hunting) {
		this.hunting = hunting;
	}

	@Override
	public void onLivingUpdate() {
		double distance2 = 20.0D;
	    Entity entityFound2 = null;
	    
	    double d4 = -1.0D;
	    for (int i = 0; i < this.world.loadedEntityList.size(); i++)
	    {
	      Entity CuEnt = (Entity)this.world.loadedEntityList.get(i);
	        
	      if (((CuEnt instanceof Entity)) && (CuEnt != this)) {
	        double d5 = CuEnt.getDistanceSq(this.posX, this.posY, this.posZ);
	          
	        if (((distance2 < 0.0D) || (d5 < distance2 * distance2)) && ((d4 == -1.0D) || (d5 < d4)))
	        {
	          d4 = d5;
	          entityFound2 = CuEnt;
	        }
	      }
	    }
	    
	    if (isChild()==false)
	    {
	      if (entityFound2 instanceof EntityGalapagosRiceRat) {
	  		this.setHunting(true);
	  	    this.getNavigator().tryMoveToXYZ(entityFound2.posX, entityFound2.posY, entityFound2.posZ, this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue() * 4.0D);
	      }
	      else{
		    this.setHunting(false);
		  }
	    }
		super.onLivingUpdate();
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.stand=true;
		return super.attackEntityFrom(source, amount);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityGalapagosHawk(this.world);
	}
}
