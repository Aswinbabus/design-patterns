package PrototypePattern.NPCTypes;

import PrototypePattern.NonPlayerCharacter;
import VisitorPattern.ShoppingCart;

public class ShopKeeper extends NonPlayerCharacter
{

	String shopType;

	public ShopKeeper(String weaponsPath,String itemsPath,String armorPath,String visualModelPath,String soundPath,String animationPath,String shopType)
	{
		super(weaponsPath, itemsPath, armorPath, visualModelPath, soundPath, animationPath);
		this.shopType = shopType;
	}

    public ShopKeeper(ShopKeeper shopKeeper) {

		super(shopKeeper);
		this.shopType = getShopType();

	}

	@Override
	protected NonPlayerCharacter clone()
	{
		return new ShopKeeper(this);
	}

	public String getShopType()
	{
		return shopType;
	}
}
