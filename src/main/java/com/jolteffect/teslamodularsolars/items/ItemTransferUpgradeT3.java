package com.jolteffect.teslamodularsolars.items;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;
import com.jolteffect.teslamodularsolars.handler.ModularSolarsConfig;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTransferUpgradeT3 extends Item {
	
	long upgredeValue = ModularSolarsConfig.traUpgradeT3;

    public ItemTransferUpgradeT3() {
        setUnlocalizedName(MOD_ID + ".itemtransferupgradet3");
        setRegistryName(MOD_ID, "itemtransferupgradet3");
        setCreativeTab(TeslaModularSolarsTabs.tab);
        
    }
    
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("Transfer an extra 1000 T/PerTick");
		list.add("Right Click Solar Panel");
		list.add("Break Panel to recieve Upgrades back");
	}
    
    
    

}