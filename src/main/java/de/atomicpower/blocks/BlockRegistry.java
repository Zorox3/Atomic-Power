package de.atomicpower.blocks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import de.atomicpower.abstracts.AtomBlock;
import de.atomicpower.abstracts.AtomBlockContainer;
import de.atomicpower.abstracts.AtomItem;

public class BlockRegistry {
	private Map <String, AtomBlock> blockList = new HashMap<String, AtomBlock>();
	private Map <String, AtomBlockContainer> blockContainerList = new HashMap<String, AtomBlockContainer>();
	
	
	public BlockRegistry() {
		
		blockContainerList.put("atomicGenerator", new AtomicGenerator("atomicGenerator", Material.rock));
		
	}
	
	public void register(){
		for(Entry<String, AtomBlock> block : blockList.entrySet()){
			block.getValue().mainRegister();
		}
		for(Entry<String, AtomBlockContainer> block : blockContainerList.entrySet()){
			block.getValue().mainRegister();
		}
	}
	
	public AtomBlockContainer getBlockContainerByName(String name){
		return blockContainerList.get(name);
	}
	
	public AtomBlock getItemByName(String name){
		return blockList.get(name);
	}
}
