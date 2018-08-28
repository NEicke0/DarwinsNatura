package com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.layer;

import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.EntityGalapagosPenguin;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.ModelGalapagosPenguinSwim;
import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.RenderGalapagosPenguin;
import com.DarwinsNatura.core.Reference;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerSwimming implements LayerRenderer<EntityGalapagosPenguin>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID + ":textures/entity/aquatic/bird/gpenguin.png");
    private final RenderGalapagosPenguin penguinRenderer;
    private final ModelGalapagosPenguinSwim penguinModel = new ModelGalapagosPenguinSwim(0.5F);

    public LayerSwimming(RenderGalapagosPenguin penguinRendererIn)
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