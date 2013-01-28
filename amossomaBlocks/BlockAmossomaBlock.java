package amossomaBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAmossomaBlock extends Block
{
	public BlockAmossomaBlock(int id, int texture) 
	{
		super(id, texture, Material.air);
	}

	public BlockAmossomaBlock(int id, int texture, Material material) 
	{
		super(id, texture, material);
	}

	public int[] GetProperties()
	{
		int[] result = {  };
		return result;
	}
	
	public void SetProperties(int[] arg1)
	{
	}
}
