package ObserverPattern;

import java.util.List;

public class Bridge implements Observable<Bridge>
{
	@Override
	public void deRegisterObserver(Observer<Bridge> observer)
	{

	}

	@Override
	public void registerObserver(Observer<Bridge> observer)
	{

	}

	@Override
	public List<Observer<Bridge>> getObservers()
	{
		return List.of();
	}
}
