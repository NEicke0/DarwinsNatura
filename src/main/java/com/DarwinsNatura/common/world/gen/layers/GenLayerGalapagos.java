package com.DarwinsNatura.common.world.gen.layers;

import com.DarwinsNatura.common.init.DarwinsNaturaBiomes;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerGalapagos extends GenLayer
{
    public GenLayerGalapagos(long seed, GenLayer parent) 
    {
        super(seed);
        this.parent = parent;
    }
    @Override
    public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight) 
    {
        int outerWidth = areaWidth + 2;
        
        int[] biomeIds = this.parent.getInts(areaX - 1, areaY - 1, areaWidth + 2, areaHeight + 2);
        int[] out = IntCache.getIntCache(areaWidth * areaHeight);

        for (int z = 0; z < areaHeight; ++z)
        {
            for (int x = 0; x < areaWidth; ++x)
            {
                int biomeNorth = biomeIds[x + 1 + (z + 1 - 1) * (areaWidth + 2)];
                int biomeEast = biomeIds[x + 1 + 1 + (z + 1) * (areaWidth + 2)];
                int biomeWest = biomeIds[x + 1 - 1 + (z + 1) * (areaWidth + 2)];
                int biomeSouth = biomeIds[x + 1 + (z + 1 + 1) * (areaWidth + 2)];
                int centerVal = biomeIds[x + 1 + (z + 1) * outerWidth];

                this.initChunkSeed((long)(x + areaX), (long)(z + areaY));

                if (centerVal == 0 && biomeNorth == 0 && biomeEast == 0 && biomeWest == 0 && biomeSouth == 0 && this.nextInt(50) == 0)
                {
                    out[x + z * areaWidth] = Biome.getIdForBiome(DarwinsNaturaBiomes.GALAPAGOS);
                }
                else
                {
                    out[x + z * areaWidth] = centerVal;
                }
            }
        }

        return out;
    }
}