package com.DarwinsNatura.common.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityGender extends EntityAnimal {

    protected static final DataParameter<Integer> GENDER = EntityDataManager.<Integer>createKey(EntityGender.class, DataSerializers.VARINT);

    public EntityGender(World worldIn) {
        super(worldIn);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        this.setGender(this.getRNG().nextInt(2));
        return super.onInitialSpawn(difficulty, livingdata);
    }

    public void entityInit() {
        super.entityInit();
        this.dataManager.register(GENDER, Integer.valueOf(0));
    }

    public void writeEntityToNBT(NBTTagCompound tagCompound) {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setInteger("Gender", this.getGender());
    }

    public void readEntityFromNBT(NBTTagCompound tagCompound) {
        super.readEntityFromNBT(tagCompound);
        this.setGender(tagCompound.getInteger("Gender"));
    }

    public int getGender() {
        return this.dataManager.get(GENDER);
    }

    public void setGender(int value) {
        this.dataManager.set(GENDER, Integer.valueOf(value));
    }

    public enum Gender {
        MALE(0), FEMALE(1);
        
        EntityGender entity;

        private Gender(int valueln){
            valueln = entity.getGender();
        }
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return new EntityGender(this.world);
    }

}
