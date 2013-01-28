package amossomaWeaves;

import java.util.List;
import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemCottonthread extends Item
{
    public ItemCottonthread(int i)
    {
        super(i);
        maxStackSize = 74;
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
    
    public String getTextureFile()
    {
            return "/Amossoma/amossomaweaves.png";
    }
}