package net.guwy.rstm.block.custom.machines.generators.alternating_redstone;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Scanner;

public class GeneratorAlternatingRedstoneBlockItem extends BlockItem {
    public GeneratorAlternatingRedstoneBlockItem(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        if(Screen.hasShiftDown()) {
            pTooltip.add(new TranslatableComponent("tooltip.rstm.block_summary.shift"));
            pTooltip.add(new TextComponent(" "));
            pTooltip.add(new TranslatableComponent("tooltip.rstm.generator_alternating_redstone.a"));
            pTooltip.add(new TranslatableComponent("tooltip.rstm.generator_alternating_redstone.b"));
            pTooltip.add(new TranslatableComponent("tooltip.rstm.generator_alternating_redstone.c"));
            pTooltip.add(new TranslatableComponent("tooltip.rstm.generator_alternating_redstone.d"));
        }  else {
            pTooltip.add(new TranslatableComponent("tooltip.rstm.block_summary"));

        }
    }
}
