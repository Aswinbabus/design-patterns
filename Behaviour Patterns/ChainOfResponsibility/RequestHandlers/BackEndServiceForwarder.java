package ChainOfResponsibility.RequestHandlers;

import ChainOfResponsibility.BackEndService;
import ChainOfResponsibility.Request;
import ChainOfResponsibility.RequestHandler;

public class BackEndServiceForwarder extends RequestHandler
{

	private BackEndService service;
	public BackEndServiceForwarder()
	{
		service = new BackEndService();
	}

	@Override
	protected boolean processRequest(Request request)
	{
		service.processRequest(request);
		return false;
	}
}
