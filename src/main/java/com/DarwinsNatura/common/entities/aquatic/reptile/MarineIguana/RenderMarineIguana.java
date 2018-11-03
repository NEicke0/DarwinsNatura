package com.DarwinsNatura.common.entities.aquatic.reptile.MarineIguana;

import com.DarwinsNatura.common.entities.aquatic.reptile.MarineIguana.layer.LayerMarineIguanaSwimming;
import com.DarwinsNatura.core.Reference;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderMarineIguana extends RenderLiving<EntityMarineIguana> {
	public static final ResourceLocation TEXTURES = new ResourceLocation(
			Reference.MODID + ":textures/entity/aquatic/reptile/miguana.png");
	public static final ResourceLocation NOTHING = new ResourceLocation(
			Reference.MODID + ":textures/entity/nothing.png");

	public RenderMarineIguana(RenderManager manager) {
		super(manager, new ModelMarineIguana(), 0.3F);
		this.addLayer(new LayerMarineIguanaSwimming(this));
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMarineIguana entity) {
		{
			if (entity.isInWater())
				return NOTHING;
			else
				return TEXTURES;
		}
	}

	public static class RenderFactory implements IRenderFactory<EntityMarineIguana> {

		@Override
		public Render<? super EntityMarineIguana> createRenderFor(RenderManager manager) {
			return new RenderMarineIguana(manager);
		}
	}
}
