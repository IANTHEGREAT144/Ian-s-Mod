
package net.mcreator.iansmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.iansmod.item.ItemRawGroundBeef;
import net.mcreator.iansmod.item.ItemCookedGroundBeef;
import net.mcreator.iansmod.ElementsIansMod;

@ElementsIansMod.ModElement.Tag
public class RecipeGRNDBFFCKKD extends ElementsIansMod.ModElement {
	public RecipeGRNDBFFCKKD(ElementsIansMod instance) {
		super(instance, 46);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemRawGroundBeef.block, (int) (1)), new ItemStack(ItemCookedGroundBeef.block, (int) (1)), 1F);
	}
}
