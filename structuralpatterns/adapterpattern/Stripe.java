package adapterpattern;

public class Stripe implements PaymentProcessor
{
	@Override
	public void pay(String customerId, double amount)
	{

		System.out.println("Payment processed using Stripe");

	}
}
