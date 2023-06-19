package com.Kamanta.KamantaMod.regi;

import com.Kamanta.KamantaMod.item.ItemKamantaIngod;
import com.Kamanta.KamantaMod.item.ItemKamantaTest;
import com.Kamanta.KamantaMod.main.KamantaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(KamantaMod.MOD_ID)
public class KamantaModItems  {

    public static final ItemKamantaIngod KAMANTA_INGOD = new ItemKamantaIngod();
    public static final ItemKamantaTest KAMANTA_TEST = new ItemKamantaTest();

    @Mod.EventBusSubscriber(modid = KamantaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] items = {
                    KAMANTA_INGOD,
                    KAMANTA_TEST
            };
            event.getRegistry().registerAll(items);
        }
    }
}
