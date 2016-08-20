package com.jolteffect.teslamodularsolars.init;

import com.jolteffect.teslamodularsolars.block.BlockTitanium;
import com.jolteffect.teslamodularsolars.block.BlockTitaniumOre;
import com.jolteffect.teslamodularsolars.block.solarpanel.BlockSolarPanel;
import com.jolteffect.teslamodularsolars.block.solarpanel.TileEntitySolarPanel;
import com.jolteffect.teslamodularsolars.utility.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
	
	public static final Block blockSolarPanel = new BlockSolarPanel();
	public static final Block blockTitaniumOre = new BlockTitaniumOre();
	public static final Block blockTitanium = new BlockTitanium();
	
	
    public static void registerBlocks() {
        
    	//Blocks
    	GameRegistry.register(blockSolarPanel);
    	GameRegistry.register(blockTitaniumOre);
    	GameRegistry.register(blockTitanium);
    	
    	LogHelper.logInfo("TeslaModularSolars --------------Blocks Init Complete.");
    	
    	//Tiles
    	GameRegistry.registerTileEntity(TileEntitySolarPanel.class, blockSolarPanel.getUnlocalizedName());
    	
    	LogHelper.logInfo("TeslaModularSolars --------------Block Tile's Init Complete.");
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSolarPanel), 0, new ModelResourceLocation(blockSolarPanel.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockTitaniumOre), 0, new ModelResourceLocation(blockTitaniumOre.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockTitanium), 0, new ModelResourceLocation(blockTitanium.getRegistryName(), "inventory"));
    	
    	
    	LogHelper.logInfo("TeslaModularSolars --------------Block Models Init Complete.");
    }
    
    
     
}