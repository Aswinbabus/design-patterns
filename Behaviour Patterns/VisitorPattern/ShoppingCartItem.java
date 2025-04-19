package VisitorPattern;

import VisitorPattern.visitors.DiscountCalculator;
import VisitorPattern.visitors.ShippingCostEstimator;
import VisitorPattern.visitors.TaxCalculator;

public abstract class ShoppingCartItem
{
	private String name;
	private Double price;
	private Integer quantity;

	public ShoppingCartItem() {

	}

	public ShoppingCartItem(String name, Double price, Integer quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}

	public Integer getQuantity()
	{
		return quantity;
	}

	public void setQuantity(Integer quantity)
	{
		this.quantity = quantity;
	}

	protected abstract Double calculateDiscount(DiscountCalculator discountCalculator);

	protected abstract Integer calculateShippingCost(ShippingCostEstimator shippingCostEstimator);

	protected abstract Double calculateTax(TaxCalculator taxCalculator);


}
