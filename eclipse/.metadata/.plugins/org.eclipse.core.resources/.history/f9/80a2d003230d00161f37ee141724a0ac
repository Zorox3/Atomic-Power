package de.atomicpower.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import de.atomicpower.Main.AtomicPower;
import de.atomicpower.abstracts.AtomBlock;
import de.atomicpower.abstracts.AtomBlockContainer;
import de.atomicpower.tileEntities.TileEntityAtomicGenerator;

public class AtomicGenerator extends AtomBlockContainer{

	public AtomicGenerator(String name, Material material) {
		super(name, material);
	}

	
	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}

	public boolean renderAsNormalBlock(){
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return AtomicPower.tileEntityRegstry.getItemByName("atomicGeneratorTile");
	}
	
}
