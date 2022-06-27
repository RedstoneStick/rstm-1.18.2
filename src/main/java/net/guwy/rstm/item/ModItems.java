package net.guwy.rstm.item;

import net.guwy.rstm.ModCreativeModTabs;
import net.guwy.rstm.RsTm;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RsTm.MOD_ID);


    // Ingots
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Nuggets
    public static final RegistryObject<Item> MAGNESIUM_NUGGET = ITEMS.register("magnesium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Dusts
    public static final RegistryObject<Item> FLUORITE_DUST = ITEMS.register("fluorite_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> MAGNESIUM_DUST = ITEMS.register("magnesium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> NITER_DUST = ITEMS.register("niter_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Crushed
    public static final RegistryObject<Item> FLUORITE_CLUSTER = ITEMS.register("fluorite_cluster",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> MAGNESIUM_CRUSHED = ITEMS.register("magnesium_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Raw Ores
    public static final RegistryObject<Item> MAGNESIUM_RAW = ITEMS.register("magnesium_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Misc Materials
    public static final RegistryObject<Item> SCRAP_METAL = ITEMS.register("scrap_metal",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
