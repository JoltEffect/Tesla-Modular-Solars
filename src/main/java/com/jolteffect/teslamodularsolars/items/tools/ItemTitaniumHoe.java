package com.jolteffect.teslamodularsolars.items.tools;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;


import com.jolteffect.teslamodularsolars.TeslaModularSolars;

import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTitaniumHoe extends ItemHoe {

	public ItemTitaniumHoe() {
		super(ToolMaterial.DIAMOND);
		
		setCreativeTab(TeslaModularSolarsTabs.tab);
		setUnlocalizedName(TeslaModularSolars.MOD_ID + ".itemtitaniumhoe");
        setRegistryName(MOD_ID, "itemtitaniumhoe");
		
	}
	
	
	
	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean isHeld)
    {
		super.onUpdate(itemStack, world, entity, slot, isHeld);
		
		if (isHeld)
		{
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, 2, 2));
		}
	}

}
