package com.DarwinsNatura.world.biomes.Galapagos;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class BiomeGalapagos extends Biome {

	public static final int[] DEFAULT_FLOWER_META = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

	
	public static Biome GALAPAGOSBEACH = new BiomeGalapagosBeach((new Biome.BiomeProperties("GALAPAGOS_BEACH")).setBaseHeight(-0.1F).setHeightVariation(0.1F).setTemperature(1.5F).setRainfall(1.25F)).setRegistryName("galapagos_beach");
	public static Biome GALAPAGOSPLAINS = new BiomeGalapagosPlains((new Biome.BiomeProperties("GALAPAGOS_PLAINS")).setBaseHeight(-0.1F).setHeightVariation(0.1F).setTemperature(1.5F).setRainfall(1.25F)).setRegistryName("galapagos_plains");

	public static boolean DISABLEDECORATION = false;

	public static void registerBiomes() {
		ForgeRegistries.BIOMES.register(GALAPAGOSBEACH);
		ForgeRegistries.BIOMES.register(GALAPAGOSPLAINS);
	}
	

	public BiomeGalapagos(BiomeProperties properties) {
		super(properties);

		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableWaterCreatureList.clear();

		
	}

	@Override
	public void decorate(World world, Random rand, BlockPos pos) {
		this.decorator.decorate(world, rand, this, pos);
	}

	

	@Override
	public float getSpawningChance() {
		return super.getSpawningChance();//0.2F;
	}
}
