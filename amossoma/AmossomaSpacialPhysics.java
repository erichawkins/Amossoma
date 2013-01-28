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
import amossoma.Amossoma.CordDirection;
import amossomaBlocks.BlockPortalAmossoma;
import amossomaBlocks.BlockSomaBlock;
import amossomaDimension.WorldProviderAmossoma;
import amossomaEntity.AmossomaEntity;

@Mod(modid = "Ash_AmossomaSpacialPhysics", name = "AmossomaSpacialPhysics", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaSpacialPhysics 
{
	@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
	public static CommonProxyAmossoma proxy;

	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();

	}
	
	/**
	 * 
	 * NOTE: These are the Spatial Coordinates of a 3x3x3 cube.
	 * 
	 * (par1World, par2 + 1, par3 - 1, par4 - 1)
	 * (par1World, par2 + 1, par3 + 1, par4 - 1)
	 * (par1World, par2 + 1, par3 + 1, par4 + 1)
	 * 
	 * (par1World, par2 - 1, par3 + 1, par4 + 1)
	 * (par1World, par2 - 1, par3 - 1, par4 + 1)
	 * (par1World, par2 - 1, par3 - 1, par4 - 1)

	 * (par1World, par2 - 1, par3 + 1, par4 - 1)
	 * (par1World, par2 + 1, par3 - 1, par4 + 1)
	 * 
	 * (par1World, par2 + 1, par3 - 1, par4 + 1)
	 * (par1World, par2 + 1, par3 - 1, par4 + 1)
	 * (par1World, par2 + 1, par3 - 1, par4 + 1)
	 * (par1World, par2 + 1, par3 - 1, par4 + 1)
	 * 
	 * (par1World, par2, par3 - 1, par4 + 1)
	 * (par1World, par2, par3 - 1, par4 - 1)
	 * (par1World, par2, par3 + 1, par4 + 1)
	 * (par1World, par2, par3 + 1, par4 - 1)
	 * 
	 * (par1World, par2 + 1, par3 - 1, par4)
	 * (par1World, par2 - 1, par3 - 1, par4)
	 * (par1World, par2 + 1, par3 + 1, par4)
	 * (par1World, par2 - 1, par3 + 1, par4)
	 * 
	 * (par1World, par2 + 1, par3, par4 - 1)
	 * (par1World, par2 - 1, par3, par4 - 1)
	 * (par1World, par2 + 1, par3, par4 + 1)
	 * (par1World, par2 - 1, par3, par4 + 1)
	 * 
	 */
	
	
	/**
	 * 
	 * NOTE: These are the Spatial Coordinates of a 3x3x3 cube.
	 * 
	 * par2 East +1 West -1
	 * par3 Up +1   Down -1
	 * par4 North +1 South -1
	 * 
	 * ===========================================
	 * (par1World, par2, par3, par4)// Center
	 * ===========================================
	 * Forward Center
	 * ===========================================
	 * (par1World, par2 + 1, par3, 	 par4 - 1)
	 * (par1World, par2, 	 par3, 	 par4 - 1)
	 * (par1World, par2 - 1, par3, 	 par4 - 1)
	 * ===========================================
	 * Center Center (Right/Left)
	 * ===========================================
	 * (par1World, par2 + 1, par3,	 par4)
	 * (par1World, par2 - 1, par3,	 par4)
	 * ===========================================
	 * Backward Center
	 * ===========================================
	 * (par1World, par2 + 1, par3, 	 par4 + 1)
	 * (par1World, par2, 	 par3, 	 par4 + 1)
	 * (par1World, par2 - 1, par3, 	 par4 + 1)
	 * ===========================================
	 * 
	 * 
	 * ===========================================
	 * Forward Upper
	 * ===========================================
	 * (par1World, par2 + 1, par3 + 1, 	 par4 - 1)
	 * (par1World, par2, 	 par3 + 1, 	 par4 - 1)
	 * (par1World, par2 - 1, par3 + 1, 	 par4 - 1)
	 * ===========================================
	 * Center Upper
	 * ===========================================
	 * (par1World, par2 + 1, par3 + 1, 	 par4)
	 * (par1World, par2, 	 par3 + 1, 	 par4)
	 * (par1World, par2 - 1, par3 + 1, 	 par4)
	 * 
	 * ===========================================
	 * Back Upper 
	 * ===========================================
	 * (par1World, par2 + 1, par3 + 1,	par4 + 1)
	 * (par1World, par2, 	 par3 + 1, 	par4 + 1)
	 * (par1World, par2 - 1, par3 + 1,	par4 + 1)
	 * ===========================================
	 * 
	 * ===========================================
	 * Forward Lower
	 * ===========================================
	 * (par1World, par2 + 1, par3 - 1, 	 par4 - 1)
	 * (par1World, par2, 	 par3 - 1, 	 par4 - 1)
	 * (par1World, par2 - 1, par3 - 1, 	 par4 - 1)
	 * ===========================================
	 * Center Lower
	 * ===========================================
	 * (par1World, par2 + 1, par3 - 1, 	 par4)
	 * (par1World, par2, 	 par3 - 1, 	 par4)
	 * (par1World, par2 - 1, par3 - 1, 	 par4)
	 * 
	 * ===========================================
	 * Back Lower 
	 * ===========================================
	 * (par1World, par2 + 1, par3 - 1,	par4 + 1)
	 * (par1World, par2, 	 par3 - 1, 	par4 + 1)
	 * (par1World, par2 - 1, par3 - 1,	par4 + 1)
	 * ===========================================
	 */
	
/**
 * This calls into Forge to convert a Int into a forge Direction Notation.
 * @param par1
 * @return
 */
	public static ForgeDirection GetDirection(int par1)
	{
		switch(par1)
		{
			case 1:
				return ForgeDirection.UP;
			case 2:
				return ForgeDirection.NORTH;
			case 3:
				return ForgeDirection.SOUTH;
			case 4:
				return ForgeDirection.EAST;
			case 5:
				return ForgeDirection.WEST;
			case 6:
				return ForgeDirection.DOWN;
			case 0:
			default:
				return ForgeDirection.UNKNOWN;
		}
	}
	
	/**
	 * Uses the direction to increment or decrement the appropriate cord and then tests if that number is greater or less then test value
	 * @param par1 current xCord
	 * @param par2 current yCord
	 * @param par3 current zCord
	 * @param par4 direction to check
	 * @param par5 value to test against
	 * @return True = incremented/decremented cord is less/greater than test value
	 */
	public static boolean IsWithinRange(int par1, int par2, int par3, ForgeDirection par4, int par5)
	{
		//checks direction and check appropriate cord either greater or less than cord
		//		down: ycord (par2) less than ycord (par5) then cant destroy
		switch(par4)
		{
			case WEST:	//decreases xcord
				par1--;
				if (par1 < par5) return false;
				break;
			case DOWN:	//decreases ycord
				par2--;
				if (par2 < par5) return false;
				break;
			case NORTH:	//decreases zcord
				par3--;
				if (par3 < par5) return false;
				break;
			case EAST:	//increases xcord
				par1++;
				if (par1 > par5) return false;
				break;
			case UP:	//increases ycord
				par2++;
				if (par2 > par5) return false;
				break;
			case SOUTH:	//increases zcord
				par3++;
				if (par3 > par5) return false;
				break;
			case UNKNOWN:
			default:
				break;
		}
		return true;
	}

	/**
     * Checks to see if the block can fall into the block
     * @param par1World the world itself
     * @param par2 xCord to check
     * @param par3 yCord to check
     * @param par4 zCord to check
     * @param par5 minimum yCord for this block
	 * @return
	 */
    public static boolean CanFallBelow(World par1World, int par2, int par3, int par4, int par5)
    {
    	//do not fall further than minimum height
    	if (par3 < par5) return false;
    	
    	return canMoveThroughBlock(par1World, par2, par3, par4);
    }

    /**
     * Checks to see if the block can rise into the block
     * @param par1World the world itself
     * @param par2 xCord to check
     * @param par3 yCord to check
     * @param par4 zCord to check
     * @param par5 maximum yCord for this block
     * @return
     */
    public static boolean CanRiseAbove(World par1World, int par2, int par3, int par4, int par5)
    {
    	//do not rise further than max height
    	if (par3 > par5) return false;
    	
    	return canMoveThroughBlock(par1World, par2, par3, par4);
    }
    
    /**
     * Checks the blockID/type at the cord
     * @param par1World the world itself
     * @param par2 xCord to check
     * @param par3 yCord to check
     * @param par4 zCord to check
     * @return True when the block can be moved through
     */
    private static boolean canMoveThroughBlock(World par1World, int par2, int par3, int par4)
    {
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

	/**
	* Randomly get direction, check for that block being air and then when time is ok, create new block
	 * @param par1World the world itself
	 * @param par2 current xCord
	 * @param par3 current yCord
	 * @param par4 current zCord
	 * @param par5 maximum distance this block can expand before finding itself
	 * @param par6 seed for the random expand time
	 * @param par7 the blockId to look for when expanding
	 */
	public static void Expand(World par1World, int par2, int par3, int par4, int par5, int par6, int par7)
	{   	
		CordDirection cd = CordDirection.xPlus;
		//get random number to determine what area is expanding
		int roll = Amossoma.GetRand(4, true, true);
		if (roll == 1) par2 += 1;								//increase current xCord
		if (roll == 2) { cd=CordDirection.xMinus; par2 -= 1; }	//decrease current xCord
		if (roll == 3) { cd=CordDirection.zPlus; par4 += 1; }	//increase current zCord
		if (roll == 4) { cd=CordDirection.zMinus; par4 -= 1; }	//decrease current zCord
		        
		//now check to make sure that the new position is air - otherwise we will eat into the world
		if (CanExpand(par1World, par2, par3, par4, cd, par5, par7))
		{
			//new block spot is air so see if it is time to expand - doing this to decrease how fast the block expands
			int timeCheck = Amossoma.GetRand(par6, true, true);
			if (timeCheck == 0)
			{
				//creating and placing the new block
			    par1World.setBlockWithNotify(par2, par3, par4, par7);
			    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);
	    	}
		}
	}

	
    /**
     * Move the block from current position up or down 1 space
     * @param par1World the world itself
     * @param par2 current xCord
     * @param par3 current yCord
     * @param par4 current zCord
     * @param par5 the blockID to be moved
     * @param par6 True is up - False is down
     */
    public static void MoveBlockUpDown(World par1World, int par2, int par3, int par4, int par5, boolean par6)
    {
        int[] propertyArray = Amossoma.GetBlockPropertyArray(par5);
        
		//destroy this block where it is
		par1World.setBlockWithNotify(par2, par3, par4, 0);
		
		if (par6)
		{
			//block above me is available so create a new block in that position
			par3 += 1;
		}
		else
		{
			//block below me is available so create a new block in that position
			par3 -= 1;
		}

		par1World.setBlockWithNotify(par2, par3, par4, par5);
	    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);   	

        Amossoma.SetBlockPropertyArray(par5, propertyArray);
    }

    /**
     * Move the block from current position South or North 1 space
     * @param par1World the world itself
     * @param par2 current xCord
     * @param par3 current yCord
     * @param par4 current zCord
     * @param par5 the blockID to be moved
     * @param par6 True is South - False is North
     */
    public static void MoveBlockSouthNorth(World par1World, int par2, int par3, int par4, int par5, boolean par6)
    {
        int[] propertyArray = Amossoma.GetBlockPropertyArray(par5);
        
		//destroy this block where it is
		par1World.setBlockWithNotify(par2, par3, par4, 0);
		
		if (par6)
		{
			//block south of me is available so create a new block in that position
			par4 += 1;
		}
		else
		{
			//block north of me is available so create a new block in that position
			par4 -= 1;
		}

		par1World.setBlockWithNotify(par2, par3, par4, par5);
	    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);   	

        Amossoma.SetBlockPropertyArray(par5, propertyArray);
    }

    /**
     * Move the block from current position east or west 1 space
     * @param par1World the world itself
     * @param par2 current xCord
     * @param par3 current yCord
     * @param par4 current zCord
     * @param par5 the blockID to be moved
     * @param par6 True is East - False is West
     */
    public static void MoveBlockEastWest(World par1World, int par2, int par3, int par4, int par5, boolean par6)
    {
        int[] propertyArray = Amossoma.GetBlockPropertyArray(par5);
        
		//destroy this block where it is
		par1World.setBlockWithNotify(par2, par3, par4, 0);
		
		if (par6)
		{
			//block east of me is available so create a new block in that position
			par2 += 1;
		}
		else
		{
			//block west of me is available so create a new block in that position
			par2 -= 1;
		}

		par1World.setBlockWithNotify(par2, par3, par4, par5);
	    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);   	

	    Amossoma.SetBlockPropertyArray(par5, propertyArray);
    }  
    
}