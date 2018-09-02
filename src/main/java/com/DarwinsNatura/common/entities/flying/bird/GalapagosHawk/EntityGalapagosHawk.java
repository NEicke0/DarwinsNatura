package com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk;

import com.DarwinsNatura.common.entities.flying.bird.EntityBirdBase;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityGalapagosHawk extends EntityBirdBase{
	
	public EntityGalapagosHawk(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 0.6F);
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
