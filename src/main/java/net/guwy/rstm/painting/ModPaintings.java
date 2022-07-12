package net.guwy.rstm.painting;

import net.guwy.rstm.RsTm;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<Motive> PAINTING_MOTIVES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, RsTm.MOD_ID);

    public static final RegistryObject<Motive> EXPLOSION = PAINTING_MOTIVES.register(
            "explosion", () -> new Motive(16,16));

    public static void register(IEventBus eventBus){
        PAINTING_MOTIVES.register(eventBus);
    }
}
