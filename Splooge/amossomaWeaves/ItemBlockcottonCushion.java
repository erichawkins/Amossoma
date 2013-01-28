package amossomaWeaves;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockcottonCushion extends ItemBlock
{
public ItemBlockcottonCushion(int par1, Block block) 
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
name = "cottonCushion";
break;
}
case 1: 
{
name = "cottonCushion1"; 
break;
}
case 2: 
{
name = "cottonCushion2"; 
break;
}
case 3: 
{
name = "cottonCushion3"; 
break;
}
case 4: 
{
name = "cottonCushion4"; 
break;
}
case 5: 
{
name = "cottonCushion5"; 
break;
}
case 6: 
{
name = "cottonCushion6"; 
break;
}
case 7: 
{
name = "cottonCushion7"; 
break;
}
case 8: 
{
name = "cottonCushion8"; 
break;
}
case 9: 
{
name = "cottonCushion9"; 
break;
}
case 10: 
{
name = "cottonCushion10"; 
break;
}
case 11: 
{
name = "cottonCushion11"; 
break;
}
case 12: 
{
name = "cottonCushion12"; 
break;
}
case 13: 
{
name = "cottonCushion13"; 
break;
}
case 14: 
{
name = "cottonCushion14"; 
break;
}
case 15: 
{
name = "cottonCushion15"; 
break;
}
case 16: 
{
name = "cottonCushion16"; 
break;
}
default: name = "cottonCushion";
}
return getItemName() + "." + name;
}

public int getMetadata(int par1)
    {
        return par1;
    }
}