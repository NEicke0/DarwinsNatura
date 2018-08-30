package com.DarwinsNatura.common.tabs;

import com.DarwinsNatura.common.init.DarwinsNaturaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class AmericasTab extends CreativeTabs {
	public AmericasTab(String label) {
		super(label);
		this.setBackgroundImageName("americas.png");
	}

	public ItemStack getTabIconItem() {
		return new ItemStack(DarwinsNaturaItems.AMERICAS_ICON);
	}

}