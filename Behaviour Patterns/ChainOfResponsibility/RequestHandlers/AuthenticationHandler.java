package ChainOfResponsibility.RequestHandlers;

import ChainOfResponsibility.Request;
import ChainOfResponsibility.RequestHandler;

public class AuthenticationHandler extends RequestHandler
{

	public AuthenticationHandler(RequestHandler nextRequestHandler)
	{
		super(nextRequestHandler);
	}

	@Override
	protected boolean processRequest(Request request)
	{
		System.out.println("Authenticating the Request");
		return true;
	}
}
