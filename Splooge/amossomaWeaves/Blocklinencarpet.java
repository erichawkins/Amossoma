package amossomaWeaves;

import java.util.List;
import java.util.Random;

import amossoma.BlockMountable;
import amossomaAllTabs.AmossomaAllTabs;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Blocklinencarpet extends BlockMountable
{
		
    public Blocklinencarpet(int par1, int par2)
    {
        super(par1, Material.cloth);
        this.setCreativeTab(AmossomaAllTabs.AmossomaDecoTab);
        this.setRequiresSelfNotify();   
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.185F, 1.0F);
    }
     
    public int getBlockTextureFromSideAndMetadata(int par1, int par2) 
    {
    	switch (par2) 
    	{
    	case 0:
    		return 0;
    	case 1:
    		return 1;
    	case 2:
    		return 2;
    	case 3:
    		return 3;
    	case 4:
    		return 4;
    	case 5:
    		return 5;
    	case 6:
    		return 6;
    	case 7:
    		return 7;
    	case 8:
    		return 8;
    	case 9:
    		return 9;
    	case 10:
    		return 10;
    	case 11:
    		return 11;
    	case 12:
    		return 12;
    	case 13:
    		return 13;
    	case 14:
    		return 14;
    	case 15:
    		return 15;
    	default:
    		return 0;
    	}
}
    
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
    {
    	return BlockMountable.onBlockActivated(world, i, j, k, 	entityplayer, .030F);
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
   
   public int getRenderType()
   {
       return 0;
   }

   /**
    * if the specified block is in the given AABB, add its collision bounding box to the given list
    */
   public void setBlockBoundsBasedOnState(IBlockAccess iblockaccess, int i, int j, int k)
   {
       this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.025F, 1.0F);
   }
   
   
   public String getTextureFile()
   {
           return "/Amossoma/amossomaweaves.png";
   }
   
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return AmossomaWeaves.cottonthread.itemID;
    }

    public int quantityDropped(Random par1Random)
    {
        return 3;
    }
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 16; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}