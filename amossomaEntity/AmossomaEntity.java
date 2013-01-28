package amossomaEntity;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import amossoma.CommonProxyAmossoma;
import amossoma.ClientProxyAmossoma;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = "Ash_AmossomaEntity", name = "AmosomaEntity", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaEntity 
{

@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
public static CommonProxyAmossoma proxy;
	
	
static int startEntityId = 300; 

@Init
public void load(FMLInitializationEvent event)
{
proxy.registerRenderThings();

/**
 * ==============================================================================================
 * Entity Registry
 * ==============================================================================================
 */

	EntityRegistry.registerModEntity(EntityIntDev.class, "Intellect Devourer", 1, this, 80, 3, true);

/**
 * ==============================================================================================
 * End of Line ~  Entity Registry
 * ==============================================================================================
 */

/**
 * ==============================================================================================
 * Entity Spawn Registry
 * ==============================================================================================
 */

/* 
 * add Spawn
 */

	EntityRegistry.addSpawn(EntityIntDev.class, 10, 2, 4, EnumCreatureType.monster, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.forest);

/*
 * Language Registry
 */

	LanguageRegistry.instance().addStringLocalization("entity.Ash_AmossomaEntity.AmossomaEntity.name", "Intellect Devourer");

/*
 * Register Egg
 */
	registerEntityEgg(EntityIntDev.class, 0x7A65CF, 0x4DF200);

}

/*
 * Entity Code
 */

	public static int getUniqueEntityId()
	{
		do
		{
			startEntityId++;
		}
			while(EntityList.getStringFromID(startEntityId) != null);

			return startEntityId;
		}

/*
 * Egg Code
 */
	public static void registerEntityEgg(Class <? extends Entity> entity, int primaryColor, int secondaryColor)
	{
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
}