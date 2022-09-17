package net.guwy.rstm;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.guwy.rstm.block.ModBlocks;
import net.guwy.rstm.block.ModBlockEntities;
import net.guwy.rstm.item.ModItems;
import net.guwy.rstm.painting.ModPaintings;
import net.guwy.rstm.util.ModBlockTransparency;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RsTm.MOD_ID)
public class RsTm
{
    public static final String MOD_ID = "rstm";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();


    public RsTm() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModPaintings.register(eventBus);

        ModBlockEntities.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ModBlockTransparency.call();
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork( () -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LAVENDER.getId(), ModBlocks.LAVENDER_POTTED);
        });
    }

    public static CreateRegistrate registrate() {
        return registrate();
    }


}
