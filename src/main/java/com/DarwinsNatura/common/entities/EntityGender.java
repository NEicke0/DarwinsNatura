package com.DarwinsNatura.common.entities;


import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityGender extends EntityAnimal{
	
	public EntityGender(World worldIn) {
		super(worldIn);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityGender(this.world);
	}

}
