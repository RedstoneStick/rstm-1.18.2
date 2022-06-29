package net.guwy.rstm.item;

import net.guwy.rstm.ModCreativeModTabs;
import net.guwy.rstm.RsTm;
import net.guwy.rstm.item.custom.BoomStickItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RsTm.MOD_ID);


    // Tools
    public static final RegistryObject<Item> BOOMSTICK = ITEMS.register("boomstick",
            () -> new BoomStickItem(new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)
                    .durability(1)));



    // Materials
    public static final RegistryObject<Item> IGNITER = ITEMS.register("igniter",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Ingots
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> THORIUM_INGOT = ITEMS.register("thorium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Nuggets
    public static final RegistryObject<Item> MAGNESIUM_NUGGET = ITEMS.register("magnesium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> PALLADIUM_NUGGET = ITEMS.register("palladium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> THORIUM_NUGGET = ITEMS.register("thorium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Dusts
    public static final RegistryObject<Item> FLUORITE_DUST = ITEMS.register("fluorite_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> MAGNESIUM_DUST = ITEMS.register("magnesium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> NITER_DUST = ITEMS.register("niter_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> THORIUM_DUST = ITEMS.register("thorium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Crushed
    public static final RegistryObject<Item> FLUORITE_CLUSTER = ITEMS.register("fluorite_cluster",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> MAGNESIUM_CRUSHED = ITEMS.register("magnesium_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> PLATINUM_CRUSHED = ITEMS.register("platinum_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> THORIUM_CRUSHED = ITEMS.register("thorium_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_CRUSHED = ITEMS.register("titanium_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> URANIUM_CRUSHED = ITEMS.register("uranium_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Raw Ores
    public static final RegistryObject<Item> MAGNESIUM_RAW = ITEMS.register("magnesium_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> THORIUM_RAW = ITEMS.register("thorium_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_RAW = ITEMS.register("titanium_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> URANIUM_RAW = ITEMS.register("uranium_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Misc Materials
    public static final RegistryObject<Item> SCRAP_METAL = ITEMS.register("scrap_metal",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> ASH = ITEMS.register("ash",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> DUST = ITEMS.register("dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));






    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
