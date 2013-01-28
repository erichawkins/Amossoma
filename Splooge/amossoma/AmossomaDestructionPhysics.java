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

@Mod(modid = "AmossomaDestructionPhysics", name = "AmossomaDestructionPhysics", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaDestructionPhysics 
{
	@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
	public static CommonProxyAmossoma proxy;

	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();

	}
	
	/**
	 * Checks to see if the block at the cords is bedrock, fire, water and lava
     * @param par1World the world itself
     * @param par2 xCord to check
     * @param par3 yCord to check
     * @param par4 zCord to check
	 * @return True = none of the blocks are at cords - False = if any listed block is at cords  
	 */
    public static boolean CanDestroyMaterialAt(World par1World, int par2, int par3, int par4)
    {
    	//TODO: add block to also destroy binini, gian
    	int var4 = par1World.getBlockId(par2, par3, par4);

        if (var4 == 0)
		{
            return false;
        }
        else if ( var4 == Block.fire.blockID)
        {
            return false;
        }
        else if (var4 == Block.bedrock.blockID)
        {
            return false;
        }
        else
        {
            Material var5 = Block.blocksList[var4].blockMaterial;
            if (var5 == Material.water || var5 == Material.lava)
            {
            	return false;
        	}
            else
            {
            	return true;
            }
        }
    }
	
	/**	
     * Devours the level of South, North, East and West blocks around the current cord 
     * @param par1World the world itself
     * @param par2 current xCord
     * @param par3 current yCord
     * @param par4 current zCord
     */
    public static void CheckAndDevourUpDown(World par1World, int par2, int par3, int par4)
    {
    	//want a range of blocks around me to destroy
    	int rnd = Amossoma.GetRand(2, false, true);
    	
    	for	(int i = 1; i <= rnd; i++)
    	{
    		if (CanDestroyMaterialAt(par1World, par2 + i, par3, par4))//east
    			par1World.setBlock(par2 + i, par3, par4, 0);
    		if (CanDestroyMaterialAt(par1World, par2 - i, par3, par4))//west
    			par1World.setBlock(par2 - i, par3, par4, 0);
    		if (CanDestroyMaterialAt(par1World, par2, par3, par4 + i))//south
    			par1World.setBlock(par2, par3, par4 + i, 0);
    		if (CanDestroyMaterialAt(par1World, par2, par3, par4 - i))//north
    			par1World.setBlock(par2, par3, par4 - i, 0);

    		if (CanDestroyMaterialAt(par1World, par2 + i, par3, par4 + i))//southeast
    			par1World.setBlock(par2 + i, par3, par4 + i, 0);
    		if (CanDestroyMaterialAt(par1World, par2 - i, par3, par4 - i))//northwest
    			par1World.setBlock(par2 - i, par3, par4 - i, 0);
    		if (CanDestroyMaterialAt(par1World, par2 - i, par3, par4 + i))//southwest
    			par1World.setBlock(par2 - i, par3, par4 + i, 0);
    		if (CanDestroyMaterialAt(par1World, par2 + i, par3, par4 - i))//northeast
    			par1World.setBlock(par2 + i, par3, par4 - i, 0);
		}
    }

    /**
     * Devours the plain of East, West, Up and Down blocks around the current cord 
     * @param par1World the world itself
     * @param par2 current xCord
     * @param par3 current yCord
     * @param par4 current zCord
     */
    public static void CheckAndDevourEastWest(World par1World, int par2, int par3, int par4)
    {
    	//want a range of blocks around me to destroy
    	int rnd = Amossoma.GetRand(2, false, true);
    	
    	for	(int i = 1; i <= rnd; i++)
    	{
    		if (CanDestroyMaterialAt(par1World, par2, par3 + i, par4))//up
    			par1World.setBlock(par2, par3 + i, par4, 0);
    		if (CanDestroyMaterialAt(par1World, par2, par3 - i, par4))//down
    			par1World.setBlock(par2, par3 - i, par4, 0);
    		if (CanDestroyMaterialAt(par1World, par2 + i, par3, par4))//east
    			par1World.setBlock(par2 + i, par3, par4, 0);
    		if (CanDestroyMaterialAt(par1World, par2 - i, par3, par4))//west
    			par1World.setBlock(par2 - i, par3, par4, 0);

    		if (CanDestroyMaterialAt(par1World, par2 + i, par3 + i, par4))//east up
    			par1World.setBlock(par2 + i, par3 + i, par4, 0);
    		if (CanDestroyMaterialAt(par1World, par2 - i, par3 - i, par4))//west down
    			par1World.setBlock(par2 - i, par3 - i, par4, 0);
    		if (CanDestroyMaterialAt(par1World, par2 + i, par3 - i, par4))//east down
    			par1World.setBlock(par2 + i, par3 - i, par4, 0);
    		if (CanDestroyMaterialAt(par1World, par2 - i, par3 + i, par4))//west up
    			par1World.setBlock(par2 - i, par3 + i, par4, 0);
		}
    }

    /**
     * Devours the plain of South, North, Up and Down blocks around the current cord 
     * @param par1World the world itself
     * @param par2 current xCord
     * @param par3 current yCord
     * @param par4 current zCord
     */
    public static void CheckAndDevourSouthNorth(World par1World, int par2, int par3, int par4)
    {
    	//want a range of blocks around me to destroy
    	int rnd = Amossoma.GetRand(2, false, true);
    	
    	for	(int i = 1; i <= rnd; i++)
    	{
    		if (CanDestroyMaterialAt(par1World, par2, par3 + i, par4))//up
    			par1World.setBlock(par2, par3 + i, par4, 0);
    		if (CanDestroyMaterialAt(par1World, par2, par3 - i, par4))//down
    			par1World.setBlock(par2, par3 - i, par4, 0);
    		if (CanDestroyMaterialAt(par1World, par2, par3, par4 + i))//south
    			par1World.setBlock(par2, par3, par4 + i, 0);
    		if (CanDestroyMaterialAt(par1World, par2, par3, par4 - i))//north
    			par1World.setBlock(par2, par3, par4 - i, 0);

    		if (CanDestroyMaterialAt(par1World, par2, par3 + i, par4 + i))//south up
    			par1World.setBlock(par2, par3 + i, par4 + i, 0);
    		if (CanDestroyMaterialAt(par1World, par2, par3 - i, par4 - i))//north down
    			par1World.setBlock(par2, par3 - i, par4 - i, 0);
    		if (CanDestroyMaterialAt(par1World, par2, par3 - i, par4 + i))//south down
    			par1World.setBlock(par2, par3 - i, par4 + i, 0);
    		if (CanDestroyMaterialAt(par1World, par2, par3 + i, par4 - i))//north up
    			par1World.setBlock(par2, par3 + i, par4 - i, 0);
		}
    }
}
