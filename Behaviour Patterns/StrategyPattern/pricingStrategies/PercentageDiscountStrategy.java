package StrategyPattern.pricingStrategies;

import StrategyPattern.OrderDetails;
import StrategyPattern.PricingStrategy;
import StrategyPattern.Product;

public class PercentageDiscountStrategy implements PricingStrategy
{

	public static final PricingStrategy INSTANCE = new PercentageDiscountStrategy();
	public static final int PERCENTAGE_DISCOUNT = 20;

	@Override
	public double computePrice(Product product, OrderDetails orderDetails)
	{

		double cost = product.getBasePrice();

		double discount = cost * PERCENTAGE_DISCOUNT / 100;

		return (cost - discount) * orderDetails.getQuantity();

	}

	public static PricingStrategy getInstance()
	{
		return INSTANCE;
	}
}
