package de.andhilldev.tutorialmod.items;

import de.andhilldev.tutorialmod.TutorialMod;
import net.minecraft.item.Item;

public class MyItem extends Item {
	public MyItem(String unlocalizedName, String registryName, int maxStackSize) {
		this.setCreativeTab(TutorialMod.tab);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
		this.setMaxStackSize(maxStackSize);
	}
}