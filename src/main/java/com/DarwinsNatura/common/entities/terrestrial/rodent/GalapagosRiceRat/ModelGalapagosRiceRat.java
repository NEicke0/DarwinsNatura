package com.DarwinsNatura.common.entities.terrestrial.rodent.GalapagosRiceRat;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * DF_GalapagosRiceRat_Adult - Oceansss,Goony,Neicke Created using Tabula 7.0.0
 */
public class ModelGalapagosRiceRat extends AdvancedModelBase {

	public AdvancedModelRenderer Body;
	public AdvancedModelRenderer Butt;
	public AdvancedModelRenderer FrontLeftLeg1;
	public AdvancedModelRenderer FrontLeftLeg1_1;
	public AdvancedModelRenderer Neck;
	public AdvancedModelRenderer Tail1;
	public AdvancedModelRenderer BackLeftLeg1;
	public AdvancedModelRenderer BackLeftLeg1_1;
	public AdvancedModelRenderer Tail2;
	public AdvancedModelRenderer Tail3;
	public AdvancedModelRenderer BackLeftLeg2;
	public AdvancedModelRenderer BackLeftFoot;
	public AdvancedModelRenderer BackLeftLeg2_1;
	public AdvancedModelRenderer BackLeftFoot_1;
	public AdvancedModelRenderer FrontLeftLeg2;
	public AdvancedModelRenderer FrontLeftFoot;
	public AdvancedModelRenderer FrontLeftLeg2_1;
	public AdvancedModelRenderer FrontLeftFoot_1;
	public AdvancedModelRenderer Head;
	public AdvancedModelRenderer shape67;
	public AdvancedModelRenderer shape67_1;
	public AdvancedModelRenderer SnoutBase;
	public AdvancedModelRenderer shape82;
	public AdvancedModelRenderer shape83;
	public AdvancedModelRenderer LowerJaw;
	public AdvancedModelRenderer shape100;
	public AdvancedModelRenderer SnoutBase_1;
	public AdvancedModelRenderer Mouth;
	public AdvancedModelRenderer shape86;

