package com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin;

import com.DarwinsNatura.common.entities.aquatic.bird.EntityPenguinBase;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityGalapagosPenguin extends EntityPenguinBase {

	public EntityGalapagosPenguin(World worldIn) {
		super(worldIn);
		this.setSize(0.4F, 0.6F);
	}
	
	@Override
	public void onLivingUpdate() {
		return;
	}

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return new EntityGalapagosPenguin(this.world);
    }
}
