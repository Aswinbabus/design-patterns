package StatePattern.Learn;

public class DisArmedMode extends SecurityMode
{



	@Override
	void disArmedMode(SecurityContext context)
	{
		System.out.println("Already in the Disarmed Mode");
	}

	@Override
	void armedWithHome(SecurityContext securityContext)
	{
		securityContext.setCurrentMode(new ArmedWithHome());
	}

	@Override
	void armedWithAway(SecurityContext securityContext)
	{
         securityContext.setCurrentMode(new ArmedWithAway());
	}

	@Override
	void alertMode(SecurityContext securityContext)
	{
		System.out.println("Not possible");
	}

	@Override
	public SecurityModes getModeType()
	{
		return SecurityModes.DISARMED;
	}
}
