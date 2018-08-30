package com.DarwinsNatura.core.proxy;

import com.DarwinsNatura.common.blocks.BlockLeavesBase;
import com.DarwinsNatura.common.init.DarwinsNaturaBiomes;
import com.DarwinsNatura.common.init.DarwinsNaturaEntities;
import com.DarwinsNatura.common.util.handlers.SoundHandler;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent e) {
		DarwinsNaturaBiomes.registerBiomes();
		SoundHandler.registerSounds();
		DarwinsNaturaEntities.init();
	}
	
	public void registerRenders(){}
	public void setGraphicsLevel(BlockLeavesBase blockLeaves, boolean b){}
}