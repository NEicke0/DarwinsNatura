package com.DarwinsNatura.world.biomes.southAmerica;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeGalapagos extends Biome 
{

	public BiomeGalapagos() 
	{
		super(new BiomeProperties("Galapagos_Islands").setTemperature(0.8F).setRainfall(0.6F).setBaseHeight(0.01F).setHeightVariation(0.02F));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();

		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableMonsterList.clear();

		this.decorator.generateFalls = false;
		
		
}
	@Override
    public int getGrassColorAtPos(BlockPos pos)
    {
        return getModdedBiomeGrassColor(6677309);
    }
}
