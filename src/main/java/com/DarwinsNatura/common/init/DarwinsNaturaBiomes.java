package com.DarwinsNatura.common.init;

import com.DarwinsNatura.common.world.biomes.Galapagos.BiomeGalapagos;
import com.DarwinsNatura.common.world.biomes.Galapagos.BiomeGalapagosBeach;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class DarwinsNaturaBiomes 
{
	public static final Biome GALAPAGOS = new BiomeGalapagos();
	public static final Biome GALAPAGOS_BEACH = new BiomeGalapagosBeach();

	public static void registerBiomes()
	{
		initBiome(GALAPAGOS, "Galapagos", BiomeType.WARM, Type.PLAINS);
		initBiome(GALAPAGOS, "Galapagos_Beach", BiomeType.WARM, Type.BEACH);
	}

	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);		System.out.println("Biome Added");
		return biome;
	}

	
}