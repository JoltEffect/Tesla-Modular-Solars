package com.jolteffect.teslamodularsolars.creativetabs;

import com.jolteffect.teslamodularsolars.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TeslaModularSolarsTabs {
    public static final CreativeTabs tab = new CreativeTabs("ModularSolars.tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.blockSolarPanel);
        }
    };
}