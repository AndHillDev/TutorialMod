package de.andhilldev.tutorialmod.misc;

import de.andhilldev.tutorialmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MyTab extends CreativeTabs {

	public MyTab(int index, String label) {
		super(index, label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.tutorialItem;
	}

}
