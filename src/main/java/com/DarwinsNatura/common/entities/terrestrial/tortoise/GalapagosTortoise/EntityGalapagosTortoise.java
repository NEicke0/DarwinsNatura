package com.DarwinsNatura.common.entities.terrestrial.tortoise.GalapagosTortoise;

import com.DarwinsNatura.common.entities.terrestrial.tortoise.EntityTortoiseBase;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityGalapagosTortoise extends EntityTortoiseBase{

	public EntityGalapagosTortoise(World worldIn) {
		super(worldIn);
		this.setSize(0.2F, 0.2F);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityGalapagosTortoise(this.world);
	}
}

