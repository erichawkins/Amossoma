package amossomaWeaves;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCotton extends ItemBlock
{
	public ItemBlockCotton(int par1, Block block) 
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
			name = "Cotton";
			break;
		}
		case 1: 
		{
			name = "Cotton1"; 
			break;
		}
		case 2: 
		{
			name = "Cotton2"; 
			break;
		}
		case 3: 
		{
			name = "Cotton3"; 
			break;
		}
		case 4: 
		{
			name = "Cotton4"; 
			break;
		}
		case 5: 
		{
			name = "Cotton5"; 
			break;
		}
		case 6: 
		{
			name = "Cotton6"; 
			break;
		}
		case 7: 
		{
			name = "Cotton7"; 
			break;
		}
		case 8: 
		{
			name = "Cotton8"; 
			break;
		}
		case 9: 
		{
			name = "Cotton9"; 
			break;
		}
		case 10: 
		{
			name = "Cotton10"; 
			break;
		}
		case 11: 
		{
			name = "Cotton11"; 
			break;
		}
		case 12: 
		{
			name = "Cotton12"; 
			break;
		}
		case 13: 
		{
			name = "Cotton13"; 
			break;
		}
		case 14: 
		{
			name = "Cotton14"; 
			break;
		}
		case 15: 
		{
			name = "Cotton15"; 
			break;
		}
		default: name = "Cotton";
		}
		return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	{
		return par1;
	}
}