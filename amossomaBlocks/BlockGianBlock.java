package amossomaBlocks;

import java.util.Random;

import amossoma.Amossoma.CordDirection;
import amossomaAllTabs.AmossomaAllTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BlockGianBlock extends Block implements IPlantable
{
	//TODO: find out what about IPlantable causes rain to fall through block and stop it for this block
    static boolean riseInstantly = false;
	static int maxHeight = 120;
	static int expandTime = 3;
	static int dropRate = 10;
	static int tickRate = 5;
	
	protected BlockGianBlock(int id, int texture) 
	{
        super(id, texture, Material.plants);
        this.setTickRandomly(true);
		this.setCreativeTab(AmossomaAllTabs.AmossomaBlocksTab);
	}
	
	public String getTextureFile()
	{
		return "/Amossoma/amossomablocks.png";
	}
	
	private int _distanceCheck = 56;
	public int GetMaxDistance(int yCord)
	{
		if (yCord < 92)
			return 1;
		return this._distanceCheck - ((this.maxHeight - yCord) * 2);
	}
	
	private int _blockMaxHeight = 120;
	public void SetBlockMaxHeight(int mh)
	{
		this._blockMaxHeight = mh;
	}
	
	public int GetBlockMaxHeight()
	{
		return this._blockMaxHeight;
	}

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        SetBlockMaxHeight(this.maxHeight + (amossoma.Amossoma.GetRand(4, true, true) * 10));
        par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate);
    }
    
    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
        	//check for ability to rise block
            if (amossoma.AmossomaSpacialPhysics.CanRiseAbove(par1World, par2, par3 + 1, par4, this.GetBlockMaxHeight()))
        	{
            	//not at max height so we need to raise the block
            	amossoma.AmossomaSpacialPhysics.MoveBlockUpDown(par1World, par2, par3, par4, this.blockID, true);
        	}
        	else
        	{
        		//get my height - for every one under my max height decrease max expand range by 2
        		int expandBoarder = this.GetMaxDistance(par3);
        		//at max height so go ahead and expand
        		amossoma.AmossomaSpacialPhysics.Expand(par1World, par2, par3, par4, expandBoarder, this.expandTime, this.blockID);
        	}
        } 
    }
    
    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
		//TODO: fix this so that gian blocks can be placed in only certain bioms??
        Block block = Block.blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
        
        ForgeDirection direction = ForgeDirection.NORTH;
        Random rnd = new Random();
        int roll = rnd.nextInt(4) + 1;
        if (roll == 1) direction = ForgeDirection.SOUTH;
        if (roll == 2) direction = ForgeDirection.EAST;
        if (roll == 3) direction = ForgeDirection.WEST;

        return (block != null && block.canSustainPlant(par1World, par2, par3 +5, par4, direction, this));
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        this.checkBlockCoordValid(par1World, par2, par3, par4);
    }

    /**
     * Checks if current block pos is valid, if not, breaks the block as dropable item. Used for reed and cactus.
     */
    protected final void checkBlockCoordValid(World par1World, int par2, int par3, int par4)
    {
        if (!this.canBlockStay(par1World, par2, par3, par4))
        {
        	//gian block is too far to remain - not all will drop so random to find out if this is a dropped block
        	if (amossoma.Amossoma.GetRand(this.dropRate, true, true) == 0)
        	{
        		//create a dropping block - will fall to ground as inert Gian
	            this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
	        }
        	//destroy this block
            par1World.setBlockWithNotify(par2, par3, par4, 0);
        }
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
    	return !amossoma.AmossomaSpacialPhysics.IsTooFar(par1World, par2, par3, par4, this.GetMaxDistance(par3), CordDirection.neutral, this.blockID);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    /*public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
    	//this null return allows no bounds for the block and players can walk through
        return null;
    }*/

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
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

    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        return EnumPlantType.Plains;
    }

    @Override
    public int getPlantID(World world, int x, int y, int z)
    {
        return this.blockID;
    }

    @Override
    public int getPlantMetadata(World world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z);
    }
}
