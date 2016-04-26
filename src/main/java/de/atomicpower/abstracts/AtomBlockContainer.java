package de.atomicpower.abstracts;

import cpw.mods.fml.common.registry.GameRegistry;
import de.atomicpower.Main.AtomicPower;
import de.atomicpower.creativetabs.AtomicTabs;
import de.atomicpower.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public abstract class AtomBlockContainer extends BlockContainer {
	protected String name;
	private Material material;

	public AtomBlockContainer(String name, Material material) {
		super(material);
		this.name = name;
		this.material = material;

		setTexture();
		setBlockName(name);

	}

	public void mainRegister() {
		init();
		register();
	}

	private void init() {
		setCreativeTab(AtomicPower.tabs.get("blocks"));
	}

	private void register() {
		GameRegistry.registerBlock(this, name);
	}

	private void setTexture() {
		setBlockTextureName(Reference.MOD_ID + ":" + name);
	}
}