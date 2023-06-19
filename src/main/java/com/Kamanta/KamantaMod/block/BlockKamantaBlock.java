package com.Kamanta.KamantaMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockKamantaBlock extends Block {
    public BlockKamantaBlock() {
        super(Properties.of(Material.METAL, MaterialColor.COLOR_RED)
                .strength(1.0f,2F)
                .sound(SoundType.ANVIL)
                .lightLevel(value -> 15)
                .jumpFactor(1));

        this.setRegistryName("kamanta_block");
    }
}
