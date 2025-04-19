package ChainOfResponsibility;

public class Request
{
	private String requestUrl;
	private String requestMethod;
	private String requestBody;

	public Request(String requestBody, String requestMethod, String requestUrl)
	{
		this.requestBody = requestBody;
		this.requestMethod = requestMethod;
		this.requestUrl = requestUrl;
	}

	public String getRequestBody()
	{
		return requestBody;
	}

	public void setRequestBody(String requestBody)
	{
		this.requestBody = requestBody;
	}

	public String getRequestMethod()
	{
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod)
	{
		this.requestMethod = requestMethod;
	}

	public String getRequestUrl()
	{
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl)
	{
		this.requestUrl = requestUrl;
	}
}
