package BuilderPattern;

public class SMSNotification extends Notification
{

	private final int priority;


	SMSNotification(SMSNotificationBuilder smsNotificationBuilder)
	{
		super(smsNotificationBuilder);
		this.priority = smsNotificationBuilder.getPriority();
	}

	public int getPriority()
	{
		return priority;
	}

}
