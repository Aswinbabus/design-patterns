package ObserverPattern;

import java.util.List;

import javax.security.auth.Subject;

public interface Observable
{
	void registerObserver(Observer observer);

	void deRegisterObserver(Observer observer);

	List<Observer> getObservers();

	default void notifyObserver(Observable observable) {

		for(Observer observer : getObservers()) {
			observer.update(observable);
		}

	}
}
