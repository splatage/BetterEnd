package com.dfsek.betterend.generation.features.generators;

import org.polydev.gaea.world.ChunkSlice;
import com.dfsek.betterend.generation.features.FeatureGenerator;
import org.bukkit.World;

import java.util.Random;

public class CloudGenerator extends FeatureGenerator {
    @Override
    public ChunkSlice generateSlice(ChunkSlice slice, Random random, World world) {
        
        return slice;
    }
}
