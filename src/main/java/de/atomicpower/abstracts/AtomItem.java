package de.atomicpower.abstracts;

import cpw.mods.fml.common.registry.GameRegistry;
import de.atomicpower.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public abstract class AtomItem extends Item {

	protected String name;
	protected CreativeTabs tab;

	public AtomItem(String name, CreativeTabs tab) {
		this.name = name;
		this.tab = tab;
	}

	public void mainRegister() {
		init();
		register();
	}

	private void init() {
		setUnlocalizedName(name);
		setCreativeTab(tab);	
		
		setTexture();
	}

	private void register() {
		GameRegistry.registerItem(this, name);
	}

	private void setTexture(){
		setTextureName(Reference.MOD_ID + ":" + name);
	}

}
