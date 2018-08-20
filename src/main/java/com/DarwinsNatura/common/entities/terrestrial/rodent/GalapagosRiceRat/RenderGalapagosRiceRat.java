package com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat;



import com.DarwinsNatura.core.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGalapagosRiceRat extends RenderLiving<EntityGalapagosRiceRat>
{
	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID+":textures/entity/terrestrial/rodent/gricerat.png");
   


    public RenderGalapagosRiceRat(RenderManager p_i47203_1_, ModelGalapagosRiceRat modelGalapagosRiceRat, float f)
    {
        super(p_i47203_1_, new ModelGalapagosRiceRat(), 0.3F);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(EntityGalapagosRiceRat entity) {
              return TEXTURES;
          }
    }