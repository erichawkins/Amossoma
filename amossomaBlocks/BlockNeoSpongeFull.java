package amossomaBlocks;


import java.util.List;
import java.util.Random;

import amossoma.Amossoma;
import amossoma.AmossomaAirPhysics;
import amossoma.AmossomaWaterPhysics;
import amossomaAllTabs.AmossomaAllTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockNeoSpongeFull extends Block
{
	protected BlockNeoSpongeFull(int id, int texture, Material materials)
	{
		super(id, texture, Material.sponge);
		this.setCreativeTab(AmossomaAllTabs.AmossomaBlocksTab);
	}

	/**
	 * Gets the Image file for textures.
	 */
	
	public String getTextureFile()
	{
		return "/Amossoma/amossomablocks.png";
	}

	
	/**
	 * Called upon block activation (right click on the block.)
	 */
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5, int par6, float par7, float par8, float par9)
	{   	
        {
    		this.Splooge(par1World, par2, par3, par4);
            return true;
        }
	}

	private void Splooge(World par1World, int par2, int par3, int par4)
	{ 	
		if (AmossomaAirPhysics.isAir(par1World, par2 + 1, par3, par4))
			par1World.setBlock(par2 + 1, par3, par4, Block.waterStill.blockID);
		if (AmossomaAirPhysics.isAir(par1World, par2 , par3, par4 + 1))
			par1World.setBlock(par2, par3, par4 + 1, Block.waterStill.blockID);
		if (AmossomaAirPhysics.isAir(par1World, par2 - 1, par3, par4))
			par1World.setBlock(par2 - 1, par3, par4, Block.waterStill.blockID);
		if (AmossomaAirPhysics.isAir(par1World, par2, par3, par4 - 1))
			par1World.setBlock(par2, par3, par4 - 1, Block.waterStill.blockID);
		if (AmossomaAirPhysics.isAir(par1World, par2, par3 + 1, par4))
			par1World.setBlock(par2, par3 + 1, par4, Block.waterStill.blockID);
		if (AmossomaAirPhysics.isAir(par1World, par2, par3 - 1, par4))
			par1World.setBlock(par2, par3 - 1, par4, Block.waterStill.blockID);
		this.Emptied(par1World, par2, par3, par4);
	}
	
	
	private void Emptied(World par1World, int par2, int par3, int par4)
	{
		par1World.setBlockWithNotify(par2, par3, par4, AmossomaBlocks.neoSpongeEmpty.blockID);
	}

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }
	
	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */
	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return this.blockID;
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1)
	{
		return 1;
	}
}
