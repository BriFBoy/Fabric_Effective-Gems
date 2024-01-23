package net.brifboy.effectivegems.world;

import net.brifboy.effectivegems.EffectiveGems;
import net.brifboy.effectivegems.block.Modblock;
import net.minecraft.registry.Registerable;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;


public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_GEM_ORE_KEY = registerKey("green_gem_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_GEM_ORE_KEY = registerKey("blue_gem_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_GEM_ORE_KEY = registerKey("black_gem_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest StoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest NetherrackReplacable = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);

        List<OreFeatureConfig.Target> overworldGreenGemOre =
                List.of(OreFeatureConfig.createTarget(StoneReplacables, Modblock.GREEN_GEM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, Modblock.DEEPSLATE_GREEN_GEM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldBlueGemOre =
                List.of(OreFeatureConfig.createTarget(StoneReplacables, Modblock.BLUE_GEM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, Modblock.DEEPSTALE_BLUE_GEM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherBlackGemOre =
                List.of(OreFeatureConfig.createTarget(NetherrackReplacable, Modblock.NETHER_BLACK_GEM_ORE.getDefaultState()));


        register(context, GREEN_GEM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldGreenGemOre, 20));
        register(context, BLUE_GEM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBlueGemOre, 8));
        register(context, BLACK_GEM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherBlackGemOre, 4));



    }




    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(EffectiveGems.MOD_ID, name));
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
