package com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk;

import com.DarwinsNatura.common.entities.flying.bird.EntityBirdBase;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.util.handlers.SoundHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathFinder;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityGalapagosHawk extends EntityBirdBase{
	
	private static final DataParameter<Boolean> HUNTING = EntityDataManager.<Boolean>createKey(EntityGalapagosHawk.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> TARGET_ENTITY = EntityDataManager.<Integer>createKey(EntityGalapagosHawk.class, DataSerializers.VARINT);
	
    private EntityLivingBase targetedEntity;
	public EntityGalapagosHawk(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 0.6F);
		this.stepHeight = 0.9F;
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundHandler.GALAPAGOS_HAWK_LIVING;
	}
	
	@Override
	protected void initEntityAI() {
		super.initEntityAI();
		this.tasks.addTask(9, new EntityAILookIdle(this));
	}
	
	protected PathNavigate createNavigator(World worldIn)
    {
        return this.onGround ? new PathNavigateGround(this, worldIn) : new PathNavigateFlying(this, worldIn);
    }
	
	public void entityInit()
    {
        super.entityInit();
        this.dataManager.register(HUNTING, Boolean.valueOf(false));
        this.dataManager.register(TARGET_ENTITY, Integer.valueOf(0));
    }

    public boolean isHunting()
    {
        return ((Boolean)this.dataManager.get(HUNTING)).booleanValue();
    }

    private void setHunting(boolean moving)
    {
        this.dataManager.set(HUNTING, Boolean.valueOf(moving));
    }
	
    public double getMountedYOffset()
    {
        return (double)this.height -0.8D;
    }
    
    public double getMountedXOffset()
    {
    	if(this.onGround) {
    		 return (double)0.2;
    	}
    	else {
    		return (double)-0.2;
    	}
    }
    
	@Override
	public void onLivingUpdate() {
        if(this.getControllingPassenger() instanceof EntityGalapagosRiceRat) {
     		this.setHunting(false);
        	if(this.onGround) {
        		this.getControllingPassenger().attackEntityFrom(DamageSource.DROWN, 1.0f);
        	}
        }
        else {
    		double distance = 20.0D;
    	    Entity entityFound = null;
    	    
    	    double d4 = -1.0D;
    	    for (int i = 0; i < this.world.loadedEntityList.size(); i++)
    	    {
    	      Entity CuEnt = (Entity)this.world.loadedEntityList.get(i);
    	        
    	      if (((CuEnt instanceof Entity)) && (CuEnt != this)) {
    	        double d5 = CuEnt.getDistanceSq(this.posX, this.posY, this.posZ);
    	          
    	        if (((distance < 0.0D) || (d5 < distance * distance)) && ((d4 == -1.0D) || (d5 < d4)))
    	        {
    	          d4 = d5;
    	          entityFound = CuEnt;
    	        }
    	      }
    	    }	    
    	    if (isChild()==false)
    	    {
    	      if (entityFound instanceof EntityGalapagosRiceRat) {
    		      this.setHunting(true);
    	    	  this.getNavigator().tryMoveToXYZ(entityFound.posX, entityFound.posY, entityFound.posZ, this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue() * 4.0D);
    	      }
    	      else {
    	    	  this.setHunting(false);
    	      }
    	    }
    	    
    	    double distance2 = 0.5D;
    	    Entity entityFound2 = null;
    	    
    	    double d = -1.0D;
    	    for (int i = 0; i < this.world.loadedEntityList.size(); i++)
    	    {
    	      Entity CuEnt = (Entity)this.world.loadedEntityList.get(i);
    	        
    	      if (((CuEnt instanceof Entity)) && (CuEnt != this)) {
    	        double d5 = CuEnt.getDistanceSq(this.posX, this.posY, this.posZ);
    	          
    	        if (((distance2 < 0.0D) || (d5 < distance2 * distance2)) && ((d == -1.0D) || (d5 < d)))
    	        {
    	          d = d5;
    	          entityFound2 = CuEnt;
    	        }
    	      }
    	    }
    	    
    	    if (isChild()==false)
    	    {
    	      if (entityFound2 instanceof EntityGalapagosRiceRat) {
    		         entityFound.startRiding(this);
    		         this.setHunting(false);
    	      }
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
