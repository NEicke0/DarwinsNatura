package com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat;

import com.DarwinsNatura.core.Reference;

import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGalapagosRiceRat extends RenderLiving<EntityGalapagosRiceRat>
{
    private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID+":textures/entity/terrestrial/rodent/gricerat");

    public RenderGalapagosRiceRat(RenderManager p_i47210_1_, ModelGalapagosRiceRat modelGalapagosRiceRat, float f)
    {
        super(p_i47210_1_, new ModelGalapagosRiceRat(), 0.7F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityGalapagosRiceRat entity)
    {
        return TEXTURES;
    }
}