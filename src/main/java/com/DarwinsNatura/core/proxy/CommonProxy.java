package com.DarwinsNatura.core.proxy;

import com.DarwinsNatura.common.blocks.BlockLeavesScalesia;
import com.DarwinsNatura.common.util.handlers.RegistryHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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