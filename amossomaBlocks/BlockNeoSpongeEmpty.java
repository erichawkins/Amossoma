package amossomaBlocks;


import java.util.List;
import java.util.Random;

import amossoma.Amossoma;
import amossoma.AmossomaWaterPhysics;
import amossomaAllTabs.AmossomaAllTabs;

import cpw.mods.fml.common.FMLLog;
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

public class BlockNeoSpongeEmpty extends Block
{
	protected BlockNeoSpongeEmpty(int id, int texture, Material materials)
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
		if (AmossomaWaterPhysics.isExposedtoWater(par1World, par2, par3, par4))
		{
			FMLLog.info("isExposedtoWater = true");
			this.Soak(par1World, par2, par3, par4);
			return true;
		}
		else if (AmossomaWaterPhysics.isNotExposedtoWater(par1World, par2, par3, par4))
		{
			FMLLog.info("isNotExposedtoWater = true");
			return false;
		}
		return false;
	}	

	private void Soak(World par1World, int par2, int par3, int par4)
	{
		{
			FMLLog.info("soak = inside Soak");

			/* 
			 * ===========================================
			 * Forward Center
			 * ===========================================
			 */
			if (AmossomaWaterPhysics.isWater(par1World, par2 + 1, par3, par4 - 1))
				par1World.setBlock(par2 + 1, par3, par4 - 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2, par3, par4 - 1))
				par1World.setBlock(par2, par3, par4 - 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2 - 1, par3, par4 - 1))
				par1World.setBlock(par2 - 1, par3, par4 - 1, 0);
			/* 
			 * ===========================================
			 * Center Center
			 * ===========================================
			 */
			if (AmossomaWaterPhysics.isWater(par1World, par2 + 1, par3, par4))
				par1World.setBlock(par2 + 1, par3, par4, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2 - 1, par3, par4))
				par1World.setBlock(par2 - 1, par3, par4, 0);
			/* 
			 * ===========================================
			 * Backward Center
			 * ===========================================
			 */
			if (AmossomaWaterPhysics.isWater(par1World, par2 + 1, par3, par4 + 1))
				par1World.setBlock(par2 + 1, par3, par4 + 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2, par3, par4 + 1))
				par1World.setBlock(par2, par3, par4 + 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2 - 1, par3, par4 + 1))
				par1World.setBlock(par2 - 1, par3, par4 + 1, 0);
			/* 
			 * ===========================================
			 * Forward Upper
			 * ===========================================
			 */
			if (AmossomaWaterPhysics.isWater(par1World, par2 + 1, par3 + 1, par4 - 1))
				par1World.setBlock(par2 + 1, par3 + 1, par4 - 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2, par3 + 1, par4 - 1))
				par1World.setBlock(par2, par3 + 1, par4 - 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2 - 1, par3 + 1, par4 - 1))
				par1World.setBlock(par2 - 1, par3 + 1, par4 - 1, 0);
			/* 
			 * ===========================================
			 * Center Upper
			 * ===========================================
			 */
			if (AmossomaWaterPhysics.isWater(par1World, par2 + 1, par3 + 1, par4))
				par1World.setBlock(par2 + 1, par3 + 1, par4, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2, par3 + 1, par4))
				par1World.setBlock(par2, par3 + 1, par4, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2 - 1, par3 + 1, par4))
				par1World.setBlock(par2 - 1, par3 + 1, par4, 0);
			/* 
			 * ===========================================
			 * Backward Upper
			 * ===========================================
			 */
			if (AmossomaWaterPhysics.isWater(par1World, par2 + 1, par3 + 1, par4 + 1))
				par1World.setBlock(par2 + 1, par3 + 1, par4 + 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2, par3 + 1, par4 + 1))
				par1World.setBlock(par2, par3 + 1, par4 + 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2 - 1, par3 + 1, par4 + 1))
				par1World.setBlock(par2 - 1, par3 + 1, par4 + 1, 0);
			/* 
			 * ===========================================
			 * Forward Lower
			 * ===========================================
			 */
			if (AmossomaWaterPhysics.isWater(par1World, par2 + 1, par3 - 1, par4 - 1))
				par1World.setBlock(par2 + 1, par3 - 1, par4 - 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2, par3 - 1, par4 - 1))
				par1World.setBlock(par2, par3 - 1, par4 - 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2 - 1, par3 - 1, par4 - 1))
				par1World.setBlock(par2 - 1, par3 - 1, par4 - 1, 0);
			/* 
			 * ===========================================
			 * Center Lower
			 * ===========================================
			 */
			if (AmossomaWaterPhysics.isWater(par1World, par2 + 1, par3 - 1, par4))
				par1World.setBlock(par2 + 1, par3 - 1, par4, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2, par3 - 1, par4))
				par1World.setBlock(par2, par3 - 1, par4, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2 - 1, par3 - 1, par4))
				par1World.setBlock(par2 - 1, par3 - 1, par4, 0);
			/* 
			 * ===========================================
			 * Backward Lower
			 * ===========================================
			 */
			if (AmossomaWaterPhysics.isWater(par1World, par2 + 1, par3 - 1,	par4 + 1))
				par1World.setBlock(par2 + 1, par3 - 1, par4 + 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2, par3 - 1, par4 + 1))
				par1World.setBlock(par2, par3 - 1, par4 + 1, 0);
			if (AmossomaWaterPhysics.isWater(par1World, par2 - 1, par3 - 1,	par4 + 1))
				par1World.setBlock(par2 - 1, par3 - 1, par4 + 1, 0);

			this.Filled(par1World, par2, par3, par4);
		}
	}

	private void Filled(World par1World, int par2, int par3, int par4)
	{
		par1World.setBlockWithNotify(par2, par3, par4, AmossomaBlocks.neoSpongeFull.blockID);
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
