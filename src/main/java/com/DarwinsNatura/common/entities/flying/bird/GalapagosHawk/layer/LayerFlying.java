package com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.layer;

import com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.EntityGalapagosHawk;
import com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.ModelGalapagosHawkFlying;
import com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.RenderGalapagosHawk;
import com.DarwinsNatura.core.Reference;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerFlying implements LayerRenderer<EntityGalapagosHawk>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID + ":textures/entity/flying/bird/ghawk.png");
    private final RenderGalapagosHawk hawkRenderer;
    private final ModelGalapagosHawkFlying hawkModel = new ModelGalapagosHawkFlying();

    public LayerFlying(RenderGalapagosHawk hawkRendererIn)
    {
        this.hawkRenderer = hawkRendererIn;
    }

    public void doRenderLayer(EntityGalapagosHawk entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInWater() && !entitylivingbaseIn.onGround)
        {
            this.hawkRenderer.bindTexture(TEXTURE);
            this.hawkModel.setModelAttributes(this.hawkRenderer.getMainModel());
            this.hawkModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
    }

    public boolean shouldCombineTextures()
    {
        return false;
    }
}
