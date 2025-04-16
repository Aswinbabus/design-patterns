package ObserverPattern;

public class TollBooth implements Observer<Road>
{

	@Override
	public void update(Road road)
	{
		if(road.isCongested()) {
			System.out.println("Open extra lanes");
		}
	}
}
