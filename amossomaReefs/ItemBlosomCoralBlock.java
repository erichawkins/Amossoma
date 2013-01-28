package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlosomCoralBlock extends ItemBlock
{
public ItemBlosomCoralBlock(int par1, Block block) 
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
name = "BlosomCoral";
break;
}
case 1: 
{
name = "BlosomCoral1"; 
break;
}
case 2: 
{
name = "BlosomCoral2"; 
break;
}
case 3: 
{
name = "BlosomCoral3"; 
break;
}
case 4: 
{
name = "BlosomCoral4"; 
break;
}
case 5: 
{
name = "BlosomCoral5"; 
break;
}
case 6: 
{
name = "BlosomCoral6"; 
break;
}
case 7: 
{
name = "BlosomCoral7"; 
break;
}
case 8: 
{
name = "BlosomCoral8"; 
break;
}
case 9: 
{
name = "BlosomCoral9"; 
break;
}
case 10: 
{
name = "BlosomCoral10"; 
break;
}
default: name = "BlosomCoral";
}
return getItemName() + "." + name;
}

public int getIconFromDamage(int par1) 
{
	switch (par1) 
	{
	case 0:
		return 176;
	case 1:
		return 177;
	case 2:
		return 178;
	case 3:
		return 179;
	case 4:
		return 180;
	case 5:
		return 181;
	case 6:
		return 182;
	case 7:
		return 183;
	case 8:
		return 184;
	case 9:
		return 185;
	case 10:
		return 186;
	default:
		return 186;
	}
}

public int getMetadata(int par1)
    {
        return par1;
    }
}