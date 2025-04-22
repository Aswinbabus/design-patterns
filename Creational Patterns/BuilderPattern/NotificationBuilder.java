package BuilderPattern;

public abstract class NotificationBuilder<B extends NotificationBuilder<B,N>,N extends Notification>
{

	private final String receipient;
	private final String message;
	private final NotificationTypes notificationTypes;
	private int retryCount;
	private String callbackURL;

	NotificationBuilder(String message, String receipient, NotificationTypes notificationTypes)
	{
		this.message = message;
		this.receipient = receipient;
		this.notificationTypes = notificationTypes;
	}

	public B retryCount(int retryCount) {
		this.retryCount = retryCount;
		return self();
	}

	protected abstract N build();

	protected abstract B self();

	public B callbackURL(String url) {
		this.callbackURL = url;
		return self();
	}

	public String getCallbackURL()
	{
		return callbackURL;
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

	public int getRetryCount()
	{
		return retryCount;
	}
}
