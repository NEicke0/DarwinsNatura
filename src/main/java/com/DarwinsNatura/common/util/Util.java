package com.DarwinsNatura.common.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Util {

    public static Block setBlockName(Block parBlock, String parBlockName)
    {
        parBlock.setRegistryName(parBlockName);
        parBlock.setUnlocalizedName(parBlockName);
        return parBlock;
    }
    
    public static Item setItemName(Item parItem, String parItemName)
    {
        parItem.setRegistryName(parItemName);
        parItem.setUnlocalizedName(parItemName);
        return parItem;
    }
}
