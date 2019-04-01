
public class SubscriberOdds implements Observer {

	@Override
	public boolean notifyObserver(Event e) {
		if(e.getEventData() % 2 != 0) {
		    System.out.println("Event " + e.getEventNumber() +  "is odd: " + e.getEventData());
		    return true;
		} else {
			return false;
		}
	}
	 
 }