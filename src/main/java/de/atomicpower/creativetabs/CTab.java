package de.atomicpower.creativetabs;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTab extends CreativeTabs {

	private Item icon;

	public CTab(String lable, Item iconItem) {
		super(lable);

		this.icon = iconItem;
	}

	@Override
	public Item getTabIconItem() {
		return icon;
	}

}
