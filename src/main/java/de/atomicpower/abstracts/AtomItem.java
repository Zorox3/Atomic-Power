package de.atomicpower.abstracts;

import cpw.mods.fml.common.registry.GameRegistry;
import de.atomicpower.Main.AtomicPower;
import de.atomicpower.creativetabs.AtomicTabs;
import de.atomicpower.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

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

	private void setTexture(){
		setTextureName(Reference.MOD_ID + ":" + name);
	}

}
