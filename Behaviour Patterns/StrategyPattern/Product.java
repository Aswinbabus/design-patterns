package StrategyPattern;

import StrategyPattern.pricingStrategies.FlatPriceStrategy;

public class Product
{
	private PricingStrategy currPricingStrategy;
    private double basePrice;

	public Product(double basePrice,PricingStrategy pricingStrategy) {
        currPricingStrategy = pricingStrategy;
		this.basePrice = basePrice;
	}

	public double computePrice(OrderDetails orderDetails) {
		return currPricingStrategy.computePrice(this,orderDetails);
	}

	public void setCurrPricingStrategy(PricingStrategy pricingStrategy) {
		this.currPricingStrategy = pricingStrategy;
	}

	public double getBasePrice()
	{
		return basePrice;
	}
}