	public ModelGalapagosRiceRat() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.Butt = new AdvancedModelRenderer(this, 0, 23);
		this.Butt.setRotationPoint(0.0F, -5.5F, 2.9F);
		this.Butt.addBox(-5.0F, -1.1F, 0.6F, 10, 13, 13, 0.0F);
		this.setRotateAngle(Butt, -0.08726646259971647F, 0.0F, 0.0F);
		this.shape67 = new AdvancedModelRenderer(this, 22, 107);
		this.shape67.setRotationPoint(3.2F, 1.3F, -1.8F);
		this.shape67.addBox(-2.5F, -5.0F, 0.0F, 5, 5, 1, 0.0F);
		this.setRotateAngle(shape67, -0.40142572795869574F, 0.0F, 0.3141592653589793F);
		this.FrontLeftFoot_1 = new AdvancedModelRenderer(this, 56, 74);
		this.FrontLeftFoot_1.setRotationPoint(0.0F, 4.3F, -1.9F);
		this.FrontLeftFoot_1.addBox(-1.5F, 0.0F, -1.8F, 3, 1, 4, 0.0F);
		this.setRotateAngle(FrontLeftFoot_1, 0.17453292519943295F, 0.0F, 0.0F);
		this.shape82 = new AdvancedModelRenderer(this, 0, 85);
		this.shape82.setRotationPoint(0.0F, 3.5F, -6.0F);
		this.shape82.addBox(-2.0F, 0.0F, -6.0F, 4, 2, 6, 0.0F);
		this.setRotateAngle(shape82, 0.08726646259971647F, 0.0F, 0.0F);
		this.BackLeftLeg2 = new AdvancedModelRenderer(this, 61, 31);
		this.BackLeftLeg2.setRotationPoint(2.0F, 6.4F, -1.8F);
		this.BackLeftLeg2.addBox(-1.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
		this.setRotateAngle(BackLeftLeg2, 1.413716694115407F, 0.0F, 0.0F);
		this.shape83 = new AdvancedModelRenderer(this, 0, 110);
		this.shape83.setRotationPoint(0.0F, 0.0F, -6.0F);
		this.shape83.addBox(-1.0F, 0.0F, -6.0F, 2, 2, 6, 0.0F);
		this.setRotateAngle(shape83, 0.5061454830783556F, 0.0F, 0.0F);
		this.shape86 = new AdvancedModelRenderer(this, 26, 102);
		this.shape86.setRotationPoint(0.0F, 1.0F, -2.0F);
		this.shape86.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(shape86, -0.40142572795869574F, 0.0F, 0.0F);
		this.Body = new AdvancedModelRenderer(this, 0, 0);
		this.Body.setRotationPoint(0.0F, 49.0F, 0.0F);
		this.Body.addBox(-4.5F, -6.5F, -5.0F, 9, 13, 10, 0.0F);
		this.setRotateAngle(Body, 0.12217304763960307F, 0.0F, 0.0F);
		this.BackLeftLeg2_1 = new AdvancedModelRenderer(this, 61, 31);
		this.BackLeftLeg2_1.setRotationPoint(-2.0F, 6.4F, -1.8F);
		this.BackLeftLeg2_1.addBox(-1.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
		this.setRotateAngle(BackLeftLeg2_1, 1.413716694115407F, 0.0F, 0.0F);
		this.Tail3 = new AdvancedModelRenderer(this, 92, 0);
		this.Tail3.setRotationPoint(0.0F, 0.7F, 7.2F);
		this.Tail3.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 11, 0.0F);
		this.setRotateAngle(Tail3, 0.45378560551852565F, 0.0F, 0.0F);
		this.BackLeftFoot = new AdvancedModelRenderer(this, 58, 44);
		this.BackLeftFoot.setRotationPoint(0.0F, 6.6F, 0.1F);
		this.BackLeftFoot.addBox(-1.5F, 0.0F, -2.4F, 3, 1, 5, 0.0F);
		this.setRotateAngle(BackLeftFoot, -0.7330382858376184F, 0.0F, 0.0F);
		this.FrontLeftLeg1_1 = new AdvancedModelRenderer(this, 58, 52);
		this.FrontLeftLeg1_1.setRotationPoint(-2.5F, 2.0F, -3.1F);
		this.FrontLeftLeg1_1.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
		this.setRotateAngle(FrontLeftLeg1_1, 0.08726646259971647F, 0.0F, 0.0F);
		this.Tail1 = new AdvancedModelRenderer(this, 44, 0);
		this.Tail1.setRotationPoint(0.0F, 0.7F, 13.3F);
		this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F);
		this.setRotateAngle(Tail1, -0.9599310885968813F, 0.0F, 0.0F);
		this.FrontLeftFoot = new AdvancedModelRenderer(this, 56, 74);
		this.FrontLeftFoot.setRotationPoint(0.0F, 4.3F, -1.9F);
		this.FrontLeftFoot.addBox(-1.5F, 0.0F, -1.8F, 3, 1, 4, 0.0F);
		this.setRotateAngle(FrontLeftFoot, 0.17453292519943295F, 0.0F, 0.0F);
		this.Head = new AdvancedModelRenderer(this, 0, 68);
		this.Head.setRotationPoint(0.0F, -0.1F, -2.4F);
		this.Head.addBox(-4.0F, 0.0F, -6.2F, 8, 8, 7, 0.0F);
		this.setRotateAngle(Head, 0.13962634015954636F, 0.0F, 0.0F);
		this.FrontLeftLeg1 = new AdvancedModelRenderer(this, 58, 52);
		this.FrontLeftLeg1.setRotationPoint(2.5F, 2.0F, -3.1F);
		this.FrontLeftLeg1.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
		this.setRotateAngle(FrontLeftLeg1, 0.08726646259971647F, 0.0F, 0.0F);
		this.Tail2 = new AdvancedModelRenderer(this, 70, 0);
		this.Tail2.setRotationPoint(0.0F, 0.0F, 8.6F);
		this.Tail2.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
		this.setRotateAngle(Tail2, 0.08726646259971647F, 0.0F, 0.0F);
		this.shape100 = new AdvancedModelRenderer(this, 27, 63);
		this.shape100.setRotationPoint(0.0F, 8.0F, -4.1F);
		this.shape100.addBox(-3.0F, -2.0F, 0.0F, 6, 2, 7, 0.0F);
		this.setRotateAngle(shape100, -0.40142572795869574F, 0.0F, 0.0F);
		this.LowerJaw = new AdvancedModelRenderer(this, 24, 92);
		this.LowerJaw.setRotationPoint(0.0F, 5.5F, -6.0F);
		this.LowerJaw.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
		this.shape67_1 = new AdvancedModelRenderer(this, 22, 107);
		this.shape67_1.setRotationPoint(-3.2F, 1.3F, -1.8F);
		this.shape67_1.addBox(-2.5F, -5.0F, 0.0F, 5, 5, 1, 0.0F);
		this.setRotateAngle(shape67_1, -0.40142572795869574F, 0.0F, -0.3141592653589793F);
		this.FrontLeftLeg2 = new AdvancedModelRenderer(this, 60, 65);
		this.FrontLeftLeg2.setRotationPoint(0.0F, 4.4F, 3.1F);
		this.FrontLeftLeg2.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(FrontLeftLeg2, -0.40142572795869574F, 0.0F, 0.0F);
		this.SnoutBase_1 = new AdvancedModelRenderer(this, 5, 120);
		this.SnoutBase_1.setRotationPoint(0.0F, 0.0F, -6.0F);
		this.SnoutBase_1.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(SnoutBase_1, 0.2792526803190927F, 0.0F, 0.0F);
		this.BackLeftFoot_1 = new AdvancedModelRenderer(this, 58, 44);
		this.BackLeftFoot_1.setRotationPoint(0.0F, 6.6F, 0.1F);
		this.BackLeftFoot_1.addBox(-1.5F, 0.0F, -2.4F, 3, 1, 5, 0.0F);
		this.setRotateAngle(BackLeftFoot_1, -0.7330382858376184F, 0.0F, 0.0F);
		this.BackLeftLeg1_1 = new AdvancedModelRenderer(this, 56, 16);
		this.BackLeftLeg1_1.setRotationPoint(-2.2F, 7.5F, 9.0F);
		this.BackLeftLeg1_1.addBox(-4.0F, -0.6F, -2.5F, 4, 7, 5, 0.0F);
		this.setRotateAngle(BackLeftLeg1_1, -0.767944870877505F, 0.0F, 0.0F);
		this.FrontLeftLeg2_1 = new AdvancedModelRenderer(this, 60, 65);
		this.FrontLeftLeg2_1.setRotationPoint(0.0F, 4.4F, 3.1F);
		this.FrontLeftLeg2_1.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(FrontLeftLeg2_1, -0.40142572795869574F, 0.0F, 0.0F);
		this.Mouth = new AdvancedModelRenderer(this, 25, 98);
		this.Mouth.setRotationPoint(0.0F, 0.0F, -2.0F);
		this.Mouth.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
		this.SnoutBase = new AdvancedModelRenderer(this, 0, 97);
		this.SnoutBase.setRotationPoint(0.0F, 1.2F, -6.1F);
		this.SnoutBase.addBox(-1.5F, 0.0F, -6.0F, 3, 3, 6, 0.0F);
		this.setRotateAngle(SnoutBase, 0.2792526803190927F, 0.0F, 0.0F);
		this.Neck = new AdvancedModelRenderer(this, 0, 51);
		this.Neck.setRotationPoint(0.0F, -5.9F, -5.0F);
		this.Neck.addBox(-3.57F, 0.0F, -3.0F, 7, 8, 5, 0.0F);
		this.setRotateAngle(Neck, -0.08726646259971647F, 0.0F, 0.0F);
		this.BackLeftLeg1 = new AdvancedModelRenderer(this, 56, 16);
		this.BackLeftLeg1.setRotationPoint(2.2F, 7.5F, 9.0F);
		this.BackLeftLeg1.addBox(0.0F, -0.6F, -2.5F, 4, 7, 5, 0.0F);
		this.setRotateAngle(BackLeftLeg1, -0.767944870877505F, 0.0F, 0.0F);
		this.Body.addChild(this.Butt);
		this.Head.addChild(this.shape67);
		this.FrontLeftLeg2_1.addChild(this.FrontLeftFoot_1);
		this.Head.addChild(this.shape82);
		this.BackLeftLeg1.addChild(this.BackLeftLeg2);
		this.Head.addChild(this.shape83);
		this.Mouth.addChild(this.shape86);
		this.BackLeftLeg1_1.addChild(this.BackLeftLeg2_1);
		this.Tail2.addChild(this.Tail3);
		this.BackLeftLeg2.addChild(this.BackLeftFoot);
		this.Body.addChild(this.FrontLeftLeg1_1);
		this.Butt.addChild(this.Tail1);
		this.FrontLeftLeg2.addChild(this.FrontLeftFoot);
		this.Neck.addChild(this.Head);
		this.Body.addChild(this.FrontLeftLeg1);
		this.Tail1.addChild(this.Tail2);
		this.Head.addChild(this.shape100);
		this.Head.addChild(this.LowerJaw);
		this.Head.addChild(this.shape67_1);
		this.FrontLeftLeg1.addChild(this.FrontLeftLeg2);
		this.SnoutBase.addChild(this.SnoutBase_1);
		this.BackLeftLeg2_1.addChild(this.BackLeftFoot_1);
		this.Butt.addChild(this.BackLeftLeg1_1);
		this.FrontLeftLeg1_1.addChild(this.FrontLeftLeg2_1);
		this.LowerJaw.addChild(this.Mouth);
		this.Head.addChild(this.SnoutBase);
		this.Body.addChild(this.Neck);
		this.Butt.addChild(this.BackLeftLeg1);

