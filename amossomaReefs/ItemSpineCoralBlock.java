package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemSpineCoralBlock extends ItemBlock
{
	public ItemSpineCoralBlock(int par1, Block block) 
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
			name = "SpineCoral";
			break;
		}
		case 1: 
		{
			name = "SpineCoral1"; 
			break;
		}
		case 2: 
		{
			name = "SpineCoral2"; 
			break;
		}
		case 3: 
		{
			name = "SpineCoral3"; 
			break;
		}
		case 4: 
		{
			name = "SpineCoral4"; 
			break;
		}
		case 5: 
		{
			name = "SpineCoral5"; 
			break;
		}
		case 6: 
		{
			name = "SpineCoral6"; 
			break;
		}
		case 7: 
		{
			name = "SpineCoral7"; 
			break;
		}
		case 8: 
		{
			name = "SpineCoral8"; 
			break;
		}
		case 9: 
		{
			name = "SpineCoral9"; 
			break;
		}
		case 10: 
		{
			name = "SpineCoral10"; 
			break;
		}
		default: name = "SpineCoral";
		}
		return getItemName() + "." + name;
	}

	   public int getIconFromDamage(int par1) 
	    {
	    	switch (par1) 
	    	{
	    	case 0:
	    		return 128;
	    	case 1:
	    		return 129;
	    	case 2:
	    		return 130;
	    	case 3:
	    		return 131;
	    	case 4:
	    		return 132;
	    	case 5:
	    		return 133;
	    	case 6:
	    		return 134;
	    	case 7:
	    		return 135;
	    	case 8:
	    		return 136;
	    	case 9:
	    		return 137;
	    	case 10:
	    		return 138;
	    	default:
	    		return 138;
	    	}
	}
	   
	public int getMetadata(int par1)
	{
		return par1;
	}
	
	
}