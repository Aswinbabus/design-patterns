package ObserverPattern;

public class AmbulanceService implements Observer<Road>
{

	@Override
	public void update(Road road)
	{
		if(road.isAccidentZone()) {
			System.out.println("Update from " + road.getRoadName() + "Take Ambulance");
		}

		if(road.isCongested()) {
			System.out.println("Update from " + road.getRoadName() + "Take Different Road");
		}

	}

}
