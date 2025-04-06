package StrategyPattern.pricingStrategies;

import StrategyPattern.OrderDetails;
import StrategyPattern.PricingStrategy;
import StrategyPattern.Product;

public class TieredPricingStrategy implements PricingStrategy
{
	public static final PricingStrategy INSTANCE = new TieredPricingStrategy();
	public static final int OFFER_COUNT = 5;
	public static final int OFFER_PRICE = 100;
	@Override
	public double computePrice(Product product, OrderDetails orderDetails)
	{
		if(orderDetails.getQuantity() > OFFER_COUNT)
		{
			return orderDetails.getQuantity() * (product.getBasePrice() - OFFER_PRICE);
		}
		else
		{
			return orderDetails.getQuantity() * product.getBasePrice();
		}
	}

	public static PricingStrategy getInstance()
	{
		return INSTANCE;
	}
}
