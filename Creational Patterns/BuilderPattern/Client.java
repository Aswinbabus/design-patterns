package BuilderPattern;

public class Client
{
	public static void main(String[] args)
	{

		SMSNotification sms = new SMSNotificationBuilder("message","receipent").priority(1).retryCount(5).callbackURL("url").build();

		EmailNotification email = new EmailNotificationBuilder("message","recepient","subject").footer("footer").mediaAttachmentUrl("sampleurl").build();

		System.out.println(sms);
		System.out.println(email);

	}
}
