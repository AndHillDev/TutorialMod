package de.andhilldev.tutorialmod.proxies;

import de.andhilldev.tutorialmod.init.ModBlocks;
import de.andhilldev.tutorialmod.init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenderer();
		ModBlocks.registerRenderer();
	}

}
