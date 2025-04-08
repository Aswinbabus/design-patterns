package StatePattern.Learn;

public class AlertMode extends SecurityMode
{

	@Override
	void disArmedMode(SecurityContext context)
	{
		context.setCurrentMode(new DisArmedMode());
	}

	@Override
	void armedWithHome(SecurityContext securityContext)
	{
		System.out.println("Not Possible");
	}

	@Override
	void armedWithAway(SecurityContext securityContext)
	{
		System.out.println("Not Possible");
	}

	@Override
	void alertMode(SecurityContext securityContext)
	{
		System.out.println("Already in Alert Mode");
	}

	@Override
	void initializeMode()
	{
		// switch on camera
		// turn on alarm
		// send notifications
	}

	@Override
	SecurityModes getModeType()
	{
		return SecurityModes.ALERT_MODE;
	}
}
