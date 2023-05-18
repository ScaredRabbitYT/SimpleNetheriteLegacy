package net.scaredrabbit.simplenetherite.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.scaredrabbit.simplenetherite.SimpleNetherite;
import net.scaredrabbit.simplenetherite.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> NETHERITE_ORE_KEY = registerKey("netherite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> END_NETHERITE_ORE_KEY = registerKey("endstone_netherite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> STONE_NETHERITE_ORE_KEY = registerKey("stone_netherite_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        RuleTest stoneRepleceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endstoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldNetheriteOres =
                List.of(OreFeatureConfig.createTarget(stoneRepleceables, ModBlocks.STONE_NETHERITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_NETHERITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherNetheriteOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHERITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endNetheriteOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplaceables, ModBlocks.ENDSTONE_NETHERITE_ORE.getDefaultState()));

        register(context, NETHERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherNetheriteOres,6));
        register(context, STONE_NETHERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldNetheriteOres,8));
        register(context, END_NETHERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endNetheriteOres,6));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(SimpleNetherite.MODID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
