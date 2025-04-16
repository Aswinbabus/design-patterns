package ObserverPattern;

public class DriverClass
{

	public static void main(String[] args)
	{

		AmbulanceService ambulanceService = new AmbulanceService();
		FireStation fireStation = new FireStation();

		Road mainStreetRoad = new Road("MainStreet");

		mainStreetRoad.registerObserver(ambulanceService);
		mainStreetRoad.registerObserver(fireStation);

		mainStreetRoad.setAccidentZone(true);
		mainStreetRoad.setCongested(true);

		Road highWayRoad = new Road("Highway1");

		highWayRoad.registerObserver(ambulanceService);

		highWayRoad.setCongested(true);

	}





}
