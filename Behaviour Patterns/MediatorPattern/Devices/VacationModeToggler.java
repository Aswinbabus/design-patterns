package MediatorPattern.Devices;

import MediatorPattern.Device;
import MediatorPattern.DeviceTypes;
import MediatorPattern.SmartHomeMediator;

public class VacationModeToggler extends Device
{

	private boolean vacationModeStatus;

	public VacationModeToggler(SmartHomeMediator smartHomeMediator)
	{
		super(smartHomeMediator);
		this.vacationModeStatus = false;
	}

	@Override
	public DeviceTypes getType()
	{
		return DeviceTypes.VACATION_MODE_TOGGLER;
	}

	public void enableVacationMode() {
		this.vacationModeStatus = true;
		System.out.println("Enabling Vacation Mode");
	}

	public void disableVacationMode() {
		this.vacationModeStatus = false;
		System.out.println("Disabling Vacation Mode");
	}

	public boolean isVacationModeEnabled()
	{
		return vacationModeStatus;
	}
}
