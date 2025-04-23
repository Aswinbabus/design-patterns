package bridgepattern.notifications;

import bridgepattern.DeliveryChannel;
import bridgepattern.Notification;

public class Alert implements Notification
{
	private final String alertMessage;
	private final DeliveryChannel deliveryChannel;

	public Alert(String alertMessage,DeliveryChannel deliveryChannel)
	{
		this.deliveryChannel = deliveryChannel;
		this.alertMessage = alertMessage;
	}

	@Override
	public void send()
	{
		deliveryChannel.deliver(this.alertMessage);
	}
}
