package TemplateMethodPattern;

public class CreditCardPaymentProcessor extends PaymentProcessor
{
	private int balance;

	public CreditCardPaymentProcessor(int balance)
	{
		this.balance = balance;
	}

	@Override
	protected boolean doesBalanceCheck()
	{
		return true;
	}

	@Override
	protected int getBalance()
	{
		return balance;
	}

	@Override
	protected String invokeAPI(int userId, int amount)
	{
		balance -= amount;
		// sending amount to user using creditcard
		return "Success";
	}
}
