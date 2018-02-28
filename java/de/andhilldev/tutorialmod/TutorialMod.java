package de.andhilldev.tutorialmod;

import de.andhilldev.tutorialmod.init.ModBlocks;
import de.andhilldev.tutorialmod.init.ModItems;
import de.andhilldev.tutorialmod.misc.MyTab;
import de.andhilldev.tutorialmod.misc.References;
import de.andhilldev.tutorialmod.proxies.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=References.MODID, name=References.MODNAME, version=References.MODVERSION, acceptedMinecraftVersions=References.MCVERSIONS)
public class TutorialMod {
	
	@Instance
	public static TutorialMod instance;
	
	@SidedProxy(clientSide=References.CLIENT_PROXY, serverSide=References.SERVER_PROXY)
	public static CommonProxy proxy;
	
	// Creative Tab
	public static CreativeTabs tab = new MyTab(CreativeTabs.getNextID(), "MyTab");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModBlocks.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		ModItems.register();
		ModBlocks.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}