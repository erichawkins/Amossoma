package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemReefBlockYellow extends ItemBlock
{
public ItemReefBlockYellow(int par1, Block block) 
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
name = "YellowReef";
break;
}
case 1: 
{
name = "YellowReef1"; 
break;
}
case 2: 
{
name = "YellowReef2"; 
break;
}
case 3: 
{
name = "YellowReef3"; 
break;
}
case 4: 
{
name = "YellowReef4"; 
break;
}
case 5: 
{
name = "YellowReef5"; 
break;
}
case 6: 
{
name = "YellowReef6"; 
break;
}
case 7: 
{
name = "YellowReef7"; 
break;
}
default: name = "YellowReef";
}
return getItemName() + "." + name;
}

public int getMetadata(int par1)
    {
        return par1;
    }
}