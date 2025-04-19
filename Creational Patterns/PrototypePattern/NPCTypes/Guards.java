package PrototypePattern.NPCTypes;

import PrototypePattern.NonPlayerCharacter;

public class Guards extends NonPlayerCharacter
{

	private String guardPosition;

	public Guards(String weaponsPath,String itemsPath,String armorPath,String visualModelPath,String soundPath,String animationPath,String guardPosition)
	{
		super(weaponsPath,itemsPath,armorPath,visualModelPath,soundPath,animationPath);
		this.guardPosition = guardPosition;
	}

	public Guards(Guards guards) {
		super(guards);
		this.guardPosition = guards.getGuardPosition();
	}

	@Override
	protected NonPlayerCharacter clone()
	{
		return new Guards(this);
	}

	public String getGuardPosition()
	{
		return guardPosition;
	}
}
