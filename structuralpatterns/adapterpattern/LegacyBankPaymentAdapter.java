package adapterpattern;

import adapterpattern.banksdk.LegacyBankAPI;

public class LegacyBankPaymentAdapter implements PaymentProcessor
{

	private final LegacyBankAPI legacyBankAPI;

	public LegacyBankPaymentAdapter(LegacyBankAPI legacyBankAPI)
	{
		this.legacyBankAPI = legacyBankAPI;
	}

	@Override
	public void pay(String customerId, double amount)
	{

		String accountNumber = customerId + "123"; // for example purposes
		int cents = (int) Math.ceil(amount * 1.2);
		legacyBankAPI.makeTransaction(accountNumber,"USD",cents);

	}
}
