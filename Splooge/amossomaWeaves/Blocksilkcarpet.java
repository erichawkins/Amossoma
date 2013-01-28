package amossomaWeaves;

import java.util.List;
import java.util.Random;

import amossoma.BlockMountable;
import amossomaAllTabs.AmossomaAllTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Blocksilkcarpet extends Block
{
		
    public Blocksilkcarpet(int par1, int par2)
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
   		return 32;
   	case 1:
   		return 33;
   	case 2:
   		return 34;
   	case 3:
   		return 35;
   	case 4:
   		return 36;
   	case 5:
   		return 37;
   	case 6:
   		return 38;
   	case 7:
   		return 39;
   	case 8:
   		return 40;
   	case 9:
   		return 41;
   	case 10:
   		return 42;
   	case 11:
   		return 43;
   	case 12:
   		return 44;
   	case 13:
   		return 45;
   	case 14:
   		return 46;
   	case 15:
   		return 47;
   	default:
   		return 32;
   	}
}

   public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
   {
   	return BlockMountable.onBlockActivated(world, i, j, k, 	entityplayer, 0.030F);
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
        return AmossomaWeaves.silkthread.itemID;
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