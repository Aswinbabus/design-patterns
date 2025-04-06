package StrategyPattern.pricingStrategies;

import StrategyPattern.OrderDetails;
import StrategyPattern.PricingStrategy;
import StrategyPattern.Product;

public class UserBasedStrategy implements PricingStrategy
{

	public static final PricingStrategy INSTANCE = new UserBasedStrategy();
	public static final int LOYAL_USER_DISCOUNT = 10;

	@Override
	public double computePrice(Product product, OrderDetails orderDetails)
	{

		if(orderDetails.getUser().isLoyalUser()) {

			double offerPrice = product.getBasePrice() * 10 / 100;

			return (product.getBasePrice() - offerPrice) * orderDetails.getQuantity();

		}

		return product.getBasePrice() * orderDetails.getQuantity();

	}

	public static PricingStrategy getInstance()
	{
		return INSTANCE;
	}

}
