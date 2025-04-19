package ChainOfResponsibility.RequestHandlers;

import ChainOfResponsibility.Request;
import ChainOfResponsibility.RequestHandler;

public class RateLimiters extends RequestHandler
{

	public RateLimiters(RequestHandler nextRequestHandler)
	{
		super(nextRequestHandler);
	}

	@Override
	protected boolean processRequest(Request request)
	{
		System.out.println("Request rate limit check");
		return true;
	}
}
