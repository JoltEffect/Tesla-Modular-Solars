package com.jolteffect.teslamodularsolars.block.solarpanel;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import net.darkhax.tesla.capability.TeslaCapabilities;
import net.darkhax.tesla.lib.TeslaUtils;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;

public class TileEntitySolarPanel extends TileEntity implements ITickable {
    
    private ContainerSolarPanel container;
    public List<ItemStack> upgrades = new ArrayList<ItemStack>();
    
    public TileEntitySolarPanel() {

        this.container = new ContainerSolarPanel();
    }
    
    @Override
    public void readFromNBT (NBTTagCompound compound) {
    	super.readFromNBT(compound);
    	
    	this.container.setCapacity(compound.getLong("Capacity"));
    	this.container.setPower(compound.getLong("StoredPower"));
    	this.container.setGeneratePerTick(compound.getLong("Generate"));
    	this.container.setTransferRate(compound.getLong("Transfer"));
    	
    	this.upgrades = new ArrayList<ItemStack>();
    	
    	NBTTagList nbttaglist = compound.getTagList("Items", 10);
    	
    	for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
            this.upgrades.add(ItemStack.loadItemStackFromNBT(nbttagcompound));
        }
    	
    }
    
    @Override
    public NBTTagCompound writeToNBT (NBTTagCompound compound) {
    	compound.setLong("Capacity", this.container.getCapacity());
    	compound.setLong("StoredPower", this.container.getStoredPower());
    	compound.setLong("Generate", this.container.getGeneratePerTick());
    	compound.setLong("Transfer", this.container.getTransferRate());
    	
    	NBTTagList itemlist = new NBTTagList();
    	
    	for(ItemStack itemStack : upgrades)
        {
    		ItemStack stack = itemStack;
    		if (stack != null)
		    {
		    	NBTTagCompound tag = new NBTTagCompound();

		        tag.setByte("Upgrade", (byte)upgrades.indexOf(itemStack));
		        stack.writeToNBT(tag);
		        itemlist.appendTag(tag);
		    }
        }
    	compound.setTag("Items", itemlist);
    	return super.writeToNBT(compound);
    }
    
    
    @Override
    @SuppressWarnings("unchecked")
    public <T> T getCapability (Capability<T> capability, EnumFacing facing) {
        
        if (capability == TeslaCapabilities.CAPABILITY_PRODUCER || capability == TeslaCapabilities.CAPABILITY_HOLDER)
            return (T) this.container;
            
        return super.getCapability(capability, facing);
    }
    
    @Override
    public boolean hasCapability (Capability<?> capability, EnumFacing facing) {
        
        if (capability == TeslaCapabilities.CAPABILITY_PRODUCER || capability == TeslaCapabilities.CAPABILITY_HOLDER)
            return true;
            
        return super.hasCapability(capability, facing);
    }

	@Override
	public void update() {
		
		
		if (this.hasWorldObj())
		{
			//Self power Generation code
			if (!this.worldObj.provider.getHasNoSky() 
					&& this.worldObj.canBlockSeeSky(getPos().add(0,1,0)) 
					&& !this.worldObj.isRaining() 
					&& this.worldObj.getSkylightSubtracted() == 0 
					&& this.container.getStoredPower() != this.container.getCapacity())
                this.container.generatePower();
			
			//Distribute Power
			int tileCheck = TeslaUtils.getConnectedCapabilities(TeslaCapabilities.CAPABILITY_CONSUMER, worldObj, pos).size();
			if(tileCheck==0) return;
			this.container.takePower(TeslaUtils.distributePowerToAllFaces(worldObj, pos, Math.min(this.container.getStoredPower() / tileCheck, this.container.getTransferRate()), false), false);
			
        }
		
	}
	
	
	
	
	@Override
    public NBTTagCompound getUpdateTag() {

        return writeToNBT(new NBTTagCompound());
    }
	
	@Nullable
    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {

        NBTTagCompound nbtTag = new NBTTagCompound();
        this.writeToNBT(nbtTag);
        return new SPacketUpdateTileEntity(getPos(), 1, nbtTag);
    }
	
	@Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity packet) {
        // Here we get the packet from the server and read it into our client side tile entity
        this.readFromNBT(packet.getNbtCompound());
    }
	
	
	
	
	
	
	
}