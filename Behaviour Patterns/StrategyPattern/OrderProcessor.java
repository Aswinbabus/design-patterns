package StrategyPattern;

public class OrderProcessor
{
	private Product product;
	private int quantity;
	private User user;
	private int time;

	public OrderProcessor(Product product, int quantity,int time, User user)
	{
		this.product = product;
		this.quantity = quantity;
		this.user = user;
		this.time = time;
	}

	public double computeCost() {

		return product.computePrice(new OrderDetails(quantity, time,user));

	}

}
