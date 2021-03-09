
package tk.panintegral.gallos_mod.item;

import tk.panintegral.gallos_mod.creativetab.TabGallosMod;
import tk.panintegral.gallos_mod.ElementsGallosModMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsGallosModMod.ModElement.Tag
public class ItemAurumitaArmor extends ElementsGallosModMod.ModElement {
	@GameRegistry.ObjectHolder("gallos_mod:aurumita_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("gallos_mod:aurumita_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("gallos_mod:aurumita_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("gallos_mod:aurumita_armorboots")
	public static final Item boots = null;
	public ItemAurumitaArmor(ElementsGallosModMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AURUMITA_ARMOR", "gallos_mod:aurumita_armor__", 25, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_gold")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("aurumita_armorhelmet")
				.setRegistryName("aurumita_armorhelmet").setCreativeTab(TabGallosMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("aurumita_armorbody")
				.setRegistryName("aurumita_armorbody").setCreativeTab(TabGallosMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("aurumita_armorlegs")
				.setRegistryName("aurumita_armorlegs").setCreativeTab(TabGallosMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("aurumita_armorboots")
				.setRegistryName("aurumita_armorboots").setCreativeTab(TabGallosMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("gallos_mod:aurumita_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("gallos_mod:aurumita_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("gallos_mod:aurumita_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("gallos_mod:aurumita_armorboots", "inventory"));
	}
}
