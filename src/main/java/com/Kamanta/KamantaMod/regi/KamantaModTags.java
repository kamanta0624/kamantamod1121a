package com.Kamanta.KamantaMod.regi;

import com.Kamanta.KamantaMod.main.KamantaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class KamantaModTags {
    public static  class Blocks{

        public static final Tags.IOptionalNamedTag NEEDS_KAMANTA_TOOL = tag("needs_kamanta_tool");

        private static final Tags.IOptionalNamedTag<Block> tag(String name){
            return BlockTags.createOptional(new ResourceLocation(KamantaMod.MOD_ID, name));
        }
    }

    public static  class Items{

        private static final Tags.IOptionalNamedTag<Item> tag(String name){
            return ItemTags.createOptional(new ResourceLocation(KamantaMod.MOD_ID, name));
        }
    }
}
