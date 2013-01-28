package amossomaWeaves;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlocksilkcarpet extends ItemBlock
{
public ItemBlocksilkcarpet(int par1, Block block) 
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
name = "silkcarpet";
break;
}
case 1: 
{
name = "silkcarpet1"; 
break;
}
case 2: 
{
name = "silkcarpet2"; 
break;
}
case 3: 
{
name = "silkcarpet3"; 
break;
}
case 4: 
{
name = "silkcarpet4"; 
break;
}
case 5: 
{
name = "silkcarpet5"; 
break;
}
case 6: 
{
name = "silkcarpet6"; 
break;
}
case 7: 
{
name = "silkcarpet7"; 
break;
}
case 8: 
{
name = "silkcarpet8"; 
break;
}
case 9: 
{
name = "silkcarpet9"; 
break;
}
case 10: 
{
name = "silkcarpet10"; 
break;
}
case 11: 
{
name = "silkcarpet11"; 
break;
}
case 12: 
{
name = "silkcarpet12"; 
break;
}
case 13: 
{
name = "silkcarpet13"; 
break;
}
case 14: 
{
name = "silkcarpet14"; 
break;
}
case 15: 
{
name = "silkcarpet15"; 
break;
}
case 16: 
{
name = "silkcarpet16"; 
break;
}
default: name = "silkcarpet";
}
return getItemName() + "." + name;
}

public int getMetadata(int par1)
    {
        return par1;
    }
}