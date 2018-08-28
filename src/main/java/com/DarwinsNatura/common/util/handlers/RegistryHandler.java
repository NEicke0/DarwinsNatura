package com.DarwinsNatura.common.util.handlers;

import com.DarwinsNatura.common.init.DarwinsNaturaBiomes;
import com.DarwinsNatura.common.world.type.WorldTypeTest;

import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@EventBusSubscriber
public class RegistryHandler 
{

	public static void preInitRegistries()
	{
		
		DarwinsNaturaBiomes.registerBiomes();
	
	}
	
	public static void initRegistries()
	{

	}
	
	public static void postInitRegistries()
	{
		WorldType TEST = new WorldTypeTest();

	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		
	}
}