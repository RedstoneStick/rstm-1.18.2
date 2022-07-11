package net.guwy.rstm.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier TITANIUM = new ForgeTier(3, 900, 4f, 3f,
            5, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get()));

    public static final ForgeTier SCRAP_METAL = new ForgeTier(1, 200, 4f, 1f,
            5, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get()));
}
