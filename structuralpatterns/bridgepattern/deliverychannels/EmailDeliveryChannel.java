package bridgepattern.deliverychannels;

import bridgepattern.DeliveryChannel;

public class EmailDeliveryChannel implements DeliveryChannel
{
	private static EmailDeliveryChannel instance = null;

	public static EmailDeliveryChannel getInstance()
	{
		if(instance == null) {
			synchronized (EmailDeliveryChannel.class) {
				if(instance == null) {
					instance = new EmailDeliveryChannel();
				}
			}
		}
		return instance;
	}
	@Override
	public void deliver(String message)
	{
		// contacting email server and sending mail
		System.out.println("Sending mail - " + message);
	}
}
