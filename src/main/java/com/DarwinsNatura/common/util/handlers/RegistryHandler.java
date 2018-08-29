package com.DarwinsNatura.common.util.handlers;

import com.DarwinsNatura.common.init.DarwinsNaturaBiomes;
import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.init.DarwinsNaturaItems;
import com.DarwinsNatura.common.world.type.WorldTypeTest;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


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