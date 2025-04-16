package MediatorPattern.Devices;

import MediatorPattern.Device;
import MediatorPattern.DeviceTypes;
import MediatorPattern.SmartHomeMediator;

public class SecuritySystem extends Device
{

	private boolean securitySystemState;

	public SecuritySystem(SmartHomeMediator smartHomeMediator)
	{
		super(smartHomeMediator);
		securitySystemState = false;
	}

	@Override
	public DeviceTypes getType()
	{
		return DeviceTypes.SECURITY_SYSTEM;
	}

	public void arm() {
		this.securitySystemState = true;
		System.out.println("Arming the Security System");
	}

	public void disArm() {
		this.securitySystemState = false;
		System.out.println("DisArm the Security System");
	}

	public boolean isSecuritySystemArmed()
	{
		return securitySystemState;
	}
}
