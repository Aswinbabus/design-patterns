package StatePattern.Learn;

public class ArmedWithAway extends SecurityMode
{



	@Override
	void disArmedMode(SecurityContext context)
	{
		context.setCurrentMode(new DisArmedMode());
	}

	@Override
	void armedWithHome(SecurityContext securityContext)
	{
      securityContext.setCurrentMode(new ArmedWithHome());
	}

	@Override
	void armedWithAway(SecurityContext securityContext)
	{
		System.out.println("Already in alert Away Mode");
	}

	@Override
	void alertMode(SecurityContext securityContext)
	{
		System.out.println("Not Possible");
	}

	@Override
	void initializeMode()
	{
		// switch on both sensors
	}

	@Override
	void handleMotionDetected(SecurityContext context)
	{
		System.out.println("Motion Detected");
		context.setCurrentMode(new AlertMode());
	}

	@Override
	void handleDoorOpened(SecurityContext securityContext)
	{
		System.out.println("Door Opened");
		securityContext.setCurrentMode(new AlertMode());
	}

	@Override
	SecurityModes getModeType()
	{
		return null;
	}
}
