package amossoma;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import amossomaBlocks.BlockPortalAmossoma;
import amossomaBlocks.BlockSomaBlock;
import amossomaDimension.WorldProviderAmossoma;
import amossomaEntity.AmossomaEntity;

@Mod(modid = "Ash_AmossomaWaterPhysics", name = "AmossomaWaterPhysics", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaWaterPhysics 
{
	@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
	public static CommonProxyAmossoma proxy;

	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();

	}
	
	/**
	 * Checks to see if the block is water. Args: world, x, y, z 
	 */
	public static boolean isWater(World par1World, int par2, int par3, int par4)
	{
		int var11 = par1World.getBlockId(par2, par3, par4);

		if (var11 == Block.waterMoving.blockID)
		{
			return true;
		}
		else if (var11 == Block.waterStill.blockID)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	    /**
	     * Checks to see if the block is NOT next to an water block. Args: world, x, y, z 
	     * 
	     * True = Water Does Not Touch Block
	     * False = Water Touches Block
	     */
		
	    public static boolean isNotExposedtoWater(World par1World, int par2, int par3, int par4)
	    {
	    	Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
	    	int var12 = par1World.getBlockId(par2, par3 + 1, par4);
	    	int var13 = par1World.getBlockId(par2, par3 - 1, par4);
	    	int var14 = par1World.getBlockId(par2 + 1, par3, par4);
	    	int var15 = par1World.getBlockId(par2 - 1, par3, par4);
	    	int var16 = par1World.getBlockId(par2, par3, par4 + 1);
	    	int var17 = par1World.getBlockId(par2, par3, par4 - 1);
	        
	    	if (var12 == (8 | 9))
	    	{
	    	return false;
	    	}
	    	else if (var13 == (8 | 9))
	    	{
	    	return false;
	    	}
	    	else if (var14 == (8 | 9))
	    	{
	    	return false;
	    	}
	    	else if (var15 == (8 | 9))
	    	{
	    	return false;
	    	}
	    	else if (var16 == (8 | 9))
	    	{
	    	return false;
	    	}
	    	else if (var17 == (8 | 9))
	    	{
	    	return false;
	    	}
	    	else
	    	{
	    	return true;
	    	}
	    }
	    
	    /**
	     * Checks to see if the block is next to an water block. Args: world, x, y, z 
	     * 
	     * True = Water Touches Block
	     * False = Water Does Not Touch Block
	     */
	    
	    public static boolean isExposedtoWater(World par1World, int par2, int par3, int par4)
	    {
	    	Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
	    	int var12 = par1World.getBlockId(par2, par3 + 1, par4);
	    	int var13 = par1World.getBlockId(par2, par3 - 1, par4);
	    	int var14 = par1World.getBlockId(par2 + 1, par3, par4);
	    	int var15 = par1World.getBlockId(par2 - 1, par3, par4);
	    	int var16 = par1World.getBlockId(par2, par3, par4 + 1);
	    	int var17 = par1World.getBlockId(par2, par3, par4 - 1);
	        
	    	if (var12 == (8 | 9))
	    	{
	    	return true;
	    	}
	    	else if (var13 == (8 | 9))
	    	{
	    	return true;
	    	}
	    	else if (var14 == (8 | 9))
	    	{
	    	return true;
	    	}
	    	else if (var15 == (8 | 9))
	    	{
	    	return true;
	    	}
	    	else if (var16 == (8 | 9))
	    	{
	    	return true;
	    	}
	    	else if (var17 == (8 | 9))
	    	{
	    	return true;
	    	}
	    	else
	    	{
	    	return false;
	    	}
	    }		
	    
		   /**
			 * Checks to see if the block can float into the block above it.
			 * True only if "block" above it is liquid.
			 * @param par1World the world itself
			 * @param par2 current xCord
			 * @param par3 current yCord
			 * @param par4 current zCord
			 * @param par5 maximum yCord for this block
		     * @return
		     */
		    public static boolean CanFloatAbove(World par1World, int par2, int par3, int par4, int par5)
		    {
		        //do not rise further than max height
		    	if (par3 >= par5) return false;
		    	int var4 = par1World.getBlockId(par2, par3, par4);

		    	if (var4 == Block.waterMoving.blockID)
		    	{
		    		return true;
		    	}
		    	else if (var4 == Block.waterStill.blockID)
		    	{
		    		return true;
		    	}
		    	else if (var4 == 0)
		    	{
		    		return false;
		    	}
		    	else
		    	{
		    		Material var5 = Block.blocksList[var4].blockMaterial;
		    		return false;
		    	}
		    }
}