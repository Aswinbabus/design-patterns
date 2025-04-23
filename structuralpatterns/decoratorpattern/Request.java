package decoratorpattern;

import java.util.Map;

public class Request
{

	private final Map<String,String> headers;
	private final String payload;
	private final String metaData;

	public Request(Map<String, String> headers, String payload, String metaData)
	{
		this.headers = headers;
		this.payload = payload;
		this.metaData = metaData;
	}

	public Map<String, String> getHeaders()
	{
		return headers;
	}

	public String getMetaData()
	{
		return metaData;
	}

	public String getPayload()
	{
		return payload;
	}
}
