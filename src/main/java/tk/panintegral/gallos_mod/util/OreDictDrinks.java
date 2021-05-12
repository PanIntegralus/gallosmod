
package tk.panintegral.gallos_mod.util;

import tk.panintegral.gallos_mod.item.ItemMonsterEnergyUltraRed;
import tk.panintegral.gallos_mod.item.ItemMonsterEnergyPacificPunch;
import tk.panintegral.gallos_mod.item.ItemMonsterEnergyLewisHamilton;
import tk.panintegral.gallos_mod.item.ItemMonsterEnergy;
import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsGallosModMod.ModElement.Tag
public class OreDictDrinks extends ElementsGallosModMod.ModElement {
	public OreDictDrinks(ElementsGallosModMod instance) {
		super(instance, 29);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("monster_energy_tag", new ItemStack(ItemMonsterEnergy.block, (int) (1)));
		OreDictionary.registerOre("monster_energy_tag", new ItemStack(ItemMonsterEnergyLewisHamilton.block, (int) (1)));
		OreDictionary.registerOre("monster_energy_tag", new ItemStack(ItemMonsterEnergyPacificPunch.block, (int) (1)));
		OreDictionary.registerOre("monster_energy_tag", new ItemStack(ItemMonsterEnergyUltraRed.block, (int) (1)));
	}
}
