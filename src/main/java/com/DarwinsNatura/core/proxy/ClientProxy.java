package com.DarwinsNatura.core.proxy;

import com.DarwinsNatura.common.blocks.BlockLeavesScalesia;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.EntityGalapagosPenguin;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.RenderGalapagosPenguin;
import com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.EntityGalapagosHawk;
import com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.RenderGalapagosHawk;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.RenderGalapagosRiceRat;
import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.init.DarwinsNaturaItems;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders(){
		DarwinsNaturaItems.registerItemRenders();
		DarwinsNaturaBlocks.registerBlockRenders();
		RenderingRegistry.registerEntityRenderingHandler(EntityGalapagosRiceRat.class, new RenderGalapagosRiceRat.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityGalapagosPenguin.class, new RenderGalapagosPenguin.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityGalapagosHawk.class, new RenderGalapagosHawk.RenderFactory());
	}
	
    @Override
    public void setGraphicsLevel(BlockLeavesScalesia parBlock, boolean parFancyEnabled)
    {
        parBlock.setGraphicsLevel(parFancyEnabled);
    }
}