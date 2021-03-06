package com.DarwinsNatura.common.entities.aquatic.reptile.MarineIguana;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * MarineIguana - MarineNeicke
 * Created using Tabula 7.0.0
 */
public class ModelMarineIguanaSwim extends AdvancedModelBase {
    public AdvancedModelRenderer Body;
    public AdvancedModelRenderer TailBase;
    public AdvancedModelRenderer Body2;
    public AdvancedModelRenderer shape19;
    public AdvancedModelRenderer Tail;
    public AdvancedModelRenderer Thingy;
    public AdvancedModelRenderer shape35;
    public AdvancedModelRenderer shape35_1;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer shape19_1;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer shape19_2;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer shape19_3;
    public AdvancedModelRenderer shape19_4;
    public AdvancedModelRenderer shape19_5;
    public AdvancedModelRenderer shape19_6;
    public AdvancedModelRenderer shape19_7;
    public AdvancedModelRenderer shape44;
    public AdvancedModelRenderer shape36;
    public AdvancedModelRenderer shape36_1;
    public AdvancedModelRenderer shape36_2;
    public AdvancedModelRenderer shape36_3;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer shape19_8;
    public AdvancedModelRenderer LeftArm;
    public AdvancedModelRenderer RightArm;
    public AdvancedModelRenderer shape5;
    public AdvancedModelRenderer Neck2;
    public AdvancedModelRenderer shape19_9;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer shape19_10;
    public AdvancedModelRenderer shape5_1;
    public AdvancedModelRenderer shape12;
    public AdvancedModelRenderer shape12_1;
    public AdvancedModelRenderer Mouth;
    public AdvancedModelRenderer shape19_11;
    public AdvancedModelRenderer shape16;
    public AdvancedModelRenderer shape16_1;
    public AdvancedModelRenderer shape14;
    public AdvancedModelRenderer shape44_1;
    public AdvancedModelRenderer shape44_2;
    public AdvancedModelRenderer shape44_3;
    public AdvancedModelRenderer shape30;
    public AdvancedModelRenderer shape30_1;
    public AdvancedModelRenderer shape30_2;
    public AdvancedModelRenderer shape30_3;
    public AdvancedModelRenderer shape44_4;

