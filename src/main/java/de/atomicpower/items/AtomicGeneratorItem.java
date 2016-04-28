package de.atomicpower.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import de.atomicpower.Main.AtomicPower;
import de.atomicpower.abstracts.AtomItem;
import de.atomicpower.lib.Reference;

public class AtomicGeneratorItem extends AtomItem {

	public AtomicGeneratorItem(String name) {
		super(name);

	}

	public boolean onItemUse(ItemStack itemstack, EntityPlayer player,
			World world, int x, int y, int z, int side, float x2, float y2,
			float z2) {
		if (!world.isRemote) {
			if(side == 1){
				world.setBlock(x, y+1, z, AtomicPower.blockRegistry.getBlockContainerByName("atomicGenerator"));
			}
		}
		return false;
	}
	
	public void setTexture(){
		setTextureName("diamond");
	}
	

}
