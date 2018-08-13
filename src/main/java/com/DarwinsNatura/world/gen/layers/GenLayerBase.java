package com.DarwinsNatura.world.gen.layers;

import net.minecraft.world.gen.layer.GenLayer;

public abstract class GenLayerBase extends GenLayer
{
    public GenLayerBase(long seed) {
        super(seed);
    }

    // make nextInt public
    @Override
    public int nextInt(int a)
    {
        return super.nextInt(a);
    }
}