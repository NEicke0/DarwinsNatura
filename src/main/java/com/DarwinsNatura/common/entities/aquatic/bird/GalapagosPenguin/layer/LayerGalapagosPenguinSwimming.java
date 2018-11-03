package com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.layer;

import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.EntityGalapagosPenguin;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.ModelGalapagosPenguinSwim;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.RenderGalapagosPenguin;
import com.DarwinsNatura.core.Reference;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerGalapagosPenguinSwimming implements LayerRenderer<EntityGalapagosPenguin>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID + ":textures/entity/aquatic/bird/gpenguin.png");
    private final RenderGalapagosPenguin penguinRenderer;
    private final ModelGalapagosPenguinSwim penguinModel = new ModelGalapagosPenguinSwim();

    public LayerGalapagosPenguinSwimming(RenderGalapagosPenguin penguinRendererIn)
    {
        this.penguinRenderer = penguinRendererIn;
    }

    public void doRenderLayer(EntityGalapagosPenguin entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (entitylivingbaseIn.isInWater())
        {
            this.penguinRenderer.bindTexture(TEXTURE);
            this.penguinModel.setModelAttributes(this.penguinRenderer.getMainModel());
            this.penguinModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
    }

    public boolean shouldCombineTextures()
    {
        return false;
    }
}