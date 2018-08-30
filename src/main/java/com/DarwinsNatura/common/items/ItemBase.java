package com.DarwinsNatura.common.items;

import com.DarwinsNatura.common.init.DarwinsNaturaItems;
import com.DarwinsNatura.common.util.IHasModel;
import com.DarwinsNatura.core.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}