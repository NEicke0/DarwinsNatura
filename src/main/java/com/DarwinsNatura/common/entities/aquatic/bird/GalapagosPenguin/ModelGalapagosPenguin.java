package com.DarwinsNatura.common.entities.aquatic.bird.GalapagosPenguin;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * DF_GalapagosPenguin_Adult - Cuchololol, Neicke
 * Created using Tabula 7.0.0
 */
public class ModelGalapagosPenguin extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer Body2;
    public ModelRenderer Belly1;
    public ModelRenderer Tail1;
    public ModelRenderer Body4;
    public ModelRenderer RightLeg1;
    public ModelRenderer LeftLeg1;
    public ModelRenderer Body3;
    public ModelRenderer Neck1;
    public ModelRenderer RightWing1;
    public ModelRenderer LeftWing1;
    public ModelRenderer Neck2;
    public ModelRenderer Throat1;
    public ModelRenderer Neck3;
    public ModelRenderer Neck4;
    public ModelRenderer Neck5;
    public ModelRenderer Neck6;
    public ModelRenderer Neck7;
    public ModelRenderer Head;
    public ModelRenderer Head2;
    public ModelRenderer Head3;
    public ModelRenderer Head5;
    public ModelRenderer UpperJaw1;
    public ModelRenderer UpperJaw3;
    public ModelRenderer LowerJaw1;
    public ModelRenderer UpperJaw4;
    public ModelRenderer UpperJaw5;
    public ModelRenderer UpperJaw6;
    public ModelRenderer LowerJaw2;
    public ModelRenderer LowerJaw3;
    public ModelRenderer Head4;
    public ModelRenderer Throat2;
    public ModelRenderer Throat3;
    public ModelRenderer RightWing2;
    public ModelRenderer RightWing3;
    public ModelRenderer RightWing4;
    public ModelRenderer LeftWing2;
    public ModelRenderer LeftWing3;
    public ModelRenderer LeftWing4;
    public ModelRenderer Belly2;
    public ModelRenderer Belly3;
    public ModelRenderer Belly4;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer Tail5;
    public ModelRenderer Tail6;
    public ModelRenderer RightLeg2;
    public ModelRenderer LeftLeg2;

    public ModelGalapagosPenguin() {
        this.textureWidth = 80;
        this.textureHeight = 100;
        this.RightLeg2 = new ModelRenderer(this, 0, 0);
        this.RightLeg2.setRotationPoint(0.0F, 4.2F, 0.0F);
        this.RightLeg2.addBox(-1.5F, -0.5F, -4.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(RightLeg2, 0.18203784098300857F, 0.0F, 0.0F);
        this.Tail3 = new ModelRenderer(this, 58, 73);
        this.Tail3.setRotationPoint(0.0F, 1.0F, 0.4F);
        this.Tail3.addBox(-2.0F, -1.0F, -3.5F, 4, 3, 5, 0.0F);
        this.setRotateAngle(Tail3, 0.22759093446006054F, 0.0F, 0.0F);
        this.UpperJaw4 = new ModelRenderer(this, 44, 86);
        this.UpperJaw4.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.UpperJaw4.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(UpperJaw4, 0.13281955607676849F, 0.0F, 0.0F);
        this.LowerJaw1 = new ModelRenderer(this, 16, 93);
        this.LowerJaw1.setRotationPoint(0.0F, 2.5F, -0.6F);
        this.LowerJaw1.addBox(-0.5F, 0.0F, -6.3F, 1, 1, 6, 0.0F);
        this.setRotateAngle(LowerJaw1, -0.091106186954104F, 0.0F, 0.0F);
        this.Neck3 = new ModelRenderer(this, 0, 8);
        this.Neck3.setRotationPoint(0.0F, -2.0F, 0.5F);
        this.Neck3.addBox(-2.0F, -2.0F, 0.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Neck3, -0.136659280431156F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 83);
        this.Head.setRotationPoint(0.0F, -0.2F, -1.8F);
        this.Head.addBox(-2.5F, -2.0F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(Head, -1.4570008595648662F, 0.0F, 0.0F);
        this.UpperJaw1 = new ModelRenderer(this, 26, 85);
        this.UpperJaw1.setRotationPoint(0.0F, 2.4F, -1.8F);
        this.UpperJaw1.addBox(-1.0F, -1.0F, -5.3F, 2, 1, 6, 0.0F);
        this.setRotateAngle(UpperJaw1, 0.012217304763960306F, 0.0F, 0.0F);
        this.Tail6 = new ModelRenderer(this, 71, 65);
        this.Tail6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Tail6.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(Tail6, 0.31869712141416456F, 0.0F, 0.0F);
        this.Belly1 = new ModelRenderer(this, 35, 70);
        this.Belly1.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.Belly1.addBox(-3.5F, -7.0F, 0.0F, 7, 7, 3, 0.0F);
        this.setRotateAngle(Belly1, 0.28379053637427804F, 0.0F, 0.0F);
        this.Tail4 = new ModelRenderer(this, 69, 83);
        this.Tail4.setRotationPoint(0.0F, 2.0F, 1.5F);
        this.Tail4.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(Tail4, 0.3710569989739945F, 0.0F, 0.0F);
        this.LeftLeg1 = new ModelRenderer(this, 67, 19);
        this.LeftLeg1.setRotationPoint(2.8F, 3.4F, -0.5F);
        this.LeftLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LeftLeg1, -0.4553564018453205F, 0.0F, 0.0F);
        this.Neck1 = new ModelRenderer(this, 0, 24);
        this.Neck1.setRotationPoint(0.0F, -2.7F, -0.9F);
        this.Neck1.addBox(-3.0F, -3.0F, -3.0F, 6, 4, 6, 0.0F);
        this.setRotateAngle(Neck1, -0.136659280431156F, 0.0F, 0.0F);
        this.Throat3 = new ModelRenderer(this, 50, 9);
        this.Throat3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Throat3.addBox(-1.5F, -4.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(Throat3, -0.27314402793711257F, 0.0F, 0.0F);
        this.Body4 = new ModelRenderer(this, 52, 51);
        this.Body4.setRotationPoint(0.0F, 5.0F, 0.4F);
        this.Body4.addBox(-3.5F, -1.0F, -4.0F, 7, 2, 7, 0.0F);
        this.setRotateAngle(Body4, -0.091106186954104F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 54, 66);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tail2.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(Tail2, 0.091106186954104F, 0.0F, 0.0F);
        this.Body3 = new ModelRenderer(this, 0, 35);
        this.Body3.setRotationPoint(0.0F, -5.0F, 1.0F);
        this.Body3.addBox(-3.5F, -4.0F, -4.0F, 7, 4, 7, 0.0F);
        this.LeftWing4 = new ModelRenderer(this, 52, 51);
        this.LeftWing4.setRotationPoint(0.0F, 4.0F, 0.5F);
        this.LeftWing4.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LeftWing4, 0.091106186954104F, 0.0F, 0.0F);
        this.RightWing4 = new ModelRenderer(this, 45, 47);
        this.RightWing4.setRotationPoint(0.0F, 4.0F, 0.5F);
        this.RightWing4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(RightWing4, 0.091106186954104F, 0.0F, 0.0F);
        this.UpperJaw5 = new ModelRenderer(this, 44, 81);
        this.UpperJaw5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.UpperJaw5.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(UpperJaw5, 0.3361504139341079F, 0.0F, 0.0F);
        this.Body1 = new ModelRenderer(this, 0, 63);
        this.Body1.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Body1.addBox(-4.0F, -3.0F, -4.0F, 8, 8, 9, 0.0F);
        this.setRotateAngle(Body1, 0.27314402793711257F, 0.0F, 0.0F);
        this.RightWing3 = new ModelRenderer(this, 44, 38);
        this.RightWing3.setRotationPoint(0.0F, 4.0F, -2.7F);
        this.RightWing3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(RightWing3, 0.40980330836826856F, 0.0F, -0.045553093477052F);
        this.Belly4 = new ModelRenderer(this, 25, 35);
        this.Belly4.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Belly4.addBox(-2.5F, -3.0F, 0.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(Belly4, -0.40980330836826856F, 0.0F, 0.0F);
        this.RightLeg1 = new ModelRenderer(this, 67, 19);
        this.RightLeg1.setRotationPoint(-2.8F, 3.4F, -0.5F);
        this.RightLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(RightLeg1, -0.4553564018453205F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 54, 61);
        this.Tail1.setRotationPoint(0.0F, 3.8F, 4.0F);
        this.Tail1.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 2, 0.0F);
        this.setRotateAngle(Tail1, -1.4570008595648662F, 0.0F, 0.0F);
        this.Belly2 = new ModelRenderer(this, 33, 58);
        this.Belly2.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Belly2.addBox(-3.0F, -6.0F, 0.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(Belly2, -0.32934362985133F, 0.0F, 0.0F);
        this.Neck6 = new ModelRenderer(this, 52, 0);
        this.Neck6.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Neck6.addBox(-2.0F, -2.0F, -4.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Neck6, 0.36425021489121656F, 0.0F, 0.0F);
        this.Head4 = new ModelRenderer(this, 10, 93);
        this.Head4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Head4.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Head4, 0.3467969223712733F, 0.0F, 0.0F);
        this.Neck4 = new ModelRenderer(this, 17, 6);
        this.Neck4.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.Neck4.addBox(-2.0F, -2.0F, -4.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Neck4, 0.31869712141416456F, 0.0F, 0.0F);
        this.Head3 = new ModelRenderer(this, 0, 93);
        this.Head3.setRotationPoint(0.0F, -1.9F, -3.0F);
        this.Head3.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Head3, 0.14014993893514466F, 0.0F, 0.0F);
        this.LeftWing2 = new ModelRenderer(this, 54, 28);
        this.LeftWing2.setRotationPoint(0.0F, 3.0F, 1.5F);
        this.LeftWing2.addBox(-1.0F, 0.0F, -3.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(LeftWing2, -0.40980330836826856F, 0.0F, 0.091106186954104F);
        this.Head2 = new ModelRenderer(this, 18, 83);
        this.Head2.setRotationPoint(0.0F, -1.3F, -3.0F);
        this.Head2.addBox(-2.0F, 0.0F, -2.0F, 4, 4, 2, 0.0F);
        this.Throat1 = new ModelRenderer(this, 20, 14);
        this.Throat1.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.Throat1.addBox(-2.0F, -2.0F, -1.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(Throat1, 0.27314402793711257F, 0.0F, 0.0F);
        this.Head5 = new ModelRenderer(this, 0, 97);
        this.Head5.setRotationPoint(0.0F, 3.0F, -3.0F);
        this.Head5.addBox(-1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(Head5, -0.136659280431156F, 0.0F, 0.0F);
        this.LowerJaw2 = new ModelRenderer(this, 63, 96);
        this.LowerJaw2.setRotationPoint(0.0F, 1.0F, -6.3F);
        this.LowerJaw2.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LowerJaw2, -0.22759093446006054F, 0.0F, 0.0F);
        this.LeftWing1 = new ModelRenderer(this, 54, 20);
        this.LeftWing1.setRotationPoint(3.5F, -0.5F, -1.0F);
        this.LeftWing1.addBox(-1.0F, 0.0F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotateAngle(LeftWing1, -0.4553564018453205F, 0.0F, -0.36425021489121656F);
        this.RightWing2 = new ModelRenderer(this, 43, 28);
        this.RightWing2.setRotationPoint(0.0F, 3.0F, 1.5F);
        this.RightWing2.addBox(0.0F, 0.0F, -3.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(RightWing2, -0.40980330836826856F, 0.0F, -0.091106186954104F);
        this.Neck5 = new ModelRenderer(this, 33, 2);
        this.Neck5.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Neck5.addBox(-2.0F, -2.0F, -4.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Neck5, 0.5009094953223726F, 0.0F, 0.0F);
        this.RightWing1 = new ModelRenderer(this, 43, 20);
        this.RightWing1.setRotationPoint(-3.5F, -0.5F, -1.0F);
        this.RightWing1.addBox(0.0F, 0.0F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotateAngle(RightWing1, -0.4553564018453205F, 0.0F, 0.36425021489121656F);
        this.Tail5 = new ModelRenderer(this, 59, 84);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tail5.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(Tail5, 0.31869712141416456F, 0.0F, 0.0F);
        this.Throat2 = new ModelRenderer(this, 35, 12);
        this.Throat2.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.Throat2.addBox(-2.0F, -2.0F, 0.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Throat2, -0.5462880558742251F, 0.0F, 0.0F);
        this.LeftLeg2 = new ModelRenderer(this, 0, 0);
        this.LeftLeg2.setRotationPoint(0.0F, 4.2F, 0.0F);
        this.LeftLeg2.addBox(-1.5F, -0.5F, -4.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(LeftLeg2, 0.18203784098300857F, 0.0F, 0.0F);
        this.Neck2 = new ModelRenderer(this, 0, 16);
        this.Neck2.setRotationPoint(0.0F, -3.0F, -2.5F);
        this.Neck2.addBox(-2.5F, -2.0F, 0.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Neck2, -0.22759093446006054F, 0.0F, 0.0F);
        this.UpperJaw6 = new ModelRenderer(this, 52, 85);
        this.UpperJaw6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.UpperJaw6.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(UpperJaw6, 0.36425021489121656F, 0.0F, 0.0F);
        this.Belly3 = new ModelRenderer(this, 26, 48);
        this.Belly3.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Belly3.addBox(-3.0F, -4.0F, 0.0F, 6, 4, 3, 0.0F);
        this.setRotateAngle(Belly3, -0.31869712141416456F, 0.0F, 0.0F);
        this.Neck7 = new ModelRenderer(this, 63, 8);
        this.Neck7.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Neck7.addBox(-2.0F, -1.0F, -4.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Neck7, 0.5009094953223726F, 0.0F, 0.0F);
        this.UpperJaw3 = new ModelRenderer(this, 39, 86);
        this.UpperJaw3.setRotationPoint(0.0F, 0.6F, -1.5F);
        this.UpperJaw3.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(UpperJaw3, -0.12601277199399058F, 0.0F, 0.0F);
        this.LeftWing3 = new ModelRenderer(this, 54, 38);
        this.LeftWing3.setRotationPoint(0.0F, 4.0F, -2.7F);
        this.LeftWing3.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(LeftWing3, 0.40980330836826856F, 0.0F, 0.045553093477052F);
        this.LowerJaw3 = new ModelRenderer(this, 63, 92);
        this.LowerJaw3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.LowerJaw3.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(LowerJaw3, 0.21694442602289515F, 0.0F, 0.0F);
        this.Body2 = new ModelRenderer(this, 0, 48);
        this.Body2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Body2.addBox(-3.5F, -5.0F, -3.5F, 7, 6, 8, 0.0F);
        this.setRotateAngle(Body2, 0.045553093477052F, 0.0F, 0.0F);
        this.RightLeg1.addChild(this.RightLeg2);
        this.Tail1.addChild(this.Tail3);
        this.UpperJaw3.addChild(this.UpperJaw4);
        this.Head2.addChild(this.LowerJaw1);
        this.Neck2.addChild(this.Neck3);
        this.Neck7.addChild(this.Head);
        this.Head2.addChild(this.UpperJaw1);
        this.Tail5.addChild(this.Tail6);
        this.Body1.addChild(this.Belly1);
        this.Tail3.addChild(this.Tail4);
        this.Body1.addChild(this.LeftLeg1);
        this.Body3.addChild(this.Neck1);
        this.Throat2.addChild(this.Throat3);
        this.Body1.addChild(this.Body4);
        this.Tail1.addChild(this.Tail2);
        this.Body2.addChild(this.Body3);
        this.LeftWing3.addChild(this.LeftWing4);
        this.RightWing3.addChild(this.RightWing4);
        this.UpperJaw4.addChild(this.UpperJaw5);
        this.RightWing2.addChild(this.RightWing3);
        this.Belly3.addChild(this.Belly4);
        this.Body1.addChild(this.RightLeg1);
        this.Body1.addChild(this.Tail1);
        this.Belly1.addChild(this.Belly2);
        this.Neck5.addChild(this.Neck6);
        this.Head3.addChild(this.Head4);
        this.Neck3.addChild(this.Neck4);
        this.Head.addChild(this.Head3);
        this.LeftWing1.addChild(this.LeftWing2);
        this.Head.addChild(this.Head2);
        this.Neck1.addChild(this.Throat1);
        this.Head.addChild(this.Head5);
        this.LowerJaw1.addChild(this.LowerJaw2);
        this.Body3.addChild(this.LeftWing1);
        this.RightWing1.addChild(this.RightWing2);
        this.Neck4.addChild(this.Neck5);
        this.Body3.addChild(this.RightWing1);
        this.Tail4.addChild(this.Tail5);
        this.Throat1.addChild(this.Throat2);
        this.LeftLeg1.addChild(this.LeftLeg2);
        this.Neck1.addChild(this.Neck2);
        this.UpperJaw5.addChild(this.UpperJaw6);
        this.Belly2.addChild(this.Belly3);
        this.Neck6.addChild(this.Neck7);
        this.Head2.addChild(this.UpperJaw3);
        this.LeftWing2.addChild(this.LeftWing3);
        this.LowerJaw2.addChild(this.LowerJaw3);
        this.Body1.addChild(this.Body2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}