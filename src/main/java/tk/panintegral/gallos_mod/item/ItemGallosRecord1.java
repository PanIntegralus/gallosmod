
package tk.panintegral.gallos_mod.item;

import tk.panintegral.gallos_mod.creativetab.TabGallosRecordsTab;
import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsGallosModMod.ModElement.Tag
public class ItemGallosRecord1 extends ElementsGallosModMod.ModElement {
	@GameRegistry.ObjectHolder("gallos_mod:gallos_record_1")
	public static final Item block = null;
	public ItemGallosRecord1(ElementsGallosModMod instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("gallos_mod:gallos_record_1", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("gallos_record_1", ElementsGallosModMod.sounds.get(new ResourceLocation("gallos_mod:gallos_record_1")));
			setUnlocalizedName("gallos_record_1");
			setRegistryName("gallos_record_1");
			setCreativeTab(TabGallosRecordsTab.tab);
		}
	}
}
