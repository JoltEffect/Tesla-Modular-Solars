package com.jolteffect.teslamodularsolars.block;

import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

import java.util.List;
import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockTitanium extends Block {
	
	public BlockTitanium() {
		super(Material.ROCK);
		setUnlocalizedName(MOD_ID + ".blocktitanium");
		setRegistryName(MOD_ID, "blocktitanium");
        setHarvestLevel("pickaxe", Item.ToolMaterial.IRON.getHarvestLevel());
        setHardness(4);
		setCreativeTab(TeslaModularSolarsTabs.tab);
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("Titanium Block");
		list.add("Nothing more than a Decrotive Block");
		list.add("or is it?");
		
	}
}
