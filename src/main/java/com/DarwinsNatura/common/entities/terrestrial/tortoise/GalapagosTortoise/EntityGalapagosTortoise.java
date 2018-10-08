package com.DarwinsNatura.common.entities.terrestrial.tortoise.GalapagosTortoise;

import java.util.Random;

import javax.annotation.Nullable;

import com.DarwinsNatura.common.entities.terrestrial.tortoise.EntityTortoiseBase;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityGalapagosTortoise extends EntityTortoiseBase{

	public EntityGalapagosTortoise(World worldIn) {
		super(worldIn);
		this.setSize(1.2F, 1F);
	}
	
	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack ItemOnHand = player.getHeldItem(hand);
		Random random = new Random();
		int num;
		
		if(ItemOnHand.getItem()==Items.WHEAT) {
	        num=random.nextInt(11);
	        if(num==2) {
	        	ItemOnHand.shrink(1);
	        	player.startRiding(this);
	        	return true;
	        }
	        else {
	        	ItemOnHand.shrink(1);
	        	return false;	
	        }
		}
		else {
			return true;	
		}
	}
	
	public boolean canBeSteered() {
	    Entity entity=this.getControllingPassenger();
	    
	    return entity instanceof EntityLivingBase;
	}
	
	@Nullable
	public Entity getControllingPassenger() {
		return this.getPassengers().isEmpty() ? null : (Entity)this.getPassengers().get(0);
	}
	
	public void travel(float strafe, float vertical, float forward)
    {
        if (this.isBeingRidden() && this.canBeSteered())
        {
            EntityLivingBase entitylivingbase = (EntityLivingBase)this.getControllingPassenger();
            this.rotationYaw = entitylivingbase.rotationYaw;
            this.prevRotationYaw = this.rotationYaw;
            this.rotationPitch = entitylivingbase.rotationPitch * 0.5F;
            this.setRotation(this.rotationYaw, this.rotationPitch);
            this.renderYawOffset = this.rotationYaw;
            this.rotationYawHead = this.renderYawOffset;
            strafe = entitylivingbase.moveStrafing * 0.5F;
            forward = entitylivingbase.moveForward;

            if (forward <= 0.0F)
            {
                forward *= 0.25F;            
            }

            this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;

            if (this.canPassengerSteer())
            {
                this.setAIMoveSpeed((float)0.5f);
                super.travel(strafe, vertical, forward);
            }
            else if (entitylivingbase instanceof EntityPlayer)
            {
                this.motionX = 0.0D;
                this.motionY = 0.0D;
                this.motionZ = 0.0D;
            }

            this.prevLimbSwingAmount = this.limbSwingAmount;
            double d1 = this.posX - this.prevPosX;
            double d0 = this.posZ - this.prevPosZ;
            float f2 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;

            if (f2 > 1.0F)
            {
                f2 = 1.0F;
            }

            this.limbSwingAmount += (f2 - this.limbSwingAmount) * 0.4F;
            this.limbSwing += this.limbSwingAmount;
        }
        else
        {
            this.jumpMovementFactor = 0.02F;
            super.travel(strafe, vertical, forward);
        }
    }
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityGalapagosTortoise(this.world);
	}
}

