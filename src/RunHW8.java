/**
 * 
 */

/**
 * @author monic_000
 * @return 
 *
 */
public class RunHW8 {
	
	private static PublisherImplementation pub;
	
	public static void main (String args[]) {
		pub = new PublisherImplementation();
		
		SubscriberOdds odds = new SubscriberOdds();
		SubscriberEvens evens = new SubscriberEvens();
		SubscriberThrees threes = new SubscriberThrees();
		
		pub.registerObserver(odds);
		pub.registerObserver(evens);
		pub.registerObserver(threes);
		pub.runSimulation();
	}
	
}
	
	
	
