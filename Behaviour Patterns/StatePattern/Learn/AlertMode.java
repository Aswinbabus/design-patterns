package StatePattern.Learn;

public class AlertMode extends SecurityMode
{
	// allowing only to change to disarmed mode by user
	@Override
	void onStateChange(SecurityContext context, SecurityMode newState)
	{
		 if(newState.getModeType() == SecurityModes.DISARMED) {
			 context.setCurrentMode(newState);
		 }
		 else {
			 System.out.println("Not Allowed");
		 }
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
