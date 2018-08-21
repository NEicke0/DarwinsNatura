package com.DarwinsNatura.common.entities;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityGender extends EntityAnimal{
	
	private static final DataParameter<Boolean> GENDER = EntityDataManager.createKey(EntityGender.class, DataSerializers.BOOLEAN);
	protected Random rand;
	
	public EntityGender(World worldIn) {
		super(worldIn);
		setGender(this.genderFromRan(rand.nextBoolean()));
	}
	
	public enum Gender
	{
	  MALE(true),  FEMALE(false);
		
		boolean value;
		  
	  private Gender(boolean type)
	  {
	     this.value = type;
	  }
		  
	  public boolean getValue()
	  {
		  return this.value;
	  }
	}
	
	protected Gender genderFromRan(boolean i)
	{
		if(i) {
			return Gender.MALE;
		}
		else {
			return Gender.FEMALE;
		}
	}
	
    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(GENDER, true);
    }
    
    public void writeEntityToNBT(NBTTagCompound tagCompound)
    {
      super.writeEntityToNBT(tagCompound);
      tagCompound.setBoolean("Gender", getGender().getValue());;
    }
    
    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
    	super.readEntityFromNBT(compound);
    	setGender(this.genderFromRan(compound.getBoolean("Gender")));
    }
    
    protected Gender getGender() {
    	return this.genderFromRan((Boolean)this.dataManager.get(GENDER));
    }  
    
    protected void setGender(Gender g) {
    	this.dataManager.set(GENDER, g.getValue());
    }

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityGender(this.world);
	}	

}
