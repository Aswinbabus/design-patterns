package TemplateMethodPattern;

public class UPIPaymentProcessor extends PaymentProcessor
{
	private int balance;

	public UPIPaymentProcessor(int balance)
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
		balance-=amount;
		// sending amount to user using upi
		return "Success";
	}

	@Override
	protected boolean fraudDetection(int userId)
	{
		// detect fraud and throw exception if fraud
		return false;
	}
}
