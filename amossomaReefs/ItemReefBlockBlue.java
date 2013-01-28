package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemReefBlockBlue extends ItemBlock
{
public ItemReefBlockBlue(int par1, Block block) 
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
name = "BlueReef";
break;
}
case 1: 
{
name = "BlueReef1"; 
break;
}
case 2: 
{
name = "BlueReef2"; 
break;
}
case 3: 
{
name = "BlueReef3"; 
break;
}
case 4: 
{
name = "BlueReef4"; 
break;
}
case 5: 
{
name = "BlueReef5"; 
break;
}
case 6: 
{
name = "BlueReef6"; 
break;
}
case 7: 
{
name = "BlueReef7"; 
break;
}
default: name = "BlueReef";
}
return getItemName() + "." + name;
}

public int getMetadata(int par1)
    {
        return par1;
    }
}