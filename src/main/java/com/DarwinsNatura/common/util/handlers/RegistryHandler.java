package com.DarwinsNatura.common.util.handlers;

import com.DarwinsNatura.common.init.DarwinsNaturaBiomes;
import com.DarwinsNatura.common.init.DarwinsNaturaEntities;
import com.DarwinsNatura.common.world.type.WorldTypeTest;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{

	public static void preInitRegistries()
	{
		
		DarwinsNaturaBiomes.registerBiomes();
		DarwinsNaturaEntities.init();
	
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