package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBubbleCoralBlock extends ItemBlock
{
public ItemBubbleCoralBlock(int par1, Block block) 
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
name = "BubbleCoral";
break;
}
case 1: 
{
name = "BubbleCoral1"; 
break;
}
case 2: 
{
name = "BubbleCoral2"; 
break;
}
case 3: 
{
name = "BubbleCoral3"; 
break;
}
case 4: 
{
name = "BubbleCoral4"; 
break;
}
case 5: 
{
name = "BubbleCoral5"; 
break;
}
case 6: 
{
name = "BubbleCoral6"; 
break;
}
case 7: 
{
name = "BubbleCoral7"; 
break;
}
case 8: 
{
name = "BubbleCoral8"; 
break;
}
case 9: 
{
name = "BubbleCoral9"; 
break;
}
case 10: 
{
name = "BubbleCoral10"; 
break;
}
default: name = "BubbleCoral";
}
return getItemName() + "." + name;
}

public int getIconFromDamage(int par1) 
{
	switch (par1) 
	{
	case 0:
		return 192;
	case 1:
		return 193;
	case 2:
		return 194;
	case 3:
		return 195;
	case 4:
		return 196;
	case 5:
		return 197;
	case 6:
		return 198;
	case 7:
		return 199;
	case 8:
		return 200;
	case 9:
		return 201;
	case 10:
		return 202;
	default:
		return 202;
	}
}

public int getMetadata(int par1)
    {
        return par1;
    }
}