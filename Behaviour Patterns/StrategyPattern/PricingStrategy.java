package StrategyPattern;

public interface PricingStrategy
{
	double computePrice(Product product,OrderDetails orderDetails);
}
