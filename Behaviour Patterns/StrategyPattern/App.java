package StrategyPattern;

import StrategyPattern.pricingStrategies.FlatPriceStrategy;
import StrategyPattern.pricingStrategies.PercentageDiscountStrategy;
import StrategyPattern.pricingStrategies.TieredPricingStrategy;
import StrategyPattern.pricingStrategies.TimeBasedStrategy;
import StrategyPattern.pricingStrategies.UserBasedStrategy;

public class App
{

	public static void main(String[] args)
	{

		// Flat price
		OrderProcessor order1 = new OrderProcessor(new Product(2000, FlatPriceStrategy.getInstance()),2,4,new User(false));
        assert order1.computeCost() == 1998.0;


		// Percentage Price
		OrderProcessor order2 = new OrderProcessor(new Product(2000, PercentageDiscountStrategy.getInstance()),2,6,new User(false));
		assert order2.computeCost() == 3200.0;

		// Tiered Pricing
		OrderProcessor order3 = new OrderProcessor(new Product(2000, TieredPricingStrategy.getInstance()),6,6,new User(false));
		assert order3.computeCost() == 11400.0;

		// Time Based
		OrderProcessor order4 = new OrderProcessor(new Product(2000, TimeBasedStrategy.getInstance()),1,6,new User(false));
		assert order4.computeCost() == 2200.0;


		//Loyal Customer
		OrderProcessor order5 = new OrderProcessor(new Product(2000, UserBasedStrategy.getInstance()),1,6,new User(true));

		assert order5.computeCost() == 1800.0;



	}

}
