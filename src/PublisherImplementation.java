/**
 * 
 */
import java.util.*;
/**
 * @author monic_000
 *
 */
public class PublisherImplementation implements PublisherInterface {
	private List<Observer> subscribers = new ArrayList<Observer>(); 
	
	private Event generateEvent() {
		return new Event();
	} 
	
	public void notifyObserver (Event e) {
		for(Observer sub: subscribers)
			sub.notifyObserver(e);
	}
	
	public void runSimulation () {
		
	}
	
	public void registerObserver(Observer o){
		subscribers.add(o);
	}
	
	public void removeObserver(Observer o) {
		subscribers.remove(o);
	}
	
	@Override
	public void notifyObserver (Observer o) {
		o.notifyObserver(generateEvent());
	}
}
