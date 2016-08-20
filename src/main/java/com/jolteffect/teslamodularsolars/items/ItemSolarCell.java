package com.jolteffect.teslamodularsolars.items;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;

public class ItemSolarCell extends Item {

    public ItemSolarCell() {
        setUnlocalizedName(MOD_ID + ".itemsolarcell");
        setRegistryName(MOD_ID, "itemsolarcell");
        setCreativeTab(TeslaModularSolarsTabs.tab);
        
    }
    
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("Solar Panal Cell");
		list.add("Primary Component for the Solar Panel");
		list.add("Crafting Component");
		
		
	}
    
}