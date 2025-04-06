package TemplateMethodPattern;

public abstract class PaymentProcessor
{

	// expose only skeletal method
	public void processPayment(int userid,int amount) {

		if(validatePaymentRequest(userid) && !fraudDetection(userid))
		{
			if(doesBalanceCheck()) {

				if(!checkAccountBalance(amount)) {
					return;
				}

			}
			String response = invokeAPI(userid, amount);
			handleAPIResponse(response);
			sendNotification();
		}
	}

	// private methods

	private boolean validatePaymentRequest(int userId) {
		// validating request is from valid user or not
		return userId != -1;
	}

	private void handleAPIResponse(String response) {
		// handling api response
	}

	private void sendNotification() {
		// sending notification to user
	}

	private boolean checkAccountBalance(int amount) {

		int currBalance = getBalance();
		return currBalance > amount;
	}


	// protected methods

	// optional method with hook
	protected boolean doesBalanceCheck() {
		return false;
	}

	protected int getBalance() {
	  return -1;
	}

	protected abstract String invokeAPI(int userId,int amount);

	// optional method with default implementation
	protected  boolean fraudDetection(int userId) {
		// do nothing
		return false;
	}


}
