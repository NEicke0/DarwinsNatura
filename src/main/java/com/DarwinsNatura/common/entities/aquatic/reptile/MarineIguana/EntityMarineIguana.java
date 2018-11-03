package com.DarwinsNatura.common.entities.aquatic.reptile.MarineIguana;

import com.DarwinsNatura.common.entities.aquatic.reptile.EntityAquaticReptileBase;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityMarineIguana extends EntityAquaticReptileBase {

	public EntityMarineIguana(World worldIn) {
		super(worldIn);
		this.setSize(0.7F, 0.3F);
	}

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return new EntityMarineIguana(this.world);
    }
}

