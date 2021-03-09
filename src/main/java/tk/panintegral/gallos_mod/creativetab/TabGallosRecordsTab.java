
package tk.panintegral.gallos_mod.creativetab;

import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

@ElementsGallosModMod.ModElement.Tag
public class TabGallosRecordsTab extends ElementsGallosModMod.ModElement {
	public TabGallosRecordsTab(ElementsGallosModMod instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabgallos_records_tab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.NOTEBLOCK, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
