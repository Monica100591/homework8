
public class SubscriberThrees implements Observer {

	@Override
	public boolean notifyObserver(Event e) {
		if(e.getEventData() % 3 == 0) {
		    System.out.println("Event " + e.getEventNumber() +  " is divisible by 3: " + e.getEventData());
		    return true;
		} else {
			return false;
		}		
	}
 }