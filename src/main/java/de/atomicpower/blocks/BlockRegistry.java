package de.atomicpower.blocks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import de.atomicpower.abstracts.AtomBlock;
import de.atomicpower.abstracts.AtomItem;

public class BlockRegistry {
	private Map <String, AtomBlock> blockList = new HashMap<String, AtomBlock>();
	
	
	public BlockRegistry() {
		
		blockList.put("atomicGenerator", new AtomicGenerator("atomicGenerator", Material.ground));
		
	}
	
	public void register(){
		for(Entry<String, AtomBlock> block : blockList.entrySet()){
			block.getValue().mainRegister();
		}
	}
	
	public Block getItemByName(String name){
		return blockList.get(name);
	}
}
