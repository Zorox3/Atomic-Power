package de.atomicpower.abstracts;

import cpw.mods.fml.common.registry.GameRegistry;
import de.atomicpower.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public abstract class AtomBlock extends Block{
	protected String name;
	protected CreativeTabs tab;
	private Material material;

	public AtomBlock(String name, Material material,  CreativeTabs tab) {
		super(material);
		this.name = name;
		this.tab = tab;
		this.material = material;
	}

	public void mainRegister() {
		init();
		register();
	}

	private void register() {
		setBlockName(name);
		setCreativeTab(tab);
		
		setTexture();
	}

	private void init() {
		GameRegistry.registerBlock(this, name);
	}
	
	private void setTexture(){
		setBlockTextureName(Reference.MOD_ID + ":" + name);
	}
}
