
package net.mcreator.iansmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.iansmod.item.ItemSalt;
import net.mcreator.iansmod.ElementsIansMod;

@ElementsIansMod.ModElement.Tag
public class RecipeSLT extends ElementsIansMod.ModElement {
	public RecipeSLT(ElementsIansMod instance) {
		super(instance, 64);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.WATER_BUCKET, (int) (1)), new ItemStack(ItemSalt.block, (int) (2)), 1F);
	}
}
