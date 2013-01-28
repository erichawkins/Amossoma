package amossomaAllTabs;

import amossomaBlocks.AmossomaBlocks;
import amossomaWeaves.AmossomaWeaves;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;

public class AmossomaDecoTab extends CreativeTabs 
{
public AmossomaDecoTab(int position, String tabID) 

{
super(position, tabID); //The constructor for your tab
}

@SideOnly(Side.CLIENT)
public int getTabIconItemIndex() //The item it displays for your tab
{
return Item.painting.itemID; //For this we'll use the ruby
}
public String getTranslatedTabLabel()
{
return "Amossoma Deco"; //The name of the tab ingame
}
}