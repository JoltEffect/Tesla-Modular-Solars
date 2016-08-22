package com.jolteffect.teslamodularsolars.block.solarpanel;

import java.util.List;

import com.jolteffect.teslamodularsolars.TeslaModularSolars;
import com.jolteffect.teslamodularsolars.creativetabs.TeslaModularSolarsTabs;
import com.jolteffect.teslamodularsolars.handler.ModularSolarsConfig;
import com.jolteffect.teslamodularsolars.init.ModItems;
import com.jolteffect.teslamodularsolars.utility.LogHelper;

import net.darkhax.tesla.capability.TeslaCapabilities;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import static com.jolteffect.teslamodularsolars.TeslaModularSolars.MOD_ID;

public class BlockSolarPanel extends Block implements ITileEntityProvider {
	
	private static final AxisAlignedBB BOUNDS = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D);
    private static final int CHAT_ID = 47194716;

	public BlockSolarPanel() {
		
		super(Material.ROCK);
		blockHardness = 5.0F;
		blockSoundType = SoundType.METAL;
		setUnlocalizedName(MOD_ID + ".blocksolarpanel");
		setRegistryName(MOD_ID, "blocksolarpanel");
		setHarvestLevel("pickaxe", Item.ToolMaterial.STONE.getHarvestLevel());
		setCreativeTab(TeslaModularSolarsTabs.tab);
		
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntitySolarPanel();
	}
	
	@Override
    public boolean onBlockActivated (World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        
		//action server side.
        if (!worldIn.isRemote) {
            
            final TileEntity tile = worldIn.getTileEntity(pos);
            final TileEntitySolarPanel panel = (TileEntitySolarPanel) tile;
            final ContainerSolarPanel container = (ContainerSolarPanel) panel.getCapability(TeslaCapabilities.CAPABILITY_HOLDER, EnumFacing.DOWN);
            
            if (heldItem != null)
            {
            	final Item item = heldItem.getItem();
                
            	//Capacitor Upgrade Checks
            	if (item == ModItems.itemCapacityUpgradeT1)
            	{
            		container.increaseCapacity(ModularSolarsConfig.capUpgradeT1);
                	--heldItem.stackSize;
                	panel.upgrades.add(new ItemStack(ModItems.itemCapacityUpgradeT1,1));
                }
            	if (item == ModItems.itemCapacityUpgradeT2)
            	{
        		container.increaseCapacity(ModularSolarsConfig.capUpgradeT2);
            	--heldItem.stackSize;
            	panel.upgrades.add(new ItemStack(ModItems.itemCapacityUpgradeT2,1));
            	}
            	if (item == ModItems.itemCapacityUpgradeT3)
            	{
        		container.increaseCapacity(ModularSolarsConfig.capUpgradeT3);
            	--heldItem.stackSize;
            	panel.upgrades.add(new ItemStack(ModItems.itemCapacityUpgradeT3,1));
            	}
            	
            	//Generation Upgrade Checks
            	if (item == ModItems.itemGenerateUpgradeT1)
            	{
        		container.increaseGenerate(ModularSolarsConfig.genUpgradeT1);
            	--heldItem.stackSize;
            	panel.upgrades.add(new ItemStack(ModItems.itemGenerateUpgradeT1,1));
            	}
            	if (item == ModItems.itemGenerateUpgradeT2)
            	{
        		container.increaseGenerate(ModularSolarsConfig.genUpgradeT2);
            	--heldItem.stackSize;
            	panel.upgrades.add(new ItemStack(ModItems.itemGenerateUpgradeT2,1));
            	}
            	if (item == ModItems.itemGenerateUpgradeT3)
            	{
        		container.increaseGenerate(ModularSolarsConfig.genUpgradeT3);
            	--heldItem.stackSize;
            	panel.upgrades.add(new ItemStack(ModItems.itemGenerateUpgradeT3,1));
            	}
            	
            	//Transfer Upgrade Checks
            	if (item == ModItems.itemTransferUpgradeT1)
            	{
        		container.increaseTransfer(ModularSolarsConfig.traUpgradeT1);
            	--heldItem.stackSize;
            	panel.upgrades.add(new ItemStack(ModItems.itemTransferUpgradeT1,1));
            	}
            	if (item == ModItems.itemTransferUpgradeT2)
            	{
        		container.increaseTransfer(ModularSolarsConfig.traUpgradeT2);
            	--heldItem.stackSize;
            	panel.upgrades.add(new ItemStack(ModItems.itemTransferUpgradeT2,1));
            	}
            	if (item == ModItems.itemTransferUpgradeT3)
            	{
        		container.increaseTransfer(ModularSolarsConfig.traUpgradeT3);
            	--heldItem.stackSize;
            	panel.upgrades.add(new ItemStack(ModItems.itemTransferUpgradeT3,1));
            	}
            }
            	
            if (tile instanceof TileEntitySolarPanel && !tile.isInvalid())
            {
            	sendSpamlessMessage(CHAT_ID, new TextComponentString(I18n.format("message.teslamodularsolars.blocksolarpanel.status", container.getStoredPower(), container.getCapacity(), container.getGeneratePerTick(), container.getTransferRate() )));
            	
            	TeslaModularSolars.proxy.openGui(panel);
            }
        }
        
        return true;
    }
	
	@Override
    public void breakBlock (World worldIn, BlockPos pos, IBlockState state)
	{
		//action server side.
        if (!worldIn.isRemote) 
        {
        	final TileEntity tile = worldIn.getTileEntity(pos);
        	final TileEntitySolarPanel panel = (TileEntitySolarPanel) tile;
        	
        	for(ItemStack itemStack : panel.upgrades)
        	{
        		EntityItem item = new EntityItem(worldIn, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ(), itemStack);
        		worldIn.spawnEntityInWorld(item);
        	}
        }
        
        super.breakBlock(worldIn, pos, state);
        worldIn.removeTileEntity(pos);
    }
	
	@SuppressWarnings("deprecation")
	@Override
    public boolean eventReceived (IBlockState state, World worldIn, BlockPos pos, int id, int param)
	{
		super.eventReceived(state, worldIn, pos, id, param);
        final TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(id, param);
    }
	
	@Override
    public AxisAlignedBB getBoundingBox (IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return BOUNDS;
    }
	
	@Override
    public boolean isFullCube (IBlockState state)
	{
		return false;
    }
	
	@SuppressWarnings("deprecation")
	@Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered (IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
	{
		return side == EnumFacing.UP ? true : blockAccess.getBlockState(pos.offset(side)).getBlock() == this ? true : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }
    
    @Override
    public boolean doesSideBlockRendering (IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
    	return face == EnumFacing.DOWN;
    }
    
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4)
    {
		list.add("The Tesla Power Generating Solar Panel");
		list.add("10 T/PerTick Generation");
		list.add("10 T/PerTick Transfer In/Out");
	}
    
    
    @SideOnly(Side.CLIENT)
    private static void sendSpamlessMessage (int messageID, ITextComponent message)
    {
    	final GuiNewChat chat = Minecraft.getMinecraft().ingameGUI.getChatGUI();
        chat.printChatMessageWithOptionalDeletion(message, messageID);
    }


	

}
