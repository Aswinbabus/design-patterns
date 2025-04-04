package StatePattern.Sensors;

import StatePattern.SecuritySystem;

public class MotionSensor extends Sensor
{

	public MotionSensor(Integer sensorUID,SecuritySystem securitySystem)
	{

		super(sensorUID,securitySystem);
	}

	@Override
	public void onTurnON()
	{
		System.out.println("Turning on the motion sensor");
	}

	@Override
	public void onTurnOFF()
	{
		System.out.println("Turning Off the motion sensor");
	}

	@Override
	void notifySignal(int data)
	{
		securitySystem.securityAlert("Motion Signals detected by Motion Sensor - " + getSensorUID());

	}
}
