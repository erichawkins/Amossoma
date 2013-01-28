package amossomaTiki;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class BlockBamboo extends Block
{

    public BlockBamboo(int par1, int par2)
    {
        super(par1, 4, Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setRequiresSelfNotify();
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
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
    		return 99;
    	case 4:
    		return 100;
    	case 5:
    		return 101;
    	case 6:
    		return 102;
    	case 7:
    		return 103;
    	case 8:
    		return 104;
    	case 9:
    		return 105;
    	case 10:
    		return 106;
    	case 11:
    		return 107;
    	case 12:
    		return 108;
    	case 13:
    		return 109;
    	case 14:
    		return 110;
    	default:
    		return 96;
    	}
}
    public String getTextureFile()
    {
            return "/AmossomaWeaves/amossomaweaves.png";
     }
    public boolean isOpaqueCube()
    {
        return false;
    }
    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return true;
    }
    public int getRenderType()
    {
        return 0;
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
        for (int var4 = 0; var4 < 15; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}