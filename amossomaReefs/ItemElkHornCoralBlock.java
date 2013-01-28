package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemElkHornCoralBlock extends ItemBlock
{
	public ItemElkHornCoralBlock(int par1, Block block) 
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
			name = "ElkHornCoral";
			break;
		}
		case 1: 
		{
			name = "ElkHornCoral1"; 
			break;
		}
		case 2: 
		{
			name = "ElkHornCoral2"; 
			break;
		}
		case 3: 
		{
			name = "ElkHornCoral3"; 
			break;
		}
		case 4: 
		{
			name = "ElkHornCoral4"; 
			break;
		}
		case 5: 
		{
			name = "ElkHornCoral5"; 
			break;
		}
		case 6: 
		{
			name = "ElkHornCoral6"; 
			break;
		}
		case 7: 
		{
			name = "ElkHornCoral7"; 
			break;
		}
		case 8: 
		{
			name = "ElkHornCoral8"; 
			break;
		}
		case 9: 
		{
			name = "ElkHornCoral9"; 
			break;
		}
		case 10: 
		{
			name = "ElkHornCoral10"; 
			break;
		}
		default: name = "ElkHornCoral";
		}
		return getItemName() + "." + name;
	}

	public int getIconFromDamage(int par1) 
	{
		switch (par1) 
		{
		case 0:
			return 240;
		case 1:
			return 241;
		case 2:
			return 242;
		case 3:
			return 243;
		case 4:
			return 244;
		case 5:
			return 245;
		case 6:
			return 246;
		case 7:
			return 247;
		case 8:
			return 248;
		case 9:
			return 249;
		case 10:
			return 250;
		default:
			return 250;
		}
	}

	public int getMetadata(int par1)
	{
		return par1;
	}
}