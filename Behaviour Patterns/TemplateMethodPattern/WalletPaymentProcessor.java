package TemplateMethodPattern;

public class WalletPaymentProcessor extends PaymentProcessor
{

	public int balance;

	public WalletPaymentProcessor(int balance)
	{
		this.balance = balance;
	}


	@Override
	protected String invokeAPI(int userId, int amount)
	{
		balance -= amount;
		// sending money using wallet
		return "Success";
	}
}
