package amossomaTiki;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBamboo extends ItemBlock
{
	public ItemBlockBamboo(int par1, Block block)
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
	name = "Bamboo";
	break;
	}
	case 1: 
	{
	name = "Bamboo1"; 
	break;
	}
	case 2: 
	{
	name = "Bamboo2"; 
	break;
	}
	case 3: 
	{
	name = "Bamboo3"; 
	break;
	}
	case 4: 
	{
	name = "Bamboo4"; 
	break;
	}
	case 5: 
	{
	name = "Bamboo5"; 
	break;
	}
	case 6: 
	{
	name = "Bamboo6"; 
	break;
	}
	case 7: 
	{
	name = "Bamboo7"; 
	break;
	}
	case 8: 
	{
	name = "Bamboo8"; 
	break;
	}
	case 9: 
	{
	name = "Bamboo9"; 
	break;
	}
	case 10: 
	{
	name = "Bamboo10"; 
	break;
	}
	case 11: 
	{
	name = "Bamboo11"; 
	break;
	}
	case 12: 
	{
	name = "Bamboo12"; 
	break;
	}
	case 13: 
	{
	name = "Bamboo13"; 
	break;
	}
	case 14: 
	{
	name = "Bamboo14"; 
	break;
	}
	default: name = "Bamboo";
	}
	return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	    {
	        return par1;
	    }
	}
