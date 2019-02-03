package com.DarwinsNatura.common.entities.terrestrial.bird.booby;

import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.EntityGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.ModelGalapagosRiceRat;
import com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat.RenderGalapagosRiceRat;
import com.DarwinsNatura.core.Reference;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBFBooby extends RenderLiving<EntityBlueFootedBooby>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/terrestrial/bird/bf_booby.png");
	
	public RenderBFBooby(RenderManager manager) 
	{
		super(manager, new ModelBlueFootedBooby(), 0.55F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBlueFootedBooby entity) {
		return TEXTURES;
	}
	
	public static class RenderFactory implements IRenderFactory<EntityBlueFootedBooby> {

	      @Override
	      public Render<? super EntityBlueFootedBooby> createRenderFor(RenderManager manager) {
	            return new RenderBFBooby(manager);
	      }   
	}

}
