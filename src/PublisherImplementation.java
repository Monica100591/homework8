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
	
	public void notifyObserver(Event e) {
		for(Observer sub: subscribers)
			sub.notifyObserver(e);
	}
	
	public void runSimulation() {
		int oddVal = 0;
		int threeVal = 0;
		boolean istrue = false;
		
		for (int i = 1; i <= 200; i++) {
			Event ev = new Event(i, new Random().nextInt(5000) + 1);
			notifyObserver(ev);
			for (Observer ob : subscribers) {
				istrue = ob.notifyObserver(ev);
				if (ob instanceof SubscriberOdds && istrue) {
					oddVal += 1;
					if (oddVal > 20) {
						removeObserver(ob);
					}
				} else if (ob instanceof SubscriberThrees) {
					threeVal += 1;
					if (threeVal > 6) {
						removeObserver(ob);
					} 
				}
			}
			if (i % 40 == 0 && i / 40 > 0 && i / 40 < 6) {	// For iteration 40, 80, 120, 160, 200
				// register SubscriberOdds if it is unregistered
				// register SubscriberThrees if it is unregistered
			}
		}
	}
	
	public void registerObserver(Observer o){
		subscribers.add(o);
	}
	
	public void removeObserver(Observer o) {
		subscribers.remove(o);
	}
	
	@Override
	public void notifyObserver(Observer o) {
		o.notifyObserver(generateEvent());
	}
}
