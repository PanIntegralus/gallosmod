package tk.panintegral.gallos_mod.procedure;

import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import java.util.Map;

@ElementsGallosModMod.ModElement.Tag
public class ProcedureGallobossNaturalEntitySpawningCondition extends ElementsGallosModMod.ModElement {
	public ProcedureGallobossNaturalEntitySpawningCondition(ElementsGallosModMod instance) {
		super(instance, 15);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("Un gallo boss ha aparecido..."));
		}
	}
}
