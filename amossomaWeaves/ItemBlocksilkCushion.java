package amossomaWeaves;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlocksilkCushion extends ItemBlock
{
public ItemBlocksilkCushion(int par1, Block block) 
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
name = "silkCushion";
break;
}
case 1: 
{
name = "silkCushion1"; 
break;
}
case 2: 
{
name = "silkCushion2"; 
break;
}
case 3: 
{
name = "silkCushion3"; 
break;
}
case 4: 
{
name = "silkCushion4"; 
break;
}
case 5: 
{
name = "silkCushion5"; 
break;
}
case 6: 
{
name = "silkCushion6"; 
break;
}
case 7: 
{
name = "silkCushion7"; 
break;
}
case 8: 
{
name = "silkCushion8"; 
break;
}
case 9: 
{
name = "silkCushion9"; 
break;
}
case 10: 
{
name = "silkCushion10"; 
break;
}
case 11: 
{
name = "silkCushion11"; 
break;
}
case 12: 
{
name = "silkCushion12"; 
break;
}
case 13: 
{
name = "silkCushion13"; 
break;
}
case 14: 
{
name = "silkCushion14"; 
break;
}
case 15: 
{
name = "silkCushion15"; 
break;
}
case 16: 
{
name = "silkCushion16"; 
break;
}
default: name = "silkCushion";
}
return getItemName() + "." + name;
}

public int getMetadata(int par1)
    {
        return par1;
    }
}