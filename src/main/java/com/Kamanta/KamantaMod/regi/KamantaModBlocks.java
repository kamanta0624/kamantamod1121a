package com.Kamanta.KamantaMod.regi;

import com.Kamanta.KamantaMod.block.BlockKamantaBlock;
import com.Kamanta.KamantaMod.main.KamantaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(KamantaMod.MOD_ID)
public class KamantaModBlocks {

    public static final BlockKamantaBlock KAMANTA_BLOCK = null;

    @Mod.EventBusSubscriber(modid = KamantaMod.MOD_ID,bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event){
            final Block[] blocks = {
                    new BlockKamantaBlock()
            };
            event.getRegistry().registerAll(blocks);
        }
        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event){
            final BlockItem[] blockItems = {
                    new BlockItem(KAMANTA_BLOCK,new Item.Properties().tab(KamantaMod.KAMANTAMOD_TAB).fireResistant())
            };
            for (BlockItem item:blockItems){
                final Block block = item.getBlock();
                final ResourceLocation registryName = block.getRegistryName();
                event.getRegistry().register(item.setRegistryName(registryName));
            };
        };
    }
}
