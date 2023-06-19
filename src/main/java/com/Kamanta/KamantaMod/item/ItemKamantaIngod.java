package com.Kamanta.KamantaMod.item;

import com.Kamanta.KamantaMod.main.KamantaMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemKamantaIngod extends Item {
    public static final FoodProperties EAT_KAMANTA_INGOD = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().build();
    public ItemKamantaIngod() {
        super(new Properties().tab(KamantaMod.KAMANTAMOD_TAB).food(EAT_KAMANTA_INGOD).rarity(Rarity.RARE));
        this.setRegistryName("kamanta_ingod");
    }
}
