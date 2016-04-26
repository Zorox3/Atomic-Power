package de.atomicpower.items;

import java.util.HashMap;
import java.util.Map;


import java.util.Map.Entry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import de.atomicpower.abstracts.AtomItem;

public class ItemRegistry {

	private Map <String, AtomItem> itemList = new HashMap<String, AtomItem>();
	
	
	public ItemRegistry() {
		
		itemList.put("atomicStick", new AtomicStick("atomicStick", CreativeTabs.tabRedstone));
		
	}
	
	public void register(){
		for(Entry<String, AtomItem> item : itemList.entrySet()){
			item.getValue().mainRegister();
		}
	}
	
	public Item getItemByName(String name){
		return itemList.get(name);
	}
	
}
