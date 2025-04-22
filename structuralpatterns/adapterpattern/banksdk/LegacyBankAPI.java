package adapterpattern.banksdk;

public class LegacyBankAPI
{

	public void makeTransaction(String accountNumber, String currency, int cents) {
		// Connects to mainframe and processes payment
		System.out.println("Payment processed using LegacyBankAPI");
	}


}
