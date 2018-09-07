package com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat;

import com.DarwinsNatura.common.entities.terrestrial.rodent.EntityRodentBase;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityGalapagosRiceRat extends EntityRodentBase{

	public EntityGalapagosRiceRat(World worldIn) {
		super(worldIn);
		this.setSize(0.2F, 0.2F);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityGalapagosRiceRat(this.world);
	}
}
