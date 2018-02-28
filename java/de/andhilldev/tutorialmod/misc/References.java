package de.andhilldev.tutorialmod.misc;

public class References {
	
	public static final String MODID = "tutorialmod";
	public static final String MODNAME = "Tutorial Mod";
	public static final String MODVERSION = "1.0";
	public static final String MCVERSIONS = "[1.8.9]";
	
	public static final String CLIENT_PROXY = "de.andhilldev.tutorialmod.proxies.ClientProxy";
	public static final String SERVER_PROXY = "de.andhilldev.tutorialmod.proxies.ServerProxy";
	
	public static enum TutorialModItems {
		
		TUTORIALITEM("itemTutorialItem", "itemTutorialItem");
		
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}

		public String getRegistryName() {
			return registryName;
		}
		
		
		
	}
	
}