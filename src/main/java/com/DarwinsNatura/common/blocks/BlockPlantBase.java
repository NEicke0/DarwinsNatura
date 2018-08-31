package com.DarwinsNatura.common.blocks;

import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.init.DarwinsNaturaItems;
import com.DarwinsNatura.core.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockPlantBase extends BlockBush{
	
	public BlockPlantBase(String name){
		this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Main.AMERICAS);
        DarwinsNaturaBlocks.BLOCKS.add(this);
        DarwinsNaturaItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setHardness(0.0F);
        setSoundType(SoundType.PLANT);
	}
	
	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return super.getBoundingBox(state, source, pos).offset(state.getOffset(source, pos));
    }
	
    @Override
    public Block.EnumOffsetType getOffsetType()
    {
        return Block.EnumOffsetType.XZ;
    }
}
