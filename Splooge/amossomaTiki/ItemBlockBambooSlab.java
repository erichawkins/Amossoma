package amossomaTiki;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBambooSlab extends ItemBlock
{
	public ItemBlockBambooSlab(int par1, Block block)
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
	name = "BambooSlab";
	break;
	}
	case 1: 
	{
	name = "BambooSlab1"; 
	break;
	}
	case 2: 
	{
	name = "BambooSlab2"; 
	break;
	}
	case 3: 
	{
	name = "BambooSlab3"; 
	break;
	}
	case 4: 
	{
	name = "BambooSlab4"; 
	break;
	}
	case 5: 
	{
	name = "BambooSlab5"; 
	break;
	}
	case 6: 
	{
	name = "BambooSlab6"; 
	break;
	}
	case 7: 
	{
	name = "BambooSlab7"; 
	break;
	}
	case 8: 
	{
	name = "BambooSlab8"; 
	break;
	}
	case 9: 
	{
	name = "BambooSlab9"; 
	break;
	}
	case 10: 
	{
	name = "BambooSlab10"; 
	break;
	}
	case 11: 
	{
	name = "BambooSlab11"; 
	break;
	}
	case 12: 
	{
	name = "BambooSlab12"; 
	break;
	}
	case 13: 
	{
	name = "BambooSlab13"; 
	break;
	}
	case 14: 
	{
	name = "BambooSlab14"; 
	break;
	}
	default: name = "BambooSlab";
	}
	return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	    {
	        return par1;
	    }
	}
