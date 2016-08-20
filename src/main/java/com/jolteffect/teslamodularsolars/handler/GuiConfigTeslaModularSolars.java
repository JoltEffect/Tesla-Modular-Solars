package com.jolteffect.teslamodularsolars.handler;

import com.jolteffect.teslamodularsolars.TeslaModularSolars;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;

import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class GuiConfigTeslaModularSolars extends GuiConfig{
	
	private static Configuration solarsConfig = ModularSolarsConfig.config;
    
    public GuiConfigTeslaModularSolars(GuiScreen parent) {
        
        super(parent, generateConfigList(), TeslaModularSolars.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(solarsConfig.toString()));
    }
    
    public static List<IConfigElement> generateConfigList () {
        
        final ArrayList<IConfigElement> elements = new ArrayList<IConfigElement>();
        
        for (final String name : solarsConfig.getCategoryNames())
            elements.add(new ConfigElement(solarsConfig.getCategory(name)));
            
        return elements;
    }
}