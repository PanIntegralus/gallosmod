// Made with Blockbench 3.8.0
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelteclado extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public Modelteclado() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.4064F, 8.0F, 0.5643F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.6032F, 14.5F, 0.1322F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.3491F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 14, -0.6F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.6032F, 1.5F, 0.1322F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 0, -0.6F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.4064F, 16.0F, -0.5643F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.0436F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -3.0F, -16.0F, 0.0F, 6, 16, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
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