package tk.panintegral.gallos_mod.procedure;

import tk.panintegral.gallos_mod.item.ItemLecheDeCabra;
import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsGallosModMod.ModElement.Tag
public class ProcedurePitusaRightClickedOnEntity extends ElementsGallosModMod.ModElement {
	public ProcedurePitusaRightClickedOnEntity(ElementsGallosModMod instance) {
		super(instance, 45);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PitusaRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PitusaRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.BUCKET, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemLecheDeCabra.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.BUCKET, (int) (1)).getItem(), -1, (int) 1, null);
			world.playSound((EntityPlayer) null, (entity.posX), (entity.posY), (entity.posZ),
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.cow.milk")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		}
	}
}
