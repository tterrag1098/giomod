package giomod.blocks.ores;

import giomod.GioMod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockCopperOre extends Block 
{

	public BlockCopperOre(int par1, String par2) 
	{
		super(par1, Material.rock);
		setCreativeTab(GioMod.GioTab);
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return this.blockID;
	}

	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	public void registerIcons(IconRegister Par1)
	{
		blockIcon = Par1.registerIcon("giomod:copperore");
	}
}