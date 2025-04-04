package StatePattern;

import java.util.Scanner;

import StatePattern.Sensors.DoorSensor;
import StatePattern.Sensors.MotionSensor;
import StatePattern.Sensors.SensorDataController;
import StatePattern.Sensors.SensorType;

public class UserInterface
{

	public static void main(String[] args)
	{

		System.out.println("------------------------------------");
		System.out.println("Security Remote");
		System.out.println("------------------------------------");
		System.out.println("Modes");
		System.out.println("1: DisArmedMode");
		System.out.println("2: ArmedWithHomeMode");
		System.out.println("3: ArmedWithAwayMode");
		System.out.println("4: Alert Mode");
		System.out.println("-1 to exit the system");
		System.out.println("------------------------------------");

		SecuritySystem securitySystem = new SecuritySystem();
		SecurityRemote securityRemote = new SecurityRemote(securitySystem);

		MotionSensor motionSensor1 = new MotionSensor(1,securitySystem);
		MotionSensor motionSensor2 = new MotionSensor(2,securitySystem);

		DoorSensor doorSensor1 = new DoorSensor(3,securitySystem);
		DoorSensor doorSensor2 = new DoorSensor(4,securitySystem);

		securitySystem.addSensor(SensorType.MOTION,motionSensor1);
		securitySystem.addSensor(SensorType.MOTION,motionSensor2);
		securitySystem.addSensor(SensorType.DOOR,doorSensor1);
		securitySystem.addSensor(SensorType.DOOR,doorSensor2);


		securitySystem.setSecurityRemote(securityRemote);



		Scanner sc = new Scanner(System.in);

		int input;

		do{

			input = sc.nextInt();

			switch (input) {
				case 1 : securityRemote.switchMode(DisArmedMode.getInstance());
				         break;
				case 2:  securityRemote.switchMode(ArmedWithHomeMode.getInstance());
				         break;
				case 3 : securityRemote.switchMode(ArmedWithAwayMode.getInstance());
				         break;
				case 4 : securityRemote.switchMode(AlertMode.getInstance());
				         break;
				case 5 :
					SensorDataController.receiveSignal(1,1);
					break;
				case 6 :
					SensorDataController.receiveSignal(3,2);

			}

			System.out.println("\n\n------------------------------------");
			System.out.println("Current Mode - "  + securityRemote.getCurrentMode());
			System.out.println("Motion sensor 1 - " + motionSensor1.isSensorState());
			System.out.println("Motion sensor 2 - " + motionSensor2.isSensorState());
			System.out.println("Door Sensor 1 - " + doorSensor1.isSensorState());
			System.out.println("Door Sensor 2 - " + doorSensor2.isSensorState());
			System.out.println("------------------------------------");

		}while(input != -1);

	}

}
