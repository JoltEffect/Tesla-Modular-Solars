package com.jolteffect.teslamodularsolars.items;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;

public class ItemSolarCircuit extends Item {

    public ItemSolarCircuit() {
        setUnlocalizedName(MOD_ID + ".itemsolarcircuit");
        setRegistryName(MOD_ID, "itemsolarcircuit");
        setCreativeTab(TeslaModularSolarsTabs.tab);
        
    }
    
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("Solar Circuit");
		list.add("LETNI Processors Inc");
		list.add("Crafting Component");
		
	}
}