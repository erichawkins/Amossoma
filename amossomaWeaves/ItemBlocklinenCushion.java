package amossomaWeaves;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlocklinenCushion extends ItemBlock
{
public ItemBlocklinenCushion(int par1, Block block) 
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
name = "linenCushion";
break;
}
case 1: 
{
name = "linenCushion1"; 
break;
}
case 2: 
{
name = "linenCushion2"; 
break;
}
case 3: 
{
name = "linenCushion3"; 
break;
}
case 4: 
{
name = "linenCushion4"; 
break;
}
case 5: 
{
name = "linenCushion5"; 
break;
}
case 6: 
{
name = "linenCushion6"; 
break;
}
case 7: 
{
name = "linenCushion7"; 
break;
}
case 8: 
{
name = "linenCushion8"; 
break;
}
case 9: 
{
name = "linenCushion9"; 
break;
}
case 10: 
{
name = "linenCushion10"; 
break;
}
case 11: 
{
name = "linenCushion11"; 
break;
}
case 12: 
{
name = "linenCushion12"; 
break;
}
case 13: 
{
name = "linenCushion13"; 
break;
}
case 14: 
{
name = "linenCushion14"; 
break;
}
case 15: 
{
name = "linenCushion15"; 
break;
}
case 16: 
{
name = "linenCushion16"; 
break;
}
default: name = "linenCushion";
}
return getItemName() + "." + name;
}

public int getMetadata(int par1)
    {
        return par1;
    }
}