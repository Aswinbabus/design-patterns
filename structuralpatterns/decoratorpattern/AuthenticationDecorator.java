package decoratorpattern;

public class AuthenticationDecorator extends RequestHandlerDecorator
{

	public AuthenticationDecorator(RequestHandler requestHandler)
	{
		super(requestHandler);
	}

	@Override
	public Response handleRequest(Request request)
	{
		System.out.println("Authenticating the Request");
		return super.handleRequest(request);
	}
}
