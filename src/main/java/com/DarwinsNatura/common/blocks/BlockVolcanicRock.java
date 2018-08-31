package com.DarwinsNatura.common.blocks;

import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.init.DarwinsNaturaItems;
import com.DarwinsNatura.core.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.item.ItemBlock;

public class BlockVolcanicRock extends Block{
	
	public BlockVolcanicRock(String name){
		super(Material.ROCK);
		this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Main.AMERICAS);
        DarwinsNaturaBlocks.BLOCKS.add(this);
        DarwinsNaturaItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setHardness(0.0F);
        setSoundType(SoundType.PLANT);
	}

}
