package amossomaDimension;

import amossoma.Amossoma;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderAmossoma extends WorldProvider
{
public void registerWorldChunkManager()
{
this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.river, 0.8F, 0.1F);
this.dimensionId = AmossomaDimesion.dimension;
}
public String getDimensionName() 
{
return "Amossoma";
}

public boolean canRespawnHere()
{
return true;
}

public String getSaveFolder()
{
    return "Custom Dimension Amossoma Folder";
}
/**
public double getMovementFactor()
{
return 20.0;
}
*/
@Override
public IChunkProvider createChunkGenerator()
{
return new ChunkProviderAmossoma(worldObj, worldObj.getSeed(), true);
}
}