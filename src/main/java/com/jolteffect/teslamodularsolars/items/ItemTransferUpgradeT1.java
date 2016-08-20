package com.jolteffect.teslamodularsolars.items;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;
import com.jolteffect.teslamodularsolars.handler.ModularSolarsConfig;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTransferUpgradeT1 extends Item {
	
	long upgredeValue = ModularSolarsConfig.traUpgradeT1;

    public ItemTransferUpgradeT1() {
        setUnlocalizedName(MOD_ID + ".itemtransferupgradet1");
        setRegistryName(MOD_ID, "itemtransferupgradet1");
        setCreativeTab(TeslaModularSolarsTabs.tab);
        
    }
    
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("Transfer an extra 10 T/PerTick");
		list.add("Right Click Solar Panel");
		list.add("Break Panel to recieve Upgrades back");
	}
    
    
    

}