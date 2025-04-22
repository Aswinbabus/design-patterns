package BuilderPattern;

public class Notification
{

	private final String receipient;
	private final String message;
	private final NotificationTypes notificationTypes;
    private final int retryCount;
	private final String callbackURL;

	public Notification(NotificationBuilder builder)
	{
		this.message = builder.getMessage();
		this.notificationTypes = builder.getNotificationTypes();
		this.receipient = builder.getReceipient();
		this.retryCount = builder.getRetryCount();
		this.callbackURL = builder.getCallbackURL();
	}

	public String getMessage()
	{
		return message;
	}

	public NotificationTypes getNotificationTypes()
	{
		return notificationTypes;
	}

	public String getReceipient()
	{
		return receipient;
	}

	public String getCallbackURL()
	{
		return callbackURL;
	}

	public int getRetryCount()
	{
		return retryCount;
	}
}
