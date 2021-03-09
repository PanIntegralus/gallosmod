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