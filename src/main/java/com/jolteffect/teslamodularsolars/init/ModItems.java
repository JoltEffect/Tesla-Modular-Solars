package com.jolteffect.teslamodularsolars.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.common.util.EnumHelper;

import com.jolteffect.teslamodularsolars.items.ItemCapacityUpgradeT1;
import com.jolteffect.teslamodularsolars.items.ItemCapacityUpgradeT2;
import com.jolteffect.teslamodularsolars.items.ItemCapacityUpgradeT3;
import com.jolteffect.teslamodularsolars.items.ItemGenerateUpgradeT1;
import com.jolteffect.teslamodularsolars.items.ItemGenerateUpgradeT2;
import com.jolteffect.teslamodularsolars.items.ItemGenerateUpgradeT3;
import com.jolteffect.teslamodularsolars.items.ItemGlassPlate;
import com.jolteffect.teslamodularsolars.items.ItemSolarBase;
import com.jolteffect.teslamodularsolars.items.ItemSolarCell;
import com.jolteffect.teslamodularsolars.items.ItemSolarCircuit;
import com.jolteffect.teslamodularsolars.items.ItemTitaniumDust;
import com.jolteffect.teslamodularsolars.items.ItemTitaniumIngot;
import com.jolteffect.teslamodularsolars.items.ItemTitaniumPlate;
import com.jolteffect.teslamodularsolars.items.ItemTransferUpgradeT1;
import com.jolteffect.teslamodularsolars.items.ItemTransferUpgradeT2;
import com.jolteffect.teslamodularsolars.items.ItemTransferUpgradeT3;
import com.jolteffect.teslamodularsolars.items.armour.ItemTitaniumArmour;
import com.jolteffect.teslamodularsolars.items.tools.ItemTitaniumAxe;
import com.jolteffect.teslamodularsolars.items.tools.ItemTitaniumHoe;
import com.jolteffect.teslamodularsolars.items.tools.ItemTitaniumPickaxe;
import com.jolteffect.teslamodularsolars.items.tools.ItemTitaniumSpade;
import com.jolteffect.teslamodularsolars.items.tools.ItemTitaniumSword;
import com.jolteffect.teslamodularsolars.utility.LogHelper;

public class ModItems {
	
	

	//Upgrade Items
	public static final ItemCapacityUpgradeT1 itemCapacityUpgradeT1 = new ItemCapacityUpgradeT1();
	public static final ItemCapacityUpgradeT2 itemCapacityUpgradeT2 = new ItemCapacityUpgradeT2();
	public static final ItemCapacityUpgradeT3 itemCapacityUpgradeT3 = new ItemCapacityUpgradeT3();
	public static final ItemGenerateUpgradeT1 itemGenerateUpgradeT1 = new ItemGenerateUpgradeT1();
	public static final ItemGenerateUpgradeT2 itemGenerateUpgradeT2 = new ItemGenerateUpgradeT2();
	public static final ItemGenerateUpgradeT3 itemGenerateUpgradeT3 = new ItemGenerateUpgradeT3();
	public static final ItemTransferUpgradeT1 itemTransferUpgradeT1 = new ItemTransferUpgradeT1();
	public static final ItemTransferUpgradeT2 itemTransferUpgradeT2 = new ItemTransferUpgradeT2();
	public static final ItemTransferUpgradeT3 itemTransferUpgradeT3 = new ItemTransferUpgradeT3();
	
