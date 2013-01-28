package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemReefBlockGreen extends ItemBlock
{
public ItemReefBlockGreen(int par1, Block block) 
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
name = "GreenReef";
break;
}
case 1: 
{
name = "GreenReef1"; 
break;
}
case 2: 
{
name = "GreenReef2"; 
break;
}
case 3: 
{
name = "GreenReef3"; 
break;
}
case 4: 
{
name = "GreenReef4"; 
break;
}
case 5: 
{
name = "GreenReef5"; 
break;
}
case 6: 
{
name = "GreenReef6"; 
break;
}
case 7: 
{
name = "GreenReef7"; 
break;
}
default: name = "GreenReef";
}
return getItemName() + "." + name;
}

public int getMetadata(int par1)
    {
        return par1;
    }
}