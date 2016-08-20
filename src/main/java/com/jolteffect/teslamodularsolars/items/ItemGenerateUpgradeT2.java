package com.jolteffect.teslamodularsolars.items;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGenerateUpgradeT2 extends Item {
	

    public ItemGenerateUpgradeT2() {
        setUnlocalizedName(MOD_ID + ".itemgenerateupgradet2");
        setRegistryName(MOD_ID, "itemgenerateupgradet2");
        setCreativeTab(TeslaModularSolarsTabs.tab);
        
    }
    
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("Generate an extra 100 T/PerTick");
		list.add("Right Click Solar Panel");
		list.add("Break Panel to recieve Upgrades back");
	}
    
    
    

}