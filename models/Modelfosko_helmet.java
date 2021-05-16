// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelfosko_helmet extends EntityModel<Entity> {
	private final ModelRenderer group;

	public Modelfosko_helmet() {
		textureWidth = 64;
		textureHeight = 64;

		group = new ModelRenderer(this);
		group.setRotationPoint(-8.0F, 16.0F, 8.0F);
		group.setTextureOffset(8, 28).addBox(-7.0F, -7.25F, -8.0F, 14.0F, 3.0F, 0.0F, 0.0F, false);
		group.setTextureOffset(30, 47).addBox(-8.0F, -8.0F, -2.0F, 1.0F, 16.0F, 9.0F, 0.0F, false);
		group.setTextureOffset(0, 47).addBox(7.0F, -8.0F, -2.0F, 1.0F, 16.0F, 9.0F, 0.0F, false);
		group.setTextureOffset(20, 48).addBox(-8.0F, -4.3F, -8.0F, 1.0F, 10.0F, 6.0F, 0.0F, false);
		group.setTextureOffset(40, 47).addBox(7.0F, -4.3F, -8.0F, 1.0F, 10.0F, 6.0F, 0.0F, false);
		group.setTextureOffset(40, 30).addBox(-7.0F, -4.3F, -8.0F, 14.0F, 10.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(38, 48).addBox(-8.0F, -8.0F, -8.0F, 1.0F, 3.0F, 6.0F, 0.0F, true);
		group.setTextureOffset(38, 48).addBox(7.0F, -8.0F, -8.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		group.setTextureOffset(34, 18).addBox(-7.5F, -8.0F, 7.0F, 15.0F, 16.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(46, 16).addBox(-7.5F, -8.5F, -8.0F, 15.0F, 1.0F, 15.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		group.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}