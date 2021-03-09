
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIAttackMelee;
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
public class EntityViktor extends ElementsGallosModMod.ModElement {
	public static final int ENTITYID = 7;
	public static final int ENTITYID_RANGED = 8;
	public EntityViktor(ElementsGallosModMod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("gallos_mod", "viktor"), ENTITYID)
				.name("viktor").tracker(64, 3, true).egg(-1, -13408513).build());
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
			return new RenderLiving(renderManager, new Modelviktor(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("gallos_mod:textures/viktor.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(1f, 1f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.2, false));
			this.tasks.addTask(2, new EntityAIWander(this, 1));
			this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, false));
			this.tasks.addTask(4, new EntityAILookIdle(this));
			this.tasks.addTask(5, new EntityAISwimming(this));
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
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}
	}

	// Made with Blockbench 3.8.0
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelviktor extends ModelBase {
		private final ModelRenderer Vktor;
		public Modelviktor() {
			textureWidth = 64;
			textureHeight = 64;
			Vktor = new ModelRenderer(this);
			Vktor.setRotationPoint(-2.5F, 24.0F, -2.0F);
			Vktor.cubeList.add(new ModelBox(Vktor, 0, 0, -2.0F, -17.0F, -2.0F, 9, 8, 8, 0.0F, false));
			Vktor.cubeList.add(new ModelBox(Vktor, 20, 23, -1.0F, -16.0F, -1.0F, 7, 7, 6, 0.0F, false));
			Vktor.cubeList.add(new ModelBox(Vktor, 0, 16, -1.0F, -9.0F, -1.0F, 7, 7, 6, 0.0F, false));
			Vktor.cubeList.add(new ModelBox(Vktor, 26, 3, 6.0F, -4.0F, 1.0F, 2, 1, 2, 0.0F, false));
			Vktor.cubeList.add(new ModelBox(Vktor, 26, 0, -3.0F, -4.0F, 1.0F, 2, 1, 2, 0.0F, false));
			Vktor.cubeList.add(new ModelBox(Vktor, 20, 16, 6.0F, -8.0F, 1.0F, 2, 4, 2, 0.0F, false));
			Vktor.cubeList.add(new ModelBox(Vktor, 0, 19, 4.0F, -1.0F, 0.5F, 1, 1, 2, 0.0F, false));
			Vktor.cubeList.add(new ModelBox(Vktor, 0, 0, -3.0F, -8.0F, 1.0F, 2, 4, 2, 0.0F, false));
			Vktor.cubeList.add(new ModelBox(Vktor, 0, 16, 0.0F, -1.0F, 0.5F, 1, 1, 2, 0.0F, false));
			Vktor.cubeList.add(new ModelBox(Vktor, 4, 6, 4.0F, -2.0F, 1.5F, 1, 1, 1, 0.0F, false));
			Vktor.cubeList.add(new ModelBox(Vktor, 0, 6, 0.0F, -2.0F, 1.5F, 1, 1, 1, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			Vktor.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		}
	}
}
