package PrototypePattern.NPCTypes;

import PrototypePattern.NonPlayerCharacter;

public class Villager extends NonPlayerCharacter
{


	private String color;

	public Villager(String weaponsPath,String itemsPath,String armorPath,String visualModelPath,String soundPath,String animationPath,String color)
	{
		super(weaponsPath, itemsPath, armorPath, visualModelPath, soundPath, animationPath);
		this.color = getColor();
	}

	public Villager(Villager villager)
	{
		super(villager);
		this.color = villager.color;
	}

	// shallow clone - immutable but logically shallow
	@Override
	protected NonPlayerCharacter clone()
	{
        return new Villager(this);
	}

	public String getColor()
	{
		return color;
	}
}
