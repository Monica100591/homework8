
public class SubscriberEvens implements Observer {

	@Override
	public boolean notifyObserver(Event e) {
		if(e.getEventData() % 2 == 0) {
		    System.out.println("Event " + e.getEventNumber() +  " is even: " + e.getEventData());
		    return true;
		} else {
			return false;
		}
	}
	 
 }
