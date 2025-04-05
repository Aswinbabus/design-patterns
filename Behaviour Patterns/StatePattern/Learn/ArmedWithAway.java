package StatePattern.Learn;

public class ArmedWithAway extends SecurityMode
{



	@Override
	void onStateChange(SecurityContext context, SecurityMode newState)
	{
		if(newState.getModeType() == SecurityModes.ARMED_WITH_AWAY) {
			System.out.println("Already in Away Mode");
		}
		else if(newState.getModeType() == SecurityModes.ARMED_WITH_HOME || newState.getModeType() == SecurityModes.DISARMED)
		{
			context.setCurrentMode(newState);
		}
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
