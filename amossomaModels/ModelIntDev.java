package amossomaModels;

import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;

public class ModelIntDev extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer LegLB;
    ModelRenderer LegRB;
    ModelRenderer LegLF;
    ModelRenderer LegRF;
    ModelRenderer SholderLF;
    ModelRenderer FootLB;
    ModelRenderer FootRB;
    ModelRenderer SholderRF;
    ModelRenderer SholderLB;
    ModelRenderer SholderRB;
  
  public ModelIntDev()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 36, 0);
      Body.addBox(-4F, -2F, -3F, 7, 7, 7);
      Body.setRotationPoint(0F, 15F, -2F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0.1580091F, 0F, 0F);
      LegLB = new ModelRenderer(this, 18, 18);
      LegLB.addBox(-1F, 0F, -1F, 2, 8, 2);
      LegLB.setRotationPoint(-7F, 15F, 1F);
      LegLB.setTextureSize(64, 32);
      LegLB.mirror = true;
      setRotation(LegLB, 0.669215F, 0F, 0F);
      LegRB = new ModelRenderer(this, 18, 18);
      LegRB.addBox(-1F, 0F, -1F, 2, 8, 2);
      LegRB.setRotationPoint(6F, 15F, 1F);
      LegRB.setTextureSize(64, 32);
      LegRB.mirror = true;
      setRotation(LegRB, 0.669215F, 0F, 0F);
      LegLF = new ModelRenderer(this, 0, 0);
      LegLF.addBox(-1F, 0F, -1F, 2, 6, 2);
      LegLF.setRotationPoint(-7F, 18.4F, -3F);
      LegLF.setTextureSize(64, 32);
      LegLF.mirror = true;
      setRotation(LegLF, -0.5576792F, 0F, 0F);
      LegRF = new ModelRenderer(this, 0, 0);
      LegRF.addBox(-1F, 0F, -1F, 2, 6, 2);
      LegRF.setRotationPoint(6F, 18.4F, -3F);
      LegRF.setTextureSize(64, 32);
      LegRF.mirror = true;
      setRotation(LegRF, -0.5205006F, 0F, 0F);
      SholderLF = new ModelRenderer(this, 9, 18);
      SholderLF.addBox(0F, -1F, -1F, 4, 2, 2);
      SholderLF.setRotationPoint(3F, 18F, -3F);
      SholderLF.setTextureSize(64, 32);
      SholderLF.mirror = true;
      setRotation(SholderLF, 0F, 0F, 0F);
      FootLB = new ModelRenderer(this, 0, 18);
      FootLB.addBox(-1F, 0F, -1F, 2, 3, 2);
      FootLB.setRotationPoint(-7F, 21F, 6F);
      FootLB.setTextureSize(64, 32);
      FootLB.mirror = true;
      setRotation(FootLB, 0F, 0F, 0F);
      FootRB = new ModelRenderer(this, 0, 18);
      FootRB.addBox(-1F, 0F, -1F, 2, 3, 2);
      FootRB.setRotationPoint(6F, 21F, 6F);
      FootRB.setTextureSize(64, 32);
      FootRB.mirror = true;
      setRotation(FootRB, 0F, 0F, 0F);
      SholderRF = new ModelRenderer(this, 9, 18);
      SholderRF.addBox(-4F, -1F, -1F, 4, 2, 2);
      SholderRF.setRotationPoint(-4F, 18F, -3F);
      SholderRF.setTextureSize(64, 32);
      SholderRF.mirror = true;
      setRotation(SholderRF, 0F, 0F, 0F);
      SholderLB = new ModelRenderer(this, 9, 18);
      SholderLB.addBox(0F, -1F, -1F, 4, 2, 2);
      SholderLB.setRotationPoint(3F, 15F, 1F);
      SholderLB.setTextureSize(64, 32);
      SholderLB.mirror = true;
      setRotation(SholderLB, 0F, 0F, 0F);
      SholderRB = new ModelRenderer(this, 9, 18);
      SholderRB.addBox(-4F, -1F, -1F, 4, 2, 2);
      SholderRB.setRotationPoint(-4F, 15F, 1F);
      SholderRB.setTextureSize(64, 32);
      SholderRB.mirror = true;
      setRotation(SholderRB, 0F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Body.render(par7);
    LegLB.render(par7);
    LegRB.render(par7);
    LegLF.render(par7);
    LegRF.render(par7);
    SholderLF.render(par7);
    FootLB.render(par7);
    FootRB.render(par7);
    SholderRF.render(par7);
    SholderLB.render(par7);
    SholderRB.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }

}
