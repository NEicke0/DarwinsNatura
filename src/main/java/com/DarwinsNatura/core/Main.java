package com.DarwinsNatura.core;

import com.DarwinsNatura.common.init.DarwinsNaturaItems;
import com.DarwinsNatura.common.tabs.AmericasTab;

import org.apache.logging.log4j.Logger;

import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.util.handlers.RegistryHandler;
import com.DarwinsNatura.common.util.handlers.TerrainEventHandler;
import com.DarwinsNatura.core.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION,dependencies = Reference.DEPEND)
public class Main {
	@Instance
	public static Main instance;

	private static Logger logger;

	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs AMERICAS = new AmericasTab("americastab");

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.TERRAIN_GEN_BUS.register(TerrainEventHandler.class);
		DarwinsNaturaBlocks.registerBlocks();
		DarwinsNaturaItems.registerItems();
		proxy.preInit(event);
		proxy.registerRenders();
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RegistryHandler.initRegistries();
		System.out.println("New Exploration Awaits....");
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		RegistryHandler.postInitRegistries();
	}

}