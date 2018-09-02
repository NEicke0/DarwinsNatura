package com.DarwinsNatura.common.entities.flying.bird;

import com.DarwinsNatura.common.entities.EntityGender;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityBirdBase extends EntityGender{
	
	  private BlockPos posB;
	  private boolean fly = true;
	  public boolean sit = true;
	  public boolean stand = false;
	  private int sitNum;
	  private int standNum;
	  protected int chanceOfLanding = 150;
	
	public EntityBirdBase(World worldIn) {
        super(worldIn);
    }
	
	public boolean getWaterBelow(World world, int x, int z){
	    int y = 255;
	    boolean foundGround = false;
	    while (y-- >= 0)
	    {
	      IBlockState blockAt = world.getBlockState(new BlockPos(x, y, z));
	      if ((world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.WATER) || (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.LAVA) || (blockAt.getMaterial() == Material.WATER) || (blockAt.getMaterial() == Material.LAVA)) {
	        return true;
	      }
	    }
	    return false;
	}
	
	  public void onLivingUpdate()
	  {
	    if (!getWaterBelow(this.world, (int)this.posX, (int)this.posZ))
	    {
	      if ((!isInWater()))
	      {
	        if ((this.sitNum != 40) || (this.standNum != 40))
	        {
	          this.standNum = (this.rand.nextInt(this.chanceOfLanding) + 1);
	          this.sitNum = (this.rand.nextInt(this.chanceOfLanding) + 1);
	        }
	        else
	        {
	          this.standNum = (this.rand.nextInt(this.chanceOfLanding) + 1);
	          this.sitNum = (this.rand.nextInt(this.chanceOfLanding) + 1);
	        }
	        if (this.sitNum == 40)
	        {
	          this.sit = true;
	          this.stand = false;
	        }
	        else if ((this.sit) && (this.standNum == 40))
	        {
	          this.stand = true;
	          this.sit = false;
	        }
	      }
	    }
	    else
	    {
	      this.stand = true;
	      this.sit = false;
	    }
	    super.onLivingUpdate();
	  }
	  
	  public void onUpdate()
	  {
	    if ((this.stand) && (!isChild())){
	      int i = this.rand.nextInt(60) + 1;
	      if (i >= 40) {
	        this.motionX = (this.motionY = this.motionZ = 0.0D);
	      }
	    }
	    super.onUpdate();
	  }
	
	protected void updateAITasks()
	  {
	    super.updateAITasks();
	    if ((this.stand) && (!isChild())){
	      if (this.fly)
	      {
	        if ((this.posB != null) && ((!this.world.isAirBlock(this.posB)) || (this.posB.getY() < 1))) {
	          this.posB = null;
	        }
	        if ((this.posB == null) || (this.rand.nextInt(30) == 0) || (this.posB.distanceSq((int)this.posX, (int)this.posY, (int)this.posZ) < 4.0D)) {
	          this.posB = new BlockPos((int)this.posX + this.rand.nextInt(57) - this.rand.nextInt(57), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(57) - this.rand.nextInt(57));
	        }
	        double d0 = this.posB.getX() + 0.5D - this.posX;
	        double d1 = this.posB.getY() + 0.1D - this.posY;
	        double d2 = this.posB.getZ() + 0.5D - this.posZ;
	        this.motionX += (Math.signum(d0) * 0.5D - this.motionX) * 0.20000000149011612D;
	        this.motionY += (Math.signum(d1) * 0.799999988079071D - this.motionY) * 0.10000000149011612D;
	        this.motionZ += (Math.signum(d2) * 0.5D - this.motionZ) * 0.20000000149011612D;
	        float f = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / 3.141592653589793D) - 90.0F;
	        float f1 = MathHelper.wrapDegrees(f - this.rotationYaw);
	        this.moveForward = 0.5F;
	        this.rotationYaw += f1;
	      }
	      else
	      {
	        this.moveForward = 0.5F;
	        this.motionX = (this.motionY = this.motionZ = 0.0D);
	        float f = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / 3.141592653589793D) - 90.0F;
	        float f1 = MathHelper.wrapDegrees(f - this.rotationYaw);
	        this.rotationYaw += f1;
	      }
	    }
	  }
	
	public boolean isElytraFlying(){
	    return (this.world.isAirBlock(new BlockPos(this.posX, this.posY - 1.0D, this.posZ))) && (!isChild());
	}
	
	protected void applyEntityAttributes() {
	    super.applyEntityAttributes();
	    getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
	    getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	}
	
	public void fall(float distance, float damageMultiplier) {
		
	}
}
