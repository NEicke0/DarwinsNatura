package com.DarwinsNatura.common.entities.terrestrial.bird.booby;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityBlueFootedBooby extends EntityAnimal{

	public EntityBlueFootedBooby(World worldIn) {
		super(worldIn);
		this.setSize(1.0F, 2.0F);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityBlueFootedBooby(world);
	}

}
