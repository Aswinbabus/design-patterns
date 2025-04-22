package adapterpattern;

public class Paypal implements PaymentProcessor
{
	@Override
	public void pay(String customerId, double amount)
	{
		System.out.println("Payment processed using Paypal");
	}
}
