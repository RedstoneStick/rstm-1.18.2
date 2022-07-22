package net.guwy.rstm.util;

import net.guwy.rstm.RsTm;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NATURAL_SOIL = tag("natural_soil");
        public static final TagKey<Block> NATURAL_FOLIAGE = tag("natural_foliage");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(RsTm.MOD_ID, name));
        }

        private static TagKey<Block> forgeTags(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {


        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(RsTm.MOD_ID, name));
        }

        private static TagKey<Item> forgeTags(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
