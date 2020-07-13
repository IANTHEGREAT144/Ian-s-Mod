
package net.mcreator.iansmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.iansmod.item.ItemFriedChicken;
import net.mcreator.iansmod.item.ItemChickenBattered;
import net.mcreator.iansmod.ElementsIansMod;

@ElementsIansMod.ModElement.Tag
public class RecipeFRDCHIK extends ElementsIansMod.ModElement {
	public RecipeFRDCHIK(ElementsIansMod instance) {
		super(instance, 54);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemChickenBattered.block, (int) (1)), new ItemStack(ItemFriedChicken.block, (int) (1)), 1F);
	}
}
