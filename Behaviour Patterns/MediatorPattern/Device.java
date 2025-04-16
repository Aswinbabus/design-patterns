package MediatorPattern;

public abstract class Device
{

	private final SmartHomeMediator smartHomeMediator;

	public Device(SmartHomeMediator smartHomeMediator)
	{
		this.smartHomeMediator = smartHomeMediator;
	}


	void notify(SmartHomeEvents event) {

		smartHomeMediator.onEventOccurs(event);

	}

	public abstract DeviceTypes getType();

}
