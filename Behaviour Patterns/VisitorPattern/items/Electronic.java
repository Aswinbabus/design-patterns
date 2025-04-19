package VisitorPattern.items;

import VisitorPattern.ShoppingCartItem;
import VisitorPattern.visitors.DiscountCalculator;
import VisitorPattern.visitors.ShippingCostEstimator;
import VisitorPattern.visitors.TaxCalculator;

public class Electronic extends ShoppingCartItem
{

	@Override
	protected Double calculateDiscount(DiscountCalculator discountCalculator)
	{
		return discountCalculator.visit(this);
	}

	@Override
	protected Integer calculateShippingCost(ShippingCostEstimator shippingCostEstimator)
	{
		return shippingCostEstimator.visit(this);
	}

	@Override
	protected Double calculateTax(TaxCalculator taxCalculator)
	{
		return taxCalculator.visit(this);
	}
}
