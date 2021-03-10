package tk.panintegral.gallos_mod.procedure;

import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsGallosModMod.ModElement.Tag
public class ProcedurePanMustioFoodEaten extends ElementsGallosModMod.ModElement {
	public ProcedurePanMustioFoodEaten(ElementsGallosModMod instance) {
		super(instance, 39);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PanMustioFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!(((entity.getDisplayName().getUnformattedText())).equals("penisu777")))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 320, (int) 1, (false), (true)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 320, (int) 1, (false), (true)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 320, (int) 1, (false), (true)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, (int) 320, (int) 1, (false), (true)));
		}
	}
}
