package amossomaTiki;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import amossoma.CommonProxyAmossoma;
import amossoma.EntityMountableBlock;
import amossomaDimension.WorldProviderAmossoma;
import amossomaEntity.AmossomaEntity;


@Mod(modid = "Ash_AmossomaTiki", name = "AmossomaTiki", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaTiki
{
/*
 * ############################################################################################
 * This is where we declare all our Blocks
 * ############################################################################################
 */

	/*
	 * =========================================================================================
	 * Bamboo Types
	 * =========================================================================================
	 */
	
	public static Block BambooBlock;
	public static Block BambooSlabBlock;
	public static Block BambooMatBlock;
	
	public static Block BambooMatSBlock;
	public static Block BambooSlabSBlock;
	
	public static Block BambooFenceBlock;
	
	public static Block BambooStairBlock;
	
	 /* 
	  * =========================================================================================
	 */
	 
/* 
 * ############################################################################################
 * This is where we declare all our Items
 * ############################################################################################
 */
			
	public static Item roughtwine;// Processed from Fern
			
	public static Item ItemAgedBambooFlower;// Processed from Bamboo
		
/* 
 * ############################################################################################
 * This is the end of our declarations
 * ############################################################################################
 */
	
	@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
	public static CommonProxyAmossoma proxy;

/* 
 * ############################################################################################
 * PREINIT
 * ############################################################################################
 */
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)

{
/* 
 * ############################################################################################
 * CONFIG
 * ############################################################################################
 */
    
    Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    config.load();
    
 //=========================================================================================
    
    //=========================================================================================
    //Blocks
    //=========================================================================================
     
 //=========================================================================================
 // Cloth
 //=========================================================================================
     
     BambooBlockid = config.getBlock("idBambooBlock", Configuration.CATEGORY_BLOCK, 2500).getInt();
     BambooSlabBlockid = config.getBlock("idBambooSlabBlock", Configuration.CATEGORY_BLOCK, 2501).getInt();
     BambooMatBlockid = config.getBlock("idBambooMatBlock", Configuration.CATEGORY_BLOCK, 2502).getInt();
        
     BambooSlabSBlockid = config.getBlock("idBambooSlabSBlock", Configuration.CATEGORY_BLOCK, 2503).getInt();
     BambooMatSBlockid = config.getBlock("idBambooMatSBlock", Configuration.CATEGORY_BLOCK, 2504).getInt();
     BambooFenceBlockid = config.getBlock("idBambooFenceBlock", Configuration.CATEGORY_BLOCK, 2505).getInt();   
     BambooStairBlockid = config.getBlock("idBambooStairBlock", Configuration.CATEGORY_BLOCK, 2506).getInt();

 //=========================================================================================   
     
     //=========================================================================================   
     // Items
     //=========================================================================================  
 
//=========================================================================================
     config.save();
 }
//=========================================================================================

/* 
 * ############################################################################################
 * This is where we declare ID's for our CONFIG
 * ############################################################################################
*/

	//=========================================================================================
	//Blocks
	//=========================================================================================

//=========================================================================================
//Cloth
//=========================================================================================

	public static int BambooBlockid;
	public static int BambooSlabBlockid;
	public static int BambooMatBlockid;
	public static int BambooSlabSBlockid;
	public static int BambooMatSBlockid;
	public static int BambooFenceBlockid;
	public static int BambooStairBlockid;

//=========================================================================================
	
	//=========================================================================================
	// Items
	//=========================================================================================

//=========================================================================================
	
	@Init
	public void load(FMLInitializationEvent event)
	{
	proxy.registerRenderThings();
	
	EntityRegistry.registerModEntity(EntityMountableBlock.class, "EntityMountableBlock", 1,  this, 250, 5, false);
/**
 * ==============================================================================================
 * Block List
 * ==============================================================================================
 */
	
		 
    
/**
 * ==============================================================================================
 * End of Line ~ Block List
 * ==============================================================================================
 */
	}
}