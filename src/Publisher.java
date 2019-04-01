/**
 * 
 */

/**
 * @author monic_000
 *
 */
public interface PublisherInterface {
	
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObserver(Observer o);

}
