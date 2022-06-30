package net.guwy.rstm.block;

import net.guwy.rstm.ModCreativeModTabs;
import net.guwy.rstm.RsTm;
import net.guwy.rstm.block.custom.PavementBlock;
import net.guwy.rstm.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RsTm.MOD_ID);



    // Black Sand and its variants
    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand", () ->
            new Block(BlockBehaviour.Properties.of(Material.SAND).strength(3f).
                    explosionResistance(3f).requiresCorrectToolForDrops().
                    color(MaterialColor.COLOR_BLACK).sound(SoundType.SAND)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> BLACK_SAND_DIAMOND_ORE = registerBlock("black_sand_diamond_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.SAND).strength(3f).
                    explosionResistance(3f).requiresCorrectToolForDrops().
                    color(MaterialColor.COLOR_BLACK).sound(SoundType.SAND)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> BLACK_SAND_GOLD_ORE = registerBlock("black_sand_gold_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.SAND).strength(3f).
                    explosionResistance(3f).requiresCorrectToolForDrops().
                    color(MaterialColor.COLOR_BLACK).sound(SoundType.SAND)), ModCreativeModTabs.BLOCKS);



    // Ores
    public static final RegistryObject<Block> FLUORITE_ORE = registerBlock("fluorite_ore", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(3f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.STONE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> FLUORITE_ORE_DEEPSLATE = registerBlock("fluorite_ore_deepslate", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(4.5f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.DEEPSLATE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> MAGNESIUM_ORE = registerBlock("magnesium_ore", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(3f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.STONE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> MAGNESIUM_ORE_DEEPSLATE = registerBlock("magnesium_ore_deepslate", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(4.5f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.DEEPSLATE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> NITER_ORE = registerBlock("niter_ore", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(3f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.STONE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> NITER_ORE_DEEPSLATE = registerBlock("niter_ore_deepslate", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(4.5f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.DEEPSLATE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALLADIUM_ORE = registerBlock("palladium_ore", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(3f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.STONE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALLADIUM_ORE_DEEPSLATE = registerBlock("palladium_ore_deepslate", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(4.5f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.DEEPSLATE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(3f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.STONE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PLATINUM_ORE_DEEPSLATE = registerBlock("platinum_ore_deepslate", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(4.5f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.DEEPSLATE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> THORIUM_ORE = registerBlock("thorium_ore", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(3f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.STONE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> THORIUM_ORE_DEEPSLATE = registerBlock("thorium_ore_deepslate", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(4.5f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.DEEPSLATE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(3f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.STONE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> TITANIUM_ORE_DEEPSLATE = registerBlock("titanium_ore_deepslate", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(4.5f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.DEEPSLATE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> URANIUM_ORE = registerBlock("uranium_ore", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(3f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.STONE)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> URANIUM_ORE_DEEPSLATE = registerBlock("uranium_ore_deepslate", () -> new Block(BlockBehaviour.
            Properties.of(Material.STONE).strength(4.5f).explosionResistance(3f).requiresCorrectToolForDrops().
            sound(SoundType.DEEPSLATE)), ModCreativeModTabs.BLOCKS);



    // Building Blocks
    public static final RegistryObject<Block> PAVEMENT = registerBlock("pavement", () -> new PavementBlock(BlockBehaviour.
            Properties.of(Material.STONE).strength(1.5f).explosionResistance(6f).requiresCorrectToolForDrops().
            sound(SoundType.TUFF)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PAVEMENT_BRICKS = registerBlock("pavement_bricks", () -> new PavementBlock(BlockBehaviour.
            Properties.of(Material.STONE).strength(1.5f).explosionResistance(6f).requiresCorrectToolForDrops().
            sound(SoundType.TUFF)), ModCreativeModTabs.BLOCKS);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);}
}
