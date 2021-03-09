
package tk.panintegral.gallos_mod.creativetab;

import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

@ElementsGallosModMod.ModElement.Tag
public class TabGallosMod extends ElementsGallosModMod.ModElement {
	public TabGallosMod(ElementsGallosModMod instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabgallos_mod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.FEATHER, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
