package ChainOfResponsibility.RequestHandlers;

import ChainOfResponsibility.Request;
import ChainOfResponsibility.RequestHandler;

public class PayLoadValidator extends RequestHandler
{

	public PayLoadValidator(RequestHandler nextRequestHandler)
	{
		super(nextRequestHandler);
	}

	@Override
	protected boolean processRequest(Request request)
	{
		System.out.println("Validating the Payload");
		return true;
	}
}

