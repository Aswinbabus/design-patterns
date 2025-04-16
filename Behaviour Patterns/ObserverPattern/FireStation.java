package ObserverPattern;

public class FireStation implements Observer<Road>
{

	@Override
	public void update(Road road)
	{
		if(road.isAccidentZone()) {
			System.out.println("Update from " + road.getRoadName() + " evacuate people from accident");
		}

		if(road.isCongested()) {
			System.out.println("Update from " + road.getRoadName() + "Take different road for fire truck");
		}

	}
}
