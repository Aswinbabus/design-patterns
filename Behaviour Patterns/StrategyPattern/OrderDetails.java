package StrategyPattern;

public class OrderDetails
{

	private int quantity;
	private int time;
	private User user;

	public OrderDetails(int quantity, int time,User user)
	{
		this.quantity = quantity;
		this.time = time;
		this.user = user;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public int getTime()
	{
		return time;
	}

	public User getUser()
	{
		return user;
	}
}
