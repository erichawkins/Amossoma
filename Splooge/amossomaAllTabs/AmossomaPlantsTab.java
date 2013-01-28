package amossomaAllTabs;

import amossomaPlants.AmossomaPlants;
import amossomaWeaves.AmossomaWeaves;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.*;

public class AmossomaPlantsTab extends CreativeTabs 
{
public AmossomaPlantsTab(int position, String tabID) 

{
super(position, tabID); //The constructor for your tab
}

@SideOnly(Side.CLIENT)
public int getTabIconItemIndex() //The item it displays for your tab
{
return AmossomaPlants.LilyoftheValleyFlower.blockID; //For this we'll use the ruby
}
public String getTranslatedTabLabel()
{
return "Amossoma Plants"; //The name of the tab ingame
}
}