package com.Kamanta.KamantaMod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class KamantaModTab extends CreativeModeTab {

    public KamantaModTab() {
        super("kamantamod_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.BEEF);
    }
}
