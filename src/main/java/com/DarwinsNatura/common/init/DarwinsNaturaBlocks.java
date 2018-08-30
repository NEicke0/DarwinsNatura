package com.DarwinsNatura.common.init;

import java.util.ArrayList;
import java.util.List;

import com.DarwinsNatura.common.blocks.BlockLeavesScalesia;
import com.DarwinsNatura.common.blocks.BlockLogScalesia;


import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class DarwinsNaturaBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	  
	public static final BlockLog SCALESIA_LOG = new BlockLogScalesia("scalesia_log");
	public static final BlockLeaves SCALESIA_LEAVES = new BlockLeavesScalesia("scalesia_leaves");

    public static void registerBlocks() {
        ForgeRegistries.BLOCKS.registerAll(DarwinsNaturaBlocks.BLOCKS.toArray(new Block[DarwinsNaturaBlocks.BLOCKS.size()]));
    }

    public static void registerBlockRenders() {
        for(Block block : DarwinsNaturaBlocks.BLOCKS) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        }
    }
}