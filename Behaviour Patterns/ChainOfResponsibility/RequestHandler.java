package ChainOfResponsibility;

public abstract class RequestHandler
{

	private RequestHandler nextRequestHandler = null;

	public RequestHandler() {}
	public RequestHandler(RequestHandler nextRequestHandler)
	{
		this.nextRequestHandler = nextRequestHandler;
	}

	public void process(Request request) {

		if(processRequest(request) && nextRequestHandler != null ) {
             nextRequestHandler.process(request);
		}

	}

	protected abstract boolean processRequest(Request request);

}
