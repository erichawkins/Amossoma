package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemReefBlockRed extends ItemBlock
{
public ItemReefBlockRed(int par1, Block block) 
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
name = "RedReef";
break;
}
case 1: 
{
name = "RedReef1"; 
break;
}
case 2: 
{
name = "RedReef2"; 
break;
}
case 3: 
{
name = "RedReef3"; 
break;
}
case 4: 
{
name = "RedReef4"; 
break;
}
case 5: 
{
name = "RedReef5"; 
break;
}
case 6: 
{
name = "RedReef6"; 
break;
}
case 7: 
{
name = "RedReef7"; 
break;
}
default: name = "RedReef";
}
return getItemName() + "." + name;
}

public int getMetadata(int par1)
    {
        return par1;
    }
}