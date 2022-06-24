package net.guwy.rstm.item;

import net.guwy.rstm.RsTm;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RsTm.MOD_ID);

    public static final RegistryObject<Item> SCRAP_METAL = ITEMS.register("scrap_metal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
