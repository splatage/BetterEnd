package org.polydev.gaea.terrain2;

import org.polydev.gaea.world.palette.BlockPalette;
import org.polydev.gaea.math.FastNoise;

public abstract class BiomeTerrain {
    public BiomeTerrain() {}

    /**
     * Gets the 2D noise at a pair of coordinates using the provided FastNoise instance.
     * @param gen - The FastNoise instance to use.
     * @param x - The x coordinate.
     * @param z - The z coordinate.
     * @return double - Noise value at the specified coordinates.
     */
    public abstract double getNoise(FastNoise gen, int x, int z);

    /**
     * Gets the BlocPalette to generate the biome with.
     * @return BlocPalette - The biome's palette.
     */
    public abstract BlockPalette getPalette();
}
