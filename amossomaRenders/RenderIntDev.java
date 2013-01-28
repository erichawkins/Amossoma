package amossomaRenders;


import amossomaEntity.EntityIntDev;
import amossomaModels.ModelIntDev;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderIntDev  extends RenderLiving
{
protected amossomaModels.ModelIntDev model;

public RenderIntDev (ModelIntDev modelIntDev, float f)
{
super(modelIntDev, f);
model = ((ModelIntDev)mainModel);
}

public void renderIntDev(EntityIntDev entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderIntDev((EntityIntDev)par1EntityLiving, par2, par4, par6, par8, par9);
    }

public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderIntDev((EntityIntDev)par1Entity, par2, par4, par6, par8, par9);
    }
}
