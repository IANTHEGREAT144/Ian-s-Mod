
package net.mcreator.iansmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.iansmod.item.ItemRawPatty;
import net.mcreator.iansmod.item.ItemCookedPatty;
import net.mcreator.iansmod.ElementsIansMod;

@ElementsIansMod.ModElement.Tag
public class RecipeCKKPTTY extends ElementsIansMod.ModElement {
	public RecipeCKKPTTY(ElementsIansMod instance) {
		super(instance, 53);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemRawPatty.block, (int) (1)), new ItemStack(ItemCookedPatty.block, (int) (1)), 1F);
	}
}
