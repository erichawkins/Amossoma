package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemStagHornCoralBlock extends ItemBlock
{
public ItemStagHornCoralBlock(int par1, Block block) 
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
name = "StagHornCoral";
break;
}
case 1: 
{
name = "StagHornCoral1"; 
break;
}
case 2: 
{
name = "StagHornCoral2"; 
break;
}
case 3: 
{
name = "StagHornCoral3"; 
break;
}
case 4: 
{
name = "StagHornCoral4"; 
break;
}
case 5: 
{
name = "StagHornCoral5"; 
break;
}
case 6: 
{
name = "StagHornCoral6"; 
break;
}
case 7: 
{
name = "StagHornCoral7"; 
break;
}
case 8: 
{
name = "StagHornCoral8"; 
break;
}
case 9: 
{
name = "StagHornCoral9"; 
break;
}
case 10: 
{
name = "StagHornCoral10"; 
break;
}
default: name = "StagHornCoral";
}
return getItemName() + "." + name;
}

public int getIconFromDamage(int par1) 
{
	switch (par1) 
	{
	case 0:
		return 144;
	case 1:
		return 145;
	case 2:
		return 146;
	case 3:
		return 147;
	case 4:
		return 148;
	case 5:
		return 149;
	case 6:
		return 150;
	case 7:
		return 151;
	case 8:
		return 152;
	case 9:
		return 153;
	case 10:
		return 154;
	default:
		return 154;
	}
}

public int getMetadata(int par1)
    {
        return par1;
    }
}