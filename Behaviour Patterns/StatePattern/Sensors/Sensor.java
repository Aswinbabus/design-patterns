package StatePattern.Sensors;

import StatePattern.SecuritySystem;


public abstract class Sensor
{

	private Integer sensorUID;
	protected SecuritySystem securitySystem;
    private boolean sensorState;

	public Sensor(Integer sensorUID,SecuritySystem securitySystem)
	{
		this.sensorUID = sensorUID;
		this.securitySystem = securitySystem;
	}

	public void turnON() {

		this.sensorState = true;
		SensorDataController.addSensor(this);
		onTurnON();

	}

	public void turnOFF() {
		this.sensorState = false;
		SensorDataController.removeSensor(this.getSensorUID());
		onTurnOFF();
	}

	abstract void onTurnON();

	abstract void onTurnOFF();

	abstract  void notifySignal(int data);

	public Integer getSensorUID()
	{
		return sensorUID;
	}

	public boolean isSensorState()
	{
		return sensorState;
	}

}

