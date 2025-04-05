package StatePattern.Misunderstood;

import StatePattern.Misunderstood.Sensors.SensorType;

public class DisArmedMode implements SecurityMode
{

	private static final DisArmedMode instance = new DisArmedMode();

	public static DisArmedMode getInstance()
	{
		return instance;
	}

	public void switchingMode(SecuritySystem securitySystem) {

		securitySystem.disableSensors(SensorType.MOTION);
		securitySystem.disableSensors(SensorType.DOOR);
		System.out.println("Turning On DisArmedMode");

	}

	public String getMode() {
		return "DisArmed";
	}


}
