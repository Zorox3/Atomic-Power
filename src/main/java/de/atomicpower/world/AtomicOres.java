package de.atomicpower.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import de.atomicpower.Main.AtomicPower;

public class AtomicOres implements IWorldGenerator {

	public static final int DEFAULT_CHUNK_SIZE = 16;

	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch (world.provider.dimensionId) {
		case -1:
			generateNether(random, chunkX * DEFAULT_CHUNK_SIZE, chunkZ * DEFAULT_CHUNK_SIZE, world);
			break;
		case 0:
			generateOverworld(random, chunkX * DEFAULT_CHUNK_SIZE, chunkZ * DEFAULT_CHUNK_SIZE, world);
			break;
		case 1:
			generateEnd(random, chunkX * DEFAULT_CHUNK_SIZE, chunkZ * DEFAULT_CHUNK_SIZE, world);
			break;

		}
		
	}
	
	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVienSize, int maxVienSize, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			int xPos = posX + random.nextInt(DEFAULT_CHUNK_SIZE);
			int yPos = minY+ random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(DEFAULT_CHUNK_SIZE);
			
			new WorldGenMinable(block, (minVienSize + random.nextInt(maxVienSize - minVienSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
		}
	}

	private void generateEnd(Random random, int posX, int posZ, World world) {
		
	}

	private void generateOverworld(Random random, int posX, int posZ, World world) {
		
		addOre(AtomicPower.blockRegistry.getItemByName("atomicGenerator"), Blocks.stone, random, world, posX, posZ, 5, 100, 10, 20, 30);
		
	}

	private void generateNether(Random random, int posX, int posZ, World world) {
		
	}

}
