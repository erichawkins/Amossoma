package amossomaReefs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import amossoma.CommonProxyAmossoma;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = "Ash_AmossomaReefs", name = "AmossomaReefs", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaReefs 
{
/*
 * ############################################################################################
 * This is where we declare all our Blocks
 * ############################################################################################
 */
	/*
	 * =========================================================================================
	 * Reef Types
	 * =========================================================================================
	 */
	
	public static Block ReefBlockRed;
	public static Block ReefBlockYellow;
	public static Block ReefBlockBlue;
	public static Block ReefBlockGreen;

	/*
	 * =========================================================================================
	 * SeaWeed Types
	 * =========================================================================================
	 */
	
	public static Block SeaWeedBlock;
	public static Block DarkSeaWeedBlock;
	public static Block KelpBlock;
	public static Block DarkKelpBlock;
	
	/*
	 * =========================================================================================
	 * Algae Types
	 * =========================================================================================
	 */
	
	public static Block BlueAlgaeBlock;
	public static Block YellowAlgaeBlock;
	public static Block GreenAlgaeBlock;
	public static Block RedAlgaeBlock;
	

	/*
	 * =========================================================================================
	 * Coral Types
	 * =========================================================================================
	 */
	
	public static Block SpineCoralBlock;
	public static Block StagHornCoralBlock;
	public static Block EarCoralBlock;
	public static Block BlosomCoralBlock;
	public static Block BubbleCoralBlock;
	public static Block ShelfCoralBlock;
	public static Block BrainCoralBlock;
	public static Block ElkHornCoralBlock;
	
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
	 * ~~~~~
	 * =========================================================================================
	 */

	/*
	 * =========================================================================================
	 * SeaWeed Types
	 * =========================================================================================
	 */
	
	public static Item SeaWeedSeedling;
	public static Item DarkSeaWeedSeedling;
	public static Item KelpSeedling;
	public static Item DarkKelpSeedling;
	
	/*
	 * =========================================================================================
	 * Algae Types
	 * =========================================================================================
	 */
	
	public static Item BlueAlgaeSpore;
	public static Item YellowAlgaeSpore;
	public static Item GreenAlgaeSpore;
	public static Item RedAlgaeSpore;
		
	 /* 
	  * =========================================================================================
	 */
	
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
//	MinecraftForge.EVENT_BUS.register(new amossomaReefs.AmossomaReefsEvent_Bonemeal());
//    event.getModMetadata().version = "1.4.7";
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
 // Reef Blocks
 //=========================================================================================
        
	ReefBlockRedid = config.getBlock("idReefBlockRed", Configuration.CATEGORY_BLOCK, 2630).getInt();
	ReefBlockYellowid = config.getBlock("idReefBlockYellowk", Configuration.CATEGORY_BLOCK, 2631).getInt();
	ReefBlockBlueid = config.getBlock("idReefBlockBlue", Configuration.CATEGORY_BLOCK, 2632).getInt();
	ReefBlockGreenid = config.getBlock("idReefBlockGreen", Configuration.CATEGORY_BLOCK, 2633).getInt();
        
 //=========================================================================================
 // SeaWeeds and Kelps
 //=========================================================================================
     
     SeaWeedBlockid = config.getBlock("idSeaWeedBlock", Configuration.CATEGORY_BLOCK, 2640).getInt();
     DarkSeaWeedBlockid = config.getBlock("idDarkSeaWeedBlock", Configuration.CATEGORY_BLOCK, 2641).getInt();
     KelpBlockid = config.getBlock("idKelpBlock", Configuration.CATEGORY_BLOCK, 2642).getInt();
     DarkKelpBlockid = config.getBlock("idDarkKelpBlock", Configuration.CATEGORY_BLOCK, 2643).getInt();
     
 //=========================================================================================
     
//=========================================================================================
// SeaWeeds and Kelps
//=========================================================================================

     BlueAlgaeBlockid = config.getBlock("idBlueAlgaeBlock", Configuration.CATEGORY_BLOCK, 2650).getInt();
     YellowAlgaeBlockid = config.getBlock("idYellowAlgaeBlock", Configuration.CATEGORY_BLOCK, 2651).getInt();
     GreenAlgaeBlockid = config.getBlock("idGreenAlgaeBlock", Configuration.CATEGORY_BLOCK, 2652).getInt();
     RedAlgaeBlockid = config.getBlock("idRedAlgaeBlock", Configuration.CATEGORY_BLOCK, 2653).getInt();
         
//=========================================================================================
     
 //=========================================================================================    
 // Coral Blocks
 //=========================================================================================    
     
 	SpineCoralBlockid = config.getBlock("idSpineCoralBlock", Configuration.CATEGORY_BLOCK, 2660).getInt();
 	StagHornCoralBlockid = config.getBlock("idStagHornCoralBlock", Configuration.CATEGORY_BLOCK, 2661).getInt();
 	EarCoralBlockid = config.getBlock("idEarCoralBlock", Configuration.CATEGORY_BLOCK, 2662).getInt();
 	BlosomCoralBlockid = config.getBlock("idBlosomCoralBlock", Configuration.CATEGORY_BLOCK, 2663).getInt();
 	BubbleCoralBlockid = config.getBlock("idBubbleCoralBlock", Configuration.CATEGORY_BLOCK, 2664).getInt();
 	ShelfCoralBlockid = config.getBlock("idShelfCoralBlock", Configuration.CATEGORY_BLOCK, 2665).getInt();    
 	BrainCoralBlockid = config.getBlock("idBrainCoralBlock", Configuration.CATEGORY_BLOCK, 2666).getInt();
 	ElkHornCoralBlockid = config.getBlock("idElkHornCoralBlock", Configuration.CATEGORY_BLOCK, 2667).getInt();
 	
 //=========================================================================================   
     
//     //=========================================================================================   
//     // Items
//     //=========================================================================================  
 		
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
//Reef Blocks
//=========================================================================================

	public static int ReefBlockRedid;
	public static int ReefBlockYellowid;
	public static int ReefBlockBlueid;
	public static int ReefBlockGreenid;
		
//=========================================================================================
		
//=========================================================================================
//SeaWeed and Kelp
//=========================================================================================

	public static int SeaWeedBlockid;
	public static int DarkSeaWeedBlockid;
	public static int KelpBlockid;
	public static int DarkKelpBlockid;
	
//=========================================================================================
	
//=========================================================================================
//Algaes
//=========================================================================================

	public static int BlueAlgaeBlockid;
	public static int YellowAlgaeBlockid;
	public static int GreenAlgaeBlockid;
	public static int RedAlgaeBlockid;
	
//=========================================================================================

//=========================================================================================
//Cloth Products
//=========================================================================================

	public static int SpineCoralBlockid;
	public static int StagHornCoralBlockid;
	public static int EarCoralBlockid;
	public static int BlosomCoralBlockid;
	public static int BubbleCoralBlockid;
	public static int ShelfCoralBlockid;
	public static int BrainCoralBlockid;
	public static int ElkHornCoralBlockid;

//=========================================================================================
	
//	//=========================================================================================
//	// Items
//	//=========================================================================================
//
////=========================================================================================
	
	@Init
	public void load(FMLInitializationEvent event)
	{
	proxy.registerRenderThings();
	
	//EntityRegistry.registerModEntity(EntityMountableBlock.class, "EntityMountableBlock", 1,  this, 250, 5, false);
/**
 * ==============================================================================================
 * Block List
 * ==============================================================================================
 */

	//=========================================================================================
	//Reef Blocks
	//=========================================================================================
	
	ReefBlockRed = (new BlockReefBlockRed(ReefBlockRedid, 8)).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("RedReef");
	Item.itemsList[ReefBlockRedid] = new ItemReefBlockRed(ReefBlockRedid-256, ReefBlockRed).setIconIndex(1).setItemName("Red Reef");

	ReefBlockYellow = (new BlockReefBlockYellow(ReefBlockYellowid, 24)).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("YellowReef");
	Item.itemsList[ReefBlockYellowid] = new ItemReefBlockYellow(ReefBlockYellowid-256, ReefBlockYellow).setItemName("YellowReef");

	ReefBlockBlue = (new BlockReefBlockBlue(ReefBlockBlueid, 40)).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("BlueReef");
	Item.itemsList[ReefBlockBlueid] = new ItemReefBlockBlue(ReefBlockBlueid-256, ReefBlockBlue).setItemName("BlueReef");
	
	ReefBlockGreen = (new BlockReefBlockGreen(ReefBlockGreenid, 56)).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("GreenReef");
	Item.itemsList[ReefBlockGreenid] = new ItemReefBlockGreen(ReefBlockGreenid-256, ReefBlockGreen).setItemName("GreenReef");
	
		LanguageRegistry.instance().addStringLocalization("tile.RedReef.RedReef.name", "Red Flat Reef Down");
		LanguageRegistry.instance().addStringLocalization("tile.RedReef.RedReef1.name", "Red Flat Reef Up");
		LanguageRegistry.instance().addStringLocalization("tile.RedReef.RedReef2.name", "Red Collum Reef Left");
		LanguageRegistry.instance().addStringLocalization("tile.RedReef.RedReef3.name", "Red Collum Reef Right");
		LanguageRegistry.instance().addStringLocalization("tile.RedReef.RedReef4.name", "Red Smooth Pumuce");
		LanguageRegistry.instance().addStringLocalization("tile.RedReef.RedReef5.name", "Red Smooth Pumuce Dirty");
		LanguageRegistry.instance().addStringLocalization("tile.RedReef.RedReef6.name", "Red Pumuce");
		LanguageRegistry.instance().addStringLocalization("tile.RedReef.RedReef7.name", "Red Pumace Dirty");
		
		LanguageRegistry.instance().addStringLocalization("tile.YellowReef.YellowReef.name", "Yellow Flat Reef Down");
		LanguageRegistry.instance().addStringLocalization("tile.YellowReef.YellowReef1.name", "Yellow Flat Reef Up");
		LanguageRegistry.instance().addStringLocalization("tile.YellowReef.YellowReef2.name", "Yellow Collum Reef Left");
		LanguageRegistry.instance().addStringLocalization("tile.YellowReef.YellowReef3.name", "Yellow Collum Reef Right");
		LanguageRegistry.instance().addStringLocalization("tile.YellowReef.YellowReef4.name", "Yellow Smooth Pumuce");
		LanguageRegistry.instance().addStringLocalization("tile.YellowReef.YellowReef5.name", "Yellow Smooth Pumuce Dirty");
		LanguageRegistry.instance().addStringLocalization("tile.YellowReef.YellowReef6.name", "Yellow Pumuce");
		LanguageRegistry.instance().addStringLocalization("tile.YellowReef.YellowReef7.name", "Yellow Pumace Dirty");
		
		LanguageRegistry.instance().addStringLocalization("tile.BlueReef.BlueReef.name", "Blue Flat Reef Down");
		LanguageRegistry.instance().addStringLocalization("tile.BlueReef.BlueReef1.name", "Blue Flat Reef Up");
		LanguageRegistry.instance().addStringLocalization("tile.BlueReef.BlueReef2.name", "Blue Collum Reef Left");
		LanguageRegistry.instance().addStringLocalization("tile.BlueReef.BlueReef3.name", "Blue Collum Reef Right");
		LanguageRegistry.instance().addStringLocalization("tile.BlueReef.BlueReef4.name", "Blue Smooth Pumuce");
		LanguageRegistry.instance().addStringLocalization("tile.BlueReef.BlueReef5.name", "Blue Smooth Pumuce Dirty");
		LanguageRegistry.instance().addStringLocalization("tile.BlueReef.BlueReef6.name", "Blue Pumuce");
		LanguageRegistry.instance().addStringLocalization("tile.BlueReef.BlueReef7.name", "Blue Pumace Dirty");
		
		LanguageRegistry.instance().addStringLocalization("tile.GreenReef.GreenReef.name", "Green Flat Reef Down");
		LanguageRegistry.instance().addStringLocalization("tile.GreenReef.GreenReef1.name", "Green Flat Reef Up");
		LanguageRegistry.instance().addStringLocalization("tile.GreenReef.GreenReef2.name", "Green Collum Reef Left");
		LanguageRegistry.instance().addStringLocalization("tile.GreenReef.GreenReef3.name", "Green Collum Reef Right");
		LanguageRegistry.instance().addStringLocalization("tile.GreenReef.GreenReef4.name", "Green Smooth Pumuce");
		LanguageRegistry.instance().addStringLocalization("tile.GreenReef.GreenReef5.name", "Green Smooth Pumuce Dirty");
		LanguageRegistry.instance().addStringLocalization("tile.GreenReef.GreenReef6.name", "Green Pumuce");
		LanguageRegistry.instance().addStringLocalization("tile.GreenReef.GreenReef7.name", "Green Pumace Dirty");
		
//=========================================================================================
// SeaWeeds and Kelp.
//=========================================================================================	
		
		SeaWeedBlock = (new BlockSeaWeedBlock(SeaWeedBlockid, 7, Material.water)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("SeaWeed");
		GameRegistry.registerBlock(SeaWeedBlock, "Ash_SeaWeedBlock");
		LanguageRegistry.addName(SeaWeedBlock, "SeaWeed");
		
		DarkSeaWeedBlock = (new BlockDarkSeaWeedBlock(DarkSeaWeedBlockid, 23, Material.water)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("DarkSeaWeed");
		GameRegistry.registerBlock(DarkSeaWeedBlock, "Ash_DarkSeaWeedBlock");
		LanguageRegistry.addName(DarkSeaWeedBlock, "DarkSeaWeed");
		
		KelpBlock = (new BlockKelpBlock(KelpBlockid, 39, Material.water)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Kelp");
		GameRegistry.registerBlock(KelpBlock, "Ash_KelpBlock");
		LanguageRegistry.addName(KelpBlock, "Kelp");
		
		DarkKelpBlock = (new BlockDarkKelpBlock(DarkKelpBlockid, 55, Material.water)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("DarkKelp");
		GameRegistry.registerBlock(DarkKelpBlock, "Ash_DarkKelpBlock");
		LanguageRegistry.addName(DarkKelpBlock, "DarkKelp");
		
//=========================================================================================
// Algaes.
//=========================================================================================
		
		BlueAlgaeBlock = (new BlockBlueAlgaeBlock(BlueAlgaeBlockid, 72)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("BlueAlgae");
		YellowAlgaeBlock = (new BlockYellowAlgaeBlock(YellowAlgaeBlockid, 88)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("YellowAlgae");
		GreenAlgaeBlock = (new BlockGreenAlgaeBlock(GreenAlgaeBlockid, 104)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("GreenAlgae");
		RedAlgaeBlock = (new BlockRedAlgaeBlock(RedAlgaeBlockid, 120)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("RedAlgae");
		
//=========================================================================================
// Corals.
//=========================================================================================

		SpineCoralBlock = new BlockSpineCoralBlock(SpineCoralBlockid, 188).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("SpineCoral");
		Item.itemsList[SpineCoralBlockid] = new ItemSpineCoralBlock(SpineCoralBlockid-256, SpineCoralBlock).setItemName("SpineCoral");

		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral.name", "Blue SpineCoral");
		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral1.name", "Green SpineCoral");
		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral2.name", "Teal SpineCoral");
		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral3.name", "Ligh Blue SpineCoral");
		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral4.name", "Purple SpineCoral");
		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral5.name", "Red SpineCoral");
		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral6.name", "Magenta SpineCoral");
		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral7.name", "Pink SpineCoral");
		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral8.name", "Orange SpineCoral");
		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral9.name", "Yellow SpineCoral");
		LanguageRegistry.instance().addStringLocalization("tile.SpineCoral.SpineCoral10.name", "Brown SpineCoral");

		StagHornCoralBlock = new BlockStagHornCoralBlock(StagHornCoralBlockid, 154).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("StagHornCoral");
		Item.itemsList[StagHornCoralBlockid] = new ItemStagHornCoralBlock(StagHornCoralBlockid-256, StagHornCoralBlock).setItemName("StagHornCoral");

		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral.name", "Blue StagHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral1.name", "Green StagHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral2.name", "Teal StagHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral3.name", "Ligh Blue StagHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral4.name", "Purple StagHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral5.name", "Red StagHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral6.name", "Magenta StagHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral7.name", "Pink StagHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral8.name", "Orange StagHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral9.name", "Yellow StagHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.StagHornCoral.StagHornCoral10.name", "Brown StagHornCoral");
				
		EarCoralBlock = new BlockEarCoralBlock(EarCoralBlockid, 170).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("EarCoral");
		Item.itemsList[EarCoralBlockid] = new ItemEarCoralBlock(EarCoralBlockid-256, EarCoralBlock).setItemName("EarCoral");

		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral.name", "Blue EarCoral");
		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral1.name", "Green EarCoral");
		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral2.name", "Teal EarCoral");
		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral3.name", "Ligh Blue EarCoral");
		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral4.name", "Purple EarCoral");
		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral5.name", "Red EarCoral");
		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral6.name", "Magenta EarCoral");
		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral7.name", "Pink EarCoral");
		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral8.name", "Orange EarCoral");
		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral9.name", "Yellow EarCoral");
		LanguageRegistry.instance().addStringLocalization("tile.EarCoral.EarCoral10.name", "Brown EarCoral");
		
		BlosomCoralBlock = new BlockBlosomCoralBlock(BlosomCoralBlockid, 186).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("BlosomCoral");
		Item.itemsList[BlosomCoralBlockid] = new ItemBlosomCoralBlock(BlosomCoralBlockid-256, BlosomCoralBlock).setItemName("BlosomCoral");

		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral.name", "Blue BlosomCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral1.name", "Green BlosomCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral2.name", "Teal BlosomCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral3.name", "Ligh Blue BlosomCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral4.name", "Purple BlosomCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral5.name", "Red BlosomCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral6.name", "Magenta BlosomCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral7.name", "Pink BlosomCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral8.name", "Orange BlosomCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral9.name", "Yellow BlosomCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BlosomCoral.BlosomCoral10.name", "Brown BlosomCoral");
				
		BubbleCoralBlock = new BlockBubbleCoralBlock(BubbleCoralBlockid, 202).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("BubbleCoral");
		Item.itemsList[BubbleCoralBlockid] = new ItemBubbleCoralBlock(BubbleCoralBlockid-256, BubbleCoralBlock).setItemName("BubbleCoral");

		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral.name", "Blue BubbleCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral1.name", "Green BubbleCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral2.name", "Teal BubbleCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral3.name", "Ligh Blue BubbleCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral4.name", "Purple BubbleCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral5.name", "Red BubbleCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral6.name", "Magenta BubbleCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral7.name", "Pink BubbleCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral8.name", "Orange BubbleCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral9.name", "Yellow BubbleCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BubbleCoral.BubbleCoral10.name", "Brown BubbleCoral");

		ShelfCoralBlock = new BlockShelfCoralBlock(ShelfCoralBlockid, 218).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("ShelfCoral");
		Item.itemsList[ShelfCoralBlockid] = new ItemShelfCoralBlock(ShelfCoralBlockid-256, ShelfCoralBlock).setItemName("ShelfCoral");

		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral.name", "Blue ShelfCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral1.name", "Green ShelfCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral2.name", "Teal ShelfCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral3.name", "Ligh Blue ShelfCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral4.name", "Purple ShelfCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral5.name", "Red ShelfCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral6.name", "Magenta ShelfCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral7.name", "Pink ShelfCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral8.name", "Orange ShelfCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral9.name", "Yellow ShelfCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ShelfCoral.ShelfCoral10.name", "Brown ShelfCoral");
		
		BrainCoralBlock = new BlockBrainCoralBlock(BrainCoralBlockid, 234).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("BrainCoral");
		Item.itemsList[BrainCoralBlockid] = new ItemBrainCoralBlock(BrainCoralBlockid-256, BrainCoralBlock).setItemName("BrainCoral");

		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral.name", "Blue BrainCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral1.name", "Green BrainCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral2.name", "Teal BrainCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral3.name", "Ligh Blue BrainCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral4.name", "Purple BrainCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral5.name", "Red BrainCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral6.name", "Magenta BrainCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral7.name", "Pink BrainCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral8.name", "Orange BrainCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral9.name", "Yellow BrainCoral");
		LanguageRegistry.instance().addStringLocalization("tile.BrainCoral.BrainCoral10.name", "Brown BrainCoral");

		ElkHornCoralBlock = new BlockElkHornCoralBlock(ElkHornCoralBlockid, 250).setStepSound(Block.soundStoneFootstep).setHardness(1F).setResistance(1.0F).setBlockName("ElkHornCoral");
		Item.itemsList[ElkHornCoralBlockid] = new ItemElkHornCoralBlock(ElkHornCoralBlockid-256, ElkHornCoralBlock).setItemName("ElkHornCoral");

		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral.name", "Blue ElkHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral1.name", "Green ElkHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral2.name", "Teal ElkHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral3.name", "Ligh Blue ElkHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral4.name", "Purple ElkHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral5.name", "Red ElkHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral6.name", "Magenta ElkHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral7.name", "Pink ElkHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral8.name", "Orange ElkHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral9.name", "Yellow ElkHornCoral");
		LanguageRegistry.instance().addStringLocalization("tile.ElkHornCoral.ElkHornCoral10.name", "Brown ElkHornCoral");
		
		

		

		

		GameRegistry.registerBlock(BlueAlgaeBlock, "Ash_BlueAlgaeBlock");
		GameRegistry.registerBlock(YellowAlgaeBlock, "Ash_YellowAlgaeBlock");
		GameRegistry.registerBlock(RedAlgaeBlock, "Ash_RedAlgaeBlock");
		GameRegistry.registerBlock(GreenAlgaeBlock, "Ash_GreenAlgaeBlock");
		
		
		LanguageRegistry.addName(BlueAlgaeBlock, "BlueAlgae");
		LanguageRegistry.addName(YellowAlgaeBlock, "YellowAlgae");
		LanguageRegistry.addName(RedAlgaeBlock, "RedAlgae");
		LanguageRegistry.addName(GreenAlgaeBlock, "GreenAlgae");
		
	/**
	 * ==============================================================================================
	 * End of Line ~ Block List
	 * ==============================================================================================
	 */
	}
}