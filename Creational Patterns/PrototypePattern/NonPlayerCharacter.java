package PrototypePattern;

public abstract class NonPlayerCharacter {



	private String weapons;
    private String items;
    private String armor;

	// varies for each npcType
	private String visualModel;
	private String sound;
	private String animations;


	public NonPlayerCharacter(String weaponsPath,String itemsPath,String armorPath,String visualModelPath,String soundPath,String animationPath)
	{
		loadWeapons(weaponsPath);
		loadArmors(armorPath);
		loadItems(itemsPath);
		loadVisualModel(visualModelPath);
		loadAnimations(animationPath);
		loadSound(soundPath);
	}

	public NonPlayerCharacter(NonPlayerCharacter nonPlayerCharacter) {

		this.weapons = nonPlayerCharacter.getWeapons();
		this.items = nonPlayerCharacter.getItems();
		this.armor = nonPlayerCharacter.getArmor();
		this.sound = nonPlayerCharacter.getSound();
		this.animations = nonPlayerCharacter.getAnimations();
		this.visualModel = nonPlayerCharacter.getVisualModel();

	}

	public void loadWeapons(String path) {
		// parsing the weapons details from disk path
		weapons = null;
	}

	public void loadItems(String path) {
		// paring the items details from disk
		items = null;
	}

	public void loadArmors(String path) {
		// paring the armors details from disk
		armor = null;
	}

	public void loadVisualModel(String path) {
		this.visualModel = null;
	}

	public void loadSound(String path) {
		sound = null;
	}

	public void loadAnimations(String path) {
		animations = null;
	}

	protected abstract NonPlayerCharacter clone();

	public String getAnimations()
	{
		return animations;
	}

	public String getArmor()
	{
		return armor;
	}

	public String getItems()
	{
		return items;
	}

	public String getSound()
	{
		return sound;
	}

	public String getVisualModel()
	{
		return visualModel;
	}

	public String getWeapons()
	{
		return weapons;
	}



}
