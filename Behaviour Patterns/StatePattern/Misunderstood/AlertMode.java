package StatePattern.Misunderstood;

public class AlertMode implements SecurityMode
{


	public static final AlertMode alertMode = new AlertMode();

	public static AlertMode getInstance()
	{
		return alertMode;
	}

	public void switchingMode(SecuritySystem securitySystem) {

		System.out.println("Turning On AlertMode");
		System.out.println("Sending Notifications");
		System.out.println("Switching on Cameras");

	}

	@Override
	public String getMode()
	{
		return "Alert";
	}
}
