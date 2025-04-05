package StatePattern.Misunderstood;

import StatePattern.Misunderstood.Sensors.SensorType;

public class ArmedWithHomeMode implements SecurityMode
{

	private static final ArmedWithHomeMode instance = new ArmedWithHomeMode();

	public static ArmedWithHomeMode getInstance()
	{
		return instance;
	}


	public void switchingMode(SecuritySystem securitySystem) {

		securitySystem.disableSensors(SensorType.MOTION);
		securitySystem.enableSensors(SensorType.DOOR);
		System.out.println("Turning On ArmedWithHomeMode");

	}

	@Override
	public String getMode()
	{
		return "ArmedWithHome";
	}
}
