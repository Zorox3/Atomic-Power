package de.atomicpower.Main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.atomicpower.blocks.BlockRegistry;
import de.atomicpower.items.ItemRegistry;
import de.atomicpower.lib.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class AtomicPower {

	public static ItemRegistry itemRegistry;
	public static BlockRegistry blockRegistry;
	
	
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
	public static ServerProxy serverproxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent preEvent){
		
		
		itemRegistry = new ItemRegistry();
		blockRegistry = new BlockRegistry();
		
		itemRegistry.register();
		blockRegistry.register();
		
		
		serverproxy.registerRenderInfo();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent postEvent){
		
	}
	
}
