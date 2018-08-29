package com.DarwinsNatura.core.proxy;

import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.EntityGalapagosPenguin;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.RenderGalapagosPenguin;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.RenderGalapagosRiceRat;
import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.init.DarwinsNaturaEntities;
import com.DarwinsNatura.common.init.DarwinsNaturaItems;
import com.DarwinsNatura.common.util.handlers.RegistryHandler;
import com.DarwinsNatura.core.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println(Reference.MODID + ":preInit");
		DarwinsNaturaEntities.init();
		RegistryHandler.preInitRegistries();
	}

	@Override
	public void registerRenders(){
		DarwinsNaturaItems.registerItemRenders();
		DarwinsNaturaBlocks.registerBlockRenders();
		RenderingRegistry.registerEntityRenderingHandler(EntityGalapagosRiceRat.class, new RenderGalapagosRiceRat.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityGalapagosPenguin.class, new RenderGalapagosPenguin.RenderFactory());
	}
}