package com.Kamanta.KamantaMod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class KamantaModTabSecond extends CreativeModeTab {
    public KamantaModTabSecond() {
        super("kamantamod_tab_second");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.APPLE);
    }
}
