package StatePattern.Sensors;

import StatePattern.SecuritySystem;

public class DoorSensor extends Sensor
{
	public DoorSensor(Integer sensorUID, SecuritySystem securitySystem)
	{
		super(sensorUID, securitySystem);
	}

	@Override
	void onTurnON()
	{
		System.out.println("Turning On Door Sensor - " + getSensorUID());
	}

	@Override
	void onTurnOFF()
	{
		System.out.println("Turning Off Door Sensor - " + getSensorUID());
	}

	@Override
	void notifySignal(int data)
	{
		securitySystem.securityAlert("Motion Detected by door Sensor - " + getSensorUID());
	}
}
