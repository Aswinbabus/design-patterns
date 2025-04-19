package ChainOfResponsibility.RequestHandlers;

import ChainOfResponsibility.Request;
import jdk.jfr.Frequency;

public class Client
{

	public static void main(String[] args)
	{

		BackEndServiceForwarder backEndServiceForwarder = new BackEndServiceForwarder();


		PayLoadValidator payLoadValidator = new PayLoadValidator(backEndServiceForwarder);
		RateLimiters rateLimiters = new RateLimiters(payLoadValidator);
		LogHandler logHandler = new LogHandler(payLoadValidator);
		Authorizationhandler authorizationhandler = new Authorizationhandler(logHandler);
		AuthenticationHandler postRequestHandlerChain = new AuthenticationHandler(authorizationhandler);


		RateLimiters rateLimiters1 = new RateLimiters(backEndServiceForwarder);
		LogHandler logHandler1 = new LogHandler(rateLimiters1);
		Authorizationhandler authorizationhandler1 = new Authorizationhandler(logHandler1);
		AuthenticationHandler getRequestHandlerChain = new AuthenticationHandler(authorizationhandler1);


		// wrong handling - chain configuration must be dynamic
		// work on chain and skipping logic
		Request request = new Request("body","POST","/users");
		postRequestHandlerChain.process(request);

		Request get = new Request(null,"GET","/users");
		getRequestHandlerChain.process(request);


	}
}
