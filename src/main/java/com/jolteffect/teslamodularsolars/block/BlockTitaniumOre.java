package com.jolteffect.teslamodularsolars.block;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;
import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;

import net.minecraft.block.BlockOre;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockTitaniumOre extends BlockOre {
	
	public BlockTitaniumOre() {
		setUnlocalizedName(MOD_ID + ".blocktitaniumore");
		setRegistryName(MOD_ID, "blocktitaniumore");
        setHarvestLevel("pickaxe", Item.ToolMaterial.IRON.getHarvestLevel());
        setHardness(4);
		setCreativeTab(TeslaModularSolarsTabs.tab);
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("This Titanium Ore can be found");
		list.add("Throughout the Overworld");
		
	}
}
