package com.DarwinsNatura.world.gen.layers;

import com.DarwinsNatura.world.biomes.DarwinsNaturaBiomes;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldGenGalapagos extends WorldType
	{
		public WorldGenGalapagos() 
		{
			super("Galapagos_Islands");
		}
		
		@Override
		public BiomeProvider getBiomeProvider(World world) 
		{
			return new BiomeProviderSingle(DarwinsNaturaBiomes.GALAPAGOS);
		}
	}
