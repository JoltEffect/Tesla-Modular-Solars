package com.jolteffect.teslamodularsolars.items.armour;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;


import javax.annotation.Nonnull;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ItemTitaniumArmour extends ItemArmor {

	public ItemTitaniumArmour(String unlocalizedName, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setCreativeTab(TeslaModularSolarsTabs.tab);
		setMaxStackSize(1);
		setUnlocalizedName(unlocalizedName);
        setRegistryName(MOD_ID, unlocalizedName);
		
	}
	
	@Override
    @Nonnull
    public Item setUnlocalizedName(@Nonnull String name) {
        return super.setUnlocalizedName(MOD_ID + "." + name);
    }
	
	
	

}
