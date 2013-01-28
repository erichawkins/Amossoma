package amossomaReefs;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import amossomaAllTabs.AmossomaAllTabs;
import amossomaWeaves.AmossomaWeaves;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockReefBlockRed extends Block
{
    public BlockReefBlockRed(int par1, int par2)
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
    		return 8;
    	case 1:
    		return 9;
    	case 2:
    		return 10;
    	case 3:
    		return 11;
    	case 4:
    		return 12;
    	case 5:
    		return 13;
    	case 6:
    		return 14;
    	case 7:
    		return 15;
    	default:
    		return 8;
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