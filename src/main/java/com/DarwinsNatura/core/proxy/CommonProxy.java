package com.DarwinsNatura.core.proxy;

import com.DarwinsNatura.common.blocks.BlockLeavesScalesia;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;

public class CommonProxy 
{
	public void registerItemRenderer(Item item, int meta, String id) {
	
	}
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {
	
	}
	public void registerRenders(){
	     RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
    }
	public void setGraphicsLevel(BlockLeavesScalesia blockLeavesScalesia, boolean b) {
		
	}
}