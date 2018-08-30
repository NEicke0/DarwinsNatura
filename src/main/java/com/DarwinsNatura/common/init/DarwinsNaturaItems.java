package com.DarwinsNatura.common.init;

import java.util.ArrayList;

import com.DarwinsNatura.common.blocks.BlockLogScalesia;
import com.DarwinsNatura.common.items.ItemBase;
import com.DarwinsNatura.core.Reference;

import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class DarwinsNaturaItems {

	public static final ArrayList<Item> ITEMS = new ArrayList<Item>();

	public static final ItemBase AMERICAS_ICON = new ItemBase("americas_icon");

	public static void registerItems() {
		ForgeRegistries.ITEMS.registerAll(DarwinsNaturaItems.ITEMS.toArray(new Item[DarwinsNaturaItems.ITEMS.size()]));
	}

}
