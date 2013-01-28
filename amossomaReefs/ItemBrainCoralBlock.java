package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBrainCoralBlock extends ItemBlock
{
public ItemBrainCoralBlock(int par1, Block block) 
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
name = "BrainCoral";
break;
}
case 1: 
{
name = "BrainCoral1"; 
break;
}
case 2: 
{
name = "BrainCoral2"; 
break;
}
case 3: 
{
name = "BrainCoral3"; 
break;
}
case 4: 
{
name = "BrainCoral4"; 
break;
}
case 5: 
{
name = "BrainCoral5"; 
break;
}
case 6: 
{
name = "BrainCoral6"; 
break;
}
case 7: 
{
name = "BrainCoral7"; 
break;
}
case 8: 
{
name = "BrainCoral8"; 
break;
}
case 9: 
{
name = "BrainCoral9"; 
break;
}
case 10: 
{
name = "BrainCoral10"; 
break;
}
default: name = "BrainCoral";
}
return getItemName() + "." + name;
}

public int getIconFromDamage(int par1) 
{
	switch (par1) 
	{
	case 0:
		return 224;
	case 1:
		return 225;
	case 2:
		return 226;
	case 3:
		return 227;
	case 4:
		return 228;
	case 5:
		return 229;
	case 6:
		return 230;
	case 7:
		return 231;
	case 8:
		return 232;
	case 9:
		return 233;
	case 10:
		return 234;
	default:
		return 234;
	}
}

public int getMetadata(int par1)
    {
        return par1;
    }
}