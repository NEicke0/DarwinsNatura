package com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin;

import com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin.layer.LayerSwimming;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.RenderGalapagosRiceRat;
import com.DarwinsNatura.core.Reference;

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
		super(manager, new ModelGalapagosPenguin(), 0.15F);
		this.addLayer(new LayerSwimming(this));
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
