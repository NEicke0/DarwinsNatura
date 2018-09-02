package com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat;

import com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.EntityGalapagosHawk;
import com.DarwinsNatura.common.entities.terrestrial.rodent.EntityRodentBase;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityGalapagosRiceRat extends EntityRodentBase{

	public EntityGalapagosRiceRat(World worldIn) {
		super(worldIn);
		this.setSize(0.2F, 0.2F);
	}
	
	@Override
	public void onLivingUpdate() {
		double distance2 = 1.0D;
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
	      if (entityFound2 instanceof EntityGalapagosHawk) {
	    	 entityFound2.startRiding(this);
	 		 this.attackEntityFrom(DamageSource.DROWN, 0.25F);
	      }
	    }
		super.onLivingUpdate();
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityGalapagosRiceRat(this.world);
	}
}
