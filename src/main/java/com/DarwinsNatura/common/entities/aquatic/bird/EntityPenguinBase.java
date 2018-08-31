package com.DarwinsNatura.common.entities.aquatic.bird;

import com.DarwinsNatura.common.entities.EntityGender;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityLookHelper;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public abstract class EntityPenguinBase extends EntityGender{
	
    private static final DataParameter<Boolean> MOVING = EntityDataManager.<Boolean>createKey(EntityPenguinBase.class, DataSerializers.BOOLEAN);
    private EntityLivingBase targetedEntity;
    private int clientSideAttackTime;
    private boolean clientSideTouchedGround;
    protected EntityAIWander wander;
    private EntityPenguinBase.GuardianMoveHelper moveHelpCross = new EntityPenguinBase.GuardianMoveHelper(this);
    private EntityMoveHelper helpMove = new EntityMoveHelper(this);;

    public EntityPenguinBase(World worldIn)
    {
        super(worldIn);
        setPathPriority(net.minecraft.pathfinding.PathNodeType.WATER, 0.0F);
        this.getNavigator().getNodeProcessor().setCanSwim(true);
    }
    
	@Override
	public boolean shouldDismountInWater(Entity rider) {
		return false;
	}
    
	@Override
	public boolean canRiderInteract() {
		return true;
	}
	
    protected void initEntityAI()
    {
    	super.initEntityAI();
		this.tasks.addTask(0, new EntityAIWander(this, 1D));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.3D));
		this.tasks.addTask(2, new EntityAIMate(this, 1D));
		this.tasks.addTask(1, new EntityAIFollowParent(this, 1D));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(3, new EntityAIAvoidEntity<EntityPlayer>(this, EntityPlayer.class, 10.0F, 0.30D, 0.30D));
		this.tasks.addTask(7, new EntityAILookIdle(this));
    }
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
    }

    /**
     * nani
     */
    protected PathNavigate createNavigator(World worldIn)
    {
        return this.isInWater() ? new PathNavigateSwimmer(this, worldIn) : super.createNavigator(worldIn);
    }

    public void entityInit()
    {
        super.entityInit();
        this.dataManager.register(MOVING, Boolean.valueOf(false));
    }
    
    public boolean isMoving()
    {
        return ((Boolean)this.dataManager.get(MOVING)).booleanValue();
    }

    public void setMoving(boolean moving)
    {
        this.dataManager.set(MOVING, Boolean.valueOf(moving));
    }

    public int getTalkInterval()
    {
        return super.getTalkInterval();
    }

    protected boolean canTriggerWalking()
    {
        return false;
    }

    public float getEyeHeight()
    {
        return this.height * 0.5F;
    }

    public float getBlockPathWeight(BlockPos pos)
    {
        return this.world.getBlockState(pos).getMaterial() == Material.WATER ? 10.0F + this.world.getLightBrightness(pos) - 0.5F : super.getBlockPathWeight(pos);
    }

    public void onLivingUpdate()
    {
    	if(this.inWater) {
    		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6D);
            this.moveHelper = moveHelpCross;
	        if (this.world.isRemote)
	        {
	            if (!this.isInWater())
	            {
	                this.clientSideTouchedGround = this.motionY < 0.0D && this.world.isBlockNormalCube((new BlockPos(this)).down(), false);
	            }
	        }
	
	        if (this.inWater)
	        {
	            this.setAir(300);
	        }
    	}
    	else {
            this.moveHelper = helpMove;
    	}

        super.onLivingUpdate();
    }

    protected boolean isValidLightLevel()
    {
        return true;
    }

    public boolean isNotColliding()
    {
        return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this) && this.world.getCollisionBoxes(this, this.getEntityBoundingBox()).isEmpty();
    }

    public boolean getCanSpawnHere()
    {
        return super.getCanSpawnHere();
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (!this.isMoving() && !source.isMagicDamage() && source.getImmediateSource() instanceof EntityLivingBase)
        {
            EntityLivingBase entitylivingbase = (EntityLivingBase)source.getImmediateSource();

            if (!source.isExplosion())
            {
                entitylivingbase.attackEntityFrom(DamageSource.causeThornsDamage(this), 2.0F);
            }
        }

        if (this.wander != null)
        {
            this.wander.makeUpdate();
        }

        return super.attackEntityFrom(source, amount);
    }

    public int getVerticalFaceSpeed()
    {
        return 180;
    }

    public void travel(float p_191986_1_, float p_191986_2_, float p_191986_3_)
    {
        if (this.isServerWorld() && this.isInWater())
        {
            this.moveRelative(p_191986_1_, p_191986_2_, p_191986_3_, 0.1F);
            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.8999999761581421D;
            this.motionY *= 0.8999999761581421D;
            this.motionZ *= 0.8999999761581421D;
            
            if(this.motionX == 0 && this.motionZ == 0) {
        		this.motionX = MathHelper.sin(-this.rotationYaw * 0.017453292F) * 0.4F;
    			this.motionZ = MathHelper.cos(this.rotationYaw * 0.017453292F) * 0.4F;
            }
            
            if (!this.isMoving() && this.getAttackTarget() == null)
            {
                this.motionY += 0.001D;
            }
        }
        else
        {
            super.travel(p_191986_1_, p_191986_2_, p_191986_3_);
        }
    }

    /**
     * this is literally stolen from the fucking guardian Ill admit but the other stuff I modified
     */
    static class GuardianMoveHelper extends EntityMoveHelper
        {
            private final EntityPenguinBase entityGuardian;

            public GuardianMoveHelper(EntityPenguinBase Swimmer)
            {
                super(Swimmer);
                this.entityGuardian = Swimmer;
            }

            public void onUpdateMoveHelper()
            {
                if (!this.entityGuardian.getNavigator().noPath())
                {
                    double d0 = this.posX - this.entityGuardian.posX;
                    double d1 = this.posY - this.entityGuardian.posY;
                    double d2 = this.posZ - this.entityGuardian.posZ;
                    double d3 = (double)MathHelper.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                    d1 = d1 / d3;
                    float f = (float)(MathHelper.atan2(d2, d0) * (180D / Math.PI)) - 90.0F;
                    this.entityGuardian.rotationYaw = this.limitAngle(this.entityGuardian.rotationYaw, f, 90.0F);
                    this.entityGuardian.renderYawOffset = this.entityGuardian.rotationYaw;
                    float f1 = (float)(this.speed * this.entityGuardian.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue());
                    this.entityGuardian.setAIMoveSpeed(this.entityGuardian.getAIMoveSpeed() + (f1 - this.entityGuardian.getAIMoveSpeed()) * 0.125F);
                    double d4 = Math.sin((double)(this.entityGuardian.ticksExisted + this.entityGuardian.getEntityId()) * 0.5D) * 0.05D;
                    double d5 = Math.cos((double)(this.entityGuardian.rotationYaw * (float)Math.PI / 180.0F));
                    double d6 = Math.sin((double)(this.entityGuardian.rotationYaw * (float)Math.PI / 180.0F));
                    this.entityGuardian.motionX += d4 * d5;
                    this.entityGuardian.motionZ += d4 * d6;
                    d4 = Math.sin((double)(this.entityGuardian.ticksExisted + this.entityGuardian.getEntityId()) * 0.75D) * 0.05D;
                    this.entityGuardian.motionY += d4 * (d6 + d5) * 0.25D;
	                this.entityGuardian.motionY += (double)this.entityGuardian.getAIMoveSpeed() * d1 * 0.1D;
                    EntityLookHelper entitylookhelper = this.entityGuardian.getLookHelper();
                    double d7 = this.entityGuardian.posX + d0 / d3 * 2.0D;
                    double d8 = (double)this.entityGuardian.getEyeHeight() + this.entityGuardian.posY + d1 / d3;
                    double d9 = this.entityGuardian.posZ + d2 / d3 * 2.0D;
                    double d10 = entitylookhelper.getLookPosX();
                    double d11 = entitylookhelper.getLookPosY();
                    double d12 = entitylookhelper.getLookPosZ();
                    
                    if (!entitylookhelper.getIsLooking())
                    {
                        d10 = d7;
                        d11 = d8;
                        d12 = d9;
                    }

                    this.entityGuardian.getLookHelper().setLookPosition(d10 + (d7 - d10) * 0.125D, d11 + (d8 - d11) * 0.125D, d12 + (d9 - d12) * 0.125D, 10.0F, 40.0F);
                    this.entityGuardian.setMoving(true);
                }
                else
                {
                	 this.entityGuardian.setAIMoveSpeed(0.0F);
                     this.entityGuardian.setMoving(false);
                }
            }
        }
    
    public boolean canBreatheUnderwater()
    {
        return true;
    }
}