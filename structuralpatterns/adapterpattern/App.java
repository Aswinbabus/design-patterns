package adapterpattern;

import adapterpattern.banksdk.LegacyBankAPI;

public class App
{
	public static void main(String[] args)
	{

		Stripe stripe = new Stripe();
		stripe.pay("customerId", 100.0);

		Paypal paypal = new Paypal();
		paypal.pay("customid",200.0);

		LegacyBankPaymentAdapter legacyBankPaymentAdapter = new LegacyBankPaymentAdapter(new LegacyBankAPI());

		legacyBankPaymentAdapter.pay("customerId",300.0);



	}
}
