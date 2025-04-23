package bridgepattern.notifications;

import bridgepattern.DeliveryChannel;
import bridgepattern.Notification;

public class Remainder implements Notification
{
	private final String remainderMessage;
	private final DeliveryChannel deliveryChannel;

	public Remainder(String remainderMessage,DeliveryChannel deliveryChannel)
	{
		this.deliveryChannel = deliveryChannel;
		this.remainderMessage = remainderMessage;
	}

	@Override
	public void send()
	{
		deliveryChannel.deliver(this.remainderMessage);
	}
}

