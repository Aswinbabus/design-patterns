package decoratorpattern;

public abstract class RequestHandlerDecorator implements RequestHandler
{

	private final RequestHandler requestHandler;

	public RequestHandlerDecorator(RequestHandler requestHandler)
	{
		this.requestHandler = requestHandler;
	}

	@Override
	public Response handleRequest(Request request)
	{
		return requestHandler.handleRequest(request);
	}
}
