package StatePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import StatePattern.Sensors.Sensor;
import StatePattern.Sensors.SensorType;

public class SecuritySystem
{

	private SecurityRemote securityRemote;
	private Map<SensorType,List<Sensor>> sensors;

	public SecuritySystem() {
		sensors = new HashMap<>();
	}

	public void addSensor(SensorType sensorType, Sensor sensor) {

		if(!sensors.containsKey(sensorType)) {
			sensors.put(sensorType,new ArrayList<>());
		}

		sensors.get(sensorType).add(sensor);

	}

	public void enableSensors(SensorType sensorType) {

		if(sensors.containsKey(sensorType) && !isSensorEnabled(sensorType))
		{
			sensors.get(sensorType).forEach(Sensor::turnON);
		}
	}

	public void disableSensors(SensorType sensorType) {
		if(sensors.containsKey(sensorType) && isSensorEnabled(sensorType)) {
			sensors.get(sensorType).forEach(Sensor::turnOFF);
		}
	}

	public boolean isSensorEnabled(SensorType sensorType) {

		if(sensors.containsKey(sensorType)) {
			return sensors.get(sensorType).get(0).isSensorState();
		}
		return false;
	}

	public void securityAlert(String message) {

		System.out.println(message);
		System.out.println("Turning On Alert Mode");
		securityRemote.switchMode(AlertMode.getInstance());

	}

	public void setSecurityRemote(SecurityRemote securityRemote)
	{
		this.securityRemote = securityRemote;
	}
}
