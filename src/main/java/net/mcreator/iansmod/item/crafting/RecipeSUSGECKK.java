
package net.mcreator.iansmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.iansmod.item.ItemSausage;
import net.mcreator.iansmod.item.ItemRawsausage;
import net.mcreator.iansmod.ElementsIansMod;

@ElementsIansMod.ModElement.Tag
public class RecipeSUSGECKK extends ElementsIansMod.ModElement {
	public RecipeSUSGECKK(ElementsIansMod instance) {
		super(instance, 63);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemRawsausage.block, (int) (1)), new ItemStack(ItemSausage.block, (int) (1)), 1F);
	}
}
