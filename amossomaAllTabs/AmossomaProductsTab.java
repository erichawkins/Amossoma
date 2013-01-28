package amossomaAllTabs;

import amossomaWeaves.AmossomaWeaves;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;

public class AmossomaProductsTab extends CreativeTabs 
{
public AmossomaProductsTab(int position, String tabID) 

{
super(position, tabID); //The constructor for your tab
}

@SideOnly(Side.CLIENT)
public int getTabIconItemIndex() //The item it displays for your tab
{
return Item.bowlEmpty.itemID; //For this we'll use the ruby
}
public String getTranslatedTabLabel()
{
return "Amossoma Products"; //The name of the tab ingame
}
}