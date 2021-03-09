
package tk.panintegral.gallos_mod.item.crafting;

import tk.panintegral.gallos_mod.item.ItemAurumita;
import tk.panintegral.gallos_mod.block.BlockAurumitaore;
import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsGallosModMod.ModElement.Tag
public class RecipeAurumitaCraft extends ElementsGallosModMod.ModElement {
	public RecipeAurumitaCraft(ElementsGallosModMod instance) {
		super(instance, 17);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAurumitaore.block, (int) (1)), new ItemStack(ItemAurumita.block, (int) (1)), 1F);
	}
}