    public ModelMarineIguanaSwim() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Tail3 = new AdvancedModelRenderer(this, 44, 60);
        this.Tail3.setRotationPoint(0.0F, 0.5F, 8.5F);
        this.Tail3.addBox(-2.0F, 0.0F, -1.4F, 4, 5, 11, 0.0F);
        this.shape12_1 = new AdvancedModelRenderer(this, 11, 85);
        this.shape12_1.setRotationPoint(0.0F, -4.0F, -0.1F);
        this.shape12_1.addBox(-1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape12_1, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape30_2 = new AdvancedModelRenderer(this, 80, 14);
        this.shape30_2.setRotationPoint(0.0F, 5.3F, 0.0F);
        this.shape30_2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(shape30_2, 0.5009094953223726F, 0.0F, -0.4553564018453205F);
        this.shape36 = new AdvancedModelRenderer(this, 100, 11);
        this.shape36.setRotationPoint(-1.5F, -1.0F, -6.2F);
        this.shape36.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(shape36, 0.0F, 0.31869712141416456F, -0.091106186954104F);
        this.shape44_2 = new AdvancedModelRenderer(this, 116, 99);
        this.shape44_2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.shape44_2.addBox(0.0F, -5.0F, -1.5F, 0, 5, 3, 0.0F);
        this.shape19_1 = new AdvancedModelRenderer(this, 96, 69);
        this.shape19_1.setRotationPoint(0.0F, -0.5F, 0.3F);
        this.shape19_1.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.shape44 = new AdvancedModelRenderer(this, 111, 110);
        this.shape44.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.shape44.addBox(0.0F, -5.0F, -3.0F, 0, 5, 6, 0.0F);
        this.shape19_3 = new AdvancedModelRenderer(this, 68, 39);
        this.shape19_3.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.shape19_3.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.shape19_7 = new AdvancedModelRenderer(this, 85, 35);
        this.shape19_7.setRotationPoint(0.0F, 0.0F, 8.7F);
        this.shape19_7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Neck2 = new AdvancedModelRenderer(this, 0, 59);
        this.Neck2.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Neck2.addBox(-2.5F, -3.0F, -6.0F, 5, 3, 6, 0.0F);
        this.setRotateAngle(Neck2, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape12 = new AdvancedModelRenderer(this, 0, 84);
        this.shape12.setRotationPoint(0.0F, -3.0F, -2.2F);
        this.shape12.addBox(-1.5F, -4.0F, -1.0F, 3, 4, 1, 0.0F);
        this.Body = new AdvancedModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 14.5F, 2.4F);
        this.Body.addBox(-4.5F, -4.5F, -6.5F, 9, 9, 13, 0.0F);
        this.setRotateAngle(Body, -0.045553093477052F, 0.0F, 0.0F);
        this.shape16_1 = new AdvancedModelRenderer(this, 0, 92);
        this.shape16_1.setRotationPoint(0.01F, 0.0F, 1.0F);
        this.shape16_1.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(shape16_1, -0.5462880558742251F, 0.0F, 0.0F);
        this.shape30_1 = new AdvancedModelRenderer(this, 80, 24);
        this.shape30_1.setRotationPoint(0.0F, 5.0F, -1.3F);
        this.shape30_1.addBox(-1.5F, 0.0F, -0.5F, 3, 1, 3, 0.0F);
        this.setRotateAngle(shape30_1, 0.091106186954104F, 0.0F, 0.0F);
        this.shape5 = new AdvancedModelRenderer(this, 27, 48);
        this.shape5.setRotationPoint(0.0F, 1.5F, -7.4F);
        this.shape5.addBox(-2.0F, -5.6F, 0.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(shape5, -0.18203784098300857F, 0.0F, 0.0F);
        this.Tail = new AdvancedModelRenderer(this, 43, 19);
        this.Tail.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail.addBox(-3.0F, 0.0F, -1.1F, 6, 7, 11, 0.0F);
        this.setRotateAngle(Tail, 0.136659280431156F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 0, 71);
        this.Head.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Head.addBox(-2.0F, -4.0F, -5.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Head, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape14 = new AdvancedModelRenderer(this, 35, 8);
        this.shape14.setRotationPoint(0.0F, -2.8F, -1.5F);
        this.shape14.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape14, -0.27314402793711257F, 0.0F, 0.0F);
        this.shape44_4 = new AdvancedModelRenderer(this, 100, 109);
        this.shape44_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape44_4.addBox(0.0F, -5.0F, -6.5F, 0, 5, 13, 0.0F);
        this.shape19_9 = new AdvancedModelRenderer(this, 93, 51);
        this.shape19_9.setRotationPoint(0.0F, -0.6F, 0.5F);
        this.shape19_9.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape19_9, -1.5025539530419183F, 0.0F, 0.0F);
        this.shape19_5 = new AdvancedModelRenderer(this, 85, 35);
        this.shape19_5.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.shape19_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.TailBase = new AdvancedModelRenderer(this, 45, 0);
        this.TailBase.setRotationPoint(0.0F, -4.0F, 6.5F);
        this.TailBase.addBox(-3.5F, 0.0F, -0.9F, 7, 8, 6, 0.0F);
        this.setRotateAngle(TailBase, -0.091106186954104F, 0.0F, 0.0F);
        this.Mouth = new AdvancedModelRenderer(this, 34, 1);
        this.Mouth.setRotationPoint(0.0F, -3.8F, -2.7F);
        this.Mouth.addBox(-1.5F, -3.0F, -1.5F, 3, 4, 1, 0.0F);
        this.shape19_10 = new AdvancedModelRenderer(this, 93, 45);
        this.shape19_10.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.shape19_10.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape19_10, -1.593485607070823F, 0.0F, 0.0F);
        this.shape36_2 = new AdvancedModelRenderer(this, 100, 11);
        this.shape36_2.setRotationPoint(1.5F, -1.0F, -6.2F);
        this.shape36_2.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(shape36_2, 0.0F, -0.31869712141416456F, 0.091106186954104F);
        this.shape5_1 = new AdvancedModelRenderer(this, 23, 63);
        this.shape5_1.setRotationPoint(0.0F, -1.0F, -6.2F);
        this.shape5_1.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(shape5_1, -0.18203784098300857F, 0.0F, 0.0F);
        this.shape30 = new AdvancedModelRenderer(this, 80, 14);
        this.shape30.setRotationPoint(0.0F, 5.3F, 0.0F);
        this.shape30.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(shape30, 0.5009094953223726F, 0.0F, 0.4553564018453205F);
        this.shape19_2 = new AdvancedModelRenderer(this, 103, 34);
        this.shape19_2.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.shape19_2.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.shape36_1 = new AdvancedModelRenderer(this, 100, 23);
        this.shape36_1.setRotationPoint(0.0F, 5.7F, 0.5F);
        this.shape36_1.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 3, 0.0F);
        this.shape19 = new AdvancedModelRenderer(this, 96, 53);
        this.shape19.setRotationPoint(0.0F, -4.8F, 0.0F);
        this.shape19.addBox(-0.5F, 0.0F, -6.5F, 1, 1, 13, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 40, 77);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 9.4F);
        this.Tail4.addBox(-1.5F, 0.0F, -1.4F, 3, 4, 16, 0.0F);
        this.setRotateAngle(Tail4, -0.091106186954104F, 0.0F, 0.0F);
        this.RightArm = new AdvancedModelRenderer(this, 77, 0);
        this.RightArm.setRotationPoint(-2.3F, 0.0F, -2.7F);
        this.RightArm.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(RightArm, 0.7285004297824331F, 0.0F, 0.5009094953223726F);
        this.LeftArm = new AdvancedModelRenderer(this, 77, 0);
        this.LeftArm.setRotationPoint(2.3F, 0.0F, -2.7F);
        this.LeftArm.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(LeftArm, 0.7285004297824331F, 0.0F, -0.5009094953223726F);
        this.Body2 = new AdvancedModelRenderer(this, 0, 28);
        this.Body2.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.Body2.addBox(-4.0F, -4.0F, -5.1F, 8, 8, 6, 0.0F);
        this.setRotateAngle(Body2, -0.136659280431156F, 0.0F, 0.0F);
        this.shape36_3 = new AdvancedModelRenderer(this, 100, 23);
        this.shape36_3.setRotationPoint(0.0F, 5.7F, 0.5F);
        this.shape36_3.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 3, 0.0F);
        this.shape19_11 = new AdvancedModelRenderer(this, 93, 39);
        this.shape19_11.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.shape19_11.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape19_11, -1.5025539530419183F, 0.0F, 0.0F);
        this.shape35 = new AdvancedModelRenderer(this, 97, 0);
        this.shape35.setRotationPoint(3.9F, 7.1F, 3.8F);
        this.shape35.addBox(-3.0F, -1.5F, -6.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(shape35, 2.276432943376204F, -0.6829473363053812F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 44, 41);
        this.Tail2.setRotationPoint(0.0F, 0.5F, 9.8F);
        this.Tail2.addBox(-2.5F, 0.0F, -1.4F, 5, 6, 10, 0.0F);
        this.shape44_1 = new AdvancedModelRenderer(this, 117, 92);
        this.shape44_1.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.shape44_1.addBox(0.0F, -5.0F, -1.5F, 0, 5, 3, 0.0F);
        this.shape30_3 = new AdvancedModelRenderer(this, 80, 24);
        this.shape30_3.setRotationPoint(0.0F, 5.0F, -1.3F);
        this.shape30_3.addBox(-1.5F, 0.0F, -0.5F, 3, 1, 3, 0.0F);
        this.setRotateAngle(shape30_3, 0.091106186954104F, 0.0F, 0.0F);
        this.shape16 = new AdvancedModelRenderer(this, 0, 97);
        this.shape16.setRotationPoint(0.01F, -4.0F, 0.0F);
        this.shape16.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape16, -0.36425021489121656F, 0.0F, 0.0F);
        this.shape19_6 = new AdvancedModelRenderer(this, 85, 35);
        this.shape19_6.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.shape19_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Thingy = new AdvancedModelRenderer(this, 104, 45);
        this.Thingy.setRotationPoint(0.0F, -0.5F, 2.3F);
        this.Thingy.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 6, 0.0F);
        this.shape19_8 = new AdvancedModelRenderer(this, 92, 57);
        this.shape19_8.setRotationPoint(0.0F, -4.8F, -0.5F);
        this.shape19_8.addBox(-0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(shape19_8, 0.045553093477052F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRenderer(this, 0, 44);
        this.Neck.setRotationPoint(0.0F, -4.0F, -5.0F);
        this.Neck.addBox(-3.0F, -4.0F, -6.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(Neck, 1.3658946726107624F, 0.0F, 0.0F);
        this.shape19_4 = new AdvancedModelRenderer(this, 71, 55);
        this.shape19_4.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.shape19_4.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 14, 0.0F);
        this.shape44_3 = new AdvancedModelRenderer(this, 113, 104);
        this.shape44_3.setRotationPoint(0.01F, 0.0F, -2.6F);
        this.shape44_3.addBox(0.0F, -5.0F, -2.5F, 0, 5, 5, 0.0F);
        this.shape35_1 = new AdvancedModelRenderer(this, 97, 0);
        this.shape35_1.setRotationPoint(-3.9F, 7.1F, 3.8F);
        this.shape35_1.addBox(0.0F, -1.5F, -6.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(shape35_1, 2.0032889154390916F, 0.6829473363053812F, 0.0F);
        this.Tail2.addChild(this.Tail3);
        this.Head.addChild(this.shape12_1);
        this.RightArm.addChild(this.shape30_2);
        this.shape35.addChild(this.shape36);
        this.shape19_9.addChild(this.shape44_2);
        this.Tail.addChild(this.shape19_1);
        this.Thingy.addChild(this.shape44);
        this.Tail3.addChild(this.shape19_3);
        this.shape19_1.addChild(this.shape19_7);
        this.Neck.addChild(this.Neck2);
        this.Head.addChild(this.shape12);
        this.shape16.addChild(this.shape16_1);
        this.shape30.addChild(this.shape30_1);
        this.Neck.addChild(this.shape5);
        this.TailBase.addChild(this.Tail);
        this.Neck2.addChild(this.Head);
        this.Mouth.addChild(this.shape14);
        this.shape19.addChild(this.shape44_4);
        this.Neck.addChild(this.shape19_9);
        this.shape19_3.addChild(this.shape19_5);
        this.Body.addChild(this.TailBase);
        this.Head.addChild(this.Mouth);
        this.Neck2.addChild(this.shape19_10);
        this.shape35_1.addChild(this.shape36_2);
        this.Neck2.addChild(this.shape5_1);
        this.LeftArm.addChild(this.shape30);
        this.Tail2.addChild(this.shape19_2);
        this.shape36.addChild(this.shape36_1);
        this.Body.addChild(this.shape19);
        this.Tail3.addChild(this.Tail4);
        this.Body2.addChild(this.RightArm);
        this.Body2.addChild(this.LeftArm);
        this.Body.addChild(this.Body2);
        this.shape36_2.addChild(this.shape36_3);
        this.Head.addChild(this.shape19_11);
        this.TailBase.addChild(this.shape35);
        this.Tail.addChild(this.Tail2);
        this.shape19_10.addChild(this.shape44_1);
        this.shape30_2.addChild(this.shape30_3);
        this.shape12.addChild(this.shape16);
        this.shape19_2.addChild(this.shape19_6);
        this.TailBase.addChild(this.Thingy);
        this.Body2.addChild(this.shape19_8);
        this.Body2.addChild(this.Neck);
        this.Tail4.addChild(this.shape19_4);
        this.shape19_8.addChild(this.shape44_3);
        this.TailBase.addChild(this.shape35_1);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.25F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.12f, 0); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.Body.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            float scaleFactor= 0.4F;
    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 0.9f, 0); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.Body.render(f5);
            GlStateManager.popMatrix();
    	}
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		resetToDefaultPose();

		float globalSpeed = 3.7f;
		float globalHeight = 1f;
		float globalDegree = 2F;

		f = entity.ticksExisted;
		f1 = 0.5F;
		
		bob(Body, 0.05f * globalSpeed, 1f* globalHeight, true, f, f1);
		
		flap(LeftArm, 0.09f * globalSpeed, 0.3f * globalDegree, false, 0f, -1.3f, f, f1);
		flap(RightArm, 0.09f * globalSpeed, 0.3f * globalDegree, true, 0f, -1.3f, f, f1);
		walk(shape35, 0.07f * globalSpeed, 0.2f * globalDegree, true, 0f, 0f, f ,f1);
		walk(shape35_1, 0.07f * globalSpeed, 0.2f * globalDegree, false, 0f, 0f, f ,f1);
		walk(Neck, 0.07f * globalSpeed, 0.1f * globalDegree, true, 0f, 0f, f ,f1);
		walk(Neck2, 0.07f * globalSpeed, 0.1f * globalDegree, false, 0f, 0f, f ,f1);
		walk(Neck2, 0.07f * globalSpeed, 0.1f * globalDegree, true, 0f, 0f, f ,f1);
		walk(Head, 0.07f * globalSpeed, 0.1f * globalDegree, false, 0f, 0f, f ,f1);
		walk(Body2,  0.06f * globalSpeed, 0.05f * globalDegree, true, 0f, -0.075f, f, f1);
		swing(Tail, 0.05f, 0.2f, false, 0f, 0f, entity.ticksExisted, 0.5F);	
		swing(Tail2, 0.05f, 0.2f, false, 0.5f, 0f, entity.ticksExisted, 0.5F);	
		swing(Tail2, 0.05f, 0.2f, false, 0.5f, 0f, entity.ticksExisted, 0.5F);
		swing(Tail4, 0.05f, 0.2f, false, 0.5f, 0f, entity.ticksExisted, 0.5F);	
		swing(Tail4, 0.05f, 0.2f, false, 0.5f, 0f, entity.ticksExisted, 0.5F);
	}
    
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
}
