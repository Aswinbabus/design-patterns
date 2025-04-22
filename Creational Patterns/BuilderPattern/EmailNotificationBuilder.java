package BuilderPattern;

public class EmailNotificationBuilder extends NotificationBuilder<EmailNotificationBuilder,EmailNotification>
{

	private final String subject;
	private String footer;
	private String mediaAttachedUrl;

	public EmailNotificationBuilder(String message, String receipient,String subject)
	{
		super(message, receipient, NotificationTypes.EMAIL);
	    this.subject = subject;
	}

	public EmailNotificationBuilder footer(String footer) {
		this.footer = footer;
		return this;
	}

	public EmailNotificationBuilder mediaAttachmentUrl(String url) {
		this.mediaAttachedUrl = url;
		return this;
	}

	@Override
	public EmailNotification build() {
		return new EmailNotification(this);
	}

	@Override
	protected EmailNotificationBuilder self()
	{
		return this;
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
