package MediatorPattern.Devices;

import MediatorPattern.Device;
import MediatorPattern.DeviceTypes;
import MediatorPattern.SmartHomeMediator;

public class SmartThermoStat extends Device
{

	private String mode;

	public SmartThermoStat(SmartHomeMediator smartHomeMediator)
	{
		super(smartHomeMediator);
	}

	@Override
	public DeviceTypes getType()
	{
		return DeviceTypes.SMARTTHERMOSTAT;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}



}
