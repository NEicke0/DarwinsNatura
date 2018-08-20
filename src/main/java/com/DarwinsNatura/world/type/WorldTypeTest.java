package com.DarwinsNatura.world.type;

import com.DarwinsNatura.init.DarwinsNaturaBiomes;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldTypeTest extends WorldType
{
	public WorldTypeTest() 
	{
		super("test");
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world) 
	{
		return new BiomeProviderSingle(DarwinsNaturaBiomes.GALAPAGOS);
	}
}