/**
 * 
 */

/**
 * @author monic_000
 *
 */
public class Event {

	private int eventNumber;
	private int eventData;
	
	public void Event(int EventNumber, int EventData){
		eventNumber = EventNumber;
		eventData = EventData;
	}
	
	public int getEventData(){
		return eventData;
	}

	public int getEventNumber(){
		return eventNumber;
	}

}
