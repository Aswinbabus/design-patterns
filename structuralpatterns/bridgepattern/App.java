package bridgepattern;

import bridgepattern.deliverychannels.EmailDeliveryChannel;
import bridgepattern.deliverychannels.PushNotification;
import bridgepattern.deliverychannels.SMSDeliveryChannel;
import bridgepattern.notifications.Alert;
import bridgepattern.notifications.Promotion;
import bridgepattern.notifications.Remainder;

public class App
{

	public static void main(String[] args)
	{

		Alert alert = new Alert("alertMessage", SMSDeliveryChannel.getInstance());
		Promotion promotion = new Promotion("promotionalMessage", EmailDeliveryChannel.getInstance());
		Remainder remainder = new Remainder("remainderMessage", PushNotification.getInstance());

		alert.send();
		promotion.send();
		remainder.send();


	}

}
