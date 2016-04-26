package de.atomicpower.Main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.atomicpower.blocks.BlockRegistry;
import de.atomicpower.creativetabs.AtomicTabs;
import de.atomicpower.items.ItemRegistry;
import de.atomicpower.lib.Reference;
import de.atomicpower.world.AtomicWorld;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class AtomicPower {

	public static ItemRegistry itemRegistry;
	public static BlockRegistry blockRegistry;

	private static CraftingManager craftingManager;
	private static AtomicWorld world;
	public static AtomicTabs tabs;

	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
	public static ServerProxy serverproxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent preEvent) {

		itemRegistry = new ItemRegistry();
		blockRegistry = new BlockRegistry();
		
		tabs = new AtomicTabs();

		
		craftingManager = new CraftingManager();
		world = new AtomicWorld();

		itemRegistry.register();
		blockRegistry.register();


		
		craftingManager.init();

		world.mainRegistry();

		serverproxy.registerRenderInfo();
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent postEvent) {

	}

}
