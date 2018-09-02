package com.DarwinsNatura.common.world.biomes.Galapagos;

import java.util.Random;

import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.EntityGalapagosPenguin;
import com.DarwinsNatura.common.init.DarwinsNaturaBlocks;
import com.DarwinsNatura.common.world.gen.SandPatches;
import com.DarwinsNatura.common.world.gen.plants.WorldGenBushGalapagos;
import com.DarwinsNatura.common.world.gen.rocks.WorldGenGalapagosRocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeGalapagosBeach extends Biome
{
	
	public BiomeGalapagosBeach() {
		super(new BiomeProperties("Galapagos_Beach").setTemperature(0.8F).setRainfall(0F).setBaseHeight(0.11f)
				.setHeightVariation(0f).setWaterColor(0x00FF58));

    
       
        this.spawnableCreatureList.clear();
        this.topBlock = DarwinsNaturaBlocks.BLACK_SAND.getDefaultState();
        this.fillerBlock = DarwinsNaturaBlocks.WHITE_SAND.getDefaultState();
        this.decorator.treesPerChunk = -999;
        this.decorator.deadBushPerChunk = 0;
        this.decorator.reedsPerChunk = 0;
        this.decorator.cactiPerChunk = 0;
        
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityGalapagosPenguin.class, 30, 2, 6));
    }
	
	@Override
    public void decorate(World worldIn, Random rand, BlockPos pos) {
        this.addRocks(worldIn, rand, pos);
        this.addBushes(worldIn, rand, pos);
        this.sandPatches(worldIn, rand, pos);
       
        if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS)) { // no tab for patch
            int i = rand.nextInt(5) - 3;
            i += 2;
            //this.addDoublePlants(worldIn, rand, pos, i);
        }
        super.decorate(worldIn, rand, pos);
    }
	
	public void addRocks(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {
		
		for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                int k = i * 4 + 1 + 8 + p_185379_2_.nextInt(3);
                int l = j * 4 + 1 + 8 + p_185379_2_.nextInt(3);
                BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));
                if (p_185379_2_.nextInt(5) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, new net.minecraft.util.math.ChunkPos(p_185379_3_), blockpos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ROCK)) {
                	WorldGenGalapagosRocks ROCK_GEN = new WorldGenGalapagosRocks(DarwinsNaturaBlocks.VOLCANIC_ROCK, 0);
                	ROCK_GEN.generate(p_185379_1_, p_185379_2_, blockpos2);
                }
            }
		}
	}
	
	public void sandPatches(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {
		
		for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                int k = i * 4 + 1 + 8 + p_185379_2_.nextInt(3);
                int l = j * 4 + 1 + 8 + p_185379_2_.nextInt(3);
                BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));
                if (p_185379_2_.nextInt(1) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, new net.minecraft.util.math.ChunkPos(p_185379_3_), blockpos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.CLAY)) {
                	SandPatches SAND_PATCH = new SandPatches(DarwinsNaturaBlocks.WHITE_SAND, 23);
                	SAND_PATCH.generate(p_185379_1_, p_185379_2_, blockpos2);
                }
            }
		}
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
                    LAVA_GLORY_GEN.generate(p_185379_1_, p_185379_2_, blockpos);
                    
                } else {
                	
                    //addWorldgenBase(p_185379_1_, p_185379_2_, p_185379_3_, blockpos, p_185379_2_);
                    
                }
            }
        }
    }
	
	@SideOnly(Side.CLIENT)
	@Override
	public int getGrassColorAtPos(BlockPos pos) {
		return 0x99ff00;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public int getFoliageColorAtPos(BlockPos pos) {
		return 0x99ff00;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public int getSkyColorByTemp(float currentTemperature) {
		return 0x66ccff;
	}
}
