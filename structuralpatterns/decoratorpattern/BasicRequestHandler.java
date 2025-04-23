package decoratorpattern;

public class BasicRequestHandler implements RequestHandler
{
	@Override
	public Response handleRequest(Request request)
	{
		System.out.println("Request Handled Successfully");
		return new Response(null, "200", "OK");
	}

}
