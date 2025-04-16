package MediatorPattern.Devices;

import MediatorPattern.Device;
import MediatorPattern.DeviceTypes;
import MediatorPattern.SmartHomeMediator;

public class SmartLight extends Device
{

	private boolean lightState;

	public SmartLight(SmartHomeMediator smartHomeMediator)
	{
		super(smartHomeMediator);
		this.lightState = false;
	}

	@Override
	public DeviceTypes getType()
	{
		return DeviceTypes.SMARTLIGHT;
	}

	public void turnOn() {
		this.lightState = true;
		System.out.println("Turing On Smart Light");
	}

	public void turnOff() {
		this.lightState = false;
		System.out.println("Turning Off Smart Light");
	}

	public boolean isLightTurnedOn()
	{
		return lightState;
	}
}
