package amossomaBlocks;

import java.util.Random;

import amossomaAllTabs.AmossomaAllTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockImpulseBlock extends Block
{
	public BlockImpulseBlock(int id, int texture) 
	{
		super(id, texture, Material.anvil);
        this.setTickRandomly(true);
		this.setCreativeTab(AmossomaAllTabs.AmossomaBlocksTab);
	}

	public String getTextureFile()
	{
		return "/Amossoma/amossomablocks.png";
	}

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
    	//this is what controls if you can walk through the plant
        return true;
    }

}
