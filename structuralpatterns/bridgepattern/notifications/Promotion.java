package bridgepattern.notifications;

import bridgepattern.DeliveryChannel;
import bridgepattern.Notification;

public class Promotion implements Notification
{

	private final String promotionalContent;
	private final DeliveryChannel deliveryChannel;

	public Promotion(String promotionalContent,DeliveryChannel deliveryChannel)
	{
		this.deliveryChannel = deliveryChannel;
		this.promotionalContent = promotionalContent;
	}

	@Override
	public void send()
	{
		this.deliveryChannel.deliver(promotionalContent);
	}
}
