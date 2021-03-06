package com.DarwinsNatura.common.entities.aquatic.bird.FlightlessCormorant;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * FlightlessCormorant - flightlessneicke
 * Created using Tabula 7.0.0
 */
public class ModelFlightlessCormorantWingsOpen extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer Body2;
    public ModelRenderer abdomen1;
    public ModelRenderer Tail;
    public ModelRenderer TailSupport;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightLeg;
    public ModelRenderer Body3;
    public ModelRenderer LeftWingBase;
    public ModelRenderer RightWingBase;
    public ModelRenderer Back;
    public ModelRenderer NeckBase;
    public ModelRenderer Neck1;
    public ModelRenderer Neck2;
    public ModelRenderer Neck3;
    public ModelRenderer Neck4;
    public ModelRenderer Head;
    public ModelRenderer UpperJaw2;
    public ModelRenderer Skull;
    public ModelRenderer MouthBase;
    public ModelRenderer UpperJaw3;
    public ModelRenderer Snout3;
    public ModelRenderer Snout4;
    public ModelRenderer Snout5;
    public ModelRenderer Snout6;
    public ModelRenderer Skull2;
    public ModelRenderer Skull3;
    public ModelRenderer Skull4;
    public ModelRenderer Mouth2;
    public ModelRenderer LeftMouth;
    public ModelRenderer RightMouth;
    public ModelRenderer Papada;
    public ModelRenderer LeftWing2;
    public ModelRenderer LeftFeather1;
    public ModelRenderer LeftFeather2;
    public ModelRenderer LeftFeather3;
    public ModelRenderer LeftWing3;
    public ModelRenderer LeftFeather4;
    public ModelRenderer LeftFeather5;
    public ModelRenderer LeftFeather6;
    public ModelRenderer LeftFeather7;
    public ModelRenderer LeftFeather8;
    public ModelRenderer RightWing2;
    public ModelRenderer RightFeather1;
    public ModelRenderer RightFeather2;
    public ModelRenderer RightFeather3;
    public ModelRenderer RightWing3;
    public ModelRenderer RightFeather4;
    public ModelRenderer RightFeather5;
    public ModelRenderer RightFeather6;
    public ModelRenderer RightFeather7;
    public ModelRenderer RightFeather8;
    public ModelRenderer abdomen2;
    public ModelRenderer abdomen3;
    public ModelRenderer TailFeatherBase;
    public ModelRenderer RightTailFeather1;
    public ModelRenderer LeftTailFeather1;
    public ModelRenderer RightTailFeather2;
    public ModelRenderer LeftTailFeather2;
    public ModelRenderer LeftFoot;
    public ModelRenderer RightFoot;

    public ModelFlightlessCormorantWingsOpen() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Neck2 = new ModelRenderer(this, 34, 61);
        this.Neck2.setRotationPoint(0.0F, -3.0F, 4.0F);
        this.Neck2.addBox(-2.03F, -2.0F, -4.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Neck2, 0.40980330836826856F, 0.0F, 0.0F);
        this.RightTailFeather1 = new ModelRenderer(this, 35, 0);
        this.RightTailFeather1.setRotationPoint(0.0F, 7.0F, -0.1F);
        this.RightTailFeather1.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 0, 0.0F);
        this.setRotateAngle(RightTailFeather1, 0.0F, 0.0F, 0.18203784098300857F);
        this.Snout6 = new ModelRenderer(this, 10, 107);
        this.Snout6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Snout6.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Snout6, -0.5009094953223726F, 0.0F, 0.0F);
        this.TailSupport = new ModelRenderer(this, 44, 15);
        this.TailSupport.setRotationPoint(0.0F, 4.6F, -2.4F);
        this.TailSupport.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 3, 0.0F);
        this.setRotateAngle(TailSupport, 0.6829473363053812F, 0.0F, 0.0F);
        this.RightFeather4 = new ModelRenderer(this, 64, 18);
        this.RightFeather4.setRotationPoint(-2.2F, 1.3F, 0.0F);
        this.RightFeather4.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.setRotateAngle(RightFeather4, 0.0F, 0.0F, -0.091106186954104F);
        this.Snout3 = new ModelRenderer(this, 0, 105);
        this.Snout3.setRotationPoint(0.0F, 0.73F, -0.4F);
        this.Snout3.addBox(-0.5F, -1.0F, -3.0F, 1, 1, 4, 0.0F);
        this.RightLeg = new ModelRenderer(this, 52, 28);
        this.RightLeg.setRotationPoint(-2.5F, 4.2F, -2.7F);
        this.RightLeg.addBox(-0.5F, 0.0F, -0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(RightLeg, -0.6108652381980153F, 0.0F, 0.0F);
        this.LeftFeather8 = new ModelRenderer(this, 70, 18);
        this.LeftFeather8.setRotationPoint(5.3F, 1.0F, 0.0F);
        this.LeftFeather8.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 0, 0.0F);
        this.setRotateAngle(LeftFeather8, 0.0F, 0.0F, -0.9560913642424937F);
        this.LeftWingBase = new ModelRenderer(this, 62, 0);
        this.LeftWingBase.setRotationPoint(3.5F, -4.6F, 2.0F);
        this.LeftWingBase.addBox(0.0F, 0.0F, -1.0F, 5, 4, 2, 0.0F);
        this.setRotateAngle(LeftWingBase, 0.0F, -0.5009094953223726F, 0.0F);
        this.Body3 = new ModelRenderer(this, 0, 34);
        this.Body3.setRotationPoint(0.0F, -4.3F, 0.5F);
        this.Body3.addBox(-3.5F, -4.0F, -4.0F, 7, 4, 6, 0.0F);
        this.setRotateAngle(Body3, -0.22759093446006054F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 43, 0);
        this.Tail.setRotationPoint(0.0F, 3.2F, 5.0F);
        this.Tail.addBox(-3.0F, 0.0F, -3.0F, 6, 7, 3, 0.0F);
        this.Skull = new ModelRenderer(this, 16, 83);
        this.Skull.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.Skull.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(Skull, -0.31869712141416456F, 0.0F, 0.0F);
        this.LeftWing2 = new ModelRenderer(this, 77, 0);
        this.LeftWing2.setRotationPoint(4.5F, 2.0F, 0.0F);
        this.LeftWing2.addBox(0.0F, -1.5F, -0.5F, 5, 3, 1, 0.0F);
        this.setRotateAngle(LeftWing2, 0.0F, 0.27314402793711257F, -0.2792526803190927F);
        this.LeftFeather6 = new ModelRenderer(this, 64, 18);
        this.LeftFeather6.setRotationPoint(2.5F, 1.4F, 0.0F);
        this.LeftFeather6.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.setRotateAngle(LeftFeather6, 0.0F, 0.0F, -0.36425021489121656F);
        this.UpperJaw3 = new ModelRenderer(this, 11, 96);
        this.UpperJaw3.setRotationPoint(0.0F, 0.0F, -4.3F);
        this.UpperJaw3.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(UpperJaw3, 0.8196066167365371F, 0.0F, 0.0F);
        this.RightWingBase = new ModelRenderer(this, 62, 8);
        this.RightWingBase.setRotationPoint(-3.5F, -4.6F, 2.0F);
        this.RightWingBase.addBox(-5.0F, 0.0F, -1.0F, 5, 4, 2, 0.0F);
        this.setRotateAngle(RightWingBase, 0.0F, 0.5009094953223726F, 0.0F);
        this.LeftWing3 = new ModelRenderer(this, 91, 0);
        this.LeftWing3.setRotationPoint(5.0F, -1.5F, 0.0F);
        this.LeftWing3.addBox(0.0F, 0.0F, -0.5F, 6, 2, 1, 0.0F);
        this.setRotateAngle(LeftWing3, 0.0F, 0.7285004297824331F, 0.4553564018453205F);
        this.Skull3 = new ModelRenderer(this, 24, 80);
        this.Skull3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Skull3.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Skull3, 0.27314402793711257F, 0.0F, 0.0F);
        this.LeftFeather3 = new ModelRenderer(this, 64, 18);
        this.LeftFeather3.setRotationPoint(5.3F, 3.2F, 0.1F);
        this.LeftFeather3.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.setRotateAngle(LeftFeather3, 0.0F, 0.0F, -0.091106186954104F);
        this.RightFeather1 = new ModelRenderer(this, 64, 18);
        this.RightFeather1.setRotationPoint(-1.5F, 4.0F, 0.1F);
        this.RightFeather1.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.Snout5 = new ModelRenderer(this, 9, 104);
        this.Snout5.setRotationPoint(0.0F, -1.0F, -0.2F);
        this.Snout5.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Snout5, 0.6373942428283291F, 0.0F, 0.0F);
        this.LeftMouth = new ModelRenderer(this, 27, 96);
        this.LeftMouth.setRotationPoint(0.2F, 0.01F, 0.0F);
        this.LeftMouth.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.abdomen2 = new ModelRenderer(this, 0, 58);
        this.abdomen2.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.abdomen2.addBox(-3.0F, -6.0F, 0.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(abdomen2, -0.32934362985133F, 0.0F, 0.0F);
        this.Mouth2 = new ModelRenderer(this, 21, 99);
        this.Mouth2.setRotationPoint(0.0F, 0.01F, -2.6F);
        this.Mouth2.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.LeftTailFeather1 = new ModelRenderer(this, 35, 0);
        this.LeftTailFeather1.setRotationPoint(0.0F, 7.0F, -0.1F);
        this.LeftTailFeather1.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 0, 0.0F);
        this.setRotateAngle(LeftTailFeather1, 0.0F, 0.0F, -0.18203784098300857F);
        this.RightFeather8 = new ModelRenderer(this, 70, 18);
        this.RightFeather8.setRotationPoint(-5.3F, 1.0F, 0.0F);
        this.RightFeather8.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 0, 0.0F);
        this.setRotateAngle(RightFeather8, 0.0F, 0.0F, 0.9560913642424937F);
        this.Skull2 = new ModelRenderer(this, 19, 87);
        this.Skull2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Skull2.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(Skull2, 0.27314402793711257F, 0.0F, 0.0F);
        this.Neck1 = new ModelRenderer(this, 32, 51);
        this.Neck1.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Neck1.addBox(-2.0F, -3.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Neck1, -0.6829473363053812F, 0.0F, 0.0F);
        this.TailFeatherBase = new ModelRenderer(this, 35, 0);
        this.TailFeatherBase.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.TailFeatherBase.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 0, 0.0F);
        this.RightFeather3 = new ModelRenderer(this, 64, 18);
        this.RightFeather3.setRotationPoint(-5.3F, 3.2F, 0.1F);
        this.RightFeather3.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.setRotateAngle(RightFeather3, 0.0F, 0.0F, 0.091106186954104F);
        this.RightFeather5 = new ModelRenderer(this, 64, 18);
        this.RightFeather5.setRotationPoint(-4.4F, 0.7F, -0.1F);
        this.RightFeather5.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.setRotateAngle(RightFeather5, 0.0F, 0.0F, -0.091106186954104F);
        this.Neck4 = new ModelRenderer(this, 33, 78);
        this.Neck4.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Neck4.addBox(-2.01F, -3.0F, -4.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Neck4, 0.7285004297824331F, 0.0F, 0.0F);
        this.Skull4 = new ModelRenderer(this, 24, 80);
        this.Skull4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Skull4.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Skull4, 0.27314402793711257F, 0.0F, 0.0F);
        this.abdomen3 = new ModelRenderer(this, 0, 46);
        this.abdomen3.setRotationPoint(0.5F, -6.0F, 0.0F);
        this.abdomen3.addBox(-3.0F, -5.0F, 0.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(abdomen3, -0.482932604026831F, 0.0F, 0.0F);
        this.LeftFoot = new ModelRenderer(this, 49, 36);
        this.LeftFoot.setRotationPoint(0.5F, 4.7F, -0.1F);
        this.LeftFoot.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 4, 0.0F);
        this.RightFoot = new ModelRenderer(this, 49, 36);
        this.RightFoot.setRotationPoint(0.5F, 4.7F, -0.1F);
        this.RightFoot.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 4, 0.0F);
        this.LeftFeather4 = new ModelRenderer(this, 64, 18);
        this.LeftFeather4.setRotationPoint(2.2F, 1.3F, 0.0F);
        this.LeftFeather4.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.setRotateAngle(LeftFeather4, 0.0F, 0.0F, 0.091106186954104F);
        this.abdomen1 = new ModelRenderer(this, 0, 70);
        this.abdomen1.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.abdomen1.addBox(-3.5F, -7.7F, 0.0F, 7, 8, 3, 0.0F);
        this.setRotateAngle(abdomen1, 0.28379053637427804F, 0.0F, 0.0F);
        this.RightWing2 = new ModelRenderer(this, 77, 7);
        this.RightWing2.setRotationPoint(-4.5F, 2.0F, 0.0F);
        this.RightWing2.addBox(-5.0F, -1.5F, -0.5F, 5, 3, 1, 0.0F);
        this.setRotateAngle(RightWing2, 0.0F, -0.27314402793711257F, 0.2792526803190927F);
        this.Papada = new ModelRenderer(this, 20, 103);
        this.Papada.setRotationPoint(0.0F, 1.0F, -2.8F);
        this.Papada.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Papada, -0.27314402793711257F, 0.0F, 0.0F);
        this.RightFeather7 = new ModelRenderer(this, 70, 18);
        this.RightFeather7.setRotationPoint(-4.2F, 1.3F, 0.0F);
        this.RightFeather7.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 0, 0.0F);
        this.setRotateAngle(RightFeather7, 0.0F, 0.0F, 0.5462880558742251F);
        this.LeftFeather2 = new ModelRenderer(this, 64, 18);
        this.LeftFeather2.setRotationPoint(3.2F, 4.0F, 0.0F);
        this.LeftFeather2.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.setRotateAngle(LeftFeather2, 0.0F, 0.0F, -0.091106186954104F);
        this.LeftTailFeather2 = new ModelRenderer(this, 35, 0);
        this.LeftTailFeather2.setRotationPoint(0.0F, 7.0F, -0.2F);
        this.LeftTailFeather2.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 0, 0.0F);
        this.setRotateAngle(LeftTailFeather2, 0.0F, 0.0F, -0.40980330836826856F);
        this.LeftFeather5 = new ModelRenderer(this, 64, 18);
        this.LeftFeather5.setRotationPoint(4.4F, 0.7F, -0.1F);
        this.LeftFeather5.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.setRotateAngle(LeftFeather5, 0.0F, 0.0F, 0.091106186954104F);
        this.MouthBase = new ModelRenderer(this, 20, 94);
        this.MouthBase.setRotationPoint(0.0F, 1.8F, -5.7F);
        this.MouthBase.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.LeftFeather7 = new ModelRenderer(this, 70, 18);
        this.LeftFeather7.setRotationPoint(4.2F, 1.3F, 0.0F);
        this.LeftFeather7.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 0, 0.0F);
        this.setRotateAngle(LeftFeather7, 0.0F, 0.0F, -0.5462880558742251F);
        this.UpperJaw2 = new ModelRenderer(this, 0, 97);
        this.UpperJaw2.setRotationPoint(0.0F, 0.9F, -6.3F);
        this.UpperJaw2.addBox(-1.0F, 0.0F, -4.3F, 2, 1, 5, 0.0F);
        this.setRotateAngle(UpperJaw2, 0.0767944870877505F, 0.0F, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 52, 28);
        this.LeftLeg.setRotationPoint(1.5F, 4.2F, -2.7F);
        this.LeftLeg.addBox(-0.5F, 0.0F, -0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(LeftLeg, -0.6108652381980153F, 0.0F, 0.0F);
        this.LeftFeather1 = new ModelRenderer(this, 64, 18);
        this.LeftFeather1.setRotationPoint(1.5F, 4.0F, 0.1F);
        this.LeftFeather1.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.Head = new ModelRenderer(this, 0, 85);
        this.Head.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Head.addBox(-2.0F, 0.0F, -6.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(Head, -0.6373942428283291F, 0.0F, 0.0F);
        this.RightWing3 = new ModelRenderer(this, 91, 6);
        this.RightWing3.setRotationPoint(-5.0F, -1.5F, 0.0F);
        this.RightWing3.addBox(-6.0F, 0.0F, -0.5F, 6, 2, 1, 0.0F);
        this.setRotateAngle(RightWing3, 0.0F, -0.7285004297824331F, -0.4553564018453205F);
        this.NeckBase = new ModelRenderer(this, 31, 41);
        this.NeckBase.setRotationPoint(0.0F, -4.0F, -4.2F);
        this.NeckBase.addBox(-2.01F, -4.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(NeckBase, -0.5918411493512771F, 0.0F, 0.0F);
        this.Snout4 = new ModelRenderer(this, 11, 99);
        this.Snout4.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.Snout4.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Snout4, 0.3497639820996636F, 0.0F, 0.0F);
        this.Body2 = new ModelRenderer(this, 0, 18);
        this.Body2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Body2.addBox(-3.5F, -5.0F, -3.5F, 7, 6, 8, 0.0F);
        this.setRotateAngle(Body2, 0.045553093477052F, 0.0F, 0.0F);
        this.RightTailFeather2 = new ModelRenderer(this, 35, 0);
        this.RightTailFeather2.setRotationPoint(0.0F, 7.0F, -0.2F);
        this.RightTailFeather2.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 0, 0.0F);
        this.setRotateAngle(RightTailFeather2, 0.0F, 0.0F, 0.40980330836826856F);
        this.RightFeather6 = new ModelRenderer(this, 64, 18);
        this.RightFeather6.setRotationPoint(-2.5F, 1.4F, 0.0F);
        this.RightFeather6.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.setRotateAngle(RightFeather6, 0.0F, 0.0F, 0.36425021489121656F);
        this.Back = new ModelRenderer(this, 31, 31);
        this.Back.setRotationPoint(0.0F, -4.0F, 2.0F);
        this.Back.addBox(-3.0F, 0.0F, 0.0F, 6, 3, 3, 0.0F);
        this.setRotateAngle(Back, -0.9105382707654417F, 0.0F, 0.0F);
        this.RightFeather2 = new ModelRenderer(this, 64, 18);
        this.RightFeather2.setRotationPoint(-3.2F, 4.0F, 0.0F);
        this.RightFeather2.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F);
        this.setRotateAngle(RightFeather2, 0.0F, 0.0F, 0.091106186954104F);
        this.RightMouth = new ModelRenderer(this, 37, 96);
        this.RightMouth.setRotationPoint(-0.2F, 0.01F, 0.0F);
        this.RightMouth.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.Body1 = new ModelRenderer(this, 0, 0);
        this.Body1.setRotationPoint(0.0F, 13.3F, 0.0F);
        this.Body1.addBox(-4.0F, -3.0F, -4.0F, 8, 8, 9, 0.0F);
        this.setRotateAngle(Body1, 0.6373942428283291F, 0.0F, 0.0F);
        this.Neck3 = new ModelRenderer(this, 33, 68);
        this.Neck3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Neck3.addBox(-2.02F, -3.0F, -4.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Neck3, 0.40980330836826856F, 0.0F, 0.0F);
        this.Neck1.addChild(this.Neck2);
        this.Tail.addChild(this.RightTailFeather1);
        this.Snout5.addChild(this.Snout6);
        this.Body1.addChild(this.TailSupport);
        this.RightWing2.addChild(this.RightFeather4);
        this.UpperJaw2.addChild(this.Snout3);
        this.Body1.addChild(this.RightLeg);
        this.LeftWing3.addChild(this.LeftFeather8);
        this.Body2.addChild(this.LeftWingBase);
        this.Body2.addChild(this.Body3);
        this.Body1.addChild(this.Tail);
        this.Head.addChild(this.Skull);
        this.LeftWingBase.addChild(this.LeftWing2);
        this.LeftWing3.addChild(this.LeftFeather6);
        this.UpperJaw2.addChild(this.UpperJaw3);
        this.Body2.addChild(this.RightWingBase);
        this.LeftWing2.addChild(this.LeftWing3);
        this.Skull2.addChild(this.Skull3);
        this.LeftWingBase.addChild(this.LeftFeather3);
        this.RightWingBase.addChild(this.RightFeather1);
        this.Snout3.addChild(this.Snout5);
        this.MouthBase.addChild(this.LeftMouth);
        this.abdomen1.addChild(this.abdomen2);
        this.MouthBase.addChild(this.Mouth2);
        this.Tail.addChild(this.LeftTailFeather1);
        this.RightWing3.addChild(this.RightFeather8);
        this.Skull.addChild(this.Skull2);
        this.NeckBase.addChild(this.Neck1);
        this.Tail.addChild(this.TailFeatherBase);
        this.RightWingBase.addChild(this.RightFeather3);
        this.RightWing2.addChild(this.RightFeather5);
        this.Neck3.addChild(this.Neck4);
        this.Skull3.addChild(this.Skull4);
        this.abdomen2.addChild(this.abdomen3);
        this.LeftLeg.addChild(this.LeftFoot);
        this.RightLeg.addChild(this.RightFoot);
        this.LeftWing2.addChild(this.LeftFeather4);
        this.Body1.addChild(this.abdomen1);
        this.RightWingBase.addChild(this.RightWing2);
        this.MouthBase.addChild(this.Papada);
        this.RightWing3.addChild(this.RightFeather7);
        this.LeftWingBase.addChild(this.LeftFeather2);
        this.Tail.addChild(this.LeftTailFeather2);
        this.LeftWing2.addChild(this.LeftFeather5);
        this.Head.addChild(this.MouthBase);
        this.LeftWing3.addChild(this.LeftFeather7);
        this.Head.addChild(this.UpperJaw2);
        this.Body1.addChild(this.LeftLeg);
        this.LeftWingBase.addChild(this.LeftFeather1);
        this.Neck4.addChild(this.Head);
        this.RightWing2.addChild(this.RightWing3);
        this.Body3.addChild(this.NeckBase);
        this.Snout3.addChild(this.Snout4);
        this.Body1.addChild(this.Body2);
        this.Tail.addChild(this.RightTailFeather2);
        this.RightWing3.addChild(this.RightFeather6);
        this.Body3.addChild(this.Back);
        this.RightWingBase.addChild(this.RightFeather2);
        this.MouthBase.addChild(this.RightMouth);
        this.Neck2.addChild(this.Neck3);
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
