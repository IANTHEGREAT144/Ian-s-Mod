
package net.mcreator.iansmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.iansmod.creativetab.TabIngredients;
import net.mcreator.iansmod.ElementsIansMod;

@ElementsIansMod.ModElement.Tag
public class ItemRawPatty extends ElementsIansMod.ModElement {
	@GameRegistry.ObjectHolder("iansmod:rawpatty")
	public static final Item block = null;
	public ItemRawPatty(ElementsIansMod instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("iansmod:rawpatty", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(1, 0.1f, false);
			setUnlocalizedName("rawpatty");
			setRegistryName("rawpatty");
			setCreativeTab(TabIngredients.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
