package ChainOfResponsibility.RequestHandlers;

import ChainOfResponsibility.Request;
import ChainOfResponsibility.RequestHandler;

public class LogHandler extends RequestHandler
{

	public LogHandler(RequestHandler nextRequestHandler)
	{
		super(nextRequestHandler);
	}

	@Override
	protected boolean processRequest(Request request)
	{
		System.out.println("Logging the Request");
		return true;
	}
}
