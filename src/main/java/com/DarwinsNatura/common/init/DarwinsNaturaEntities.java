package com.DarwinsNatura.common.init;

import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.ModelGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.RenderGalapagosRiceRat;
import com.DarwinsNatura.core.Main;
import com.DarwinsNatura.core.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DarwinsNaturaEntities {
	public static void init() {
		int id = 1;
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "GalapagosRiceRat"),EntityGalapagosRiceRat.class, "GalapagosRiceRat", id++, Main.instance, 64, 3, true, 0xffe0bd, 0xffad60);
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
		
	}
}
