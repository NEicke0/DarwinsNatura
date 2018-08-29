package com.DarwinsNatura.common.world.biomes.Galapagos;

import java.util.Random;

import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.world.gen.trees.WorldGenTreesScalesia;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeGalapagos extends Biome {

	private static final WorldGenTreesScalesia TREE = new WorldGenTreesScalesia(false);

	public BiomeGalapagos() {
		super(new BiomeProperties("Galapagos_Islands").setTemperature(0.8F).setRainfall(0.6F).setBaseHeight(0.5f)
				.setHeightVariation(0f));

		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();

		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.decorator.generateFalls = false;
		this.decorator.treesPerChunk = 1;
		this.decorator.flowersPerChunk = 4;
		this.decorator.grassPerChunk = 20;
		
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityGalapagosRiceRat.class, 30, 2, 4));
	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
	}


	@Override
	public int getGrassColorAtPos(BlockPos pos) {
		return getModdedBiomeGrassColor(0xA7E140);
	}

	@Override
	public int getFoliageColorAtPos(BlockPos pos) {
		return getModdedBiomeFoliageColor(0x88E140);
	}
}
