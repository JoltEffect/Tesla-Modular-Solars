package com.jolteffect.teslamodularsolars.items;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;

public class ItemSolarBase extends Item {

    public ItemSolarBase() {
        setUnlocalizedName(MOD_ID + ".itemsolarbase");
        setRegistryName(MOD_ID, "itemsolarbase");
        setCreativeTab(TeslaModularSolarsTabs.tab);
        
    }
    
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("Solar Panal Base");
		list.add("Primary Component for the Solar Panel");
		list.add("Crafting Component");
		
		
	}
    
}