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

public class BlockSilk extends Block
{
    public BlockSilk(int par1, int par2)
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