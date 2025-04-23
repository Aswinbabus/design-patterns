package decoratorpattern;

import java.util.Map;

public class Response
{

	private final String statusCode;
	private final String message;
	private final Map<String,Object> data;

	public Response(Map<String, Object> data, String statusCode, String message)
	{
		this.data = data;
		this.statusCode = statusCode;
		this.message = message;
	}

	public Map<String, Object> getData()
	{
		return data;
	}

	public String getMessage()
	{
		return message;
	}

	public String getStatusCode()
	{
		return statusCode;
	}
}
