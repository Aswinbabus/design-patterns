package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Road implements Observable<Road>
{


	private final List<Observer<Road>> observers;

	private final String roadName;
	private boolean isCongested;
	private boolean isAccidentZone;
	private boolean isBadWeather;

	public Road(String roadName)
	{

		this.roadName = roadName;
		this.observers = new ArrayList<>();
		isCongested = false;
		isAccidentZone = false;
		isBadWeather = false;
	}

	@Override
	public void registerObserver(Observer<Road> observer)
	{
		observers.add(observer);
	}

	@Override
	public void deRegisterObserver(Observer<Road> observer)
	{
        observers.remove(observer);
	}

	@Override
	public List<Observer<Road>> getObservers()
	{
		return observers;
	}

	public boolean isAccidentZone()
	{
		return isAccidentZone;
	}

	public boolean isBadWeather()
	{
		return isBadWeather;
	}

	public boolean isCongested()
	{
		return isCongested;
	}


	public void setAccidentZone(boolean accidentZone)
	{
		isAccidentZone = accidentZone;
		notifyObserver(this);
	}


	public void setBadWeather(boolean badWeather)
	{
		isBadWeather = badWeather;
		notifyObserver(this);
	}

	public void setCongested(boolean congested)
	{
		isCongested = congested;
		notifyObserver(this);
	}

	public String getRoadName()
	{
		return roadName;
	}
}
