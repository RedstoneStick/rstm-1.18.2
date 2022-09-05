package net.guwy.rstm;

import net.guwy.rstm.block.ModBlocks;
import net.guwy.rstm.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.lwjgl.system.CallbackI;

public class ModCreativeModTabs {

    public static final CreativeModeTab BLOCKS = new CreativeModeTab("rstm_tab_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BLACK_SAND.get());
        }
    };

    public static final CreativeModeTab MATERIALS = new CreativeModeTab("rstm_tab_materials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SCRAP_METAL.get());
        }
    };

    public static final CreativeModeTab EQUIPMENT = new CreativeModeTab("rstm_tab_equipment") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModItems.BOOMSTICK.get()); }
    };

    public static final CreativeModeTab MACHINES = new CreativeModeTab("rstm_tab_machines") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModBlocks.GENERATOR_ALTERNATING_REDSTONE_BLOCK_ITEM.get()); }
    };
}
