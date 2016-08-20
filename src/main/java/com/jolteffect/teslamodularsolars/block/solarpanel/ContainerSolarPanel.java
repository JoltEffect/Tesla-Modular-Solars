package com.jolteffect.teslamodularsolars.block.solarpanel;

import com.jolteffect.teslamodularsolars.handler.ModularSolarsConfig;
import net.darkhax.tesla.api.ITeslaHolder;
import net.darkhax.tesla.api.ITeslaProducer;
import net.minecraft.nbt.NBTTagCompound;

public class ContainerSolarPanel implements ITeslaHolder, ITeslaProducer {
	
	private long capacity;
	private long storedPower = 0;
	private long transferRate;
	private long generatePerTick;
	@SuppressWarnings("unused")
	private NBTTagCompound teslaTagCompound;

	public ContainerSolarPanel() {
		this.capacity = ModularSolarsConfig.panelCapacity;
		this.transferRate = ModularSolarsConfig.panelTransferRate;
		this.generatePerTick = ModularSolarsConfig.panelPowerGen;
		
	}
	
	
	@Override
	public long takePower(long power, boolean simulated) {
		final long removedPower = Math.min(this.storedPower, Math.min(transferRate, power));
		if (!simulated)
            this.storedPower -= removedPower;
		
		return removedPower;
		
	}

	//Our Getters
	@Override
	public long getStoredPower() {
		return storedPower;
	}

	@Override
	public long getCapacity() {
		return capacity;
	}
	
	public long getTransferRate() {
		return transferRate;
	}

	public long getGeneratePerTick() {
		return generatePerTick;
	}
	
	//Our Setters
	protected void setPower (long power)
	{
		this.storedPower = power;
	}
	
	protected void setCapacity (long cap)
	{
		this.capacity = cap;
	}
	
	protected void setTransferRate(long rate) {
		this.transferRate = rate;
	}

	protected void setGeneratePerTick(long rate) {
		this.generatePerTick = rate;
	}
	
	//Our upgraders
	public void increaseCapacity(int rate) {
		this.capacity +=rate;
	}
	public void increaseGenerate(int rate) {
		this.generatePerTick += rate;
	}
	public void increaseTransfer(int rate) {
		this.transferRate +=rate;
	}
	
	
	//Our Power Generation
	public void generatePower()
	{
		this.storedPower += generatePerTick;
		
		if (this.storedPower > this.getCapacity())
            this.storedPower = this.getCapacity();
    }




	

	

	
	



}
