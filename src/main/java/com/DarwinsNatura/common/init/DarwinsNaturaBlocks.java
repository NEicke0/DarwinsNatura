package com.DarwinsNatura.common.init;

import java.util.ArrayList;
import java.util.List;

import com.DarwinsNatura.common.blocks.BlockDoorBase;
import com.DarwinsNatura.common.blocks.BlockGalapagosFernTree;
import com.DarwinsNatura.common.blocks.BlockLavaMorningGlory;
import com.DarwinsNatura.common.blocks.BlockLeavesScalesia;
import com.DarwinsNatura.common.blocks.BlockLogBase;
import com.DarwinsNatura.common.blocks.BlockPlanksBase;
import com.DarwinsNatura.common.blocks.BlockPlantBase;
import com.DarwinsNatura.common.blocks.BlockSaplingScalesia;
import com.DarwinsNatura.common.blocks.BlockVolcanicRock;
import com.DarwinsNatura.common.blocks.common.BlockSandBase;
import com.DarwinsNatura.common.blocks.item.ItemBlockDoor;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class DarwinsNaturaBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	  
	public static final BlockLog SCALESIA_LOG = new BlockLogBase("scalesia_log");
	public static final Block SCALESIA_PLANK = new BlockPlanksBase("scalesia_plank");
	public static final Block SCALESIA_DOOR = new BlockDoorBase("scalesia_door");
	public static final ItemBlockDoor SCALESIA_DOOR_ITEM = new ItemBlockDoor(SCALESIA_DOOR);
	
	public static final BlockLeaves SCALESIA_LEAVES = new BlockLeavesScalesia("scalesia_leaves");
	public static final BlockBush SCALESIA_SAPLING = new BlockSaplingScalesia("scalesia_sapling");
	public static final BlockBush MICONIA_SHRUB = new BlockPlantBase("miconia_shrub");
	public static final BlockBush LAVA_MORNING_GLORY = new BlockLavaMorningGlory("lava_morning_glory");
	public static final BlockBush GALAPAGOS_FERN_TREE_PART = new BlockGalapagosFernTree("galapagos_fern_tree");
	public static final Block VOLCANIC_ROCK = new BlockVolcanicRock("volcanic_rock");
	
	/*'
	 * @Common- Stuff that will be reused in other biomes
	 */
	public static final BlockFalling WHITE_SAND = new BlockSandBase("white_sand");
	public static final BlockFalling BLACK_SAND = new BlockSandBase("black_sand");

    public static void registerBlocks() {
        ForgeRegistries.BLOCKS.registerAll(DarwinsNaturaBlocks.BLOCKS.toArray(new Block[DarwinsNaturaBlocks.BLOCKS.size()]));
    }

    public static void registerBlockRenders() {
        for(Block block : DarwinsNaturaBlocks.BLOCKS) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        }
    }
}
