package com.DarwinsNatura.common.blocks;

import java.util.Random;

import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.init.DarwinsNaturaItems;
import com.DarwinsNatura.core.Main;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockVolcanicRock extends Block{
	
	public BlockVolcanicRock(String name){
		super(Material.ROCK);
		this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Main.AMERICAS);
        DarwinsNaturaBlocks.BLOCKS.add(this);
        DarwinsNaturaItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setHardness(1.1F);
        setHarvestLevel("pickaxe", 1);
        setSoundType(SoundType.STONE);
        this.setTickRandomly(true);
	}

	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
        if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase)entityIn))
        {
            entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 0.5F);
        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }
	
	 protected void checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state){
	       this.dropBlockAsItem(worldIn, pos, state, 0);
	       worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	 }
	 
	 @SideOnly(Side.CLIENT)
	 public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	    {
	        super.randomDisplayTick(stateIn, worldIn, pos, rand);

	        if (rand.nextInt(10) == 0)
	        {
	            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)((float)pos.getX() + rand.nextFloat()), (double)((float)pos.getY() + 1.1F), (double)((float)pos.getZ() + rand.nextFloat()), 0.0D, 0.0D, 0.0D);
	        }
	        }
	 
	 @Override
	 public int tickRate(World world) {
			return 7;
	 }
	 
	 public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        BlockPos blockpos = pos.up();
	        IBlockState iblockstate = worldIn.getBlockState(blockpos);

	        if (iblockstate.getBlock() == Blocks.WATER || iblockstate.getBlock() == Blocks.FLOWING_WATER)
	        {
	            worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

	            if (worldIn instanceof WorldServer)
	            {
	            	if(rand.nextInt(2)==1) {
	            		((WorldServer)worldIn).spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.25D, (double)blockpos.getZ() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D);
	            	}
	            	
	            }
	        }
	    }
}
