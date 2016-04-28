package de.atomicpower.abstracts;

import cpw.mods.fml.common.registry.GameRegistry;
import de.atomicpower.Main.AtomicPower;
import de.atomicpower.creativetabs.AtomicTabs;
import de.atomicpower.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public abstract class AtomItem extends Item {

	protected String name;

	public AtomItem(String name) {
		this.name = name;
		
		setTexture();
		setUnlocalizedName(name);

	}

	public void mainRegister() {
		init();
		register();
		
	}

	private void init() {
		setCreativeTab(AtomicPower.tabs.get("items"));	
		
	}

	private void register() {
		GameRegistry.registerItem(this, name);
	}

	protected void setTexture(){
		setTextureName(Reference.MOD_ID + ":" + name);
	}
	protected boolean placeBlock(int side, World world, int x, int y, int z, Block placeBlock) {
		switch (side) {
		case 1:
			world.setBlock(x, y + 1, z, placeBlock);
			break;
		case 2:
			world.setBlock(x, y, z - 1, placeBlock);
			break;
		case 3:
			world.setBlock(x, y, z + 1, placeBlock);
			break;
		case 4:
			world.setBlock(x - 1, y, z, placeBlock);
			break;
		case 5:
			world.setBlock(x + 1, y, z, placeBlock);
			break;
		case 0:
			world.setBlock(x, y - 1, z, placeBlock);
			break;
			default: return false;
		}
		return true;
		
	}
}
