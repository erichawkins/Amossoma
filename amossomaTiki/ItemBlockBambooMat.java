package amossomaTiki;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBambooMat extends ItemBlock
{
	public ItemBlockBambooMat(int par1, Block block)
	{
		super(par1);
		setHasSubtypes(true);
	}
	
	public String getItemNameIS(ItemStack itemstack)
	{
		String name = "";
		switch(itemstack.getItemDamage())
	{
	case 0: 
	{
	name = "BambooMat";
	break;
	}
	case 1: 
	{
	name = "BambooMat1"; 
	break;
	}
	case 2: 
	{
	name = "BambooMat2"; 
	break;
	}
	case 3: 
	{
	name = "BambooMat3"; 
	break;
	}
	case 4: 
	{
	name = "BambooMat4"; 
	break;
	}
	case 5: 
	{
	name = "BambooMat5"; 
	break;
	}
	case 6: 
	{
	name = "BambooMat6"; 
	break;
	}
	case 7: 
	{
	name = "BambooMat7"; 
	break;
	}
	case 8: 
	{
	name = "BambooMat8"; 
	break;
	}
	case 9: 
	{
	name = "BambooMat9"; 
	break;
	}
	case 10: 
	{
	name = "BambooMat10"; 
	break;
	}
	case 11: 
	{
	name = "BambooMat11"; 
	break;
	}
	case 12: 
	{
	name = "BambooMat12"; 
	break;
	}
	case 13: 
	{
	name = "BambooMat13"; 
	break;
	}
	case 14: 
	{
	name = "BambooMat14"; 
	break;
	}
	default: name = "BambooMat";
	}
	return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	    {
	        return par1;
	    }
	}
