package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemShelfCoralBlock extends ItemBlock
{
public ItemShelfCoralBlock(int par1, Block block) 
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
name = "ShelfCoral";
break;
}
case 1: 
{
name = "ShelfCoral1"; 
break;
}
case 2: 
{
name = "ShelfCoral2"; 
break;
}
case 3: 
{
name = "ShelfCoral3"; 
break;
}
case 4: 
{
name = "ShelfCoral4"; 
break;
}
case 5: 
{
name = "ShelfCoral5"; 
break;
}
case 6: 
{
name = "ShelfCoral6"; 
break;
}
case 7: 
{
name = "ShelfCoral7"; 
break;
}
case 8: 
{
name = "ShelfCoral8"; 
break;
}
case 9: 
{
name = "ShelfCoral9"; 
break;
}
case 10: 
{
name = "ShelfCoral10"; 
break;
}
default: name = "ShelfCoral";
}
return getItemName() + "." + name;
}

public int getIconFromDamage(int par1) 
{
	switch (par1) 
	{
	case 0:
		return 208;
	case 1:
		return 209;
	case 2:
		return 210;
	case 3:
		return 211;
	case 4:
		return 212;
	case 5:
		return 213;
	case 6:
		return 214;
	case 7:
		return 215;
	case 8:
		return 216;
	case 9:
		return 217;
	case 10:
		return 218;
	default:
		return 218;
	}
}

public int getMetadata(int par1)
    {
        return par1;
    }
}