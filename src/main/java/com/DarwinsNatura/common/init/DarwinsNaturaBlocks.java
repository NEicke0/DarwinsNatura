package com.DarwinsNatura.common.init;

import java.util.ArrayList;
import java.util.List;

import com.DarwinsNatura.common.blocks.BlockLeavesScalesia;
import com.DarwinsNatura.common.blocks.BlockLogScalesia;


import net.minecraft.block.Block;

public class DarwinsNaturaBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	  
      public static final Block SCALESIA_LOG = new BlockLogScalesia();
      public static final Block SCALESIA_LEAVES = new BlockLeavesScalesia();
}
