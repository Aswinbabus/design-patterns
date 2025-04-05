package StatePattern.Learn;

public class ArmedWithHome extends SecurityMode
{
	@Override
	public void onStateChange(SecurityContext context, SecurityMode newState)
	{
		if(newState.getModeType() == SecurityModes.ARMED_WITH_HOME) {
			System.out.println("Already in Home Mode");
		}
		else if(newState.getModeType() == SecurityModes.ARMED_WITH_AWAY || newState.getModeType() == SecurityModes.DISARMED)
		{
			context.setCurrentMode(newState);
		}
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
