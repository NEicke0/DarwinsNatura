package com.DarwinsNatura.common.items;

import com.DarwinsNatura.common.init.DarwinsNaturaItems;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	public ItemBase(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		DarwinsNaturaItems.ITEMS.add(this);
	}
}