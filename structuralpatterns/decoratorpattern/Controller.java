package decoratorpattern;

public class Controller
{

	public static void main(String[] args)
	{

		RequestHandler handler = new RateLimitorDecorator(new LoggingDecorator(new AuthorizationDecorator(new AuthenticationDecorator(new BasicRequestHandler()))));
		handler.handleRequest(new Request(null,"payload","metadata"));
	}
}
