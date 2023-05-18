package net.scaredrabbit.simplenetherite.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

public class ModWorldGen {
    public static void generateWorldGen(){
        ModOreGeneration.generateOres();
    }
}
