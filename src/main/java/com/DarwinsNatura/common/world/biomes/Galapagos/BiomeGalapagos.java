package com.DarwinsNatura.common.world.biomes.Galapagos;

import java.util.Random;

import com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.EntityGalapagosHawk;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.world.gen.plants.WorldGenBushGalapagos;
import com.DarwinsNatura.common.world.gen.rocks.WorldGenGalapagosRocks;
import com.DarwinsNatura.common.world.gen.trees.WorldGenTreesGalapagosFern;
import com.DarwinsNatura.common.world.gen.trees.WorldGenTreesScalesia;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeGalapagos extends Biome{
	
	private static final WorldGenTreesScalesia TREE = new WorldGenTreesScalesia(false);
	private static final WorldGenTreesGalapagosFern TREE2 = new WorldGenTreesGalapagosFern(false, false);
	public static short biomeWeight;

	public BiomeGalapagos() {
		super(new BiomeProperties("Galapagos_Islands").setTemperature(0.8F).setRainfall(0.6F).setBaseHeight(0.5f)
				.setHeightVariation(0f).setWaterColor(0x00FF99));

		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();

		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.decorator.generateFalls = false;
		this.decorator.treesPerChunk = 1;
		this.decorator.flowersPerChunk = 4;
		this.decorator.grassPerChunk = 20;
		this.decorator.mushroomsPerChunk = -999;
		this.decorator.sandPatchesPerChunk = 2;
		
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityGalapagosRiceRat.class, 30, 2, 4));
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityGalapagosHawk.class, 20, 1, 2));
	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{		
		if(rand.nextInt(2)==1) {
			return TREE;
		}
		else {
			return TREE2;
		}
	}
	

	@Override
	public int getGrassColorAtPos(BlockPos pos) {
		return getModdedBiomeGrassColor(0xA7E140);
	}

	@Override
	public int getFoliageColorAtPos(BlockPos pos) {
		return getModdedBiomeFoliageColor(0x88E140);
	}
	
	@Override
    public void decorate(World worldIn, Random rand, BlockPos pos) {
        this.addBushes(worldIn, rand, pos);
        //this.addRocks(worldIn, rand, pos);
       
        if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS)) { // no tab for patch
            int i = rand.nextInt(5) - 3;
            i += 2;
            //this.addDoublePlants(worldIn, rand, pos, i);
        }
        super.decorate(worldIn, rand, pos);
    }
	
	
	public void addBushes(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                int k = i * 4 + 1 + 8 + p_185379_2_.nextInt(3);
                int l = j * 4 + 1 + 8 + p_185379_2_.nextInt(3);
                BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));

                if (p_185379_2_.nextInt(20) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, new net.minecraft.util.math.ChunkPos(p_185379_3_), blockpos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE)) {
                    WorldGenBushGalapagos LAVA_GLORY_GEN = new WorldGenBushGalapagos(DarwinsNaturaBlocks.LAVA_MORNING_GLORY);
                    WorldGenBushGalapagos MICONIA_GEN = new WorldGenBushGalapagos(DarwinsNaturaBlocks.MICONIA_SHRUB);
                    //LAVA_GLORY_GEN.generate(p_185379_1_, p_185379_2_, blockpos);
                    MICONIA_GEN.generate(p_185379_1_, p_185379_2_, blockpos2);
                    
                } else {
                	
                    addWorldgenBase(p_185379_1_, p_185379_2_, p_185379_3_, blockpos, p_185379_2_);
                    
                }
            }
        }
    }
	
	public void addRocks(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {
		
		for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                int k = i * 4 + 1 + 8 + p_185379_2_.nextInt(3);
                int l = j * 4 + 1 + 8 + p_185379_2_.nextInt(3);
                BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));
                if (p_185379_2_.nextInt(27) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, new net.minecraft.util.math.ChunkPos(p_185379_3_), blockpos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ROCK)) {
                	WorldGenGalapagosRocks ROCK_GEN = new WorldGenGalapagosRocks(DarwinsNaturaBlocks.VOLCANIC_ROCK, 0);
                	ROCK_GEN.generate(p_185379_1_, p_185379_2_, blockpos2);
                }
            }
		}
	}
	
	//Just a placeholder for now
	private void addWorldgenBase(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_, BlockPos blockpos, Random rand) {
        if (net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, new net.minecraft.util.math.ChunkPos(p_185379_3_), blockpos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE)) {
        	if(rand.nextInt(9)==1) {
        	WorldGenAbstractTree worldgenabstracttree = this.getRandomTreeFeature(p_185379_2_);
            worldgenabstracttree.setDecorationDefaults();

            if (worldgenabstracttree.generate(p_185379_1_, p_185379_2_, blockpos)) {
                worldgenabstracttree.generateSaplings(p_185379_1_, p_185379_2_, blockpos);
            }
        }
        }
    }
	
}
