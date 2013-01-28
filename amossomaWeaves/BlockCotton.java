package amossomaWeaves;

import java.util.List;
import java.util.Random;

import amossomaAllTabs.AmossomaAllTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;

public class BlockCotton extends Block
{
    public BlockCotton(int par1, int par2)
    {
        super(par1, par2, Material.cloth);
        this.setCreativeTab(AmossomaAllTabs.AmossomaMaterialsTab);
        this.setRequiresSelfNotify();
    }
     
   public int getBlockTextureFromSideAndMetadata(int par1, int par2) 
    {
    	switch (par2) 
    	{
    	case 0:
    		return 16;
    	case 1:
    		return 17;
    	case 2:
    		return 18;
    	case 3:
    		return 19;
    	case 4:
    		return 20;
    	case 5:
    		return 21;
    	case 6:
    		return 22;
    	case 7:
    		return 23;
    	case 8:
    		return 24;
    	case 9:
    		return 25;
    	case 10:
    		return 26;
    	case 11:
    		return 27;
    	case 12:
    		return 28;
    	case 13:
    		return 29;
    	case 14:
    		return 30;
    	case 15:
    		return 31;
    	default:
    		return 16;
    	}
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
        return 9;
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