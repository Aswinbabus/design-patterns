package BuilderPattern;

public class EmailNotification extends Notification
{

	private String subject;
	private String footer;
	private String mediaAttachedUrl;

	EmailNotification(EmailNotificationBuilder builder)
	{
		super(builder);
		this.subject = builder.getSubject();
		this.footer = builder.getFooter();
		this.mediaAttachedUrl = builder.getMediaAttachedUrl();
	}

	public String getFooter()
	{
		return footer;
	}

	public String getMediaAttachedUrl()
	{
		return mediaAttachedUrl;
	}

	public String getSubject()
	{
		return subject;
	}
}
