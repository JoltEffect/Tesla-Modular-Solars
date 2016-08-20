package com.jolteffect.teslamodularsolars.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.jolteffect.teslamodularsolars.init.ModBlocks;
import com.jolteffect.teslamodularsolars.init.ModItems;
import com.jolteffect.teslamodularsolars.init.TeslaModularSolarsRecipes;

abstract class CommonProxy implements IProxy {

    @Override
    @OverridingMethodsMustInvokeSuper
    public void preInit(FMLPreInitializationEvent event)
    {
    	
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }

    @Override
    @OverridingMethodsMustInvokeSuper
    public void init(FMLInitializationEvent event)
    {
    	TeslaModularSolarsRecipes.registerRecipes();
    }

    @Override
    @OverridingMethodsMustInvokeSuper
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}