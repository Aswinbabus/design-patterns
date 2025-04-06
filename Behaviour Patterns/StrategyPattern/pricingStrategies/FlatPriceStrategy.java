package StrategyPattern.pricingStrategies;

import StrategyPattern.OrderDetails;
import StrategyPattern.PricingStrategy;
import StrategyPattern.Product;

public class FlatPriceStrategy implements PricingStrategy
{
	public static final double FLAT_PRICE = 999;
    public static final PricingStrategy instance = new FlatPriceStrategy();

	@Override
	public double computePrice(Product product, OrderDetails orderDetails)
	{
		return FLAT_PRICE * orderDetails.getQuantity();
	}

	public static PricingStrategy getInstance()
	{
		return instance;
	}


}
