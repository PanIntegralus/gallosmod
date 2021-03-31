
package tk.panintegral.gallos_mod.entity;

import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import java.util.Iterator;
import java.util.ArrayList;

@ElementsGallosModMod.ModElement.Tag
public class EntityPitusa extends ElementsGallosModMod.ModElement {
	public static final int ENTITYID = 17;
	public static final int ENTITYID_RANGED = 18;
	public EntityPitusa(ElementsGallosModMod instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("gallos_mod", "pitusa"), ENTITYID)
				.name("pitusa").tracker(64, 3, true).egg(-1, -3355444).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		Biome[] spawnBiomes = allbiomes(Biome.REGISTRY);
		EntityRegistry.addSpawn(EntityCustom.class, 20, 4, 4, EnumCreatureType.MONSTER, spawnBiomes);
	}

	private Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
		Iterator<Biome> itr = in.iterator();
		ArrayList<Biome> ls = new ArrayList<Biome>();
		while (itr.hasNext())
			ls.add(itr.next());
		return ls.toArray(new Biome[ls.size()]);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new Modelpitusa(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("gallos_mod:textures/pitusa.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityCow {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAIWander(this, 1));
			this.tasks.addTask(2, new EntityAILookIdle(this));
			this.tasks.addTask(3, new EntityAISwimming(this));
			this.tasks.addTask(4, new EntityAILeapAtTarget(this, (float) 0.5));
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected Item getDropItem() {
			return null;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelpitusa extends ModelBase {
		private final ModelRenderer BODY;
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer rightleg;
		private final ModelRenderer rightarm;
		private final ModelRenderer leftleg;
		private final ModelRenderer leftarm;
		private final ModelRenderer torso;
		private final ModelRenderer cola;
		private final ModelRenderer cube_r3;
		public Modelpitusa() {
			textureWidth = 32;
			textureHeight = 32;
			BODY = new ModelRenderer(this);
			BODY.setRotationPoint(0.0F, 24.0F, 0.75F);
			head = new ModelRenderer(this);
			head.setRotationPoint(-0.0042F, -7.1077F, -3.7963F);
			BODY.addChild(head);
			head.cubeList.add(new ModelBox(head, 8, 15, 0.2032F, -4.4052F, -1.5224F, 1, 2, 1, 0.0F, false));
			head.cubeList.add(new ModelBox(head, 0, 20, -1.2457F, -4.4052F, -1.5224F, 1, 3, 1, 0.0F, false));
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-1.7708F, -0.6501F, -1.0797F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, -2.3562F, 0.0F, 0.0F);
			cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 21, -0.475F, -0.5F, -1.5F, 1, 1, 1, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 22, 3.025F, -0.5F, -1.5F, 1, 1, 1, 0.0F, false));
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0042F, -0.3673F, -0.4787F);
			head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
			cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 12, -1.25F, -1.625F, -3.975F, 2, 3, 4, 0.0F, false));
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-2.0F, -3.0F, 2.0F);
			BODY.addChild(rightleg);
			rightleg.cubeList.add(new ModelBox(rightleg, 20, 13, -0.9F, 2.0F, -0.9F, 1, 1, 1, 0.0F, false));
			rightleg.cubeList.add(new ModelBox(rightleg, 18, 0, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, false));
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-2.0F, -3.125F, -3.0F);
			BODY.addChild(rightarm);
			rightarm.cubeList.add(new ModelBox(rightarm, 6, 18, -1.0F, -0.375F, -1.0F, 2, 3, 2, 0.0F, false));
			rightarm.cubeList.add(new ModelBox(rightarm, 20, 11, -0.9F, 2.125F, -0.9F, 1, 1, 1, 0.0F, false));
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(2.0F, -3.0F, 2.0F);
			BODY.addChild(leftleg);
			leftleg.cubeList.add(new ModelBox(leftleg, 16, 6, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, false));
			leftleg.cubeList.add(new ModelBox(leftleg, 18, 19, -0.9F, 2.0F, -0.9F, 1, 1, 1, 0.0F, false));
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(2.0F, -3.0F, -3.0F);
			BODY.addChild(leftarm);
			leftarm.cubeList.add(new ModelBox(leftarm, 0, 15, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, false));
			leftarm.cubeList.add(new ModelBox(leftarm, 15, 0, -0.9F, 2.0F, -0.9F, 1, 1, 1, 0.0F, false));
			torso = new ModelRenderer(this);
			torso.setRotationPoint(0.0F, -4.9375F, -0.7F);
			BODY.addChild(torso);
			torso.cubeList.add(new ModelBox(torso, 0, 8, -2.95F, -2.3125F, -0.05F, 5, 4, 3, 0.0F, false));
			torso.cubeList.add(new ModelBox(torso, 0, 0, -3.25F, -2.5625F, -3.55F, 6, 5, 3, 0.0F, false));
			cola = new ModelRenderer(this);
			cola.setRotationPoint(0.0F, -5.3792F, 3.0633F);
			BODY.addChild(cola);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -0.4495F, -0.4495F);
			cola.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
			cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 19, -0.5F, -0.5F, -0.0643F, 1, 1, 2, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			BODY.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.cola.rotateAngleY = f4 / (180F / (float) Math.PI);
		}
	}
}
