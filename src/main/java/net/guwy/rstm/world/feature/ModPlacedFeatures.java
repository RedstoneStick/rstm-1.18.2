package net.guwy.rstm.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

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

    public static final Holder<PlacedFeature> FLUORITE_ORE_PLACED = PlacementUtils.register("fluorite_ore_placed",
            ModConfiguredFeatures.FLUORITE_ORE, ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-70), VerticalAnchor.absolute(40))));

    public static final Holder<PlacedFeature> MAGNESIUM_ORE_PLACED = PlacementUtils.register("magnesium_ore_placed",
            ModConfiguredFeatures.MAGNESIUM_ORE, ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(60))));

    public static final Holder<PlacedFeature> NITER_ORE_PLACED = PlacementUtils.register("niter_ore_placed",
            ModConfiguredFeatures.NITER_ORE, ModOrePlacement.commonOrePlacement(12, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(50))));

    public static final Holder<PlacedFeature> PALLADIUM_ORE_PLACED = PlacementUtils.register("palladium_ore_placed",
            ModConfiguredFeatures.PALLADIUM_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-100), VerticalAnchor.absolute(-20))));

    public static final Holder<PlacedFeature> PLATINUM_ORE_PLACED = PlacementUtils.register("platinum_ore_placed",
            ModConfiguredFeatures.PLATINUM_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-100), VerticalAnchor.absolute(-20))));

    public static final Holder<PlacedFeature> THORIUM_ORE_PLACED = PlacementUtils.register("thorium_ore_placed",
            ModConfiguredFeatures.THORIUM_ORE, ModOrePlacement.commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(40))));

    public static final Holder<PlacedFeature> TITANIUM_ORE_PLACED = PlacementUtils.register("titanium_ore_placed",
            ModConfiguredFeatures.TITANIUM_ORE, ModOrePlacement.commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-66), VerticalAnchor.absolute(24))));

    public static final Holder<PlacedFeature> URANIUM_ORE_PLACED = PlacementUtils.register("uranium_ore_placed",
            ModConfiguredFeatures.URANIUM_ORE, ModOrePlacement.commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-150), VerticalAnchor.absolute(22))));

    public static final Holder<PlacedFeature> BAUXITE_SOIL_PLACED = PlacementUtils.register("bauxite_soil_placed",
            ModConfiguredFeatures.BAUXITE_SOIL, ModOrePlacement.rareOrePlacement(18, // VeinsEveryXAmountOfChunks
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(50), VerticalAnchor.absolute(150))));
}
