package amossomaAllTabs;

import amossoma.CommonProxyAmossoma;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.creativetab.CreativeTabs;


@Mod(modid = "Ash_AmossomaAllTabs", name = "AmosomaAllTabs", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AmossomaAllTabs 
{
	@SidedProxy(clientSide = "amossoma.ClientProxyAmossoma", serverSide = "amossoma.CommonProxyAmossoma")
	public static CommonProxyAmossoma proxy;
	

	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();

	}

	public static CreativeTabs AmossomaBlocksTab = new AmossomaBlocksTab(CreativeTabs.getNextID(),"AmossomaBlocksTab"); //Our custom creative tab's object
	public static CreativeTabs AmossomaReefsTab = new AmossomaReefsTab(CreativeTabs.getNextID(),"AmossomaReefsTab"); //Our custom creative tab's object
	public static CreativeTabs AmossomaDecoTab = new AmossomaDecoTab(CreativeTabs.getNextID(),"AmossomaDecoTab"); //Our custom creative tab's object
	public static CreativeTabs AmossomaMaterialsTab = new AmossomaMaterialsTab(CreativeTabs.getNextID(),"AmossomaMaterialsTab"); //Our custom creative tab's object
	public static CreativeTabs AmossomaPlantsTab = new AmossomaPlantsTab(CreativeTabs.getNextID(),"AmossomaPlantsTab"); //Our custom creative tab's object
	public static CreativeTabs AmossomaProductsTab = new AmossomaProductsTab(CreativeTabs.getNextID(),"AmossomaProductsTab"); //Our custom creative tab's object

	
	
}
