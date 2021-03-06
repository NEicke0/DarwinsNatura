package com.DarwinsNatura.common.blocks;

import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.init.DarwinsNaturaItems;
import com.DarwinsNatura.core.Main;

import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

public class BlockLavaMorningGlory extends BlockBush{
	
	public BlockLavaMorningGlory(String name){
		this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Main.AMERICAS);
        DarwinsNaturaBlocks.BLOCKS.add(this);
        DarwinsNaturaItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setHardness(0.0F);
        setSoundType(SoundType.PLANT);
	}
    
    protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == DarwinsNaturaBlocks.VOLCANIC_ROCK;
    }

}

