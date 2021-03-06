package com.mjr.extraplanets.world.features;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;
import com.mjr.extraplanets.util.MessageUtilities;
import com.mjr.extraplanets.util.WorldGenHelper;

public class WorldGenLogTree extends WorldGenerator {

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		if (WorldGenHelper.checkValidSpawn(world, x, y, z, 5) == false)
			return false;
		else {
			if (Config.debugMode)
				MessageUtilities.debugMessageToLog("Spawning Brown Hut at (x, y, z)" + x + " " + y + " " + z);

			return generatreStructure(world, rand, x, y, z);
		}
	}

	public boolean generatreStructure(World world, Random rand, int x, int y, int z) {
		world.setBlock(x + 6, y + 0, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 0, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 4, y + 0, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 5, y + 0, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 6, y + 0, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 0, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 8, y + 0, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 9, y + 0, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 5, y + 0, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 6, y + 0, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 0, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 8, y + 0, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 6, y + 0, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 0, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 6, y + 1, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 1, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 6, y + 1, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 1, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 2, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 6, y + 2, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 2, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 8, y + 2, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 5, y + 2, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 6, y + 2, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 2, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 6, y + 2, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 8, y + 3, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 8, y + 3, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 8, y + 3, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 5, y + 3, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 6, y + 3, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 5, y + 3, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 6, y + 3, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 4, y + 3, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 5, y + 3, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 6, y + 3, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 4, y + 4, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 8, y + 4, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 9, y + 4, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 8, y + 4, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 9, y + 4, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 2, y + 4, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 3, y + 4, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 4, y + 4, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 5, y + 4, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 3, y + 4, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 4, y + 4, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 5, y + 4, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 6, y + 4, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 4, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 6, y + 4, z + 10, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 7, y + 4, z + 10, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 5, y + 5, z + 2, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 10, y + 5, z + 2, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 3, y + 5, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 4, y + 5, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 5, y + 5, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 10, y + 5, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 11, y + 5, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 3, y + 5, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 4, y + 5, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 9, y + 5, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 10, y + 5, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 3, y + 5, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 9, y + 5, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 10, y + 5, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 11, y + 5, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 2, y + 5, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 3, y + 5, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 10, y + 5, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 11, y + 5, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 2, y + 5, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 3, y + 5, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 10, y + 5, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 11, y + 5, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 2, y + 5, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 3, y + 5, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 5, z + 10, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 7, y + 5, z + 11, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 8, y + 5, z + 11, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 10, y + 6, z + 2, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 4, y + 6, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 10, y + 6, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 3, y + 6, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 4, y + 6, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 2, y + 6, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 3, y + 6, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 4, y + 6, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 10, y + 6, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 2, y + 6, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 3, y + 6, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 10, y + 6, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 11, y + 6, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 10, y + 6, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 11, y + 6, z + 7, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 10, y + 6, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 11, y + 6, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 10, y + 6, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 4, y + 7, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 5, y + 7, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 3, y + 7, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 4, y + 7, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 5, y + 7, z + 4, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 4, y + 7, z + 5, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 9, y + 7, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 5, 3);
		world.setBlock(x + 10, y + 7, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 11, y + 7, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 9, y + 7, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 9, 3);
		world.setBlock(x + 10, y + 7, z + 9, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 5, y + 8, z + 3, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		world.setBlock(x + 9, y + 8, z + 8, ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 3);
		return true;

	}
}