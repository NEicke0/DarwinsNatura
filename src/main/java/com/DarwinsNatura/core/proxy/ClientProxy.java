package com.DarwinsNatura.core.proxy;

import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.EntityGalapagosPenguin;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.RenderGalapagosPenguin;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.RenderGalapagosRiceRat;
import com.DarwinsNatura.common.init.DarwinsNaturaEntities;
import com.DarwinsNatura.common.util.handlers.RegistryHandler;
import com.DarwinsNatura.core.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println(Reference.MODID + ":preInit");
		DarwinsNaturaEntities.init();
		RegistryHandler.preInitRegistries();
	}

	public void registerRenders(){
		RenderingRegistry.registerEntityRenderingHandler(EntityGalapagosRiceRat.class, new RenderGalapagosRiceRat.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityGalapagosPenguin.class, new RenderGalapagosPenguin.RenderFactory());
	}
	
	public void registerBlockRenderer(Block block, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}