package amossomaWeaves;

import java.util.List;
import java.util.Random;

import amossomaAllTabs.AmossomaAllTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLinenthread extends Item
{
    public ItemLinenthread(int i)
    {
        super(i);
        maxStackSize = 58;
        this.setCreativeTab(AmossomaAllTabs.AmossomaMaterialsTab);
    }
    
    public String getTextureFile()
    {
            return "/Amossoma/amossomaweaves.png";
    }
}