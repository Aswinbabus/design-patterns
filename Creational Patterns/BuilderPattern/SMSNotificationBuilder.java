package BuilderPattern;

public class SMSNotificationBuilder extends NotificationBuilder<SMSNotificationBuilder,SMSNotification>
{

	private int priority;


	public SMSNotificationBuilder(String message, String receipient)
	{
		super(message, receipient, NotificationTypes.SMS);
	}

	public SMSNotificationBuilder priority(Integer priority) {
		this.priority = priority;
		return this;
	}

	public int getPriority()
	{
		return priority;
	}

	@Override
	public SMSNotification build() {
		return new SMSNotification(this);
	}

	@Override
	protected SMSNotificationBuilder self()
	{
		return this;
	}
}
