package com.DarwinsNatura.world.biomes.Galapagos;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeGalapagosBeach extends BiomeGalapagos
{

	public BiomeGalapagosBeach(BiomeProperties properties) {
		super(properties);
		this.spawnableCreatureList.clear();
        this.topBlock = Blocks.SAND.getDefaultState();
        this.fillerBlock = Blocks.SAND.getDefaultState();
        this.decorator.treesPerChunk = -999;
        this.decorator.deadBushPerChunk = 0;
        this.decorator.reedsPerChunk = 0;
        this.decorator.cactiPerChunk = 0;
	}

}
