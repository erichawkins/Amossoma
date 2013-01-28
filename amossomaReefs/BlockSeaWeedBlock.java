package amossomaReefs;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockReed;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import amossoma.Amossoma;
import amossomaAllTabs.AmossomaAllTabs;
import amossomaPlants.AmossomaPlants;

public class BlockSeaWeedBlock extends Block //implements IPlantable
{
	protected BlockSeaWeedBlock(int par1, int par2, Material par3material)
    {
        super(par1, par2, Material.water);
        blockIndexInTexture = par2;
        float var3 = 0.375F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
        this.setCreativeTab(AmossomaAllTabs.AmossomaReefsTab);
        //this.setTickRandomly(true);
    }
	
    public String getTextureFile()
    {
            return "/Amossoma/amossomareef.png";
    }
    
    /**
     * Ticks the block if it's been scheduled
     */
//    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
//    {
//        if (par1World.isAirBlock(par2, par3 + 1, par4))
//        {
//            int var6;
//
//            for (var6 = 1; par1World.getBlockId(par2, par3 - var6, par4) == this.blockID; ++var6)
//            {
//                ;
//            }
//
//            if (var6 < 3)
//            {
//                int var7 = par1World.getBlockMetadata(par2, par3, par4);
//
//                if (var7 == 15)
//                {
//                    par1World.setBlockWithNotify(par2, par3 + 1, par4, this.blockID);
//                    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);
//                }
//                else
//                {
//                    par1World.setBlockMetadataWithNotify(par2, par3, par4, var7 + 1);
//                }
//            }
//        }
//    }
    
//    public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
//    {
//        //if (par1World.isAirBlock(par2, par3, par4))
//		{
//        par1World.setBlockWithNotify(par2, par3, par4, Block.waterMoving.blockID);
//        par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);
// 		}
//    }
//    


    /**
     * Checks to see if the block is next to an air block. Args: world, x, y, z 
     */
    public boolean isInContactWithSelf(World par1World, int par2, int par3, int par4)
    {
    	Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
    	int var4 = par1World.getBlockId(par2, par3 + 1, par4);
    	int var5 = par1World.getBlockId(par2, par3 - 1, par4);
    	int var6 = par1World.getBlockId(par2 + 1, par3, par4);
    	int var7 = par1World.getBlockId(par2 - 1, par3, par4);
    	int var8 = par1World.getBlockId(par2, par3, par4 + 1);
    	int var9 = par1World.getBlockId(par2, par3, par4 - 1);
        
    	if (var4 == this.blockID)
    	{
    	return true;
    	}
    	else if (var5 == this.blockID)
    	{
    	return true;
    	}
    	if (var6 == this.blockID)
    	{
    	return true;
    	}
    	else if (var7 == this.blockID)
    	{
    	return true;
    	}
    	if (var8 == this.blockID)
    	{
    	return true;
    	}
    	else if (var9 == this.blockID)
    	{
    	return true;
    	}
    	else
    	{
    	return false;
    	}
    }

    private boolean canThriveHere(World par1World, int par2, int par3, int par4) 
	{
    Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
	int var10 = par1World.getBlockId(par2, par3, par4);
	
	if (var10 == Block.dirt.blockID)
	{
	return true;
	}
	else if (var10 == Block.blockClay.blockID)
	{
	return true;
	}
	else if (var10 == Block.gravel.blockID)
	{
	return true;
	}
	else if (var10 == Block.waterStill.blockID)
	{
	return true;
	}
	else if (var10 == Block.waterMoving.blockID)
	{
	return true;
	}
	else if (var10 == this.blockID)
	{
	return true;
	}
	else
	{
	return false;
	}
}
    
    /**
     * ================================================================================
     * These two Methods are added to create Method isSubmurged.
     * ================================================================================
     */
    /**
     * Checks to see if the block is under water. Args: world, x, y, z 
     */
    public static boolean isUnderWater(World par1World, int par2, int par3, int par4)
    {
    	Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
    	int var11 = par1World.getBlockId(par2, par3 + 1, par4);
        
    	if (var11 == Block.waterMoving.blockID)
    	{
    	return true;
    	}
    	else if (var11 == Block.waterStill.blockID)
    	{
    	return true;
    	}
    	else
    	{
    	return false;
    	}
    }
    
