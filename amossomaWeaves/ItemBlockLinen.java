package amossomaWeaves;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;



	public class ItemBlockLinen extends ItemBlock
	{
	public ItemBlockLinen(int par1, Block block) 
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
	name = "Linen";
	break;
	}
	case 1: 
	{
	name = "Linen1"; 
	break;
	}
	case 2: 
	{
	name = "Linen2"; 
	break;
	}
	case 3: 
	{
	name = "Linen3"; 
	break;
	}
	case 4: 
	{
	name = "Linen4"; 
	break;
	}
	case 5: 
	{
	name = "Linen5"; 
	break;
	}
	case 6: 
	{
	name = "Linen6"; 
	break;
	}
	case 7: 
	{
	name = "Linen7"; 
	break;
	}
	case 8: 
	{
	name = "Linen8"; 
	break;
	}
	case 9: 
	{
	name = "Linen9"; 
	break;
	}
	case 10: 
	{
	name = "Linen10"; 
	break;
	}
	case 11: 
	{
	name = "Linen11"; 
	break;
	}
	case 12: 
	{
	name = "Linen12"; 
	break;
	}
	case 13: 
	{
	name = "Linen13"; 
	break;
	}
	case 14: 
	{
	name = "Linen14"; 
	break;
	}
	case 15: 
	{
	name = "Linen15"; 
	break;
	}
	default: name = "Linen";
	}
	return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	    {
	        return par1;
	    }
	}
