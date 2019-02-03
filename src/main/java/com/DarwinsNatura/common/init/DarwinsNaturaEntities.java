package com.DarwinsNatura.common.init;

import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.EntityGalapagosPenguin;
import com.DarwinsNatura.common.entities.aquatic.reptile.MarineIguana.EntityMarineIguana;
import com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.EntityGalapagosHawk;
import com.DarwinsNatura.common.entities.terrestrial.bird.booby.EntityBlueFootedBooby;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.tortoise.GalapagosTortoise.EntityGalapagosTortoise;
import com.DarwinsNatura.core.Main;
import com.DarwinsNatura.core.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class DarwinsNaturaEntities {
	private static int id = 0;
	
	public static void init() {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "GalapagosRiceRat"),EntityGalapagosRiceRat.class, "GalapagosRiceRat", id++, Main.instance, 64, 3, true, 0x783F32, 0x977044);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "GalapagosPenguin"),EntityGalapagosPenguin.class, "GalapagosPenguin", id++, Main.instance, 64, 3, true, 0xE3DED9, 0x3C3A38);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "GalapagosHawk"),EntityGalapagosHawk.class, "GalapagosHawk", id++, Main.instance, 64, 3, true, 0x845e3f, 0xedb771);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "GalapagosTortoise"),EntityGalapagosTortoise.class, "GalapagosTortoise", id++, Main.instance, 64, 3, true, 0x6a6b4c, 0x414222);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "MarineIguana"),EntityMarineIguana.class, "MarineIguana", id++, Main.instance, 64, 3, true, 0x161623, 0x4d4d59);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "BlueFootedBooby"),EntityBlueFootedBooby.class, "BlueFootedBooby", id++, Main.instance, 64, 3, true, 5060123, 3140604);
	}
}
