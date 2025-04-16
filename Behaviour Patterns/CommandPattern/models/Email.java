package CommandPattern.models;

public class Email
{
	int maildUID;
	String maildId;
	String subject;
	String body;

	public Email(String body, String maildId, String subject)
	{
		this.body = body;
		this.maildId = maildId;
		this.subject = subject;
	}

	public String getBody()
	{
		return body;
	}

	public void setBody(String body)
	{
		this.body = body;
	}

	public String getMaildId()
	{
		return maildId;
	}

	public void setMaildId(String maildId)
	{
		this.maildId = maildId;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public int getMaildUID()
	{
		return maildUID;
	}

	public void setMaildUID(int maildUID)
	{
		this.maildUID = maildUID;
	}
}
