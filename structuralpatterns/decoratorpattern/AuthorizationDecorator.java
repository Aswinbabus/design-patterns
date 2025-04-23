package decoratorpattern;

public class AuthorizationDecorator extends RequestHandlerDecorator
{

	public AuthorizationDecorator(RequestHandler requestHandler)
	{
		super(requestHandler);
	}

	@Override
	public Response handleRequest(Request request)
	{
		System.out.println("Authorizing the Request");
		return super.handleRequest(request);
	}
}
