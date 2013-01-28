package amossomaDimension;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import amossomaEntity.AmossomaEntity;
import amossoma.CommonProxyAmossoma;
import amossoma.ClientProxyAmossoma;


@Mod(modid = "Ash_AmossomaDimesion", name = "AmosomaDimesion", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaDimesion 
{

@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
public static CommonProxyAmossoma proxy;
	
public static int dimension = 20; 

@Init
public void load(FMLInitializationEvent event)
{
proxy.registerRenderThings();

/**
 * ==============================================================================================
 * Dimension Manager
 * ==============================================================================================
 */

	DimensionManager.registerProviderType(dimension, WorldProviderAmossoma.class, false);

	DimensionManager.registerDimension(dimension, dimension);


/**
 * ==============================================================================================
 * End of Line ~  Dimension Manager
 * ==============================================================================================
 */
	}

}