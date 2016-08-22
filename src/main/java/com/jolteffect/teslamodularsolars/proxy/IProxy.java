package com.jolteffect.teslamodularsolars.proxy;

import com.jolteffect.teslamodularsolars.block.solarpanel.TileEntitySolarPanel;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IProxy {

    void preInit(FMLPreInitializationEvent event);

    void init(FMLInitializationEvent event);

    void postInit(FMLPostInitializationEvent event);
    
 
	void openGui(TileEntity panel);

}
