package com.jolteffect.teslamodularsolars.items;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;

public class ItemTitaniumIngot extends Item {

    public ItemTitaniumIngot() {
        setUnlocalizedName(MOD_ID + ".itemtitaniumingot");
        setRegistryName(MOD_ID, "itemtitaniumingot");
        setCreativeTab(TeslaModularSolarsTabs.tab);
        
    }
    
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("Titanium Ingot");
		list.add("Strong but how strong?");
		list.add("Lets make some tools");
		
	}
    
}