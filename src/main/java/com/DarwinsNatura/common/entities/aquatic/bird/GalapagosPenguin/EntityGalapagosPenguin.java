package com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin;

import com.DarwinsNatura.common.entities.aquatic.bird.EntityAquaticBirdBase;
import com.DarwinsNatura.common.util.handlers.SoundHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityGalapagosPenguin extends EntityAquaticBirdBase {

	public EntityGalapagosPenguin(World worldIn) {
		super(worldIn);
		this.setSize(0.4F, 0.6F);
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundHandler.GALAPAGOS_PENGUIN_LIVING;
	}

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return new EntityGalapagosPenguin(this.world);
    }
}
