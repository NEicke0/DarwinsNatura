package com.DarwinsNatura.common.entities.aquatic.bird.FlightlessCormorant;

import com.DarwinsNatura.common.entities.aquatic.bird.EntityAquaticBirdBase;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.EntityGalapagosPenguin;
import com.DarwinsNatura.common.util.handlers.SoundHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityFlightlessCormorant extends EntityAquaticBirdBase{

	public EntityFlightlessCormorant(World worldIn) {
		super(worldIn);
		this.setSize(0.4F, 0.6F);
	}
	
	/*@Override
	protected SoundEvent getAmbientSound() {
		return SoundHandler.FLIGHTLESS_CORMORANT_LIVING;
	}*/

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return new EntityFlightlessCormorant(this.world);
    }
}
