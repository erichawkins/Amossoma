package amossomaBlocks;

import java.util.Random;

import amossoma.Amossoma;
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
import net.minecraftforge.common.ForgeDirection;

public class BlockFloatableBlock extends Block
{
	
	static boolean riseInstantly = true;
	static int maxHeight = 120;
	static int dropRate = 10;
	static int tickRate = 5;
	
		//This constructor just pass thing on.
		public BlockFloatableBlock(int id, int texture)
    	{
	        super(id, texture, Material.rock);
			this.setTickRandomly(true);
			this.setCreativeTab(AmossomaAllTabs.AmossomaBlocksTab);
		}
		
		public String getTextureFile()
		{
			return "/Amossoma/amossomablocks.png";
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
 * Move the block from current position up 1 space
 * @param par1World the world itself
 * @param par2 current xCord
 * @param par3 current yCord
 * @param par4 current zCord
 */
		private void floatup(World par1World, int par2, int par3, int par4)
		{
			//destroy this block where it is
			par1World.setBlockWithNotify(par2, par3, par4, Block.waterStill.blockID);
			//block above me is water so create a new block in that position
			par3 += 1;
			par1World.setBlockWithNotify(par2, par3, par4, this.blockID);
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);
		}

}

