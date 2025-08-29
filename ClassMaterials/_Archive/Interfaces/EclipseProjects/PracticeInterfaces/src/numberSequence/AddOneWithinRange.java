package numberSequence;

/**
 * 
 * Produces a between a given range, cycling back to the start
 * once max is reached.  E.g., for AddWithRange(3,5) produces
 * 
 * 3 4 5 3 4 5 3...
 *
 * @author hewner.
 *         Created Sep 29, 2016.
 */
public class AddOneWithinRange implements Sequence{
	private int current, min, max;
	
	public AddOneWithinRange(int min, int max) {
		this.current = max;
		this.min = min;
		this.max = max;
	}

	@Override
	public int next() {
		this.current = this.current + 1;
		if(this.current > this.max) {
			this.current = this.min;
		}
		return this.current;
	}

	@Override
	public void reset() {
		this.current = this.max;
	}
}
