package com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat;



import com.DarwinsNatura.core.Reference;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderGalapagosRiceRat extends RenderLiving<EntityGalapagosRiceRat>
	{
		public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/terrestrial/rodent/gricerat.png");
		
		public RenderGalapagosRiceRat(RenderManager manager) 
		{
			super(manager, new ModelGalapagosRiceRat(), 0.5F);
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