		updateDefaultPose();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {
			float scaleFactor = 0.1F;

			GlStateManager.pushMatrix();
			GlStateManager.translate(0F, 1.25 - 1.25F * scaleFactor, 0);
			GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
			this.Body.render(f5);
			GlStateManager.popMatrix();
		} else {
			float scaleFactor = 0.2F;

			GlStateManager.pushMatrix();
			GlStateManager.translate(0F, 0.92F - 0.92F * scaleFactor, -0.05F);
			GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
			this.Body.render(f5);
			GlStateManager.popMatrix();
		}
	}

	public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		resetToDefaultPose();
		
		float globalSpeed = 4.5f;
		float globalHeight = 0.9f;
		float globalDegree = 2F;
		
//		f=entity.ticksExisted;
//		f1=0.5F;

		this.Head.rotateAngleY = (f3 * 0.015453292F);
		
		bob(Body, 0.2f* globalSpeed, 1.3f* globalHeight, true, f, f1);
		
		walk(FrontLeftLeg1, 0.3f * globalSpeed, 0.5f * globalDegree, false, 0, 0.0f, f, f1);
		walk(FrontLeftLeg1_1, 0.3f * globalSpeed, 0.5f * globalDegree, false, 0, 0.0f, f, f1);
		walk(FrontLeftLeg2, 0.3f * globalSpeed, 0.7f * globalDegree, false, 1f, 0.0f, f, f1);
		walk(FrontLeftLeg2_1, 0.3f * globalSpeed, 0.7f * globalDegree, false, 1f, 0.0f, f, f1);
		walk(FrontLeftFoot, 0.4f * globalSpeed, 0.4f * globalDegree, true, 0, 0.0f, f, f1);
		walk(FrontLeftFoot_1, 0.4f * globalSpeed, 0.4f * globalDegree, true, 0, 0.0f, f, f1);
		walk(BackLeftLeg1, 0.3f * globalSpeed, 0.2f * globalDegree, true, 0f, 0.2f, f, f1);
		walk(BackLeftLeg1_1, 0.3f * globalSpeed, 0.2f * globalDegree, true, 0f, 0.2f, f, f1);
		walk(BackLeftLeg2, 0.3f * globalSpeed, 0.3f * globalDegree, true, 0f, -0.3f, f, f1);
		walk(BackLeftLeg2_1, 0.3f * globalSpeed, 0.3f * globalDegree, true, 0f, -0.3f, f, f1);
		walk(BackLeftFoot, 0.4f * globalSpeed, 0.4f * globalDegree, false, 0.2f, 0f, f, f1);
		walk(BackLeftFoot_1, 0.4f * globalSpeed, 0.4f * globalDegree, false, 0.2f, 0f, f, f1);
		walk(Neck, 0.35f * globalSpeed, 0.05f * globalDegree, true, 0f, 0f, f, f1);
		walk(Tail1, 0.15f * globalSpeed, 0.2f * globalDegree, false, 0, 1f, f, f1);
		walk(Tail2, 0.15f * globalSpeed, 0.2f * globalDegree, false, 0, 0.5f, f, f1);
		walk(Tail3, 0.1f * globalSpeed, 0.2f * globalDegree, true, 0, 0.0f, f, f1);
		
		walk(Neck, 0.2f, 0.05f, true, 0f, 0f, entity.ticksExisted, 0.5F);
		walk(Head, 0.1f, 0.08f, true, 0f, 0f, entity.ticksExisted, 0.5F);
		flap(Tail1, 0.1f, 0.4f, true, 0f, 0f, entity.ticksExisted, 0.5F);
		swing(Tail2, 0.2f, 0.3f, false, 0f, 0f, entity.ticksExisted, 0.5F);
		flap(Tail3, 0.3f, 0.2f, false, 0f, 0f, entity.ticksExisted, 0.5F);		
	}
}