package StatePattern;

import StatePattern.Sensors.SensorType;

public class ArmedWithAwayMode implements SecurityMode
{

	private static final ArmedWithAwayMode instance = new ArmedWithAwayMode();

	public static ArmedWithAwayMode getInstance()
	{
		return instance;
	}


	public void switchingMode(SecuritySystem securitySystem) {

		securitySystem.enableSensors(SensorType.MOTION);
		securitySystem.enableSensors(SensorType.DOOR);


		System.out.println("Turning On ArmedWithAwayMode");
	}

	@Override
	public String getMode()
	{
		return "ArmedWithAway";
	}
}
