package decoratorpattern;

public class RateLimitorDecorator extends RequestHandlerDecorator
{

	public RateLimitorDecorator(RequestHandler requestHandler)
	{
		super(requestHandler);
	}

	@Override
	public Response handleRequest(Request request)
	{
		System.out.println("Rate Limiting the request");
		return super.handleRequest(request);
	}
}
