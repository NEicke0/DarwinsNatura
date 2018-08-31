package com.DarwinsNatura.common.world.biomes.Galapagos;

import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.EntityGalapagosPenguin;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;

public class BiomeGalapagosBeach extends BiomeBaseGalapagos
{

	public BiomeGalapagosBeach() {
		super(new BiomeProperties("Galapagos_Beach").setTemperature(0.8F).setRainfall(0F).setBaseHeight(0.5f)
				.setHeightVariation(0f));

    
       
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.STONE.getDefaultState();
        this.fillerBlock = Blocks.STONE.getDefaultState();
        this.decorator.treesPerChunk = -999;
        this.decorator.deadBushPerChunk = 0;
        this.decorator.reedsPerChunk = 0;
        this.decorator.cactiPerChunk = 0;
        
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityGalapagosPenguin.class, 30, 2, 6));
    }
}
