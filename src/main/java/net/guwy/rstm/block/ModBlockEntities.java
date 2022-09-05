package net.guwy.rstm.block;

import net.guwy.rstm.RsTm;
import net.guwy.rstm.block.ModBlocks;
import net.guwy.rstm.block.custom.machines.generators.alternating_redstone.GeneratorAlternatingRedstoneBlockEntity;
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

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }

}
