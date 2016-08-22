package com.jolteffect.teslamodularsolars;

import com.jolteffect.teslamodularsolars.handler.ModularSolarsConfig;
import com.jolteffect.teslamodularsolars.init.ModBlocks;
import com.jolteffect.teslamodularsolars.init.ModItems;
import com.jolteffect.teslamodularsolars.proxy.IProxy;
import com.jolteffect.teslamodularsolars.utility.LogHelper;
import com.jolteffect.teslamodularsolars.worldgen.OreGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = TeslaModularSolars.MOD_ID, name = TeslaModularSolars.MOD_NAME, version = TeslaModularSolars.VERSION, guiFactory = TeslaModularSolars.GUI_FACTORY_CLASS, acceptedMinecraftVersions = "[1.10.2]")

public class TeslaModularSolars {
	
	public static final String MOD_ID = "teslamodularsolars";
    public static final String MOD_NAME = "TeslaModularSolars";

    static final String VERSION = "1.10.2 R1.1";
    static final String GUI_FACTORY_CLASS = "com.jolteffect.teslamodularsolars.handler.GuiFactoryTeslaModularSolars";
    static final String DEPENDENCIES = "required-after:Forge@[12.18.0.2002,);";
    
    /** The Modular Solars world generation handler. */
	public static OreGen genHandler = new OreGen();
    
    
    @Mod.Instance
    public static TeslaModularSolars instance;
    
    @SidedProxy(clientSide = "com.jolteffect.teslamodularsolars.proxy.ClientProxy", serverSide = "com.jolteffect.teslamodularsolars.proxy.ServerProxy")
    public static IProxy proxy;
    
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    	ModularSolarsConfig.initConfig(event.getSuggestedConfigurationFile());
    	
    	//OreDictionary
        OreDictionary.registerOre("oreTitanium", ModBlocks.blockTitaniumOre);
        OreDictionary.registerOre("ingotTitanium", ModItems.itemTitaniumIngot);
        OreDictionary.registerOre("blockTitanium", ModBlocks.blockTitanium);
        OreDictionary.registerOre("dustTitanium", ModItems.itemTitaniumDust);
        
        
        LogHelper.logInfo("TModularSolars -------------- successfully Finished preInit");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	//Register the mod's world generators
    	GameRegistry.registerWorldGenerator(genHandler, 1);
        proxy.init(event);
        
        LogHelper.logInfo("TModularSolars -------------- successfully Finished init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        LogHelper.logInfo("TModularSolars -------------- successfully Finished postInit");
    }
    
    
    

}
