package de.andhilldev.tutorialmod.init;

import de.andhilldev.tutorialmod.items.MyItem;
import de.andhilldev.tutorialmod.misc.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item tutorialItem;

	public static void init() {
		tutorialItem = new MyItem(References.TutorialModItems.TUTORIALITEM.getUnlocalizedName(), References.TutorialModItems.TUTORIALITEM.getRegistryName(),16);
	}
	
	public static void register() {
		GameRegistry.registerItem(tutorialItem);
	}
	
	public static void registerRenderer() {
		registerRender(tutorialItem);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID+":"+item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}