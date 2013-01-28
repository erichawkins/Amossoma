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

@Mod(modid = "Ash_AmossomaAirPhysics", name = "AmossomaAirPhysics", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaAirPhysics 
{
	@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
	public static CommonProxyAmossoma proxy;

	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();

	}

	/**
	 * Checks to see if the block is Air. Args: world, x, y, z 
	 */
	public static boolean isAir(World par1World, int par2, int par3, int par4)
	{
		int var11 = par1World.getBlockId(par2, par3, par4);

		if (var11 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	    /**
	     * Checks to see if the block is next to an air block. Args: world, x, y, z 
	     * 
	     * True = AIR Does Not Touch Block
	     * False = AIR Does Touch Block
	     */
	    public static boolean isNotExposedtoAir(World par1World, int par2, int par3, int par4)
	    {
	    	Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
	    	int var12 = par1World.getBlockId(par2, par3 + 1, par4);
	    	int var13 = par1World.getBlockId(par2, par3 - 1, par4);
	    	int var14 = par1World.getBlockId(par2 + 1, par3, par4);
	    	int var15 = par1World.getBlockId(par2 - 1, par3, par4);
	    	int var16 = par1World.getBlockId(par2, par3, par4 + 1);
	    	int var17 = par1World.getBlockId(par2, par3, par4 - 1);
	        
	    	if (var12 == 0)
	    	{
	    	return false;
	    	}
	    	else if (var13 == 0)
	    	{
	    	return false;
	    	}
	    	else if (var14 == 0)
	    	{
	    	return false;
	    	}
	    	else if (var15 == 0)
	    	{
	    	return false;
	    	}
	    	else if (var16 == 0)
	    	{
	    	return false;
	    	}
	    	else if (var17 == 0)
	    	{
	    	return false;
	    	}
	    	else
	    	{
	    	return true;
	    	}
	    }
	    
	    
	    /**
	     * Checks to see if the block is next to an air block. Args: world, x, y, z 
	     */
	    public static boolean isExposedtoAir(World par1World, int par2, int par3, int par4)
	    {
	    	Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
	    	int var12 = par1World.getBlockId(par2, par3 + 1, par4);
	    	int var13 = par1World.getBlockId(par2, par3 - 1, par4);
	    	int var14 = par1World.getBlockId(par2 + 1, par3, par4);
	    	int var15 = par1World.getBlockId(par2 - 1, par3, par4);
	    	int var16 = par1World.getBlockId(par2, par3, par4 + 1);
	    	int var17 = par1World.getBlockId(par2, par3, par4 - 1);
	        
	    	if (var12 == 0)
	    	{
	    	return true;
	    	}
	    	else if (var13 == 0)
	    	{
	    	return true;
	    	}
	    	else if (var14 == 0)
	    	{
	    	return true;
	    	}
	    	else if (var15 == 0)
	    	{
	    	return true;
	    	}
	    	else if (var16 == 0)
	    	{
	    	return true;
	    	}
	    	else if (var17 == 0)
	    	{
	    	return true;
	    	}
	    	else
	    	{
	    	return false;
	    	}
	    }
	    
}