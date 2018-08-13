package com.DarwinsNatura.util.handlers;

import com.DarwinsNatura.init.DarwinsNaturaBiomes;
import com.DarwinsNatura.world.gen.layers.WorldGenGalapagos;

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
	
	}
	
	public static void initRegistries()
	{

	}
	
	public static void postInitRegistries()
	{
		WorldType GALAPAGOS_ISLANDS = new WorldGenGalapagos();

	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		
	}
}