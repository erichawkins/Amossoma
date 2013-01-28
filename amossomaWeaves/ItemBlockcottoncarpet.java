package amossomaWeaves;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockcottoncarpet extends ItemBlock
{
public ItemBlockcottoncarpet(int par1, Block block) 
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
name = "cottoncarpet";
break;
}
case 1: 
{
name = "cottoncarpet1"; 
break;
}
case 2: 
{
name = "cottoncarpet2"; 
break;
}
case 3: 
{
name = "cottoncarpet3"; 
break;
}
case 4: 
{
name = "cottoncarpet4"; 
break;
}
case 5: 
{
name = "cottoncarpet5"; 
break;
}
case 6: 
{
name = "cottoncarpet6"; 
break;
}
case 7: 
{
name = "cottoncarpet7"; 
break;
}
case 8: 
{
name = "cottoncarpet8"; 
break;
}
case 9: 
{
name = "cottoncarpet9"; 
break;
}
case 10: 
{
name = "cottoncarpet10"; 
break;
}
case 11: 
{
name = "cottoncarpet11"; 
break;
}
case 12: 
{
name = "cottoncarpet12"; 
break;
}
case 13: 
{
name = "cottoncarpet13"; 
break;
}
case 14: 
{
name = "cottoncarpet14"; 
break;
}
case 15: 
{
name = "cottoncarpet15"; 
break;
}
case 16: 
{
name = "cottoncarpet16"; 
break;
}
default: name = "cottoncarpet";
}
return getItemName() + "." + name;
}

public int getMetadata(int par1)
    {
        return par1;
    }
}