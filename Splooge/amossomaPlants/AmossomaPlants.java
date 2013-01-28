package amossomaPlants;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
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

@Mod(modid = "Ash_AmossomaPlants", name = "AmosomaPlants", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)


public class AmossomaPlants 
{
	
	// Crop Types
	
	public static Block FlaxFlower;
	public static Block CottonFlower;
	public static Block BambooFlower;
	
	//Flower Types
	
	public static Block FernFlower;
	public static Block JungleFernFlower;
	
	public static Block HeatherFlower;
	public static Block FoxgloveFlower;
	public static Block ForgetMeNotFlower;
	public static Block IrisFlower;
	public static Block BlueBellFlower;
	public static Block LilyoftheValleyFlower;
	public static Block CarnationFlower;
	public static Block GladiolusFlower;
	public static Block VioletFlower;
	public static Block LilyFlower;
	public static Block TigerLilyFlower;
	public static Block SalviaFlower;
	public static Block PoppyFlower;
	public static Block SunFlower;
	public static Block DasiyFlower;
	public static Block DalihaFlower;
	public static Block BlackDalihaFlower;
	public static Block LavenderFlower;
	public static Block SageFlower;
	public static Block TulipFlower;
	public static Block LotusFlower;
	
	//Seeds and Bulbs
	
