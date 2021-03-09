package tk.panintegral.gallos_mod.procedure;

import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import java.util.Map;

@ElementsGallosModMod.ModElement.Tag
public class ProcedureGallobossEntityDies extends ElementsGallosModMod.ModElement {
	public ProcedureGallobossEntityDies(ElementsGallosModMod instance) {
		super(instance, 14);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GallobossEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GallobossEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) (entity.posX), (int) (entity.posY), (int) (entity.posZ));
			IBlockState _bs = Blocks.FLOWING_LAVA.getDefaultState();
			IBlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
				IProperty _property = entry.getKey();
				if (_bs.getPropertyKeys().contains(_property))
					_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
	}
}
