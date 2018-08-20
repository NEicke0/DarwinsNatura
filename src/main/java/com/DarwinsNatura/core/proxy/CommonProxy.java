package com.DarwinsNatura.core.proxy;

import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.ModelGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.RenderGalapagosRiceRat;
import com.DarwinsNatura.common.util.handlers.RegistryHandler;
import com.DarwinsNatura.core.Reference;
import com.DarwinsNatura.common.init.DarwinsNaturaEntities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println(Reference.MODID + ":preInit");
		DarwinsNaturaEntities.init();
		RegistryHandler.preInitRegistries();
	}


	public void registerItemRenderer(Item item, int meta, String id) {
	}

	public void registerVariantRenderer(Item item, int meta, String filename, String id) {
	}
	public void registerRenders() {
		RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
		RenderingRegistry.registerEntityRenderingHandler(EntityGalapagosRiceRat.class,new RenderGalapagosRiceRat(renderManager, new ModelGalapagosRiceRat(), 0.3F));
	}
}