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
		textureWidth = 128;
		textureHeight = 128;

		BODY = new ModelRenderer(this);
		BODY.setRotationPoint(0.0F, 24.0F, 0.75F);

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.0525F, -19.0873F, -8.8682F);
		BODY.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 70, 0.5497F, -12.789F, -4.6744F, 3, 8, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 58, 67, -3.5072F, -12.749F, -4.6744F, 3, 8, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.9175F, -2.6347F, -3.4347F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, -2.3562F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 0, -1.53F, -1.6F, -4.2F, 3, 3, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 48, 8.27F, -1.6F, -4.2F, 3, 3, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0525F, -1.8427F, -1.7518F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 35, -3.5F, -4.15F, -11.13F, 7, 8, 13, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-5.49F, -8.45F, 7.14F);
		BODY.addChild(rightleg);
		rightleg.cubeList.add(new ModelBox(rightleg, 20, 64, -2.54F, 5.45F, -2.51F, 5, 3, 5, 0.0F, false));
		rightleg.cubeList.add(new ModelBox(rightleg, 56, 0, -2.96F, -0.95F, -2.99F, 6, 8, 6, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.34F, -8.45F, -6.86F);
		BODY.addChild(rightarm);
		rightarm.cubeList.add(new ModelBox(rightarm, 24, 50, -2.96F, -0.95F, -2.99F, 6, 8, 6, 0.0F, false));
		rightarm.cubeList.add(new ModelBox(rightarm, 63, 59, -2.54F, 5.45F, -2.51F, 5, 3, 5, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(5.81F, -8.45F, 7.14F);
		BODY.addChild(leftleg);
		leftleg.cubeList.add(new ModelBox(leftleg, 50, 18, -2.96F, -0.95F, -2.99F, 6, 8, 6, 0.0F, false));
		leftleg.cubeList.add(new ModelBox(leftleg, 0, 62, -2.54F, 5.45F, -2.51F, 5, 3, 5, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.36F, -8.45F, -6.86F);
		BODY.addChild(leftarm);
		leftarm.cubeList.add(new ModelBox(leftarm, 0, 48, -2.96F, -0.95F, -2.99F, 6, 8, 6, 0.0F, false));
		leftarm.cubeList.add(new ModelBox(leftarm, 48, 56, -2.54F, 5.45F, -2.51F, 5, 3, 5, 0.0F, false));

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.155F, -13.75F, -0.4F);
		BODY.addChild(torso);
		torso.cubeList.add(new ModelBox(torso, 0, 24, -8.445F, -6.25F, -0.35F, 17, 13, 11, 0.0F, false));
		torso.cubeList.add(new ModelBox(torso, 0, 0, -9.055F, -7.25F, -10.15F, 18, 14, 10, 0.0F, false));

		cola = new ModelRenderer(this);
		cola.setRotationPoint(0.1F, -16.4202F, 8.4885F);
		BODY.addChild(cola);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.1F, 0.1F, 0.1802F);
		cola.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 64, -1.6F, -1.6F, -0.1802F, 3, 3, 6, 0.0F, false));
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
		this.rightarm.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.cola.rotateAngleY = f2 / 20.f;
	}
}