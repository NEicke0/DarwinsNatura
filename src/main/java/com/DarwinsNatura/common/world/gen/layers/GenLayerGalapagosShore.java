package com.DarwinsNatura.common.world.gen.layers;

import com.DarwinsNatura.common.init.DarwinsNaturaBiomes;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraft.world.biome.BiomeMesa;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerGalapagosShore extends GenLayer {
	public GenLayerGalapagosShore(long seed, GenLayer p_i2130_3_) {
		super(seed);
		this.parent = p_i2130_3_;
	}

	@Override
	public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight) {
		int[] aint = this.parent.getInts(areaX - 1, areaY - 1, areaWidth + 2, areaHeight + 2);
		int[] aint1 = IntCache.getIntCache(areaWidth * areaHeight);

		for (int i = 0; i < areaHeight; ++i) {
			for (int j = 0; j < areaWidth; ++j) {
				this.initChunkSeed((long) (j + areaX), (long) (i + areaY));
				int k = aint[j + 1 + (i + 1) * (areaWidth + 2)];
				Biome biome = Biome.getBiome(k);

				if (k == Biome.getIdForBiome(DarwinsNaturaBiomes.GALAPAGOS)) {
					int j2 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
					int i3 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
					int l3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
					int k4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

					if (j2 != Biome.getIdForBiome(Biomes.OCEAN) && i3 != Biome.getIdForBiome(Biomes.OCEAN)
							&& l3 != Biome.getIdForBiome(Biomes.OCEAN) && k4 != Biome.getIdForBiome(Biomes.OCEAN)) {
						aint1[j + i * areaWidth] = k;
					} else {
						aint1[j + i * areaWidth] = Biome.getIdForBiome(DarwinsNaturaBiomes.GALAPAGOS_BEACH);
					}
				}
			}
		}

		return aint1;
	}
}