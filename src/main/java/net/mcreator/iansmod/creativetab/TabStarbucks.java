
package net.mcreator.iansmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.iansmod.item.ItemCoffee;
import net.mcreator.iansmod.ElementsIansMod;

@ElementsIansMod.ModElement.Tag
public class TabStarbucks extends ElementsIansMod.ModElement {
	public TabStarbucks(ElementsIansMod instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabstarbucks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCoffee.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
