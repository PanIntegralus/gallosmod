
package tk.panintegral.gallos_mod.item;

import tk.panintegral.gallos_mod.creativetab.TabGallosMod;
import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsGallosModMod.ModElement.Tag
public class ItemLecheDeCabra extends ElementsGallosModMod.ModElement {
	@GameRegistry.ObjectHolder("gallos_mod:leche_de_cabra")
	public static final Item block = null;
	public ItemLecheDeCabra(ElementsGallosModMod instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("gallos_mod:leche_de_cabra", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 0f, false);
			setUnlocalizedName("leche_de_cabra");
			setRegistryName("leche_de_cabra");
			setAlwaysEdible();
			setCreativeTab(TabGallosMod.tab);
			setMaxStackSize(1);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.DRINK;
		}
	}
}
