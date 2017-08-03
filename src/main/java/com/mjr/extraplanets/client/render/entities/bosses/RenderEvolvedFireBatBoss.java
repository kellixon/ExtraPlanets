package com.mjr.extraplanets.client.render.entities.bosses;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.mjr.extraplanets.client.model.bosses.ModelEvolvedFireBatBoss;
import com.mjr.extraplanets.entities.bosses.EntityEvolvedFireBatBoss;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEvolvedFireBatBoss extends RenderLiving {
	private static final ResourceLocation batTextures = new ResourceLocation("textures/entity/bat.png");
	/**
	 * not actually sure this is size, is not used as of now, but the model would be recreated if the value changed and it seems a good match for a bats size
	 */
	private int renderedBatSize;

	public RenderEvolvedFireBatBoss() {
		super(new ModelEvolvedFireBatBoss(), 0.25F);
		this.renderedBatSize = ((ModelEvolvedFireBatBoss) this.mainModel).getBatSize();
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic (Render<T extends
	 * Entity) and this method has signature public void func_76986_a(T entity, double d, double d1, double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	public void doRender(EntityEvolvedFireBatBoss p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
		int i = ((ModelEvolvedFireBatBoss) this.mainModel).getBatSize();

		if (i != this.renderedBatSize) {
			this.renderedBatSize = i;
			this.mainModel = new ModelEvolvedFireBatBoss();
		}

		super.doRender(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityEvolvedFireBatBoss p_110775_1_) {
		return batTextures;
	}

	/**
	 * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args: entityLiving, partialTickTime
	 */
	protected void preRenderCallback(EntityEvolvedFireBatBoss p_77041_1_, float p_77041_2_) {
		GL11.glScalef(8.35F, 8.35F, 8.35F);
		GL11.glTranslatef(0.0F, 0.9F, 0.0F);
	}

	/**
	 * Sets a simple glTranslate on a LivingEntity.
	 */
	protected void renderLivingAt(EntityEvolvedFireBatBoss p_77039_1_, double p_77039_2_, double p_77039_4_, double p_77039_6_) {
		super.renderLivingAt(p_77039_1_, p_77039_2_, p_77039_4_, p_77039_6_);
	}

	protected void rotateCorpse(EntityEvolvedFireBatBoss p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_) {
		GL11.glTranslatef(0.0F, -0.1F, 0.0F);
		super.rotateCorpse(p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic (Render<T extends
	 * Entity) and this method has signature public void func_76986_a(T entity, double d, double d1, double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	@Override
	public void doRender(EntityLiving p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
		this.doRender((EntityEvolvedFireBatBoss) p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
	}

	/**
	 * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args: entityLiving, partialTickTime
	 */
	@Override
	protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_) {
		this.preRenderCallback((EntityEvolvedFireBatBoss) p_77041_1_, p_77041_2_);
	}

	@Override
	protected void rotateCorpse(EntityLivingBase p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_) {
		this.rotateCorpse((EntityEvolvedFireBatBoss) p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
	}

	/**
	 * Sets a simple glTranslate on a LivingEntity.
	 */
	@Override
	protected void renderLivingAt(EntityLivingBase p_77039_1_, double p_77039_2_, double p_77039_4_, double p_77039_6_) {
		this.renderLivingAt((EntityEvolvedFireBatBoss) p_77039_1_, p_77039_2_, p_77039_4_, p_77039_6_);
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic (Render<T extends
	 * Entity) and this method has signature public void func_76986_a(T entity, double d, double d1, double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	@Override
	public void doRender(EntityLivingBase p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
		this.doRender((EntityEvolvedFireBatBoss) p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return this.getEntityTexture((EntityEvolvedFireBatBoss) p_110775_1_);
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic (Render<T extends
	 * Entity) and this method has signature public void func_76986_a(T entity, double d, double d1, double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	@Override
	public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
		this.doRender((EntityEvolvedFireBatBoss) p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
	}
}