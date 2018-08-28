package com.DarwinsNatura.common.world.biomes.Galapagos;

import java.util.Random;

import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;

import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeGalapagos extends Biome {

	private static final WorldGenSavannaTree SAVANNA_TREE = new WorldGenSavannaTree(false);

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
		
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityGalapagosRiceRat.class, 15, 1, 2));
	}

	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
		return (WorldGenAbstractTree) (rand.nextInt(5) > 0 ? SAVANNA_TREE : TREE_FEATURE);
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
