package amossoma;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import amossomaAllTabs.AmossomaBlocksTab;
import amossomaBlocks.BlockPortalAmossoma;
import amossomaBlocks.BlockSomaBlock;
import amossomaDimension.WorldProviderAmossoma;
import amossomaEntity.AmossomaEntity;

@Mod(modid = "Ash_Amossoma", name = "Amosoma", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Amossoma 
{
	@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
	public static CommonProxyAmossoma proxy;
	

	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();

	}
	
    public enum CordDirection
    {
    	neutral(0), xPlus(1), xMinus(2), zPlus(3), zMinus(4);
    	
    	private int direction;
    	private CordDirection(int d)
    	{
    		direction = d;
    	}
    	
    	public int getDirection()
    	{
    		return direction;
    	}
    }

	/**
	 * Gets the Block's blocklist as a handle to the Block to call it's GetProperties method
	 * @param blockId The blockID of the Block
	 * @return The int[] of the Block's GetProperties method
	 */
	static int[] GetBlockPropertyArray(int blockId)
	{
        int[] propertyArray = null;

        if (Block.blocksList[blockId] != null)
        {
        	propertyArray = ((amossomaBlocks.BlockAmossomaBlock)Block.blocksList[blockId]).GetProperties();
        }
        
        return propertyArray;
    }
	
	/**
	 * Uses the blockId to get the Block's blocklist to use as handle on the Block to pass in the propArray
	 * @param blockId The blockID of the Block
	 * @param propArray The int[] to pass into Block has properties of that Block before it was destroyed/created
	 */
	static void SetBlockPropertyArray(int blockId, int[] propArray)
	{
        if (Block.blocksList[blockId] != null & propArray != null)
        {
        	FMLLog.info("inside set property array");
        	((amossomaBlocks.BlockAmossomaBlock)Block.blocksList[blockId]).SetProperties(propArray);
        }
	}
	/**
	 * Returns a random integer
	 * @param range This size of the random integer
	 * @param isZeroBased Controls is this is zero base or False will be 1 base
	 * @param returnPositive Controls returning a positive or False will be a negative integer
	 * @return Integer
	 */
	public static int GetRand(int range, boolean isZeroBased, boolean returnPositive)
	{
		int result = 0;
		
        Random rnd = new Random();
        result = rnd.nextInt(range);
        
        if (!isZeroBased)
        	result++;

        if (!returnPositive)
        	result = result * -1;
        
        return result;
<<<<<<< HEAD
}

    /**
* Checks to see if the block can rise into the block above it
* @param par1World the world itself
* @param par2 current xCord
* @param par3 current yCord
* @param par4 current zCord
* @param par5 maximum yCord for this block
* @return
*/
    public static boolean CanRiseAbove(World par1World, int par2, int par3, int par4, int par5)
    {
     //do not rise further than max height
     if (par3 >= par5) return false;
    
        int var4 = par1World.getBlockId(par2, par3, par4);

        if (var4 == 0)
        {
         //air blockId is 0
            return true;
        }
        else if (var4 == Block.fire.blockID)
        {
            return true;
        }
        else
        {
            Material var5 = Block.blocksList[var4].blockMaterial;
            return var5 == Material.water ? true : var5 == Material.lava;
        }
    }
    
    /**
 * CanFloatAbove =
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
        
    /**
* Determines if block has another of itself at it's max distance - will only expand into air
* @param par1World the world itself
* @param par2 xCord to check
* @param par3 yCord to check
* @param par4 zCord to check
* @param par5 Enum.CordDirection that we are wanting to expanding
* @param par6 max distance for this block to expand to
* @param par7 blockId to check for
* @return True means we can create new block at this cord
*/
    public static boolean CanExpand(World par1World, int par2, int par3, int par4, CordDirection par5, int par6, int par7)
    {
     boolean result = false;
    
     //must first be an air block or there is no place to expand this direction
     result = par1World.isAirBlock(par2, par3, par4);
    
     if (result)
     {
     //block to expand to is air - now check to see if this is past my max expanding distance
     result = !IsTooFar(par1World, par2, par3, par4, par6, par5, par7);
     }
    
     return result;
    }
    
    /**
* Determines if block has another of it within it's max expand distance
* @param par1World the world itself
* @param par2 xCord to check
* @param par3 yCord to check
* @param par4 zCord to check
* @param lookDistance distance to check for another blockId
* @param par5 Enum.CordDirection that we are wanting to expand to
* @param par6 blockId to check for
* @return True means nothing was found and we can expand more in this direction
*/
    public static boolean IsTooFar(World par1World, int par2, int par3, int par4, int lookDistance, CordDirection par5, int par6)
    {
     boolean result = false;
     switch(par5)
     {
case neutral:
result = (par1World.getBlockId(par2 - lookDistance, par3, par4 - lookDistance) == par6
|| par1World.getBlockId(par2 + lookDistance, par3, par4 + lookDistance) == par6
|| par1World.getBlockId(par2, par3, par4 + lookDistance) == par6
|| par1World.getBlockId(par2, par3, par4 - lookDistance) == par6
|| par1World.getBlockId(par2 - lookDistance, par3, par4) == par6
|| par1World.getBlockId(par2 + lookDistance, par3, par4) == par6);
break;
case xPlus:
result = par1World.getBlockId(par2 - lookDistance, par3, par4) == par6;
break;
case xMinus:
result = par1World.getBlockId(par2 + lookDistance, par3, par4) == par6;
break;
case zPlus:
result = par1World.getBlockId(par2, par3, par4 - lookDistance) == par6;
break;
case zMinus:
result = par1World.getBlockId(par2, par3, par4 + lookDistance) == par6;
break;
default:
result = true;
break;
     }
     return result;
    }
}
=======
	}
	 
}
>>>>>>> Slpooged on all Files
