package com.DarwinsNatura.common.entities.aquatic.reptile.MarineIguana.layer;

import com.DarwinsNatura.common.entities.aquatic.reptile.MarineIguana.EntityMarineIguana;
import com.DarwinsNatura.common.entities.aquatic.reptile.MarineIguana.ModelMarineIguanaSwim;
import com.DarwinsNatura.common.entities.aquatic.reptile.MarineIguana.RenderMarineIguana;
import com.DarwinsNatura.core.Reference;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerMarineIguanaSwimming implements LayerRenderer<EntityMarineIguana>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID + ":textures/entity/aquatic/reptile/miguana.png");
    private final RenderMarineIguana iguanaRenderer;
    private final ModelMarineIguanaSwim iguanaModel = new ModelMarineIguanaSwim();

    public LayerMarineIguanaSwimming(RenderMarineIguana penguinRendererIn)
    {
        this.iguanaRenderer = penguinRendererIn;
    }

    public void doRenderLayer(EntityMarineIguana entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (entitylivingbaseIn.isInWater())
        {
            this.iguanaRenderer.bindTexture(TEXTURE);
            this.iguanaModel.setModelAttributes(this.iguanaRenderer.getMainModel());
            this.iguanaModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
    }

    public boolean shouldCombineTextures()
    {
        return false;
    }
}