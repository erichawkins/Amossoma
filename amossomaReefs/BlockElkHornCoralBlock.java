package amossomaReefs;

import java.util.List;
import java.util.Random;

import amossomaAllTabs.AmossomaAllTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockElkHornCoralBlock extends Block
{
    public BlockElkHornCoralBlock(int par1, int par2)
    {
        super(par1, par2, Material.water);
        float f = 0.5F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        this.setCreativeTab(AmossomaAllTabs.AmossomaReefsTab);
        this.setRequiresSelfNotify();
    }
     
   public int getBlockTextureFromSideAndMetadata(int par1, int par2) 
    {
    	switch (par2) 
    	{
    	case 0:
    		return 240;
    	case 1:
    		return 241;
    	case 2:
    		return 242;
    	case 3:
    		return 243;
    	case 4:
    		return 244;
    	case 5:
    		return 245;
    	case 6:
    		return 246;
    	case 7:
    		return 247;
    	case 8:
    		return 248;
    	case 9:
    		return 249;
    	case 10:
    		return 250;
    	default:
    		return 250;
    	}
}
   
   public String getTextureFile()
   {
           return "/Amossoma/amossomareef.png";
   }
   public int getRenderType()
   {
       return 6;
   }
   
   public boolean isOpaqueCube()
   {
       return false;
   }
   
   public boolean renderAsNormalBlock()
   {
       return false;
   }
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }

    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 11; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}