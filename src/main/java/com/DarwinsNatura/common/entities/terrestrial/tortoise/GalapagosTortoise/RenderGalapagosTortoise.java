package com.DarwinsNatura.common.entities.terrestrial.tortoise.GalapagosTortoise;

import com.DarwinsNatura.core.Reference;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGalapagosTortoise extends RenderLiving<EntityGalapagosTortoise>
	{
		public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/terrestrial/tortoise/gtortoise.png");
		
		public RenderGalapagosTortoise(RenderManager manager) 
		{
			super(manager, new ModelGalapagosTortoise(), 0.9F);
		}
		
		@Override
		protected ResourceLocation getEntityTexture(EntityGalapagosTortoise entity) 
		{
			return TEXTURES;
		}
	    public static class RenderFactory implements IRenderFactory<EntityGalapagosTortoise> {

		      @Override
		      public Render<? super EntityGalapagosTortoise> createRenderFor(RenderManager manager) {
		            return new RenderGalapagosTortoise(manager);
		      }   
		}
     }