package net.guwy.rstm.block;

import com.simibubi.create.content.contraptions.base.HalfShaftInstance;
import com.simibubi.create.repack.registrate.util.entry.BlockEntityEntry;
import net.guwy.rstm.RsTm;
import net.guwy.rstm.block.ModBlocks;
import net.guwy.rstm.block.custom.machines.generators.alternating_redstone.GeneratorAlternatingRedstoneBlockEntity;
import net.guwy.rstm.block.custom.machines.generators.alternator.GeneratorAlternatorBlock;
import net.guwy.rstm.block.custom.machines.generators.alternator.GeneratorAlternatorBlockEntity;
import net.guwy.rstm.block.custom.machines.generators.alternator.GeneratorAlternatorRenderer;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, RsTm.MOD_ID);

        public static final RegistryObject<BlockEntityType<GeneratorAlternatingRedstoneBlockEntity>>
                GENERATOR_ALTERNATING_REDSTONE_BLOCK_ENTITY = BLOCK_ENTITIES.register(
                        "generator_alternating_redstone_block_entity", () -> BlockEntityType.Builder.of(
                                GeneratorAlternatingRedstoneBlockEntity::new,
                        ModBlocks.GENERATOR_ALTERNATING_REDSTONE.get()).build(null));

    //public static final RegistryObject<BlockEntityType<GeneratorAlternatorBlockEntity>>
    //        GENERATOR_ALTERNATOR_BLOCK_ENTITY = BLOCK_ENTITIES.register(
    //        "generator_alternator_block_entity", () -> BlockEntityType.Builder.of(
    //                GeneratorAlternatorBlockEntity::new,
    //                ModBlocks.GENERATOR_ALTERNATOR.get()).build(null));

    public static final BlockEntityEntry<GeneratorAlternatorBlockEntity> ELECTRIC_MOTOR = RsTm.registrate()
            .tileEntity("generator_alternator_block_entity", GeneratorAlternatorBlockEntity::new)
            .instance(() -> HalfShaftInstance::new)
            .validBlocks(() -> ModBlocks.GENERATOR_ALTERNATOR.get())
            .renderer(() -> GeneratorAlternatorRenderer::new)
            .register();

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }

}