	//Tool Materials
	public static ToolMaterial titaniumToolMaterial = EnumHelper.addToolMaterial("titaniumtoolmaterial", 8, 2500, 15, 15, 50).setRepairItem(new ItemStack(ModItems.itemTitaniumIngot,1,43));
	public static ArmorMaterial titaniumArmourMaterial = EnumHelper.addArmorMaterial("titaniumarmourmaterial", "teslamodularsolars:titaniumarmour", 35, new int[] {4, 9, 7, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4F);
	
	//Crafting Items
	public static final ItemTitaniumIngot itemTitaniumIngot = new ItemTitaniumIngot();
	public static final ItemTitaniumDust itemTitaniumDust = new ItemTitaniumDust();
	public static final ItemGlassPlate itemGlassPlate = new ItemGlassPlate();
	public static final ItemSolarBase itemSolarBase = new ItemSolarBase();
	public static final ItemSolarCell itemSolarCell = new ItemSolarCell();
	public static final ItemSolarCircuit itemSolarCircuit = new ItemSolarCircuit();
	public static final ItemTitaniumPlate itemTitaniumPlate = new ItemTitaniumPlate();
	
	//Tools
    public static final ItemTitaniumSword itemTitaniumSword = new ItemTitaniumSword(titaniumToolMaterial);
    public static final ItemTitaniumPickaxe itemTitaniumPickaxe = new ItemTitaniumPickaxe();
    public static final ItemTitaniumSpade itemTitaniumSpade = new ItemTitaniumSpade();
    public static final ItemTitaniumHoe itemTitaniumHoe = new ItemTitaniumHoe();
    public static final ItemTitaniumAxe itemTitaniumAxe = new ItemTitaniumAxe();
    
    
    //Armour
    public static Item itemTitaniumHelmet = new ItemTitaniumArmour("itemtitaniumhelmet", titaniumArmourMaterial, 1, EntityEquipmentSlot.HEAD);
    public static Item itemTitaniumChestPlate = new ItemTitaniumArmour ("itemtitaniumchestplate", titaniumArmourMaterial, 1, EntityEquipmentSlot.CHEST);
    public static Item itemTitaniumLeggings = new ItemTitaniumArmour ("itemtitaniumleggings", titaniumArmourMaterial, 2, EntityEquipmentSlot.LEGS);
    public static Item itemTitaniumBoots = new ItemTitaniumArmour ("itemtitaniumboots", titaniumArmourMaterial, 1, EntityEquipmentSlot.FEET);

	public static void registerItems() {

		// ItemBlocks
		GameRegistry.register(new ItemBlock(ModBlocks.blockSolarPanel),ModBlocks.blockSolarPanel.getRegistryName());
		GameRegistry.register(new ItemBlock(ModBlocks.blockTitaniumOre),ModBlocks.blockTitaniumOre.getRegistryName());
		GameRegistry.register(new ItemBlock(ModBlocks.blockTitanium),ModBlocks.blockTitanium.getRegistryName());
		LogHelper.logInfo("TeslaModularSolars --------------ItemBlocks Registration Init Complete.");
		
		// Items
		GameRegistry.register(itemCapacityUpgradeT1);
		GameRegistry.register(itemCapacityUpgradeT2);
		GameRegistry.register(itemCapacityUpgradeT3);
		GameRegistry.register(itemGenerateUpgradeT1);
		GameRegistry.register(itemGenerateUpgradeT2);
		GameRegistry.register(itemGenerateUpgradeT3);
		GameRegistry.register(itemTransferUpgradeT1);
		GameRegistry.register(itemTransferUpgradeT2);
		GameRegistry.register(itemTransferUpgradeT3);
		
		//Crafting Items
		GameRegistry.register(itemTitaniumIngot);
		GameRegistry.register(itemTitaniumDust);
		GameRegistry.register(itemGlassPlate);
		GameRegistry.register(itemSolarBase);
		GameRegistry.register(itemSolarCell);
		GameRegistry.register(itemSolarCircuit);
		GameRegistry.register(itemTitaniumPlate);
		
		//Tools
        GameRegistry.register(itemTitaniumSword);
        GameRegistry.register(itemTitaniumPickaxe);
        GameRegistry.register(itemTitaniumSpade);
        GameRegistry.register(itemTitaniumHoe);
        GameRegistry.register(itemTitaniumAxe);
        
        
        //Armour
        GameRegistry.register(itemTitaniumHelmet);
        GameRegistry.register(itemTitaniumChestPlate);
        GameRegistry.register(itemTitaniumLeggings);
        GameRegistry.register(itemTitaniumBoots);
		
		LogHelper.logInfo("TeslaModularSolars --------------Items Registration Init Complete.");
	}

	@SideOnly(Side.CLIENT)
	public static void registerModels() {

		// Items
		ModelLoader.setCustomModelResourceLocation(itemCapacityUpgradeT1,0,new ModelResourceLocation(itemCapacityUpgradeT1.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapacityUpgradeT2,0,new ModelResourceLocation(itemCapacityUpgradeT2.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapacityUpgradeT3,0,new ModelResourceLocation(itemCapacityUpgradeT3.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGenerateUpgradeT1,0,new ModelResourceLocation(itemGenerateUpgradeT1.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGenerateUpgradeT2,0,new ModelResourceLocation(itemGenerateUpgradeT2.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGenerateUpgradeT3,0,new ModelResourceLocation(itemGenerateUpgradeT3.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTransferUpgradeT1,0,new ModelResourceLocation(itemTransferUpgradeT1.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTransferUpgradeT2,0,new ModelResourceLocation(itemTransferUpgradeT2.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTransferUpgradeT3,0,new ModelResourceLocation(itemTransferUpgradeT3.getRegistryName(), "inventory"));
		
		//Crafting Items
		ModelLoader.setCustomModelResourceLocation(itemTitaniumIngot,0,new ModelResourceLocation(itemTitaniumIngot.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTitaniumDust,0,new ModelResourceLocation(itemTitaniumDust.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGlassPlate,0,new ModelResourceLocation(itemGlassPlate.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSolarBase,0,new ModelResourceLocation(itemSolarBase.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSolarCell,0,new ModelResourceLocation(itemSolarCell.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSolarCircuit,0,new ModelResourceLocation(itemSolarCircuit.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTitaniumPlate,0,new ModelResourceLocation(itemTitaniumPlate.getRegistryName(), "inventory"));
		
		//Tools
        ModelLoader.setCustomModelResourceLocation(itemTitaniumSword, 0, new ModelResourceLocation(itemTitaniumSword.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemTitaniumPickaxe, 0, new ModelResourceLocation(itemTitaniumPickaxe.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemTitaniumSpade, 0, new ModelResourceLocation(itemTitaniumSpade.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemTitaniumHoe, 0, new ModelResourceLocation(itemTitaniumHoe.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemTitaniumAxe, 0, new ModelResourceLocation(itemTitaniumAxe.getRegistryName(), "inventory"));
        
        
        //Armour
        ModelLoader.setCustomModelResourceLocation(itemTitaniumHelmet, 0, new ModelResourceLocation(itemTitaniumHelmet.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemTitaniumChestPlate, 0, new ModelResourceLocation(itemTitaniumChestPlate.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemTitaniumLeggings, 0, new ModelResourceLocation(itemTitaniumLeggings.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemTitaniumBoots, 0, new ModelResourceLocation(itemTitaniumBoots.getRegistryName(), "inventory"));
        
		LogHelper.logInfo("TeslaModularSolars --------------Item models Init Complete.");
	}

}