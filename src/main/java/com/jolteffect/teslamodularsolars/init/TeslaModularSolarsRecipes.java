package com.jolteffect.teslamodularsolars.init;

import com.jolteffect.teslamodularsolars.utility.LogHelper;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TeslaModularSolarsRecipes {

	public static void registerRecipes()
	{
		//Blocks
		GameRegistry.addShapedRecipe( new ItemStack(ModBlocks.blockSolarPanel),
				"CCC",
				"CCC",
				"BBB",
				'C', new ItemStack(ModItems.itemSolarCell),
				'B', new ItemStack(ModItems.itemSolarBase)
				);
		GameRegistry.addShapedRecipe( new ItemStack(ModBlocks.blockTitanium),
				"TTT",
				"TTT",
				"TTT",
				'T', new ItemStack(ModItems.itemTitaniumIngot)
				);

		//Items
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemSolarCell),
				"PPP",
				"PCP",
				"PPP",
				'P', new ItemStack(ModItems.itemGlassPlate),
				'C', new ItemStack(ModItems.itemSolarCircuit)
				);
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemSolarBase),
				"   ",
				"TTT",
				"CCC",
				'T', new ItemStack(ModItems.itemTitaniumPlate),
				'C', new ItemStack(ModItems.itemSolarCircuit)
				);
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemGlassPlate),
				"GGG",
				"GTG",
				"GGG",
				'G', new ItemStack(Blocks.GLASS),
				'T', new ItemStack(ModItems.itemTitaniumPlate)
				);
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemSolarCircuit),
				"TGT",
				"ROR",
				"TGT",
				'T', new ItemStack(ModItems.itemTitaniumIngot),
				'R', new ItemStack(Items.REDSTONE),
				'O', new ItemStack(Items.GOLD_INGOT),
				'G', new ItemStack(Blocks.GLASS)
				);
		//Shapeless
		GameRegistry.addShapelessRecipe( new ItemStack(ModItems.itemTitaniumPlate), 
				new Object[] {ModItems.itemTitaniumIngot, ModItems.itemTitaniumIngot, ModItems.itemTitaniumIngot, ModItems.itemTitaniumIngot});

		//Smelting
		GameRegistry.addSmelting(ModBlocks.blockTitaniumOre, new ItemStack(ModItems.itemTitaniumIngot), 1.0F);
		GameRegistry.addSmelting(ModItems.itemTitaniumDust, new ItemStack(ModItems.itemTitaniumIngot), 1.0F);

		//Upgrades
		//T1
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemCapacityUpgradeT1),
				"TRT",
				"TCT",
				"TTT",
				'T', new ItemStack(ModItems.itemTitaniumPlate),
				'C', new ItemStack(ModItems.itemSolarCircuit),
				'R', new ItemStack(Blocks.REDSTONE_BLOCK)
				);
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemGenerateUpgradeT1),
				"TST",
				"TCT",
				"TTT",
				'T', new ItemStack(ModItems.itemTitaniumPlate),
				'C', new ItemStack(ModItems.itemSolarCircuit),
				'S', new ItemStack(ModItems.itemSolarCell)
				);
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTransferUpgradeT1),
				"TLT",
				"TCT",
				"TTT",
				'T', new ItemStack(ModItems.itemTitaniumPlate),
				'C', new ItemStack(ModItems.itemSolarCircuit),
				'L', new ItemStack(Blocks.LAPIS_BLOCK)
				);
		//T2
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemCapacityUpgradeT2),
				"GGG",
				"GCG",
				"GGG",
				'C', new ItemStack(ModItems.itemSolarCircuit),
				'G', new ItemStack(ModItems.itemCapacityUpgradeT1)
				);
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemGenerateUpgradeT2),
				"GGG",
				"GCG",
				"GGG",
				'C', new ItemStack(ModItems.itemSolarCircuit),
				'G', new ItemStack(ModItems.itemGenerateUpgradeT1)
				);
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTransferUpgradeT2),
				"GGG",
				"GCG",
				"GGG",
				'C', new ItemStack(ModItems.itemSolarCircuit),
				'G', new ItemStack(ModItems.itemTransferUpgradeT1)
				);		
		//T3
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemCapacityUpgradeT3),
				"GGG",
				"GCG",
				"GGG",
				'C', new ItemStack(ModItems.itemSolarCircuit),
				'G', new ItemStack(ModItems.itemCapacityUpgradeT2)
				);
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemGenerateUpgradeT3),
				"GGG",
				"GCG",
				"GGG",
				'C', new ItemStack(ModItems.itemSolarCircuit),
				'G', new ItemStack(ModItems.itemGenerateUpgradeT2)
				);
		GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTransferUpgradeT3),
				"GGG",
				"GCG",
				"GGG",
				'C', new ItemStack(ModItems.itemSolarCircuit),
				'G', new ItemStack(ModItems.itemTransferUpgradeT2)
				);
		
		//Tools
        GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTitaniumSword),
                "I",
                "I",
                "S",
                'I', new ItemStack(ModItems.itemTitaniumIngot),
                'S', new ItemStack(Items.STICK)
        );
        
        GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTitaniumPickaxe),
                "III",
                " S ",
                " S ",
                'I', new ItemStack(ModItems.itemTitaniumIngot),
                'S', new ItemStack(Items.STICK)
        );
        
        GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTitaniumSpade),
                " I ",
                " S ",
                " S ",
                'I', new ItemStack(ModItems.itemTitaniumIngot),
                'S', new ItemStack(Items.STICK)
        );
        GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTitaniumHoe),
                "II ",
                " S ",
                " S ",
                'I', new ItemStack(ModItems.itemTitaniumIngot),
                'S', new ItemStack(Items.STICK)
        );
        GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTitaniumAxe),
                "II",
                "IS",
                " S",
                'I', new ItemStack(ModItems.itemTitaniumIngot),
                'S', new ItemStack(Items.STICK)
        );
        
      //Armour
        GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTitaniumHelmet),
                "III",
                "I I",
                "   ",
                'I', new ItemStack(ModItems.itemTitaniumIngot)
        );
        GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTitaniumChestPlate),
                "I I",
                "III",
                "III",
                'I', new ItemStack(ModItems.itemTitaniumIngot)
        );
        GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTitaniumLeggings),
                "III",
                "I I",
                "I I",
                'I', new ItemStack(ModItems.itemTitaniumIngot)
        );
        GameRegistry.addShapedRecipe( new ItemStack(ModItems.itemTitaniumBoots),
                "   ",
                "I I",
                "I I",
                'I', new ItemStack(ModItems.itemTitaniumIngot)
        );

		LogHelper.logInfo("Recipes registered.");
	}

}
