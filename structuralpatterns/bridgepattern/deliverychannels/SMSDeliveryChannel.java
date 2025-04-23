package bridgepattern.deliverychannels;

import bridgepattern.DeliveryChannel;

public class SMSDeliveryChannel implements DeliveryChannel
{

	private static SMSDeliveryChannel instance;

	public static SMSDeliveryChannel getInstance()
	{
		if(instance == null) {

			synchronized (SMSDeliveryChannel.class) {
				if(instance == null) {

					instance = new SMSDeliveryChannel();

				}
			}

		}
		return instance;
	}
	@Override
	public void deliver(String message)
	{
		// contact network server and send sms
		System.out.println("Sending Sms - " + message);
	}
}
