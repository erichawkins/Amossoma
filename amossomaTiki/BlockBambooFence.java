package amossomaTiki;

import java.util.List;
import java.util.Random;

import amossoma.Amossoma;
import amossomaWeaves.AmossomaWeaves;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class BlockBambooFence extends BlockFence
{

	public BlockBambooFence(int par1, int par2)
	{
		super(par1, par2, Material.wood);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setRequiresSelfNotify();
        }
     
   public int getBlockTextureFromSideAndMetadata(int par1, int par2) 
    {
    	switch (par2) 
    	{
    	case 0:
    		return 96;
    	case 1:
    		return 97;
    	case 2:
    		return 98;
    	case 3:
    		return 101;
    	case 4:
    		return 104;
    	case 5:
    		return 105;
    	case 6:
    		return 108;
    	default:
    		return 96;
    	}
}		
   public String getTextureFile()
   {
	   return "/Amossoma/amossomaweaves.png";
   }
   @SideOnly(Side.CLIENT)
   public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
   {
       for (int var4 = 0; var4 < 7; ++var4)
       {
           par3List.add(new ItemStack(par1, 1, var4));
       }
   }
   public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
   {
       boolean var5 = this.canConnectFenceTo(par1World, par2, par3, par4 - 1);
       boolean var6 = this.canConnectFenceTo(par1World, par2, par3, par4 + 1);
       boolean var7 = this.canConnectFenceTo(par1World, par2 - 1, par3, par4);
       boolean var8 = this.canConnectFenceTo(par1World, par2 + 1, par3, par4);
       float var9 = 0.375F;
       float var10 = 0.625F;
       float var11 = 0.375F;
       float var12 = 0.625F;

       if (var5)
       {
           var11 = 0.0F;
       }

       if (var6)
       {
           var12 = 1.0F;
       }

       if (var7)
       {
           var9 = 0.0F;
       }

       if (var8)
       {
           var10 = 1.0F;
       }

       return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)((float)par2 + var9), (double)par3, (double)((float)par4 + var11), (double)((float)par2 + var10), (double)((float)par3 + 1.5F), (double)((float)par4 + var12));
   }
   public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
   {
       boolean var5 = this.canConnectFenceTo(par1IBlockAccess, par2, par3, par4 - 1);
       boolean var6 = this.canConnectFenceTo(par1IBlockAccess, par2, par3, par4 + 1);
       boolean var7 = this.canConnectFenceTo(par1IBlockAccess, par2 - 1, par3, par4);
       boolean var8 = this.canConnectFenceTo(par1IBlockAccess, par2 + 1, par3, par4);
       float var9 = 0.375F;
       float var10 = 0.625F;
       float var11 = 0.375F;
       float var12 = 0.625F;

       if (var5)
       {
           var11 = 0.0F;
       }

       if (var6)
       {
           var12 = 1.0F;
       }

       if (var7)
       {
           var9 = 0.0F;
       }

       if (var8)
       {
           var10 = 1.0F;
       }

       this.setBlockBounds(var9, 0.0F, var11, var10, 1.0F, var12);
   }
   public boolean isOpaqueCube()
   {
       return false;
   }
   public boolean renderAsNormalBlock()
   {
       return false;
   }
   public int getRenderType()
   {
       return 11;
   }
   public boolean canConnectFenceTo(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
   {
       int var5 = par1IBlockAccess.getBlockId(par2, par3, par4);

       if (var5 != this.blockID && var5 != Block.fenceGate.blockID && var5 != Block.fence.blockID && var5 != AmossomaWeaves.BambooFenceBlock.blockID)
       {
           Block var6 = Block.blocksList[var5];
           return var6 != null && var6.blockMaterial.isOpaque() && var6.renderAsNormalBlock() ? var6.blockMaterial != Material.pumpkin : false;
       }
       else
       {
           return true;
       }
   }
   public static boolean isIdAFence(int par0)
   {
       return par0 == Block.fence.blockID || par0 == Block.netherFence.blockID || par0 == AmossomaWeaves.BambooFenceBlock.blockID;
   }
   public int idDropped(int par1, Random par2Random, int par3)
   {
       return this.blockID;
   }
   
   public int quantityDropped(Random par1Random)
   {
       return 1;
   }
}
