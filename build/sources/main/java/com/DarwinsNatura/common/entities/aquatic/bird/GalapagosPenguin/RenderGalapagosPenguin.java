package com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin;

import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.layer.LayerSwimming;
import com.DarwinsNatura.core.Reference;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGalapagosPenguin extends RenderLiving<EntityGalapagosPenguin> {
	public static final ResourceLocation TEXTURES = new ResourceLocation(
			Reference.MODID + ":textures/entity/aquatic/bird/gpenguin.png");
	public static final ResourceLocation NOTHING = new ResourceLocation(
			Reference.MODID + ":textures/entity/nothing.png");

	public RenderGalapagosPenguin(RenderManager manager) {
		super(manager, new ModelGalapagosPenguin(), 0.3F);
		this.addLayer(new LayerSwimming(this));
	}
	
	protected void preRenderCallback(EntityGalapagosPenguin entitylivingbaseIn, float partialTickTime)
	{
		if(entitylivingbaseIn.isChild()) {
			GlStateManager.translate(0.0F, 0.17F, 0.0F);
		}
		else {
		    GlStateManager.translate(0.0F, 0.33F, 0.07F);
		}
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityGalapagosPenguin entity) {
		{
			if (entity.isInWater())
				return NOTHING;
			else
				return TEXTURES;
		}
	}

	public static class RenderFactory implements IRenderFactory<EntityGalapagosPenguin> {

		@Override
		public Render<? super EntityGalapagosPenguin> createRenderFor(RenderManager manager) {
			return new RenderGalapagosPenguin(manager);
		}
	}
}
