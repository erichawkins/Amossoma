package amossomaPlants;

import java.util.Random;

import amossomaAllTabs.AmossomaAllTabs;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBlueBellFlower extends BlockFlower
{
    public BlockBlueBellFlower(int par1, int par2)
    {
        super(par1, par2, Material.plants);
        this.setCreativeTab(AmossomaAllTabs.AmossomaPlantsTab);
    }
    
    public String getTextureFile()
    {
            return "/Amossoma/amossomaplants.png";
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }
    
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
}