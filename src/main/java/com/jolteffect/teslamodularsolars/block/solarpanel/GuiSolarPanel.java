package com.jolteffect.teslamodularsolars.block.solarpanel;

import java.io.IOException;

import org.lwjgl.opengl.GL11;

import com.jolteffect.teslamodularsolars.TeslaModularSolars;

import net.darkhax.tesla.capability.TeslaCapabilities;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class GuiSolarPanel extends GuiScreen {
	
	private final int imageHeight = 192;
    private final int imageWidth = 192;
    private static ResourceLocation background;
    private static ResourceLocation powerbarBack;
    private static ResourceLocation powerbarFront;
    private final TileEntitySolarPanel te;
    private final ContainerSolarPanel container;
    
    public GuiSolarPanel(TileEntity tile) {
    	background = new ResourceLocation(TeslaModularSolars.MOD_ID + ":textures/gui/guisolar.png");
    	powerbarBack = new ResourceLocation(TeslaModularSolars.MOD_ID + ":textures/gui/powerbarback.png");
    	powerbarFront = new ResourceLocation(TeslaModularSolars.MOD_ID + ":textures/gui/powerbarfront.png");
    	te = (TileEntitySolarPanel) tile;
    	this.container = (ContainerSolarPanel) tile.getCapability(TeslaCapabilities.CAPABILITY_HOLDER, EnumFacing.DOWN);
    	
	}
	
	/**
     * Adds the buttons (and other controls) to the screen in question.
     */
	public void initGui() 
    {
     // DEBUG
     System.out.println("GuiSolarPanel initGUI()");
     

    }
	
	/**
     * Called from the main game loop to update the screen.
     */
    @Override
    public void updateScreen() 
    {
        
    }
    
    /**
     * Draws the screen and all the components in it.
     */
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    	
    	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    	int offsetFromScreenLeft = (width - imageWidth ) / 2;
    	mc.getTextureManager().bindTexture(background);
    	drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, imageWidth, imageHeight);
    	
    	
    	String s = "Modular Solar Panel";
    	long p = container.getStoredPower();
    	long c = container.getCapacity();
    	long g = container.getGeneratePerTick();
    	long t = container.getTransferRate();
    	
    	fontRendererObj.drawString(s, offsetFromScreenLeft+20, 8, 4210752);
        fontRendererObj.drawString("Power:" + p, offsetFromScreenLeft+41, 24, 4210752);
        fontRendererObj.drawString("Cap:" + c, offsetFromScreenLeft+41, 39, 4210752);
        fontRendererObj.drawString("T/PerTick:" + g, offsetFromScreenLeft+41, 54, 4210752);
        fontRendererObj.drawString("In/Out:" + t, offsetFromScreenLeft+41, 69, 4210752);
    	
        drawPowerBar();

    	super.drawScreen(mouseX, mouseY, partialTicks);
    }
    
    /**
     * Called when a mouse button is pressed and the mouse is moved around. 
     * Parameters are : mouseX, mouseY, lastButtonClicked & 
     * timeSinceMouseClick.
     */
    @Override
    protected void mouseClickMove(int parMouseX, int parMouseY, 
          int parLastButtonClicked, long parTimeSinceMouseClick) 
    {
    	
     
    }
    
    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException
    {
        if (keyCode != 2)
        {
            this.mc.displayGuiScreen((GuiScreen)null);

            if (this.mc.currentScreen == null)
            {
                this.mc.setIngameFocus();
            }
        }
    }
    
    @Override
    protected void actionPerformed(GuiButton parButton) 
    {
    	
    }
    
    /**
     * Called when the screen is unloaded. Used to disable keyboard repeat 
     * events
     */
    @Override
    public void onGuiClosed() 
    {
     
    }
    
    /**
     * Returns true if this GUI should pause the game when it is displayed in 
     * single-player
     */
    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }
    
    public void drawPowerBar()
	{
    	int offsetFromScreenLeft = (width - imageWidth ) / 2;
    	int currentStoredEnergy = (int) (container.getStoredPower()* 60 / container.getCapacity());
    	mc.getTextureManager().bindTexture(powerbarFront);
    	drawTexturedModalRect(offsetFromScreenLeft+14, 20, 0, currentStoredEnergy, 12, 60);
    	
	}
    
    
    

}
