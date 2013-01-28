package amossomaTiki;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBambooFence extends ItemBlock
{
	public ItemBlockBambooFence(int par1, Block block)
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
	name = "BambooFence";
	break;
	}
	case 1: 
	{
	name = "BambooFence1"; 
	break;
	}
	case 2: 
	{
	name = "BambooFence2"; 
	break;
	}
	case 3: 
	{
	name = "BambooFence3"; 
	break;
	}
	case 4: 
	{
	name = "BambooFence4"; 
	break;
	}
	case 5: 
	{
	name = "BambooFence5"; 
	break;
	}
	case 6: 
	{
	name = "BambooFence6"; 
	break;
	}
	default: name = "BambooFence";
	}
	return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	    {
	        return par1;
	    }
	}
