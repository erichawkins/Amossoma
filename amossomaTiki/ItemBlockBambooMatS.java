package amossomaTiki;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBambooMatS extends ItemBlock
{
	public ItemBlockBambooMatS(int par1, Block block)
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
	name = "BambooMatS";
	break;
	}
	case 1: 
	{
	name = "BambooMatS1"; 
	break;
	}
	case 2: 
	{
	name = "BambooMatS2"; 
	break;
	}
	case 3: 
	{
	name = "BambooMatS3"; 
	break;
	}
	case 4: 
	{
	name = "BambooMatS4"; 
	break;
	}
	default: name = "BambooMatS";
	}
	return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	    {
	        return par1;
	    }
	}
