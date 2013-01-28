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

public class BlockLinen extends Block
{
    public BlockLinen(int par1, int par2)
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
   public String getTextureFile()
   {
           return "/Amossoma/amossomaweaves.png";
   }
   
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return AmossomaWeaves.linenthread.itemID;
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