package net.guwy.rstm.world.feature;

import net.guwy.rstm.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {
    // Trees
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PALE_CREAM_TREE =
            FeatureUtils.register("pale_cream_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.PALE_CREAM_LOG.get()),
                    new StraightTrunkPlacer(4, 2, 3),
                    BlockStateProvider.simple(ModBlocks.PALE_CREAM_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirt(BlockStateProvider.simple(Blocks.SAND)).build());

    public static final Holder<PlacedFeature> PALE_CREAM_TREE_CHECKED =
            PlacementUtils.register("pale_cream_tree_checked", PALE_CREAM_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.PALE_CREAM_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> PALE_CREAM_TREE_SPAWN =
            FeatureUtils.register("pale_cream_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            PALE_CREAM_TREE_CHECKED, 0.01F)),
                            PALE_CREAM_TREE_CHECKED));



    // Flowers
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_LAVENDER =
            FeatureUtils.register("flower_lavender", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(
                            Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(
                                    ModBlocks.LAVENDER.get())))));



    // Ores
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_FLUORITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.FLUORITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.FLUORITE_ORE_DEEPSLATE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FLUORITE_ORE = FeatureUtils.register("fluorite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_FLUORITE_ORES, 5));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_MAGNESIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MAGNESIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.MAGNESIUM_ORE_DEEPSLATE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MAGNESIUM_ORE = FeatureUtils.register("magnesium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_MAGNESIUM_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_NITER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.NITER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.NITER_ORE_DEEPSLATE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NITER_ORE = FeatureUtils.register("niter_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_NITER_ORES, 5));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PALLADIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PALLADIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.PALLADIUM_ORE_DEEPSLATE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PALLADIUM_ORE = FeatureUtils.register("palladium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PALLADIUM_ORES, 3));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PLATINUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PLATINUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.PLATINUM_ORE_DEEPSLATE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PLATINUM_ORE = FeatureUtils.register("platinum_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PLATINUM_ORES, 5));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_THORIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.THORIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.THORIUM_ORE_DEEPSLATE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> THORIUM_ORE = FeatureUtils.register("thorium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_THORIUM_ORES, 12));

}
    /**
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CITRINE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CITRINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.CITRINE_ORE_DEEPSLATE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CITRINE_ORE = FeatureUtils.register("ebony_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CITRINE_ORES, 9));
     **/
