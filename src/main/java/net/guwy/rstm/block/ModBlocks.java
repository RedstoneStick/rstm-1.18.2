package net.guwy.rstm.block;

import net.guwy.rstm.ModCreativeModTabs;
import net.guwy.rstm.RsTm;
import net.guwy.rstm.block.custom.*;
import net.guwy.rstm.item.ModItems;
import net.guwy.rstm.world.feature.tree.PaleCreamTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.CallbackI;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RsTm.MOD_ID);



    // Black Sand and its variants
    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).strength(3f).
                    explosionResistance(3f).requiresCorrectToolForDrops().
                    color(MaterialColor.COLOR_BLACK).sound(SoundType.SAND)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> BLACK_SAND_DIAMOND_ORE = registerBlock("black_sand_diamond_ore", () ->
            new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).strength(3f).
                    explosionResistance(3f).requiresCorrectToolForDrops().
                    color(MaterialColor.COLOR_BLACK).sound(SoundType.SAND)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> BLACK_SAND_GOLD_ORE = registerBlock("black_sand_gold_ore", () ->
            new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).strength(3f).
                    explosionResistance(3f).requiresCorrectToolForDrops().
                    color(MaterialColor.COLOR_BLACK).sound(SoundType.SAND)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> BLACK_SAND_PLATINUM_ORE = registerBlock("black_sand_platinum_ore", () ->
            new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).strength(3f).
                    explosionResistance(3f).requiresCorrectToolForDrops().
                    color(MaterialColor.COLOR_BLACK).sound(SoundType.SAND)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> BLACK_SAND_THORIUM_ORE = registerBlock("black_sand_thorium_ore", () ->
            new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).strength(3f).
                    explosionResistance(3f).requiresCorrectToolForDrops().
                    color(MaterialColor.COLOR_BLACK).sound(SoundType.SAND)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> BLACK_SAND_TITANIUM_ORE = registerBlock("black_sand_titanium_ore", () ->
            new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).strength(3f).
                    explosionResistance(3f).requiresCorrectToolForDrops().
                    color(MaterialColor.COLOR_BLACK).sound(SoundType.SAND)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> BLACK_SAND_URANIUM_ORE = registerBlock("black_sand_uranium_ore", () ->
            new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).strength(3f).
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
            sound(SoundType.TUFF)), ModCreativeModTabs.BLOCKS, "tooltip.rstm.pavement");

    public static final RegistryObject<Block> PAVEMENT_SLAB = registerBlock("pavement_slab", () -> new PavementSlabBlock(BlockBehaviour.
            Properties.of(Material.STONE).strength(1.5f).explosionResistance(6f).requiresCorrectToolForDrops().
            sound(SoundType.TUFF)), ModCreativeModTabs.BLOCKS, "tooltip.rstm.pavement");

    public static final RegistryObject<Block> PAVEMENT_STAIRS = registerBlock("pavement_stairs", () -> new PavementStairsBlock(
            () -> ModBlocks.PAVEMENT.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).
            explosionResistance(6f).requiresCorrectToolForDrops().
            sound(SoundType.TUFF)), ModCreativeModTabs.BLOCKS, "tooltip.rstm.pavement");

    public static final RegistryObject<Block> PAVEMENT_WALL = registerBlock("pavement_wall", () -> new PavementWallBlock(BlockBehaviour.
            Properties.of(Material.STONE).strength(1.5f).explosionResistance(6f).requiresCorrectToolForDrops().
            sound(SoundType.TUFF)), ModCreativeModTabs.BLOCKS, "tooltip.rstm.pavement");

    public static final RegistryObject<Block> PAVEMENT_BRICKS = registerBlock("pavement_bricks", () -> new PavementBlock(BlockBehaviour.
            Properties.of(Material.STONE).strength(1.5f).explosionResistance(6f).requiresCorrectToolForDrops().
            sound(SoundType.TUFF)), ModCreativeModTabs.BLOCKS, "tooltip.rstm.pavement");

    public static final RegistryObject<Block> PAVEMENT_BRICKS_SLAB = registerBlock("pavement_bricks_slab", () -> new PavementSlabBlock(
            BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).explosionResistance(6f).
                    requiresCorrectToolForDrops().sound(SoundType.TUFF)), ModCreativeModTabs.BLOCKS, "tooltip.rstm.pavement");

    public static final RegistryObject<Block> PAVEMENT_BRICKS_STAIRS = registerBlock("pavement_bricks_stairs", () -> new PavementStairsBlock(
            () -> ModBlocks.PAVEMENT.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).
            explosionResistance(6f).requiresCorrectToolForDrops().
            sound(SoundType.TUFF)), ModCreativeModTabs.BLOCKS, "tooltip.rstm.pavement");

    public static final RegistryObject<Block> PAVEMENT_BRICKS_WALL = registerBlock("pavement_bricks_wall", () -> new PavementWallBlock(
            BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).explosionResistance(6f).
                    requiresCorrectToolForDrops().sound(SoundType.TUFF)), ModCreativeModTabs.BLOCKS, "tooltip.rstm.pavement");





    // Woods
    public static final RegistryObject<Block> PALE_CREAM_SAPLING = registerBlock("pale_cream_sapling", () -> new SaplingBlock(
            new PaleCreamTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)) {
        @Override
        protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
            return pState.is(BlockTags.SAND);
        }
    },
            CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> PALE_CREAM_LEAVES = registerBlock("pale_cream_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2f).
                    explosionResistance(0.2f).sound(SoundType.AZALEA_LEAVES).noOcclusion()) {
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 60;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 30;
        }
        },
            CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> PALE_CREAM_LOG = registerBlock("pale_cream_log", ()
            -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).
            explosionResistance(2f).sound(SoundType.WOOD)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_LOG_STRIPPED = registerBlock("pale_cream_log_stripped", ()
            -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).
            explosionResistance(2f).sound(SoundType.WOOD)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_WOOD = registerBlock("pale_cream_wood", ()
            -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).
            explosionResistance(2f).sound(SoundType.WOOD)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_WOOD_STRIPPED = registerBlock("pale_cream_wood_stripped", ()
            -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).
            explosionResistance(2f).sound(SoundType.WOOD)), ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_PLANKS = registerBlock("pale_cream_planks", () -> new Block(BlockBehaviour.
            Properties.of(Material.WOOD).strength(2f).explosionResistance(3f).sound(SoundType.WOOD))
    {
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 20;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 5;
        }
    }, ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_SLAB = registerBlock("pale_cream_slab", () -> new SlabBlock(BlockBehaviour.
            Properties.of(Material.WOOD).strength(2f).explosionResistance(3f).sound(SoundType.WOOD))
    {
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 20;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 5;
        }
    }, ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_STAIRS = registerBlock("pale_cream_stairs", () -> new StairBlock(
            () -> ModBlocks.PALE_CREAM_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f).
            explosionResistance(3f).sound(SoundType.WOOD)){
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 20;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 5;
        }
    }, ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_FENCE = registerBlock("pale_cream_fence", () -> new FenceBlock(BlockBehaviour.
            Properties.of(Material.WOOD).strength(2f).explosionResistance(3f).sound(SoundType.WOOD))
    {
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 20;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 5;
        }
    }, ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_FENCE_GATE = registerBlock("pale_cream_fence_gate", () -> new FenceGateBlock(
            BlockBehaviour.Properties.of(Material.WOOD).strength(2f).explosionResistance(3f).sound(SoundType.WOOD))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }, ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_BUTTON = registerBlock("pale_cream_button", () -> new WoodButtonBlock(
            BlockBehaviour.Properties.of(Material.WOOD).strength(2f).explosionResistance(3f)
                    .noCollission().sound(SoundType.WOOD)){
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 20;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 5;
        }
    }, ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_PRESSURE_PLATE = registerBlock("pale_cream_pressure_plate", () -> new
            PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD).strength(2f).
            explosionResistance(3f).sound(SoundType.WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }, ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_DOOR = registerBlock("pale_cream_door", () -> new DoorBlock(
            BlockBehaviour.Properties.of(Material.WOOD).strength(2f).explosionResistance(3f)
                    .noOcclusion().sound(SoundType.WOOD)){
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 20;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 5;
        }
    }, ModCreativeModTabs.BLOCKS);

    public static final RegistryObject<Block> PALE_CREAM_TRAPDOOR = registerBlock("pale_cream_trapdoor", () -> new TrapDoorBlock(
            BlockBehaviour.Properties.of(Material.WOOD).strength(2f).explosionResistance(3f)
                    .noOcclusion().sound(SoundType.WOOD)){
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 20;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 5;
        }
    }, ModCreativeModTabs.BLOCKS);



    // Crafting Materials
    public static final RegistryObject<Block> MODULAR_FRAME = registerBlock("modular_frame", () -> new Block(BlockBehaviour.
            Properties.of(Material.METAL).strength(5f).explosionResistance(6f).
            sound(SoundType.METAL).noOcclusion().isSuffocating((p_61036_, p_61037_, p_61038_) -> false).isViewBlocking((p_61036_, p_61037_, p_61038_)
                    -> false)), ModCreativeModTabs.MATERIALS, "tooltip.rstm.crafting_material");

    public static final RegistryObject<Block> MODULAR_FRAME_HEAVY = registerBlock("modular_frame_heavy", () -> new Block(BlockBehaviour.
            Properties.of(Material.METAL).strength(5f).explosionResistance(6f).
            sound(SoundType.METAL).noOcclusion().isSuffocating((p_61036_, p_61037_, p_61038_) -> false).isViewBlocking((p_61036_, p_61037_, p_61038_)
                    -> false)), ModCreativeModTabs.MATERIALS, "tooltip.rstm.crafting_material");

    public static final RegistryObject<Block> SCREWS = registerBlock("screws", () -> new Block(BlockBehaviour.
            Properties.of(Material.METAL).strength(5f).explosionResistance(6f).
            sound(SoundType.METAL).noOcclusion().isSuffocating((p_61036_, p_61037_, p_61038_) -> false)),
            ModCreativeModTabs.MATERIALS, "tooltip.rstm.crafting_material");

    public static final RegistryObject<Block> STEEL_BEAM = registerBlock("steel_beam", () -> new Block(BlockBehaviour.
            Properties.of(Material.METAL).strength(5f).explosionResistance(6f).
            sound(SoundType.METAL).noOcclusion().isSuffocating((p_61036_, p_61037_, p_61038_) -> false)),
            ModCreativeModTabs.MATERIALS, "tooltip.rstm.crafting_material");

    public static final RegistryObject<Block> STEEL_PIPES = registerBlock("steel_pipes", () -> new Block(BlockBehaviour.
            Properties.of(Material.METAL).strength(5f).explosionResistance(6f).
            sound(SoundType.METAL).noOcclusion().isSuffocating((p_61036_, p_61037_, p_61038_) -> false)),
            ModCreativeModTabs.MATERIALS, "tooltip.rstm.crafting_material");

    public static final RegistryObject<Block> TITANIUM_BEAM = registerBlock("titanium_beam", () -> new Block(BlockBehaviour.
            Properties.of(Material.METAL).strength(5f).explosionResistance(6f).
            sound(SoundType.METAL).noOcclusion().isSuffocating((p_61036_, p_61037_, p_61038_) -> false)),
            ModCreativeModTabs.MATERIALS, "tooltip.rstm.crafting_material");

    public static final RegistryObject<Block> TITANIUM_PIPES = registerBlock("titanium_pipes", () -> new Block(BlockBehaviour.
            Properties.of(Material.METAL).strength(5f).explosionResistance(6f).
            sound(SoundType.METAL).noOcclusion().isSuffocating((p_61036_, p_61037_, p_61038_) -> false)),
            ModCreativeModTabs.MATERIALS, "tooltip.rstm.crafting_material");



    // Plants
    public static final RegistryObject<Block> LAVENDER = registerBlock("lavender", () -> new FlowerBlock(
            MobEffects.ABSORPTION, 10, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion()){
                @Override
                public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer,
                                             InteractionHand pHand, BlockHitResult pHit) {
                    if(pPlayer.getItemInHand(pHand).getItem() == Items.BONE_MEAL){
                        if(!pPlayer.isCreative()) {
                            pPlayer.getItemInHand(pHand).shrink(1);
                        }
                        pLevel.addFreshEntity(new ItemEntity(pLevel, pPos.getX() + 0.5f,
                                pPos.getY() + 0.5f, pPos.getZ() + 0.5f,
                                new ItemStack(ModBlocks.LAVENDER.get())));

                        BoneMealItem.addGrowthParticles(pLevel, pPos, 15);
                    }
                    return InteractionResult.SUCCESS;
                }
            },
            CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> LAVENDER_POTTED = registerBlockWithoutBlockItem("lavender_potted", ()
            -> new FlowerPotBlock(null, ModBlocks.LAVENDER, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));





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



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }


    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);}
}
