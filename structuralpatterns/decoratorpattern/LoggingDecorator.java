package decoratorpattern;

public class LoggingDecorator extends RequestHandlerDecorator
{

	public LoggingDecorator(RequestHandler requestHandler)
	{
		super(requestHandler);
	}

	@Override
	public Response handleRequest(Request request)
	{
		System.out.println("Logging the request");
		return super.handleRequest(request);
	}
}
