package com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat;

import com.DarwinsNatura.core.Reference;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGalapagosRiceRat extends RenderLiving<EntityGalapagosRiceRat>
	{
		public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/terrestrial/rodent/gricerat.png");
		
		public RenderGalapagosRiceRat(RenderManager manager) 
		{
			super(manager, new ModelGalapagosRiceRat(), 0.15F);
		}
		
		protected void preRenderCallback(EntityGalapagosRiceRat entitylivingbaseIn, float partialTickTime)
		  {
		    if (entitylivingbaseIn.isBesideClimbableBlock()) {
		      if (entitylivingbaseIn.getHorizontalFacing().equals(EnumFacing.EAST))
		      {
		        GlStateManager.rotate(90.0F, -1.0F, 0.0F, 0.0F);
		        GlStateManager.translate(0.0F, 0.0F, 0.0F);
		      }
		      else if (entitylivingbaseIn.getHorizontalFacing().equals(EnumFacing.WEST))
		      {
		        GlStateManager.rotate(90.0F, -1.0F, 0.0F, 0.0F);
		        GlStateManager.translate(0.0F, 0.0F, -0.4F);
		      }
		      else if (entitylivingbaseIn.getHorizontalFacing().equals(EnumFacing.NORTH))
		      {
		        GlStateManager.rotate(-90.0F, 1.0F, 0.0F, 0.0F);
		        GlStateManager.translate(0.0F, 0.0F, -0.4F);
		      }
		      else if (entitylivingbaseIn.getHorizontalFacing().equals(EnumFacing.SOUTH))
		      {
		        GlStateManager.rotate(-90.0F, 1.0F, 0.0F, 0.0F);
		        GlStateManager.translate(0.0F, 0.0F, -0.4F);
		      }
		    }
		    
		    super.preRenderCallback(entitylivingbaseIn, partialTickTime);
		  }
		
		@Override
		protected ResourceLocation getEntityTexture(EntityGalapagosRiceRat entity) 
		{
			return TEXTURES;
		}
	    public static class RenderFactory implements IRenderFactory<EntityGalapagosRiceRat> {

		      @Override
		      public Render<? super EntityGalapagosRiceRat> createRenderFor(RenderManager manager) {
		            return new RenderGalapagosRiceRat(manager);
		      }   
		}
     }