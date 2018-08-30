package com.DarwinsNatura.core.proxy;

import com.DarwinsNatura.common.blocks.BlockLeavesBase;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.EntityGalapagosPenguin;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.RenderGalapagosPenguin;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.RenderGalapagosRiceRat;
import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.init.DarwinsNaturaEntities;
import com.DarwinsNatura.common.init.DarwinsNaturaItems;
import com.DarwinsNatura.common.util.handlers.SoundHandler;
import com.DarwinsNatura.core.Reference;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders(){
		DarwinsNaturaItems.registerItemRenders();
		DarwinsNaturaBlocks.registerBlockRenders();
		RenderingRegistry.registerEntityRenderingHandler(EntityGalapagosRiceRat.class, new RenderGalapagosRiceRat.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityGalapagosPenguin.class, new RenderGalapagosPenguin.RenderFactory());
	}
	
    @Override
    public void setGraphicsLevel(BlockLeavesBase parBlock, boolean parFancyEnabled)
    {
        parBlock.setGraphicsLevel(parFancyEnabled);
    }
}