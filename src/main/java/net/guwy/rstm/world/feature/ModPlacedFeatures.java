package net.guwy.rstm.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> PALE_CREAM_TREE_PLACED =
            PlacementUtils.register("pale_cream_tree_placed",
                    ModConfiguredFeatures.PALE_CREAM_TREE_SPAWN, treePlacement(
                            PlacementUtils.countExtra(0, 0.01F, 1)));

    public static final Holder<PlacedFeature> FLOWER_LAVENDER_PLACED = PlacementUtils.register(
            "flower_lavender_placed", ModConfiguredFeatures.FLOWER_LAVENDER, RarityFilter.
                    onAverageOnceEvery(16), InSquarePlacement.spread(),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
}
