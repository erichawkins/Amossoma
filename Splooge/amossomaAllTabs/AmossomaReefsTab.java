package amossomaAllTabs;

import amossomaReefs.AmossomaReefs;
import amossomaWeaves.AmossomaWeaves;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;

public class AmossomaReefsTab extends CreativeTabs 
{
public AmossomaReefsTab(int position, String tabID) 

{
super(position, tabID); //The constructor for your tab
}

@SideOnly(Side.CLIENT)
public int getTabIconItemIndex() //The item it displays for your tab
{
return Item.fishRaw.itemID; //For this we'll use the ruby
}
public String getTranslatedTabLabel()
{
return "Amossoma Reefs"; //The name of the tab ingame
}
}