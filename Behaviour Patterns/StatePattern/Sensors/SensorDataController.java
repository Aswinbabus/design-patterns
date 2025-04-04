package StatePattern.Sensors;

import java.util.HashMap;
import java.util.Map;

// receives data from physical sensors hardware
public class SensorDataController
{
	private static Map<Integer, Sensor> sensorsRegistry = new HashMap<>();

	public SensorDataController() {
         sensorsRegistry = new HashMap<>();
	}

	public static void addSensor(Sensor sensor) {
		if(!sensorsRegistry.containsKey(sensor.getSensorUID())) {
			sensorsRegistry.put(sensor.getSensorUID(), sensor );
		}
	}

	public static void removeSensor(Integer sensorId) {

		if(sensorsRegistry.containsKey(sensorId)) {
			sensorsRegistry.remove(sensorId);
		}

	}

    public static void receiveSignal(int sensorUid,int data) {

		if(sensorsRegistry.containsKey(sensorUid))
		{
			sensorsRegistry.get(sensorUid).notifySignal(data);
		}

	}

}
