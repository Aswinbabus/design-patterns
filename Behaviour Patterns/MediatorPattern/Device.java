package MediatorPattern;

public abstract class Device
{

	private final SmartHomeMediator smartHomeMediator;

	public Device(SmartHomeMediator smartHomeMediator)
	{
		this.smartHomeMediator = smartHomeMediator;
	}


	void notify(Device device,SmartHomeEvents event) {

		smartHomeMediator.onEventOccurs(this,event);

	}

	public abstract DeviceTypes getType();

}
