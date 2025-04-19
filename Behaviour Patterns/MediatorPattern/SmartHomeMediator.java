package MediatorPattern;

import MediatorPattern.Devices.SecuritySystem;
import MediatorPattern.Devices.SmartLight;
import MediatorPattern.Devices.SmartThermoStat;
import MediatorPattern.Devices.VacationModeToggler;

public class SmartHomeMediator
{

	private final SmartLight smartLight;
	private final SmartThermoStat smartThermoStat;
	private final SecuritySystem securitySystem;
	private final VacationModeToggler vacationModeToggle;

	public SmartHomeMediator(SecuritySystem securitySystem, SmartLight smartLight, SmartThermoStat smartThermoStat, VacationModeToggler vacationModeToggle)
	{
		this.securitySystem = securitySystem;
		this.smartLight = smartLight;
		this.smartThermoStat = smartThermoStat;
		this.vacationModeToggle = vacationModeToggle;
	}

	public void onEventOccurs(Device device,SmartHomeEvents event) {

		System.out.println("Event triggered by Device" + device);
		switch(event)
		{

			case VACATION_MODE_ENABLED:
				smartLight.turnOff();
				smartThermoStat.setMode("ECO");
				securitySystem.arm();
				break;
			case SECURITY_SYSTEM_DISARMED:
				if(vacationModeToggle.isVacationModeEnabled())
				{
					vacationModeToggle.disableVacationMode();
				}
				break;
			case THERMOSTAT_COMFORT_MODE:
				if(vacationModeToggle.isVacationModeEnabled())
				{
					vacationModeToggle.disableVacationMode();
				}
				if(securitySystem.isSecuritySystemArmed()) {
					securitySystem.disArm();;
				}
				break;
		}

	}



}