    /**
     * Checks to see if the block is next to an air block. Args: world, x, y, z 
     */
    public static boolean isNotExposedtoAir(World par1World, int par2, int par3, int par4)
    {
    	Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
    	int var12 = par1World.getBlockId(par2, par3 + 1, par4);
    	int var13 = par1World.getBlockId(par2, par3 - 1, par4);
    	int var14 = par1World.getBlockId(par2 + 1, par3, par4);
    	int var15 = par1World.getBlockId(par2 - 1, par3, par4);
    	int var16 = par1World.getBlockId(par2, par3, par4 + 1);
    	int var17 = par1World.getBlockId(par2, par3, par4 - 1);
        
    	if (var12 == 0)
    	{
    	return false;
    	}
    	else if (var13 == 0)
    	{
    	return false;
    	}
    	else if (var14 == 0)
    	{
    	return false;
    	}
    	else if (var15 == 0)
    	{
    	return false;
    	}
    	else if (var16 == 0)
    	{
    	return false;
    	}
    	else if (var17 == 0)
    	{
    	return false;
    	}
    	else
    	{
    	return true;
    	}
    }
    
    /**
     * ================================================================================
     * Method isSubmurged.
     * ================================================================================
     */
    
    public static boolean isSubmurged(World par1World, int par2, int par3, int par4)
    {
    	Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
        boolean var18 = isUnderWater(par1World, par2, par3, par4);
        boolean var19 = isNotExposedtoAir(par1World, par2, par3, par4);
        
    	if (var18 & var19)
    	{
    	return true;
    	}
    	else
    	{
    	return false;
    	}
    }
    
    
    /**
     * Checks to see if the block is under water. Args: world, x, y, z 
     */
    public boolean isUnderSelf(World par1World, int par2, int par3, int par4)
    {
    	Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
    	int var11 = par1World.getBlockId(par2, par3, par4);
        
    	if (var11 == this.blockID)
    	{
    	return true;
    	}
    	else
    	{
    	return false;
    	}
    }
    
    /**
     * ================================================================================
     * End of Line ~ Method isSubmurged.
     * ================================================================================
     */
    
    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z 
     */
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        Block block = Block.blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
        boolean var19 = isNotExposedtoAir(par1World, par2, par3, par4);
        boolean var20 = isSubmurged(par1World, par2, par3, par4);
        boolean var21 = isInContactWithSelf(par1World, par2, par3, par4);
        boolean var22 = canThriveHere(par1World, par2, par3 - 1, par4); 
        boolean var23 = isUnderSelf(par1World, par2, par3, par4); 

        
    	if (var20 & var21)
    	{
    		return true;
    	}
    	if (var20 & var22)
    	{
    		return true;
    	}
    	else if (var19 & var23)
    	{
    		return true;
    	}
    	else
    	{
    	return false;
    	}
    }
    
    /**
     * Checks if current block pos is valid, if not, breaks the block as dropable item. Used for reed and cactus.
     */
    protected final void checkBlockCoordValid(World par1World, int par2, int par3, int par4)
    {
        if (!this.canBlockStay(par1World, par2, par3, par4))
        {
            this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
            par1World.setBlockWithNotify(par2, par3, par4, 0);
        }
    }
    
    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return this.canPlaceBlockAt(par1World, par2, par3, par4);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

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
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID;
    }
//
//    @Override
//    public EnumPlantType getPlantType(World world, int x, int y, int z)
//    {
//        return EnumPlantType.Water;
//    }
//
//    @Override
//    public int getPlantID(World world, int x, int y, int z)
//    {
//        return blockID;
//    }
//
//    @Override
//    public int getPlantMetadata(World world, int x, int y, int z)
//    {
//        return world.getBlockMetadata(x, y, z);
//    }
}
