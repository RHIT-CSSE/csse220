package numberSequence;

/**
 * 
 * Goes through the powers of two
 * 
 * 2 4 8 16 etc.
 * 
 * Reset resets back to beginning
 *
 * @author hewner.
 *         Created Sep 29, 2016.
 */
		
public class PowersOfTwo implements Sequence {

	private int current;
	
	public PowersOfTwo() {
		this.current = 1;
	}
	
	@Override
	public int next() {
		this.current = this.current * 2;
		return this.current/2;
	}

	@Override
	public void reset() {
		this.current = 1;
	}

}
