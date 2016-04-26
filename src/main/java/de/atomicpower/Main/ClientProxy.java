package de.atomicpower.Main;

import cpw.mods.fml.client.registry.ClientRegistry;
import de.atomicpower.renderer.AtomicGeneratorRenderer;

public class ClientProxy extends ServerProxy {
	public void registerRenderInfo() {

	}

	public void registerProxies() {
		ClientRegistry.bindTileEntitySpecialRenderer(AtomicPower.tileEntityRegstry.getItemByName("atomicGeneratorTile").getTileClass(), new AtomicGeneratorRenderer());
	}
}
