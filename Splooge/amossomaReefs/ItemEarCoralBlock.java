package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemEarCoralBlock extends ItemBlock
{
public ItemEarCoralBlock(int par1, Block block) 
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
name = "EarCoral";
break;
}
case 1: 
{
name = "EarCoral1"; 
break;
}
case 2: 
{
name = "EarCoral2"; 
break;
}
case 3: 
{
name = "EarCoral3"; 
break;
}
case 4: 
{
name = "EarCoral4"; 
break;
}
case 5: 
{
name = "EarCoral5"; 
break;
}
case 6: 
{
name = "EarCoral6"; 
break;
}
case 7: 
{
name = "EarCoral7"; 
break;
}
case 8: 
{
name = "EarCoral8"; 
break;
}
case 9: 
{
name = "EarCoral9"; 
break;
}
case 10: 
{
name = "EarCoral10"; 
break;
}
default: name = "EarCoral";
}
return getItemName() + "." + name;
}


public int getIconFromDamage(int par1) 
 {
 	switch (par1) 
 	{
	case 0:
		return 160;
	case 1:
		return 161;
	case 2:
		return 162;
	case 3:
		return 163;
	case 4:
		return 164;
	case 5:
		return 165;
	case 6:
		return 166;
	case 7:
		return 167;
	case 8:
		return 168;
	case 9:
		return 169;
	case 10:
		return 170;
	default:
		return 170;
 	}
}

public int getMetadata(int par1)
    {
        return par1;
    }
}