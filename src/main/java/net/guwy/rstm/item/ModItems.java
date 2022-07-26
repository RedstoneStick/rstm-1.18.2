package net.guwy.rstm.item;

import net.guwy.rstm.ModCreativeModTabs;
import net.guwy.rstm.RsTm;
import net.guwy.rstm.item.custom.*;
import net.guwy.rstm.item.misc.ModArmorMaterials;
import net.guwy.rstm.item.misc.ModFoods;
import net.guwy.rstm.item.misc.ModToolTiers;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModToolTiers.TITANIUM, 3, -3f,
                    new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModToolTiers.TITANIUM, 5, -3.5f,
                    new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TITANIUM, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModToolTiers.TITANIUM, 1, -3f,
                    new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)));

    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModToolTiers.TITANIUM, -3, 0f,
                    new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)));

    public static final RegistryObject<Item> SCRAP_METAL_SWORD = ITEMS.register("scrap_metal_sword",
            () -> new PotionSwordItem(ModToolTiers.SCRAP_METAL, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT), MobEffects.POISON, 0,
                    100, 0.3f));



    // Armors
    public static final RegistryObject<Item> SCRAP_METAL_CHESTPLATE = ITEMS.register(
            "scrap_metal_chestplate", () -> new ArmorItem(ModArmorMaterials.SCRAP_METAL,
                    EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)
                    .durability(120)));

    public static final RegistryObject<Item> SCRAP_METAL_LEGGINGS = ITEMS.register(
            "scrap_metal_leggings", () -> new ArmorItem(ModArmorMaterials.SCRAP_METAL,
                    EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)
                    .durability(120)));

    public static final RegistryObject<Item> SCRAP_METAL_BOOTS = ITEMS.register(
            "scrap_metal_boots", () -> new ArmorItem(ModArmorMaterials.SCRAP_METAL,
                    EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)
                    .durability(120)));

    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register(
            "titanium_helmet", () -> new TitaniumArmorItem(ModArmorMaterials.TITANIUM,
                    EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)
                    .durability(570)));

    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register(
            "titanium_chestplate", () -> new TitaniumArmorItem(ModArmorMaterials.TITANIUM,
                    EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)
                    .durability(570)));

    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register(
            "titanium_leggings", () -> new TitaniumArmorItem(ModArmorMaterials.TITANIUM,
                    EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)
                    .durability(570)));

    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register(
            "titanium_boots", () -> new TitaniumArmorItem(ModArmorMaterials.TITANIUM,
                    EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)
                    .durability(570)));



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

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
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

    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
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

    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
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

    public static final RegistryObject<Item> ALUMINUM_CRUSHED = ITEMS.register("aluminum_crushed",
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
            () -> new TooltipItem(new Item.Properties().tab(ModCreativeModTabs.MATERIALS),
                    "tooltip.rstm.scrap_metal"));

    public static final RegistryObject<Item> ASH = ITEMS.register("ash",
            () -> new TooltipItem(new Item.Properties().tab(ModCreativeModTabs.MATERIALS),
                    "tooltip.rstm.ash"));

    public static final RegistryObject<Item> DUST = ITEMS.register("dust",
            () -> new TooltipItem(new Item.Properties().tab(ModCreativeModTabs.MATERIALS),
                    "tooltip.rstm.dust"));



    // Components
    public static final RegistryObject<Item> IGNITER = ITEMS.register("igniter", () -> new TooltipItem(
            new Item.Properties().tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Circuits
    public static final RegistryObject<Item> CIRCUIT_BASIC = ITEMS.register(
            "circuit_basic", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_BASIC_INCOMPLETE = ITEMS.register(
            "circuit_basic_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_ENHANCED = ITEMS.register(
            "circuit_enhanced", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_ENHANCED_INCOMPLETE = ITEMS.register(
            "circuit_enhanced_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_ADVANCED = ITEMS.register(
            "circuit_advanced", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_ADVANCED_INCOMPLETE = ITEMS.register(
            "circuit_advanced_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_INDUSTRIAL_GRADE = ITEMS.register(
            "circuit_industrial_grade", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_INDUSTRIAL_GRADE_INCOMPLETE = ITEMS.register(
            "circuit_industrial_grade_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_OVERCLOCKED = ITEMS.register(
            "circuit_overclocked", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_OVERCLOCKED_INCOMPLETE = ITEMS.register(
            "circuit_overclocked_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_RELIABLE = ITEMS.register(
            "circuit_reliable", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_RELIABLE_ASSEMBLY = ITEMS.register(
            "circuit_reliable_assembly", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_RELIABLE_INCOMPLETE = ITEMS.register(
            "circuit_reliable_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_AVIONICS = ITEMS.register(
            "circuit_avionics", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_AVIONICS_INCOMPLETE = ITEMS.register(
            "circuit_avionics_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_CAPACITIVE = ITEMS.register(
            "circuit_capacitive", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_CAPACITIVE_INCOMPLETE = ITEMS.register(
            "circuit_capacitive_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));



    // Plates
    public static final RegistryObject<Item> SHEET_STEEL = ITEMS.register(
            "sheet_steel", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> SHEET_TITANIUM = ITEMS.register(
            "sheet_titanium", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> SHEET_ALUMINUM = ITEMS.register(
            "sheet_aluminum", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Wires
    public static final RegistryObject<Item> WIRE_COPPER = ITEMS.register(
            "wire_copper", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> WIRE_GOLD = ITEMS.register(
            "wire_gold", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> WIRE_STEEL = ITEMS.register(
            "wire_steel", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> WIRE_ALUMINUM = ITEMS.register(
            "wire_aluminum", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Coils
    public static final RegistryObject<Item> COIL_EMPTY = ITEMS.register(
            "coil_empty", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> COIL_COPPER = ITEMS.register(
            "coil_copper", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> COIL_GOLD = ITEMS.register(
            "coil_gold", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> COIL_ALUMINUM = ITEMS.register(
            "coil_aluminum", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Foils
    public static final RegistryObject<Item> FOIL_COPPER = ITEMS.register(
            "foil_copper", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_COPPER_INCOMPLETE = ITEMS.register(
            "foil_copper_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_IRON = ITEMS.register(
            "foil_iron", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_IRON_INCOMPLETE = ITEMS.register(
            "foil_iron_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_STEEL = ITEMS.register(
            "foil_steel", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_STEEL_INCOMPLETE = ITEMS.register(
            "foil_steel_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_TITANIUM = ITEMS.register(
            "foil_titanium", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_TITANIUM_INCOMPLETE = ITEMS.register(
            "foil_titanium_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_ALUMINUM = ITEMS.register(
            "foil_aluminum", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_ALUMINUM_INCOMPLETE = ITEMS.register(
            "foil_aluminum_incomplete", () -> new TooltipItem(new Item.Properties()
                    , "tooltip.rstm.crafting_material"));



    // Motors
    public static final RegistryObject<Item> MOTOR = ITEMS.register(
            "motor", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Panels
    public static final RegistryObject<Item> PANEL_GLASS_REINFORCED = ITEMS.register(
            "panel_glass_reinforced", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> PANEL_INSULATOR = ITEMS.register(
            "panel_insulator", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Solid Fuels
    public static final RegistryObject<Item> ROCKET_FUEL_SUGAR = ITEMS.register("rocket_fuel_sugar",
            () -> new BurnableItem(new Item.Properties().tab(ModCreativeModTabs.MATERIALS), 800));

    public static final RegistryObject<Item> ROCKET_FUEL_SOLID = ITEMS.register("rocket_fuel_solid",
            () -> new BurnableItem(new Item.Properties().tab(ModCreativeModTabs.MATERIALS), 3200));



    // Foods
    public static final RegistryObject<Item> NOODLES_CHICKEN_XL = ITEMS.register("noodles_chicken_xl",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT).food(ModFoods.NOODLES_CHICKEN_XL)));

    public static final RegistryObject<Item> NOODLES_CHICKEN_XL_RAW = ITEMS.register("noodles_chicken_xl_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT).food(ModFoods.NOODLES_CHICKEN_XL_RAW)));

    public static final RegistryObject<Item> NOODLES_CURRY = ITEMS.register("noodles_curry",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT).food(ModFoods.NOODLES_CURRY)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
