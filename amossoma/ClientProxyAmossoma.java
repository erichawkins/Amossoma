package amossoma;

import net.minecraftforge.client.MinecraftForgeClient;
import amossomaEntity.EntityIntDev;
import amossomaModels.ModelIntDev;
import amossomaRenders.RenderIntDev;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyAmossoma extends CommonProxyAmossoma
{
@Override
public void registerRenderThings()
{
	
MinecraftForgeClient.preloadTexture("/Amossoma/amossomablocks.png");
MinecraftForgeClient.preloadTexture("/Amossoma/amossomaplants.png");
MinecraftForgeClient.preloadTexture("/Amossoma/amossomaweaves.png");
MinecraftForgeClient.preloadTexture("/Amossoma/amossomareef.png");

RenderingRegistry.registerEntityRenderingHandler(EntityIntDev.class, new RenderIntDev(new ModelIntDev(), 0.3F));
}
}