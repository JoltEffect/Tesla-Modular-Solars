package com.jolteffect.teslamodularsolars.items;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;

public class ItemTitaniumDust extends Item {

    public ItemTitaniumDust() {
        setUnlocalizedName(MOD_ID + ".itemtitaniumdust");
        setRegistryName(MOD_ID, "itemtitaniumdust");
        setCreativeTab(TeslaModularSolarsTabs.tab);
        
    }
    
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("Titanium Dust");
		list.add("Ground from the strongest of Ores");
		list.add("Not used as yet.....future update");
		
		
	}
    
}