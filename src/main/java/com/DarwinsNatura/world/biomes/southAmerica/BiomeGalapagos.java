package com.DarwinsNatura.world.biomes.southAmerica;

import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeGalapagos extends Biome 
{

	public BiomeGalapagos() 
	{
		super(new BiomeProperties("Galapagos_Islands").setTemperature(0.8F).setRainfall(0.6F).setWaterColor(3120543).setBaseHeight(0.01F).setHeightVariation(0.02F));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();

		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableMonsterList.clear();

		this.decorator.generateFalls = false;
		
	

	}
}
