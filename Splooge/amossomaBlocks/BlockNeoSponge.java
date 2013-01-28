//package amossomaBlocks;
//
//
//import java.util.List;
//import java.util.Random;
//
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.entity.EntityLiving;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.world.World;
//
//public class BlockNeoSponge extends Block
//{
//	protected BlockNeoSponge(int par1, int par2, Material materials)
//	{
//		super(par1, par2, Material.sponge);
//		this._isFull = false;
//		//this.blockIndexInTexture = 6;
//		this.setCreativeTab(amossoma.Amossoma.AmossomaBlocksTab);
//	}
//	  	
//	
//	  public int getBlockTextureFromSideAndMetadata(int par1, int par2) 
//	    {
//	    	switch (par2) 
//	    	{
//	    	case 0:
//	    		return 6;
//	    	case 1:
//	    		return 7;
//	    	default:
//	    		return 6;
//	    	}
//	}
//	  
//	public String getTextureFile()
//	{
//		return "/Amossoma/amossomablocks.png";
//	}
//
//	/**
//	 * Called when the block is placed in the world.
//	 */
//	public void onBlockPlacedBy(World par1, int par2, int par3, int par4, EntityLiving par5)
//	{
////		if (!this.isFull())
////		this._isFull = false;
//		this.checkBlockCoordValid(par1, par2, par3, par4);
//	}
//
//	/**
//	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
//	 */
//	public boolean canPlaceBlockAt(World par1, int par2, int par3, int par4)
//	{
//		int var5 = par1.getBlockId(par2, par3 - 1, par4);
//		return var5 == this.blockID ? false : var5 != Block.dirt.blockID | var5 != Block.sand.blockID;
//	}
//
//	/**
//	 * Checks to see if the block is water. Args: world, x, y, z 
//	 */
//	public static boolean isWater(World par1World, int par2, int par3, int par4)
//	{
//		int var11 = par1World.getBlockId(par2, par3, par4);
//
//		if (var11 == Block.waterMoving.blockID)
//		{
//			return true;
//		}
//		else if (var11 == Block.waterStill.blockID)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
//
//	private boolean _isFull;
//
//	public boolean isFull()
//	{
//		return this._isFull;
//	}
//	
//	public boolean isNotFull()
//	{
//		return this._isNotFull;
//	}
//
//	public void setIsNotFull()
//	{
//		this._isFull = false;
//	}
//
//	public void setIsFull()
//	{
//		this._isFull = true;
//	}
//
//	/**
//	 * Called upon block activation (right click on the block.)
//	 */
//	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5, int par6, float par7, float par8, float par9)
//	{   	
//
//		if (!this.isFull())
//		{
//			if (isWater(par1World, par2 + 1, par3, par4))
//				par1World.setBlock(par2 + 1, par3, par4, 0);
//			if (isWater(par1World, par2 , par3, par4 + 1))
//				par1World.setBlock(par2, par3, par4 + 1, 0);
//			if (isWater(par1World, par2 - 1, par3, par4))
//				par1World.setBlock(par2 - 1, par3, par4, 0);
//			if (isWater(par1World, par2, par3, par4 - 1))
//				par1World.setBlock(par2, par3, par4 - 1, 0);
//			if (isWater(par1World, par2, par3 + 1, par4))
//				par1World.setBlock(par2, par3 + 1, par4, 0);
//			if (isWater(par1World, par2, par3 - 1, par4))
//				par1World.setBlock(par2, par3 - 1, par4, 0);
//			this.setIsFull();
//			return true;
//		}
//		if (this.isFull())
//		{
//			int var54 = Block.waterMoving.blockID;
//			if (isAirBlock(par1World, par2 + 1, par3, par4))
//				par1World.setBlock(par2 + 1, par3, par4, var54);
//			if (isAirBlock(par1World, par2 , par3, par4 + 1))
//				par1World.setBlock(par2, par3, par4 + 1, var54);
//			if (isAirBlock(par1World, par2 - 1, par3, par4))
//				par1World.setBlock(par2 - 1, par3, par4, var54);
//			if (isAirBlock(par1World, par2, par3, par4 - 1))
//				par1World.setBlock(par2, par3, par4 - 1, var54);
//			if (isAirBlock(par1World, par2, par3 + 1, par4))
//				par1World.setBlock(par2, par3 + 1, par4, var54);
//			if (isAirBlock(par1World, par2, par3 - 1, par4))
//				par1World.setBlock(par2, par3 - 1, par4, var54);
//			this.setNotFull();
//			return true;
//		}
//		else
//		{
//			this.setIsNotFull();
//			return false;
//		}
//
//	}
//	
//	private void Filled(World par1World, int par2, int par3, int par4)
//	{
//		if (_isFull)
//		//destroy this block where it is
//		par1World.setBlockAndMetadata(par2, par3, par4, this.blockID, 0);
//		//block above me is water so create a new block in that position
//		par3 = 1;
//		par1World.setBlockWithNotify(par2, par3, par4, this.blockID);
//		par1World.setBlockAndMetadata(par2, par3, par4, this.blockID, 1);
//	}
//
//	private void Emptied(World par1World, int par2, int par3, int par4)
//	{
//		if (!_isFull)
//		//destroy this block where it is
//		par1World.setBlockAndMetadata(par2, par3, par4, this.blockID, 1);
//		//block above me is water so create a new block in that position
//		par3 = 1;
//		par1World.setBlockWithNotify(par2, par3, par4, this.blockID);
//		par1World.setBlockAndMetadata(par2, par3, par4, this.blockID, 0);
//	}
//
//	protected final void checkBlockCoordValid(World par1, int par2, int par3, int par4)
//	{
//		if (!this.canBlockStay(par1, par2, par3, par4))
//
//		{
//			par1.setBlockWithNotify(par2, par3, par4, 0);
//		}
//	}
//
//	/**
//	 * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
//	 */
//	public boolean canBlockStay(World par1, int par2, int par3, int par4)
//	{
//		return this.canPlaceBlockAt(par1, par2, par3, par4);
//	}
//
//    /**
//     * Returns the ID of the items to drop on destruction.
//     */
//    public int idDropped(int par1, Random par2Random, int par3)
//    {
//        return this.blockID;
//    }
//	
//	/**
//	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
//	 */
//	public int idPicked(World par1World, int par2, int par3, int par4)
//	{
//		return this.blockID;
//	}
//
//	/**
//	 * Returns the quantity of items to drop on block destruction.
//	 */
//	public int quantityDropped(Random par1)
//	{
//		return 1;
//	}
//	
//    @SideOnly(Side.CLIENT)
//    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
//    {
//        for (int var4 = 0; var4 < 2; ++var4)
//        {
//            par3List.add(new ItemStack(par1, 1, var4));
//        }
//    }
//}
