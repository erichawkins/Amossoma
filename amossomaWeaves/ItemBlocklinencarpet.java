package amossomaWeaves;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlocklinencarpet extends ItemBlock
{
public ItemBlocklinencarpet(int par1, Block block) 
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
name = "linencarpet";
break;
}
case 1: 
{
name = "linencarpet1"; 
break;
}
case 2: 
{
name = "linencarpet2"; 
break;
}
case 3: 
{
name = "linencarpet3"; 
break;
}
case 4: 
{
name = "linencarpet4"; 
break;
}
case 5: 
{
name = "linencarpet5"; 
break;
}
case 6: 
{
name = "linencarpet6"; 
break;
}
case 7: 
{
name = "linencarpet7"; 
break;
}
case 8: 
{
name = "linencarpet8"; 
break;
}
case 9: 
{
name = "linencarpet9"; 
break;
}
case 10: 
{
name = "linencarpet10"; 
break;
}
case 11: 
{
name = "linencarpet11"; 
break;
}
case 12: 
{
name = "linencarpet12"; 
break;
}
case 13: 
{
name = "linencarpet13"; 
break;
}
case 14: 
{
name = "linencarpet14"; 
break;
}
case 15: 
{
name = "linencarpet15"; 
break;
}
case 16: 
{
name = "linencarpet16"; 
break;
}
default: name = "linencarpet";
}
return getItemName() + "." + name;
}

public int getMetadata(int par1)
    {
        return par1;
    }
}