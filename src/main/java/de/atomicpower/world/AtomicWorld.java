package de.atomicpower.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class AtomicWorld {

	public void mainRegistry(){
		initWorldGeneration();
	}
	
	private void initWorldGeneration(){
		registerWorldGeneration(new AtomicOres(), 1);
	}
	
	private void registerWorldGeneration(IWorldGenerator worldGen, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGen, weightedProbability);
	}
	
}
