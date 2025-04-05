package StatePattern.Learn;

public class DisArmedMode extends SecurityMode
{

	// can change to Away or Home Mode only
	@Override
	public void onStateChange(SecurityContext context,SecurityMode mode)
	{

		if(mode.getModeType() == SecurityModes.DISARMED) {
			System.out.println("Already in Disarmed Mode");
		}
		else if(mode.getModeType() == SecurityModes.ALERT_MODE) {
			System.out.println("Cannot Enable Alert Mode");
		}
		else if(mode.getModeType() == SecurityModes.ARMED_WITH_AWAY || mode.getModeType() == SecurityModes.ARMED_WITH_HOME)
		{
			context.setCurrentMode(mode);
		}

	}

	@Override
	public SecurityModes getModeType()
	{
		return SecurityModes.DISARMED;
	}
}