	public static Item flaxseeds;
	public static Item cottonseeds;
	public static Item bambooseeds;

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
//		MinecraftForge.EVENT_BUS.register(new amossomaPlants.AmossomaPlants_EventBonemeal());
//	    event.getModMetadata().version = "1.4.7";
	}

	@Init
	public void load(FMLInitializationEvent event)
	{
	proxy.registerRenderThings();
	/*
	 * ==============================================================================================
	 * Block List
	 * ==============================================================================================
	 */
	FlaxFlower = (new BlockFlaxFlower(2600, 0)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("FlaxFlower");
	GameRegistry.registerBlock(FlaxFlower, "Ash_FlaxFlower");
	LanguageRegistry.addName(FlaxFlower, "FlaxFlower");
	
	CottonFlower = (new BlockCottonFlower(2601, 16)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("CottonFlower");
	GameRegistry.registerBlock(CottonFlower, "Ash_CottonFlower");
	LanguageRegistry.addName(CottonFlower, "CottonFlower");
	
	BambooFlower = (new BlockBambooFlower(2602, 32)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("BambooFlower");
	GameRegistry.registerBlock(BambooFlower, "Ash_BambooFlower");
	LanguageRegistry.addName(BambooFlower, "BambooFlower");
	
	FernFlower = (new BlockFernFlower(2603, 15)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("FernFlower");
	GameRegistry.registerBlock(FernFlower, "Ash_FernFlower");
	LanguageRegistry.addName(FernFlower, "Fern Flower");
	
	JungleFernFlower = (new BlockJungleFernFlower(2604, 31)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("JungleFernFlower");
	GameRegistry.registerBlock(JungleFernFlower, "Ash_JumgleFern_Flower");
	LanguageRegistry.addName(JungleFernFlower, "Jumgle Fern Flower");
	
	flaxseeds = (new Itemflaxseeds(5101, FlaxFlower.blockID, Block.grass.blockID)).setIconIndex(8).setItemName("flaxseed");
	GameRegistry.registerItem(flaxseeds, "Ash_FlaxSeeds");
	LanguageRegistry.addName(flaxseeds, "Flax Seeds");
	
	cottonseeds = (new Itemcottonseeds(5102, CottonFlower.blockID, Block.grass.blockID)).setIconIndex(24).setItemName("cottonseeds");
	GameRegistry.registerItem(cottonseeds, "Ash_CottonSeeds");
	LanguageRegistry.addName(cottonseeds, "Cotton Seeds");
	
	bambooseeds = (new Itembambooseeds(5103, BambooFlower.blockID, Block.grass.blockID)).setIconIndex(40).setItemName("bambooseeds");
	GameRegistry.registerItem(bambooseeds, "Ash_BambooSeeds");
	LanguageRegistry.addName(bambooseeds, "Bamboo Seeds");
	
	
	HeatherFlower = (new BlockHeatherFlower(2570, 192)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Heather Flower");
	GameRegistry.registerBlock(HeatherFlower, "Ash_HeatherFlower");
	
	FoxgloveFlower = (new BlockFoxgloveFlower(2571, 193)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Fox Glove Flower");
	GameRegistry.registerBlock(FoxgloveFlower, "Ash_FoxgloveFlower");

	ForgetMeNotFlower = (new BlockFogetMeNotFlower(2572, 194)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Forget Me Not Flower");
	GameRegistry.registerBlock(ForgetMeNotFlower, "Ash_ForgetMeNotFlower");

	IrisFlower = (new BlockIrisFlower(2573, 195)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Iris Flower");
	GameRegistry.registerBlock(IrisFlower, "Ash_IrisFlower");

	BlueBellFlower = (new BlockBlueBellFlower(2574, 196)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("BlueBell Flower");
	GameRegistry.registerBlock(BlueBellFlower, "Ash_BlueBellFlower");

	LilyoftheValleyFlower = (new BlockLilyoftheValleyFlower(2575, 197)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Lily of the Valley Flower");
	GameRegistry.registerBlock(LilyoftheValleyFlower, "Ash_LilyoftheValleyFlower");

	CarnationFlower = (new BlockCarnationFlower(2576, 224)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Carnation Flower");
	GameRegistry.registerBlock(CarnationFlower, "Ash_CarnationFlower");

	GladiolusFlower = (new BlockGladiolusFlower(2577, 198)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Gladiolus Flower");
	GameRegistry.registerBlock(GladiolusFlower, "Ash_GladiolusFlower");

	VioletFlower = (new BlockVioletFlower(2578, 199)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Violet Flower");
	GameRegistry.registerBlock(VioletFlower, "Ash_VioletFlower");

	LilyFlower = (new BlockLilyFlower(2579, 200)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Lily Flower");
	GameRegistry.registerBlock(LilyFlower, "Ash_LilyFlower");

	TigerLilyFlower = (new BlockLilyFlower(2580, 201)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("TigerLily Flower");
	GameRegistry.registerBlock(TigerLilyFlower, "Ash_TigerLilyFlower");

	SalviaFlower = (new BlockSalviaFlower(2581, 202)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Salvia Flower");
	GameRegistry.registerBlock(SalviaFlower, "Ash_SalviaFlower");

	PoppyFlower = (new BlockPoppyFlower(2582, 203)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Poppy Flower");
	GameRegistry.registerBlock(PoppyFlower, "Ash_PoppyFlower");

	SunFlower = (new BlockSunFlower(2583, 204)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Sun Flower");
	GameRegistry.registerBlock(SunFlower, "Ash_SunFlower");

	DasiyFlower = (new BlockDasiyFlower(2584, 205)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Daisy Flower");
	GameRegistry.registerBlock(DasiyFlower, "Ash_DasiyFlower");

	DalihaFlower = (new BlockDalihaFlower(2585, 206)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Daliha Flower");
	GameRegistry.registerBlock(DalihaFlower, "Ash_DalihaFlower");

	BlackDalihaFlower = (new BlockBlackDaliaFlower(2586, 207)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Black Daliha Flower");
	GameRegistry.registerBlock(BlackDalihaFlower, "Ash_BlackDalihaFlower");

	LavenderFlower = (new BlockLavenderFlower(2587, 208)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Lavender Flower");
	GameRegistry.registerBlock(LavenderFlower, "Ash_LavenderFlower");

	SageFlower = (new BlockSageFlower(2588, 209)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Sage Flower");
	GameRegistry.registerBlock(SageFlower, "Ash_SageFlower");

	TulipFlower = (new BlockTulipFlower(2589, 240)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("Tulip Flower");
	GameRegistry.registerBlock(TulipFlower, "Ash_TulipFlower");
	
	LotusFlower = (new BlockLotusFlower(2590, 255)).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(1.0F).setBlockName("LotusFlower");
	GameRegistry.registerBlock(LotusFlower, "Ash_LotusFlower");
	
	/*
	 * ==============================================================================================
	 * End of Line ~ Block List
	 * ==============================================================================================
	 */
	


	/**
	 * ==============================================================================================
	 * Language Registry
	 * ==============================================================================================
	 */


	
	LanguageRegistry.addName(HeatherFlower, "Heather Flower");
	LanguageRegistry.addName(FoxgloveFlower, "Foxglove Flower");
	LanguageRegistry.addName(ForgetMeNotFlower, "Forget Me Not Flower");
	LanguageRegistry.addName(IrisFlower, "Iris Flower");
	LanguageRegistry.addName(BlueBellFlower, "BlueBell Flower");
	LanguageRegistry.addName(LilyoftheValleyFlower, "Lily of the Valley Flower");
	LanguageRegistry.addName(CarnationFlower, "Carnation Flower");
	LanguageRegistry.addName(GladiolusFlower, "Gladiolus Flower");
	LanguageRegistry.addName(VioletFlower, "Violet Flower");
	LanguageRegistry.addName(LilyFlower, "Lily Flower");
	LanguageRegistry.addName(TigerLilyFlower, "TigerLily Flower");
	LanguageRegistry.addName(SalviaFlower, "Salvia Flower");
	LanguageRegistry.addName(PoppyFlower, "Poppy Flower");
	LanguageRegistry.addName(SunFlower, "Sunflower Flower");
	LanguageRegistry.addName(DasiyFlower, "Dasiy Flower");
	LanguageRegistry.addName(DalihaFlower, "Daliha Flower");
	LanguageRegistry.addName(BlackDalihaFlower, "Black Daliha Flower");
	LanguageRegistry.addName(LavenderFlower, "Lavender Flower");
	LanguageRegistry.addName(SageFlower, "Sage Flower");
	LanguageRegistry.addName(TulipFlower, "Tulip Flower");
	LanguageRegistry.addName(LotusFlower, "Lotus Flower");

	}
}
