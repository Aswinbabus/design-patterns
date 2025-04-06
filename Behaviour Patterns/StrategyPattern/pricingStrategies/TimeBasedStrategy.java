package StrategyPattern.pricingStrategies;

import StrategyPattern.OrderDetails;
import StrategyPattern.PricingStrategy;
import StrategyPattern.Product;

public class TimeBasedStrategy implements PricingStrategy
{

	public static final PricingStrategy INSTANCE = new TimeBasedStrategy();
	public static final int PEEK_START_TIME = 4;
	public static final int PEEK_END_TIME = 8;
    public static final double ADDITIONAL_PRICE = 200;

	@Override
	public double computePrice(Product product, OrderDetails orderDetails)
	{

		if(orderDetails.getTime() >= 4 && orderDetails.getTime() <= 8) {

			return (product.getBasePrice() + ADDITIONAL_PRICE) * orderDetails.getQuantity();

		}

		return product.getBasePrice() * orderDetails.getQuantity();

	}

	public static PricingStrategy getInstance()
	{
		return INSTANCE;
	}
}
