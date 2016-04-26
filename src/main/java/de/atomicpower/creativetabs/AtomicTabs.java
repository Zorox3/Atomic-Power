package de.atomicpower.creativetabs;

import java.util.HashMap;
import java.util.Map;

import de.atomicpower.Main.AtomicPower;
import de.atomicpower.abstracts.AtomBlock;
import de.atomicpower.blocks.AtomicGenerator;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class AtomicTabs {


	private Map<String, CreativeTabs> tabs = new HashMap<String, CreativeTabs>();
	
	public AtomicTabs() {
		tabs.put("blocks", new CTab("atomicBlocksTab", Item.getItemFromBlock(Blocks.anvil)));
		tabs.put("items", new CTab("atomicItemsTab", AtomicPower.itemRegistry.getItemByName("atomicStick")));

	}
	
	public CreativeTabs get(String key){
		return tabs.get(key);
	}
	
}
