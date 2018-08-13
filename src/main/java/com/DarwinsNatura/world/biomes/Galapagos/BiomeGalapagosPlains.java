package com.DarwinsNatura.world.biomes.Galapagos;

import net.minecraft.init.Blocks;

public class BiomeGalapagosPlains extends BiomeGalapagos {

	public BiomeGalapagosPlains(BiomeProperties properties) {
		super(properties);
		this.spawnableCreatureList.clear();
        this.topBlock = Blocks.GRASS.getDefaultState();
        this.fillerBlock = Blocks.DIRT.getDefaultState();
        this.decorator.treesPerChunk = -999;
        this.decorator.deadBushPerChunk = 0;
        this.decorator.reedsPerChunk = 0;
        this.decorator.cactiPerChunk = 0;
	}

}
