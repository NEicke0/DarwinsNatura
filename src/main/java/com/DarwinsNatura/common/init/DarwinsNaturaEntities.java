package com.DarwinsNatura.common.init;

import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.core.Main;
import com.DarwinsNatura.core.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class DarwinsNaturaEntities {
	public static void init() {
		int id = 1;
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "GalapagosRiceRat"),EntityGalapagosRiceRat.class, "GalapagosRiceRat", id++, Main.instance, 64, 3, true, 0xffe0bd, 0xffad60);
	}
}
