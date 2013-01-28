package amossomaTiki;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBambooSlabS extends ItemBlock
{
	public ItemBlockBambooSlabS(int par1, Block block)
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
	name = "BambooSlabS";
	break;
	}
	case 1: 
	{
	name = "BambooSlabS1"; 
	break;
	}
	case 2: 
	{
	name = "BambooSlabS2"; 
	break;
	}
	case 3: 
	{
	name = "BambooSlabS3"; 
	break;
	}
	case 4: 
	{
	name = "BambooSlabS4"; 
	break;
	}
	default: name = "BambooSlabS";
	}
	return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	    {
	        return par1;
	    }
	}
