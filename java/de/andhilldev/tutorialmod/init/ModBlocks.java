package de.andhilldev.tutorialmod.init;

import de.andhilldev.tutorialmod.misc.References;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModBlocks {

	public static void init( ) {
		
	}
	
	public static void register() {
		
	}
	
	public static void registerRenderer() {
		
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(References.MODID+":"+block.getRegistryName().substring(5), "inventory"));
	}
	
}
