package ChainOfResponsibility.RequestHandlers;

import ChainOfResponsibility.Request;
import ChainOfResponsibility.RequestHandler;

public class Authorizationhandler extends RequestHandler
{

	public Authorizationhandler(RequestHandler nextRequestHandler)
	{
		super(nextRequestHandler);
	}

	@Override
	protected boolean processRequest(Request request)
	{
		System.out.println("Authorizing the Request");
		return true;
	}
}
