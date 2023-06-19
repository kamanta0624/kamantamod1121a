package com.Kamanta.KamantaMod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;

@Mod("kamantamod")
public class KamantaMod {
    public static final String MOD_ID="kamantamod";

    public static final CreativeModeTab KAMANTAMOD_TAB = new KamantaModTab();
    CreativeModeTab KAMANTAMOD_TAB_SECOND = new KamantaModTabSecond();
}
