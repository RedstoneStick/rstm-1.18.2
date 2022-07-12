package net.guwy.rstm.util;

import net.guwy.rstm.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class ModBlockTransparency {
    public static void call(){
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PALE_CREAM_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PALE_CREAM_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODULAR_FRAME.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODULAR_FRAME_HEAVY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SCREWS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STEEL_BEAM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STEEL_PIPES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TITANIUM_BEAM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TITANIUM_PIPES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAVENDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAVENDER_POTTED.get(), RenderType.cutout());
    }
}
