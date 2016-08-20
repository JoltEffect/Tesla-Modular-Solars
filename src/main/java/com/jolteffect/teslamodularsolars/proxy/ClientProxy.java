package com.jolteffect.teslamodularsolars.proxy;

import com.jolteffect.teslamodularsolars.init.ModBlocks;
import com.jolteffect.teslamodularsolars.init.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public final class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        
        ModBlocks.registerModels();
        ModItems.registerModels();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        
        
    }

}