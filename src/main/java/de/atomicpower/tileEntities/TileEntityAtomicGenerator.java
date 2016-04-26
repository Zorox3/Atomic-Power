package de.atomicpower.tileEntities;

import net.minecraft.tileentity.TileEntity;
import de.atomicpower.abstracts.AtomTileEntity;

public class TileEntityAtomicGenerator extends AtomTileEntity{

	public TileEntityAtomicGenerator(Class<? extends TileEntity> TileClass,
			String name) {
		super(TileClass, name);
	}

}
