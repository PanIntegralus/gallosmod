
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
public class ItemMonsterEnergyLewisHamilton extends ElementsGallosModMod.ModElement {
	@GameRegistry.ObjectHolder("gallos_mod:monster_energy_lewis_hamilton")
	public static final Item block = null;
	public ItemMonsterEnergyLewisHamilton(ElementsGallosModMod instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("gallos_mod:monster_energy_lewis_hamilton", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 0.3f, false);
			setUnlocalizedName("monster_energy_lewis_hamilton");
			setRegistryName("monster_energy_lewis_hamilton");
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
