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
	
	public Event() {
		
	}
	
	public Event(int EventNumber, int EventData){
		this.eventNumber = EventNumber;
		this.eventData = EventData;
	}
	
	public int getEventData(){
		return eventData;
	}

	public int getEventNumber(){
		return eventNumber;
	}

}
