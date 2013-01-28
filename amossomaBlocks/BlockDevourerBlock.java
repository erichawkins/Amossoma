package amossomaBlocks;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import amossoma.Amossoma.CordDirection;
import amossomaAllTabs.AmossomaAllTabs;
import amossoma.AmossomaSpacialPhysics;
import amossoma.AmossomaDestructionPhysics;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BlockDevourerBlock extends BlockAmossomaBlock //implements IPlantable
{
	public BlockDevourerBlock(int id, int texture) 
	{
		super(id, texture, Material.anvil);
        this.setTickRandomly(true);
		this.setCreativeTab(AmossomaAllTabs.AmossomaBlocksTab);
	}
	
	public BlockDevourerBlock(int id, int texture, Material material) 
	{
		super(id, texture, material);
        this.setTickRandomly(true);
		this.setCreativeTab(AmossomaAllTabs.AmossomaBlocksTab);
	}
	
	public int[] GetProperties()
	{
		int[] result = { this.GetCurrentDistance(), this.GetBlockMinHeight(), this.GetDirection() };
		return result;
	}
	public void SetProperties(int[] arg1)
	{
		if (arg1 != null & arg1.length > 0)
		{
			this.SetBeginMaxDistance();
			this.SetBeginCurrentDistance(arg1[0]);
			this.SetBlockMinHeight(arg1[1]);
			this.SetDirection(arg1[2]);
		}
	}
	
	public String getTextureFile()
	{
		return "/Amossoma/amossomablocks.png";
	}
	
	private int _tickRate;
	private int GetTickRate() { return this._tickRate; }
	private void SetBeginTickRate() { this._tickRate = 5; }
	
	private int _dropRate;
	private int GetDropRate() { return this._dropRate; }
	private void SetBeginDropRate() { this._dropRate = 5; }
	
	private int _distanceCheck;
	private int GetMaxDistance() { return this._distanceCheck; }
	private void SetBeginMaxDistance() { this._distanceCheck = 56; }
	
	private int _currentDistance;
	private int GetCurrentDistance() { return _currentDistance; }
	private void SetBeginCurrentDistance() { this._currentDistance = 0; }
	private void SetBeginCurrentDistance(int meta) { this._currentDistance = meta; }
	
	private void IncrementCurrentDistance() { this._currentDistance++; }
	
	private int _blockMinHeight;
	public void SetBlockMinHeight() { this._blockMinHeight = 2  + (amossoma.Amossoma.GetRand(4, true, false) * 10); }
	public void SetBlockMinHeight(int mh) { this._blockMinHeight = mh; }
	public int GetBlockMinHeight() { return this._blockMinHeight; }
	
	private int _impulseBlockDirection;
	public int GetDirection() { return this._impulseBlockDirection; }
	public void SetDirection(int fd) { this._impulseBlockDirection = fd; }
	
    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
//    	this gets called before metadata is set
//    	FMLLog.info("onBlockAdded...current metadata: " + metaInt);
    	this.SetBeginTickRate();
    	this.SetBeginDropRate();
		this.SetBeginMaxDistance();
		this.SetBeginCurrentDistance();
		this.SetBlockMinHeight();
		this.SetDirection(this.GetImpulseBlockDirection(par1World, par2, par3, par4));

        par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.GetTickRate());
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
    	//called after metadata has been set
        if (!par1World.isRemote)
        {
        	//find the impulse block to get direction
        	if (this.CanGoFurther(par1World, par2, par3, par4))
            {
        		//increment the distance traveled before we move
        		this.IncrementCurrentDistance();
        		
        		int fd = this.GetDirection();
        		
            	//destroy block up and around it a distance so I can rise
        		if (fd == 1)
        		{
        			amossoma.AmossomaSpacialPhysics.MoveBlockUpDown(par1World, par2, par3, par4, this.blockID, true);
                	//have just moved up so check level above what I was - level I am at now - destroy around me
        			amossoma.AmossomaDestructionPhysics.CheckAndDevourUpDown(par1World, par2, par3+1, par4);
        		}
            	//destroy block north and around it a distance so I can move
        		if (fd == 2)
        		{
        			amossoma.AmossomaSpacialPhysics.MoveBlockSouthNorth(par1World, par2, par3, par4, this.blockID, false);
                	//have just moved north so check plain north what I was - plain I am at now - destroy around me
        			amossoma.AmossomaDestructionPhysics.CheckAndDevourEastWest(par1World, par2, par3, par4-1);
        		}
            	//destroy block south and around it a distance so I can move
        		if (fd == 3)
        		{
        			amossoma.AmossomaSpacialPhysics.MoveBlockSouthNorth(par1World, par2, par3, par4, this.blockID, true);
                	//have just moved south so check plain south what I was - plain I am at now - destroy around me
        			amossoma.AmossomaDestructionPhysics.CheckAndDevourEastWest(par1World, par2, par3, par4+1);
        		}
            	//destroy block east and around it a distance so I can move
        		if (fd == 4)
        		{
        			amossoma.AmossomaSpacialPhysics.MoveBlockEastWest(par1World, par2, par3, par4, this.blockID, true);
                	//have just moved east so check plain east what I was - plain I am at now - destroy around me
        			amossoma.AmossomaDestructionPhysics.CheckAndDevourSouthNorth(par1World, par2+1, par3, par4);
        		}
            	//destroy block west and around it a distance so I can move
        		if (fd == 5)
        		{
        			amossoma.AmossomaSpacialPhysics.MoveBlockEastWest(par1World, par2, par3, par4, this.blockID, false);
                	//have just moved west so check plain west what I was - plain I am at now - destroy around me
        			amossoma.AmossomaDestructionPhysics.CheckAndDevourSouthNorth(par1World, par2-1, par3, par4);
        		}
        		//destroy block below and around it a distance so I can fall
        		if (fd == 6)
        		{
        			amossoma.AmossomaSpacialPhysics.MoveBlockUpDown(par1World, par2, par3, par4, this.blockID, false);
                	//have just moved down so check level below what I was - level I am at now - destroy around me
        			amossoma.AmossomaDestructionPhysics.CheckAndDevourUpDown(par1World, par2, par3-1, par4);
        		}
            }
        	else
        	{
        		//can not destroy any more so I burn out
        		par1World.setBlock(par2, par3, par4, 0);
        	}
        }
    }

	public boolean CanGoFurther(World par1World, int par2, int par3, int par4)
	{
		boolean result = true;
		//get the direction of the impulse block to determine which direction I devourer
		int par5 = this.GetDirection();
		//have I gone the distance of my block and should burn out
		if (result) result = this.GetCurrentDistance() < this.GetMaxDistance();
		//now use direction to determine if the block in that direction is destroyable
		switch(par5)
		{
			case 1:
				if (result) result = amossoma.AmossomaDestructionPhysics.CanDestroyMaterialAt(par1World, par2, par3 + 1, par4);
				break;
			case 2:
				if (result) result = amossoma.AmossomaDestructionPhysics.CanDestroyMaterialAt(par1World, par2, par3, par4 - 1);
				break;
			case 3:
				if (result) result = amossoma.AmossomaDestructionPhysics.CanDestroyMaterialAt(par1World, par2, par3, par4 + 1);
				break;
			case 4:
				if (result) result = amossoma.AmossomaDestructionPhysics.CanDestroyMaterialAt(par1World, par2 + 1, par3, par4);
				break;
			case 5:
				if (result) result = amossoma.AmossomaDestructionPhysics.CanDestroyMaterialAt(par1World, par2 - 1, par3, par4);
				break;
			case 6:
				if (result) result = amossoma.AmossomaDestructionPhysics.CanDestroyMaterialAt(par1World, par2, par3 - 1, par4);
				break;
			case 0:
			default:
				result = false;
		}

		return result;
	}
	
	public int GetImpulseBlockDirection(World par1World, int par2, int par3, int par4)
	{
		int result = 0;
    	if (par1World.getBlockId(par2, par3+1, par4) == AmossomaBlocks.ImpulseBlockId)
    		result = 1;
    	if (par1World.getBlockId(par2, par3, par4-1) == AmossomaBlocks.ImpulseBlockId)
    		result = 2;
    	if (par1World.getBlockId(par2, par3, par4+1) == AmossomaBlocks.ImpulseBlockId)
    		result = 3;
    	if (par1World.getBlockId(par2+1, par3, par4) == AmossomaBlocks.ImpulseBlockId)
    		result = 4;
    	if (par1World.getBlockId(par2-1, par3, par4) == AmossomaBlocks.ImpulseBlockId)
    		result = 5;
    	if (par1World.getBlockId(par2, par3-1, par4) == AmossomaBlocks.ImpulseBlockId)
    		result = 6;
		return result;
	}
	
    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
		//TODO: fix this so that destroyer blocks can be placed in only certain bioms - or anything but under water/lava??
		return true;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
    	//this is what controls if you can walk through the plant
        return true;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 0;
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID;
    }
}