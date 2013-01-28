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

public class BlockReefBlockYellow  extends Block
{
    public BlockReefBlockYellow(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(AmossomaAllTabs.AmossomaReefsTab);
        this.setRequiresSelfNotify();
    }
     
   public int getBlockTextureFromSideAndMetadata(int par1, int par2) 
    {
    	switch (par2) 
    	{
    	case 0:
    		return 24;
    	case 1:
    		return 25;
    	case 2:
    		return 26;
    	case 3:
    		return 27;
    	case 4:
    		return 28;
    	case 5:
    		return 29;
    	case 6:
    		return 30;
    	case 7:
    		return 31;
    	default:
    		return 24;
    	}
}
   
   public String getTextureFile()
   {
           return "/Amossoma/amossomareef.png";
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
        for (int var4 = 0; var4 < 8; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}