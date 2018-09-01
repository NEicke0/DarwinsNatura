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
	        int parentWidth = areaWidth + 2;
	        int parentHeight = areaHeight + 2;

	        int[] parent = this.parent.getInts(areaX - 1, areaY - 1, parentWidth, parentHeight);
	        int[] result = IntCache.getIntCache(areaWidth * areaHeight);

	        for (int localY = 0; localY < areaHeight; ++localY) {
	            for (int localX = 0; localX < areaWidth; ++localX) {
	                this.initChunkSeed((long) (localX + areaX), (long) (localY + areaY));

	                int parentX = localX + 1;
	                int parentY = localY + 1;
	                int sampled = parent[parentX + parentY * parentWidth];

	                if (sampled == Biome.getIdForBiome(DarwinsNaturaBiomes.GALAPAGOS)) {
	                    int up = parent[parentX + (parentY - 1) * parentWidth];
	                    int right = parent[parentX + 1 + parentY * parentWidth];
	                    int left = parent[parentX - 1 + parentY * parentWidth];
	                    int down = parent[parentX + (parentY + 1) * parentWidth];

	                    if (isBiomeOceanic(up) || isBiomeOceanic(down) || isBiomeOceanic(right) || isBiomeOceanic(left)) {
	                        result[localX + localY * areaWidth] = Biome.getIdForBiome(DarwinsNaturaBiomes.GALAPAGOS_BEACH);
	                    } else {
	                        result[localX + localY * areaWidth] = sampled;
	                    }
	                } else {
	                    result[localX + localY * areaWidth] = sampled;
	                }
	            }
	        }

	        return result;
	    }
	}