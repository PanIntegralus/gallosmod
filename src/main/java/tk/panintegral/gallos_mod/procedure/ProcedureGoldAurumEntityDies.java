package tk.panintegral.gallos_mod.procedure;

import tk.panintegral.gallos_mod.item.ItemAurumita;
import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityItem;

import java.util.Random;
import java.util.Map;

@ElementsGallosModMod.ModElement.Tag
public class ProcedureGoldAurumEntityDies extends ElementsGallosModMod.ModElement {
	public ProcedureGoldAurumEntityDies(ElementsGallosModMod instance) {
		super(instance, 34);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GoldAurumEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GoldAurumEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GoldAurumEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GoldAurumEntityDies!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((new Random()).nextInt((int) 100 + 1)) < 20)) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, Math.round(x), Math.round(y), Math.round(z),
						new ItemStack(ItemAurumita.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		} else {
			for (int index0 = 0; index0 < (int) (((new Random()).nextInt((int) 6 + 1))); index0++) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, Math.round(x), Math.round(y), Math.round(z),
							new ItemStack(Blocks.DEADBUSH, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
