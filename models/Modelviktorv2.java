// Made with Blockbench 3.8.0
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelviktorv2 extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer rleg;
	private final ModelRenderer lleg;
	private final ModelRenderer rarm;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer larm;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer torso;

	public Modelviktorv2() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.05F, 18.5F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.05F, -3.5F, -0.075F);
		body.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -7.0F, -3.625F, 7, 7, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 14, -3.0F, -6.1F, -3.175F, 6, 6, 6, 0.0F, false));

		rleg = new ModelRenderer(this);
		rleg.setRotationPoint(-1.4F, 3.375F, -0.25F);
		body.addChild(rleg);
		rleg.cubeList.add(new ModelBox(rleg, 18, 14, -0.55F, 0.125F, -0.45F, 1, 2, 1, 0.0F, false));

		lleg = new ModelRenderer(this);
		lleg.setRotationPoint(1.35F, 3.375F, -0.15F);
		body.addChild(lleg);
		lleg.cubeList.add(new ModelBox(lleg, 18, 17, -0.45F, 0.125F, -0.55F, 1, 2, 1, 0.0F, false));

		rarm = new ModelRenderer(this);
		rarm.setRotationPoint(-1.85F, -2.675F, 0.05F);
		body.addChild(rarm);

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(-0.919F, -0.4207F, -0.25F);
		rarm.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.0F, 0.0F, 0.3927F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 0, 14, 0.269F, -0.1543F, -0.5F, 1, 5, 1, 0.0F, false));

		larm = new ModelRenderer(this);
		larm.setRotationPoint(1.926F, -2.7415F, 0.05F);
		body.addChild(larm);

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(-4.695F, -0.3542F, -0.25F);
		larm.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.0F, 0.0F, -0.3927F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 0, 0, 3.769F, 1.9957F, -0.5F, 1, 5, 1, 0.0F, false));

		torso = new ModelRenderer(this);
		torso.setRotationPoint(-0.05F, 0.0F, -0.25F);
		body.addChild(torso);
		torso.cubeList.add(new ModelBox(torso, 21, 23, -2.5F, -3.5F, -1.5F, 5, 7, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
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
		this.lleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.larm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.rleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}