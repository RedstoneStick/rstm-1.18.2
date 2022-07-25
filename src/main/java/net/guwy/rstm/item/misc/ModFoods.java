package net.guwy.rstm.item.misc;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties NOODLES_CHICKEN_XL = (new FoodProperties.Builder()).nutrition(16).saturationMod(0.2F).build();
    public static final FoodProperties NOODLES_CHICKEN_XL_RAW = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.2F).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 1200, 0), 0.7f).build();
    public static final FoodProperties NOODLES_CURRY = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.2F).build();
}
