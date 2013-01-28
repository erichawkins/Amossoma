package amossomaReefs;

import java.util.List;
import java.util.Random;

import amossomaAllTabs.AmossomaAllTabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockRedAlgaeBlock extends BlockCrops
{
	static boolean riseInstantly = true;
	static int maxHeight = 120;
	static int dropRate = 10;
	static int tickRate = 5;
	
    public BlockRedAlgaeBlock(int par1, int par2)
    {
        super(par1, par2);
        float var3 = 0.5F;
        float var4 = 0.015625F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
		this.setTickRandomly(true);
        this.setCreativeTab(AmossomaAllTabs.AmossomaReefsTab);
    }
    
    public String getTextureFile()
    {
            return "/Amossoma/amossomaplants.png";
    }
    
    public void fertilize(World par1World, int par2, int par3, int par4)
    {
        par1World.setBlockMetadataWithNotify(par2, par3, par4, 8);
    }
    
    /**
     * sets a value to the max Height the block can rise.
     * TODO: Set this to default as next encountered "air" block UP.
     */
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
    				//check for ability to Float block
    				if (amossoma.AmossomaWaterPhysics.CanFloatAbove(par1World, par2, par3 + 1, par4, this.GetBlockMaxHeight()))
    				{
    					//not at max height so we need to Float the block
    					floatup(par1World, par2, par3, par4);
    				}
    			}
    		}

    /**
     * Move the block from current position up 2 space
     * @param par1World the world itself
     * @param par2 current xCord
     * @param par3 current yCord
     * @param par4 current zCord
     * TODO: Bug as of now Lotus must be placed in water with a depth value in "2's"
     */
    		private void floatup(World par1World, int par2, int par3, int par4)
    		{
    			//destroy this block where it is
    			par1World.setBlockWithNotify(par2, par3, par4, Block.waterStill.blockID);
    			//block above me is water so create a new block in that position
    			par3 += 2;
    			par1World.setBlockWithNotify(par2, par3, par4, this.blockID);
    			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);
    		}
    		
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 23;
    }
    
    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	*/
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return par3 >= 0 && par3 < 256 ? par1World.getBlockMaterial(par2, par3 - 1, par4) == Material.water && par1World.getBlockMetadata(par2, par3 - 1, par4) == 0 : false;
    }
    
    /**
     * if the specified block is in the given AABB, add its collision bounding box to the given list
     */
    public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        if (par7Entity == null || !(par7Entity instanceof EntityBoat))
        {
            super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)par2 + this.minX, (double)par3 + this.minY, (double)par4 + this.minZ, (double)par2 + this.maxX, (double)par3 + this.maxY, (double)par4 + this.maxZ);
    }
}