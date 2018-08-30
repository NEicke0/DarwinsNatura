package com.DarwinsNatura.core.proxy;

import com.DarwinsNatura.common.blocks.BlockLeavesBase;
import com.DarwinsNatura.common.util.handlers.RegistryHandler;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent e) {
		RegistryHandler.preInitRegistries();
	}
	
	public void registerRenders(){}
	public void setGraphicsLevel(BlockLeavesBase blockLeaves, boolean b){}
}