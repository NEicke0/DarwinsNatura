package com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk;

import com.DarwinsNatura.common.entities.flying.bird.GalapagosHawk.layer.LayerGalapagosHawk;
import com.DarwinsNatura.core.Reference;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGalapagosHawk extends RenderLiving<EntityGalapagosHawk> {
	public static final ResourceLocation TEXTURES = new ResourceLocation(
			Reference.MODID + ":textures/entity/flying/bird/ghawk.png");
	public static final ResourceLocation NOTHING = new ResourceLocation(
			Reference.MODID + ":textures/entity/nothing.png");

	public RenderGalapagosHawk(RenderManager manager) {
		super(manager, new ModelGalapagosHawk(), 0.3F);
		this.addLayer(new LayerGalapagosHawk(this));
	}
	
	protected void preRenderCallback(EntityGalapagosHawk entitylivingbaseIn, float partialTickTime)
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
	protected ResourceLocation getEntityTexture(EntityGalapagosHawk entity) {
		{
			if ((!entity.isInWater() && !entity.onGround) || entity.isHunting())
				return NOTHING;
			else
				return TEXTURES;
		}
	}

	public static class RenderFactory implements IRenderFactory<EntityGalapagosHawk> {

		@Override
		public Render<? super EntityGalapagosHawk> createRenderFor(RenderManager manager) {
			return new RenderGalapagosHawk(manager);
		}
	}
}

