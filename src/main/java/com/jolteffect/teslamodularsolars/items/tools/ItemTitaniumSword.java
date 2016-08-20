package com.jolteffect.teslamodularsolars.items.tools;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;


import com.jolteffect.teslamodularsolars.TeslaModularSolars;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;
import net.minecraft.item.ItemSword;

public class ItemTitaniumSword extends ItemSword {
	
	

    public ItemTitaniumSword(ToolMaterial m) {
    	super(m);
        setCreativeTab(TeslaModularSolarsTabs.tab);
        setUnlocalizedName(TeslaModularSolars.MOD_ID + ".itemtitaniumsword");
        setRegistryName(MOD_ID, "itemtitaniumsword");
	}

	
	
	
	
}
