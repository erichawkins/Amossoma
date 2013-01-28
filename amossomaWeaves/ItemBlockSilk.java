package amossomaWeaves;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

	public class ItemBlockSilk extends ItemBlock
	{
	public ItemBlockSilk(int par1, Block block) 
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
	name = "Silk";
	break;
	}
	case 1: 
	{
	name = "Silk1"; 
	break;
	}
	case 2: 
	{
	name = "Silk2"; 
	break;
	}
	case 3: 
	{
	name = "Silk3"; 
	break;
	}
	case 4: 
	{
	name = "Silk4"; 
	break;
	}
	case 5: 
	{
	name = "Silk5"; 
	break;
	}
	case 6: 
	{
	name = "Silk6"; 
	break;
	}
	case 7: 
	{
	name = "Silk7"; 
	break;
	}
	case 8: 
	{
	name = "Silk8"; 
	break;
	}
	case 9: 
	{
	name = "Silk9"; 
	break;
	}
	case 10: 
	{
	name = "Silk10"; 
	break;
	}
	case 11: 
	{
	name = "Silk11"; 
	break;
	}
	case 12: 
	{
	name = "Silk12"; 
	break;
	}
	case 13: 
	{
	name = "Silk13"; 
	break;
	}
	case 14: 
	{
	name = "Silk14"; 
	break;
	}
	case 15: 
	{
	name = "Silk15"; 
	break;
	}
	case 16: 
	{
	name = "Silk16"; 
	break;
	}
	default: name = "Silk";
	}
	return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	    {
	        return par1;
	    }
	}