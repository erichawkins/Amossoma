package amossomaAllTabs;

import amossomaBlocks.AmossomaBlocks;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.*;

public class AmossomaBlocksTab extends CreativeTabs 
{
public AmossomaBlocksTab(int position, String tabID) 

{
super(position, tabID); //The constructor for your tab
}

@SideOnly(Side.CLIENT)
public int getTabIconItemIndex() //The item it displays for your tab
{
return AmossomaBlocks.somaBlock.blockID; //For this we'll use the ruby
}
public String getTranslatedTabLabel()
{
return "Amossoma Blocks"; //The name of the tab ingame
}
}