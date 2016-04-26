package de.atomicpower.abstracts;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;

public abstract class AtomTileEntity extends TileEntity {
	protected String name;
	protected Class tileClass;
	
	public AtomTileEntity(Class<? extends TileEntity> tileClass, String name) {
		this.name = name;
		this.tileClass = tileClass;
	}

	public void mainRegister() {
		GameRegistry.registerTileEntity(tileClass, name);
	}
	
	public Class getTileClass() {
		return tileClass;
	}

}
