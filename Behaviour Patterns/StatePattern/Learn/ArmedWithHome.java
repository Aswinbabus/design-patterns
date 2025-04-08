package StatePattern.Learn;

public class ArmedWithHome extends SecurityMode
{


	@Override
	void disArmedMode(SecurityContext context)
	{
		context.setCurrentMode(new DisArmedMode());
	}

	@Override
	void armedWithHome(SecurityContext securityContext)
	{
		System.out.println("Already in Home Mode");
	}

	@Override
	void armedWithAway(SecurityContext securityContext)
	{
		 securityContext.setCurrentMode(new ArmedWithAway());
	}

	@Override
	void alertMode(SecurityContext securityContext)
	{
		System.out.println("Not possible only via sensor detection");
	}

	@Override
	void initializeMode()
	{
		// switch on the door sensors
		// switch off the motion sensors
	}

	// ignoring motionDetectedMethod
	@Override
	public void handleDoorOpened(SecurityContext context)
	{
		System.out.println("Door Opening is Detected");
		context.setCurrentMode(new AlertMode());
	}

	@Override
	public SecurityModes getModeType()
	{
		return null;
	}
}
