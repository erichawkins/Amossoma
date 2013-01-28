package amossomaBlocks;

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
import amossomaDimension.WorldProviderAmossoma;
import amossomaEntity.AmossomaEntity;
import amossomaWeaves.ItemBlockLinen;


@Mod(modid = "Ash_AmossomaBlocks", name = "AmosomaBlocks", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaBlocks 
{
	
	public static int DevourerBlockId;
	public static int ImpulseBlockId;

	@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
	public static CommonProxyAmossoma proxy;

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

		DevourerBlockId = config.getBlock("idDevourerBlock", Configuration.CATEGORY_BLOCK, 2455).getInt();
		ImpulseBlockId = config.getBlock("idImpulseBlock", Configuration.CATEGORY_BLOCK, 2456).getInt();
	
		config.save();
	}

	public static Block somaBlock;
	public static Block portal;
	public static Block gianBlock;
	public static Block bininiBlock;
	public static Block floatableBlock;
<<<<<<< HEAD
	
	@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
	public static CommonProxyAmossoma proxy;
=======
	public static Block devourerBlock;
	public static Block impulseBlock;

	public static Block neoSpongeFull;
	public static Block neoSpongeEmpty;
	public static Block neoSpongeLavaFull;
	public static Block neoSpongeLavaEmpty;
>>>>>>> Slpooged on all Files

	@Init
	public void load(FMLInitializationEvent event)
	{
	proxy.registerRenderThings();
	/**
	 * ==============================================================================================
	 * Block List
	 * 2457, 2458, 2459 open then 2470
	 * ==============================================================================================
	 */

<<<<<<< HEAD
	somaBlock = (new BlockSomaBlock(2550, 1)).setBlockName("SomaBlock");
	portal = (new BlockPortalAmossoma(2551, 2)).setBlockName("portal");
	gianBlock = (new BlockGianBlock(2552, 3)).setHardness(2f).setBlockName("gianBlock");
	bininiBlock = (new BlockBininiBlock(2553, 0)).setHardness(4f).setBlockName("Binini Block");
	floatableBlock = (new BlockFloatableBlock(2554, 4)).setHardness(4f).setBlockName("Float Block");
=======
	somaBlock = (new BlockSomaBlock(2451, 1)).setBlockName("SomaBlock");
	portal = (new BlockPortalAmossoma(2452, 2)).setBlockName("portal");
	gianBlock = (new BlockGianBlock(2453, 3)).setHardness(2f).setBlockName("gianBlock");
	bininiBlock = (new BlockBininiBlock(2454, 0)).setHardness(4f).setBlockName("Binini Block");

	devourerBlock = (new BlockDevourerBlock(DevourerBlockId, 5)).setHardness(4f).setBlockName("DevourerBlock");
	impulseBlock = (new BlockImpulseBlock(ImpulseBlockId, 6)).setHardness(4f).setBlockName("ImpulseBlock");

	floatableBlock = (new BlockFloatableBlock(2460, 4)).setHardness(4f).setBlockName("Float Block");
	neoSpongeFull = (new BlockNeoSpongeFull(2461, 16, Material.sponge)).setHardness(.5f).setBlockName("neoSpongeFull");
	neoSpongeEmpty = (new BlockNeoSpongeEmpty(2462, 17, Material.sponge)).setHardness(.5f).setBlockName("neoSpongeEmpty");

	neoSpongeLavaFull = (new BlockNeoSpongeLavaFull(2463, 18, Material.sponge)).setHardness(.5f).setBlockName("neoSpongeLavaFull");
	neoSpongeLavaEmpty = (new BlockNeoSpongeLavaEmpty(2464, 19, Material.sponge)).setHardness(.5f).setBlockName("neoSpongeLavaEmpty");

>>>>>>> Slpooged on all Files
	/**
	 * ==============================================================================================
	 * End of Line ~ Block List
	 * ==============================================================================================
	 */
	
	/**
	 * ==============================================================================================
	 * Game Registry
	 * ==============================================================================================
	 */

	GameRegistry.registerBlock(somaBlock, "Ash_SomaBlock");
	GameRegistry.registerBlock(portal, "Ash_Portal");
	GameRegistry.registerBlock(gianBlock, "Ash_GianBlock");
	GameRegistry.registerBlock(bininiBlock, "Ash_BininiBlock");
<<<<<<< HEAD
	GameRegistry.registerBlock(floatableBlock, "Ash_FloatBlock");
=======
	GameRegistry.registerBlock(devourerBlock, "Ash_DevourerBlock");
	GameRegistry.registerBlock(impulseBlock, "Ash_ImpulseBlock");
	
	GameRegistry.registerBlock(floatableBlock, "Ash_FloatBlock");
	GameRegistry.registerBlock(neoSpongeFull, "Ash_neoSpongeFull");
	GameRegistry.registerBlock(neoSpongeEmpty, "Ash_neoSpongeEmpty");
	GameRegistry.registerBlock(neoSpongeLavaFull, "Ash_neoSpongeLavaFull");
	GameRegistry.registerBlock(neoSpongeLavaEmpty, "Ash_neoSpongeLavaEmpty");

>>>>>>> Slpooged on all Files
	
	/**
	 * ==============================================================================================
	 * End of Line ~ Game Registry
	 * ==============================================================================================
	 */

	/**
	 * ==============================================================================================
	 * Language Registry
	 * ==============================================================================================
	 */

	LanguageRegistry.addName(somaBlock, "Soma Block");
	LanguageRegistry.addName(portal, "Custom Portal");
	LanguageRegistry.addName(gianBlock, "Gian Block");
	LanguageRegistry.addName(bininiBlock, "Binini Block");
<<<<<<< HEAD
	LanguageRegistry.addName(floatableBlock, "Float Block");
=======
	LanguageRegistry.addName(devourerBlock, "Devourer Block");
	LanguageRegistry.addName(impulseBlock, "Impulse Block");
	LanguageRegistry.addName(floatableBlock, "Float Block");
	LanguageRegistry.addName(neoSpongeFull, "Sponge Full");
	LanguageRegistry.addName(neoSpongeEmpty, "Sponge Empty");
	LanguageRegistry.addName(neoSpongeLavaFull, "Lava Sponge Full");
	LanguageRegistry.addName(neoSpongeLavaEmpty, "Lava Sponge Empty");

>>>>>>> Slpooged on all Files
	/**
	 * ==============================================================================================
	 * End of Line ~ Language Registry
	 * ==============================================================================================
	 */
	}
}
