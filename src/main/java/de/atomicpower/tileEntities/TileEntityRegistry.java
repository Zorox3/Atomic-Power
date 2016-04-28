package de.atomicpower.tileEntities;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import de.atomicpower.abstracts.AtomBlock;
import de.atomicpower.abstracts.AtomBlockContainer;
import de.atomicpower.abstracts.AtomItem;
import de.atomicpower.abstracts.AtomTileEntity;

public class TileEntityRegistry {
	private Map <String, AtomTileEntity> tileEntityList = new HashMap<String, AtomTileEntity>();
	
	
	public TileEntityRegistry() {
		
		tileEntityList.put("atomicGeneratorTile", new TileEntityAtomicGenerator(TileEntityAtomicGenerator.class, "atomicGeneratorTile"));
		//tileEntityList.put("atomicGeneratorFloorTile", new TileEntityAtomicGeneratorFloor(TileEntityAtomicGeneratorFloor.class, "atomicGeneratorFloorTile"));

		
	}
	
	public void register(){
		for(Entry<String, AtomTileEntity> tile : tileEntityList.entrySet()){
			tile.getValue().mainRegister();
		}
	}
		
	public AtomTileEntity getItemByName(String name){
		return tileEntityList.get(name);
	}
}
