package com.jolteffect.teslamodularsolars.items;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCapacityUpgradeT3 extends Item {
	
    public ItemCapacityUpgradeT3() {
        setUnlocalizedName(MOD_ID + ".itemcapacityupgradet3");
        setRegistryName(MOD_ID, "itemcapacityupgradet3");
        setCreativeTab(TeslaModularSolarsTabs.tab);
        
    }
    
    
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
    	list.add("Add 1000000 TESLA Capacity");
		list.add("Right Click Solar Panel");
		list.add("Break Panel to recieve Upgrades back");
	}
    
    

}