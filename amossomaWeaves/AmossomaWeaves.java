package amossomaWeaves;

import net.minecraft.block.Block;
import net.minecraft.block.BlockJukeBox;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
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


@Mod(modid = "Ash_AmossomaWeaves", name = "AmossomaWeaves", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaWeaves 
{
	/*
	 * ############################################################################################
	 * This is where we declare all our Blocks
	 * ############################################################################################
	 */
	/*
	 * =========================================================================================
	 * Cloth Types
	 * =========================================================================================
	 */

	public static Block LinenBlock;
	public static Block CottonBlock;
	public static Block SilkBlock;

	/*
	 * =========================================================================================
	 * Cloth Carpet Blocks
	 * 
	 * The first set of carpet Blocks do NOT enable "seatable" Functions.
	 * The second set does.
	 * The "Slab" Blocks are NOT "seatable" and the "Cushion" Types are.
	 * =========================================================================================
	 */
	public static Block linencarpetBlock;
	public static Block cottoncarpetBlock;
	public static Block silkcarpetBlock;

	public static Block linencarpetSBlock;
	public static Block cottoncarpetSBlock;
	public static Block silkcarpetSBlock;

	public static Block linenSlabBlock;
	public static Block cottonSlabBlock;
	public static Block silkSlabBlock;

	public static Block linenCushionBlock;
	public static Block cottonCushionBlock;
	public static Block silkCushionBlock;

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

	/*
	 * =========================================================================================
	 * Threads
	 * =========================================================================================
	 */

	public static Item linenthread;
	public static Item cottonthread;
	public static Item silkthread;

	public static Item roughtwine;// Processed from Fern

	public static Item ItemAgedBambooFlower;// Processed from Bamboo

	//=========================================================================================	

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

		LinenBlockid = config.getBlock("idLinenBlock", Configuration.CATEGORY_BLOCK, 2500).getInt();
		CottonBlockid = config.getBlock("idCottonBlock", Configuration.CATEGORY_BLOCK, 2501).getInt();
		SilkBlockid = config.getBlock("idSilkBlock", Configuration.CATEGORY_BLOCK, 2502).getInt();

		//=========================================================================================

		//=========================================================================================    
		// NON Seatable Cloth Products
		//=========================================================================================    

		cottoncarpetBlockid = config.getBlock("idcottoncarpetBlock", Configuration.CATEGORY_BLOCK, 2503).getInt();
		linencarpetBlockid = config.getBlock("idlinencarpetBlock", Configuration.CATEGORY_BLOCK, 2504).getInt();
		silkcarpetBlockid = config.getBlock("idsilkcarpetBlock", Configuration.CATEGORY_BLOCK, 2505).getInt();

		cottonCushionBlockid = config.getBlock("idcottonCushionBlock", Configuration.CATEGORY_BLOCK, 2506).getInt();
		linenCushionBlockid = config.getBlock("idlinenCushionBlock", Configuration.CATEGORY_BLOCK, 2507).getInt();
		silkCushionBlockid = config.getBlock("idsilkCushionBlock", Configuration.CATEGORY_BLOCK, 2508).getInt();    

		//=========================================================================================  

		//=========================================================================================    
		// Seatable Cloth Products
		//=========================================================================================    

		cottoncarpetBlockid = config.getBlock("idcottoncarpetBlock", Configuration.CATEGORY_BLOCK, 2503).getInt();
		linencarpetBlockid = config.getBlock("idlinencarpetBlock", Configuration.CATEGORY_BLOCK, 2504).getInt();
		silkcarpetBlockid = config.getBlock("idsilkcarpetBlock", Configuration.CATEGORY_BLOCK, 2505).getInt();

		cottonCushionBlockid = config.getBlock("idcottonCushionBlock", Configuration.CATEGORY_BLOCK, 2506).getInt();
		linenCushionBlockid = config.getBlock("idlinenCushionBlock", Configuration.CATEGORY_BLOCK, 2507).getInt();
		silkCushionBlockid = config.getBlock("idsilkCushionBlock", Configuration.CATEGORY_BLOCK, 2508).getInt();    

		//=========================================================================================   
		// Items
		//=========================================================================================  

		//=========================================================================================
		// Thread
		//=========================================================================================

		Linenthreadid = config.getItem("idLinenthread", Configuration.CATEGORY_ITEM, 5201).getInt();
		Silkthreadid = config.getItem("idSilkthread", Configuration.CATEGORY_ITEM, 5202).getInt();
		Cottonthreadid = config.getItem("idCottonthread", Configuration.CATEGORY_ITEM, 5203).getInt();

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

	public static int LinenBlockid;
	public static int CottonBlockid;
	public static int SilkBlockid;

	//=========================================================================================

	//=========================================================================================
	//Cloth Products
	//=========================================================================================

	public static int linencarpetBlockid;
	public static int cottoncarpetBlockid;
	public static int silkcarpetBlockid;

	public static int linenCushionBlockid;
	public static int cottonCushionBlockid;
	public static int silkCushionBlockid;

	//=========================================================================================

	//=========================================================================================
	// Items
	//=========================================================================================

	//=========================================================================================
	// Threads
	//=========================================================================================

	public static int Linenthreadid;
	public static int Cottonthreadid;
	public static int Silkthreadid;

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

		//=========================================================================================
		//Cloth
		//=========================================================================================

		//=========================================================================================
		// This is the Basic Linen Block.
		// It also has the call to make the block hold METADATA
		//=========================================================================================

		LinenBlock = (new BlockLinen(LinenBlockid, 0)).setStepSound(Block.soundClothFootstep).setHardness(1F).setResistance(1.0F).setBlockName("Linen");
		Item.itemsList[LinenBlockid] = new ItemBlockLinen(LinenBlockid-256, LinenBlock).setItemName("Linen");

		//=========================================================================================
		// This is the Basic Cotton Block.
		// It also has the call to make the block hold METADATA
		//=========================================================================================

		CottonBlock  = (new BlockCotton(CottonBlockid, 16)).setStepSound(Block.soundClothFootstep).setHardness(1F).setResistance(1.0F).setBlockName("Cotton");
		Item.itemsList[CottonBlockid] = new ItemBlockCotton(CottonBlockid-256, CottonBlock).setItemName("Cotton");

		//=========================================================================================
		// This is the basic Silk Block.
		// It also has the call to make the block hold METADATA
		//=========================================================================================

		SilkBlock = (new BlockSilk(SilkBlockid, 32)).setStepSound(Block.soundClothFootstep).setHardness(1F).setResistance(1.0F).setBlockName("Silk");
		Item.itemsList[SilkBlockid] = new ItemBlockSilk(SilkBlockid-256, SilkBlock).setItemName("Silk");

		//=========================================================================================
		// This is where all the METADATA Names for Linen, Cotton and Silk are.
		//=========================================================================================

		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen.name", "Raw Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen1.name", "Light Gray Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen2.name", "Gray Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen3.name", "Black Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen4.name", "Red Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen5.name", "Pink Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen6.name", "Green Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen7.name", "Lime Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen8.name", "Brown Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen9.name", "Yellow Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen10.name", "Blue Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen11.name", "Light Blue Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen12.name", "Cyan Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen13.name", "Purple Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen14.name", "Magenta Linen");
		LanguageRegistry.instance().addStringLocalization("tile.Linen.Linen15.name", "Orange Linen");

		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton.name", "Raw Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton1.name", "Light Gray Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton2.name", "Gray Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton3.name", "Black Cotton3");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton4.name", "Red Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton5.name", "Pink Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton6.name", "Green Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton7.name", "Lime Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton8.name", "Brown Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton9.name", "Yellow Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton10.name", "Blue Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton11.name", "Light Blue Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton12.name", "Cyan Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton13.name", "Purple Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton14.name", "Magenta Cotton");
		LanguageRegistry.instance().addStringLocalization("tile.Cotton.Cotton15.name", "Orange Cotton");

		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk.name", "Raw Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk1.name", "Light Gray Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk2.name", "Gray Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk3.name", "Black Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk4.name", "Red Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk5.name", "Pink Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk6.name", "Green Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk7.name", "Lime Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk8.name", "Brown Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk9.name", "Yellow Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk10.name", "Blue Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk11.name", "Light Blue Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk12.name", "Cyan Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk13.name", "Purple Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk14.name", "Magenta Silk");
		LanguageRegistry.instance().addStringLocalization("tile.Silk.Silk15.name", "Orange Silk");


		//=========================================================================================
		// This is the basic Carpet Block.
		//=========================================================================================

		linencarpetBlock = new Blocklinencarpet(linencarpetBlockid, 0).setStepSound(Block.soundClothFootstep).setHardness(1F).setResistance(1.0F).setBlockName("linencarpet");
		Item.itemsList[linencarpetBlockid] = new ItemBlocklinencarpet(linencarpetBlockid-256, linencarpetBlock).setItemName("linencarpet");

		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet.name", "Raw Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet1.name", "Light Gray Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet2.name", "Gray Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet3.name", "Black Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet4.name", "Red Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet5.name", "Pink Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet6.name", "Green Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet7.name", "Lime Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet8.name", "Brown Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet9.name", "Yellow Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet10.name", "Blue Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet11.name", "Light Blue Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet12.name", "Cyan Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet13.name", "Purple Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet14.name", "Magenta Linen Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.linencarpet.linencarpet15.name", "Orange Linen Carpet");

		cottoncarpetBlock = new Blockcottoncarpet(cottoncarpetBlockid, 16).setStepSound(Block.soundClothFootstep).setHardness(1F).setResistance(1.0F).setBlockName("cottoncarpet");
		Item.itemsList[cottoncarpetBlockid] = new ItemBlockcottoncarpet(cottoncarpetBlockid-256, cottoncarpetBlock).setItemName("cottoncarpet");

		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet.name", "Raw Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet1.name", "Light Gray Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet2.name", "Gray Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet3.name", "Black Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet4.name", "Red Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet5.name", "Pink Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet6.name", "Green Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet7.name", "Lime Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet8.name", "Brown Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet9.name", "Yellow Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet10.name", "Blue Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet11.name", "Light Blue Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet12.name", "Cyan Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet13.name", "Purple Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet14.name", "Magenta Cotton Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.cottoncarpet.cottoncarpet15.name", "Orange Cotton Carpet");

		silkcarpetBlock = new Blocksilkcarpet(silkcarpetBlockid, 32).setStepSound(Block.soundClothFootstep).setHardness(1F).setResistance(1.0F).setBlockName("silkcarpet");
		Item.itemsList[silkcarpetBlockid] = new ItemBlocksilkcarpet(silkcarpetBlockid-256, silkcarpetBlock).setItemName("silkcarpet");

		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet.name", "Raw Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet1.name", "Light Gray Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet2.name", "Gray Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet3.name", "Black Silk Ccarpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet4.name", "Red Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet5.name", "Pink Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet6.name", "Green Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet7.name", "Lime Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet8.name", "Brown Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet9.name", "Yellow Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet10.name", "Blue Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet11.name", "Light Blue Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet12.name", "Cyan Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet13.name", "Purple Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet14.name", "Magenta Silk Carpet");
		LanguageRegistry.instance().addStringLocalization("tile.silkcarpet.silkcarpet15.name", "Orange Silk Carpet");

		//=========================================================================================
		// This is the basic Cushion Block.
		//=========================================================================================

		linenCushionBlock = new BlocklinenCushion(linenCushionBlockid, 0).setStepSound(Block.soundClothFootstep).setHardness(1F).setResistance(1.0F).setBlockName("linenCushion");
		Item.itemsList[linenCushionBlockid] = new ItemBlocklinenCushion(linenCushionBlockid-256, linenCushionBlock).setItemName("linenCushion");

		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion.name", "Raw Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion1.name", "Light Gray Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion2.name", "Gray Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion3.name", "Black Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion4.name", "Red Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion5.name", "Pink Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion6.name", "Green Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion7.name", "Lime Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion8.name", "Brown Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion9.name", "Yellow Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion10.name", "Blue Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion11.name", "Light Blue Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion12.name", "Cyan Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion13.name", "Purple Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion14.name", "Magenta Linen Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.linenCushion.linenCushion15.name", "Orange Linen Cushion");

		cottonCushionBlock = new BlockcottonCushion(cottonCushionBlockid, 16).setStepSound(Block.soundClothFootstep).setHardness(1F).setResistance(1.0F).setBlockName("cottonCushion");
		Item.itemsList[cottonCushionBlockid] = new ItemBlockcottonCushion(cottonCushionBlockid-256, cottonCushionBlock).setItemName("cottonCushion");

		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion.name", "Raw Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion1.name", "Light Gray Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion2.name", "Gray Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion3.name", "Black Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion4.name", "Red Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion5.name", "Pink Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion6.name", "Green Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion7.name", "Lime Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion8.name", "Brown Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion9.name", "Yellow Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion10.name", "Blue Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion11.name", "Light Blue Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion12.name", "Cyan Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion13.name", "Purple Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion14.name", "Magenta Cotton Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.cottonCushion.cottonCushion15.name", "Orange Cotton Cushion");

		silkCushionBlock = new BlocksilkCushion(silkCushionBlockid, 32).setStepSound(Block.soundClothFootstep).setHardness(1F).setResistance(1.0F).setBlockName("silkCushion");
		Item.itemsList[silkCushionBlockid] = new ItemBlocksilkCushion(silkCushionBlockid-256, silkCushionBlock).setItemName("silkCushion");

		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion.name", "Raw Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion1.name", "Light Gray Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion2.name", "Gray Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion3.name", "Black Silk CCushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion4.name", "Red Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion5.name", "Pink Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion6.name", "Green Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion7.name", "Lime Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion8.name", "Brown Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion9.name", "Yellow Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion10.name", "Blue Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion11.name", "Light Blue Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion12.name", "Cyan Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion13.name", "Purple Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion14.name", "Magenta Silk Cushion");
		LanguageRegistry.instance().addStringLocalization("tile.silkCushion.silkCushion15.name", "Orange Silk Cushion");	


		/**
		 * ==============================================================================================
		 * End of Line ~ Block List
		 * ==============================================================================================
		 */
	}
}