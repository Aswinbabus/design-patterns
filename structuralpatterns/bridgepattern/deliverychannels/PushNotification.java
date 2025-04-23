package bridgepattern.deliverychannels;

import bridgepattern.DeliveryChannel;

public class PushNotification implements DeliveryChannel
{

	private static PushNotification instance;

	public static PushNotification getInstance()
	{

		if(instance == null) {
			synchronized (PushNotification.class) {
				if(instance == null) {
					instance = new PushNotification();
				}
			}
		}

		return instance;
	}

	@Override
	public void deliver(String message)
	{
		// sending push notification
		System.out.println("Sending push notification - " + message);
	}
}
