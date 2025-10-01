package numberSequence;

/**
 * 
 * Produces a sequence like this:
 * 
 * 1 2 3 4 5 6 7
 *
 * @author hewner.
 *         Created Sep 29, 2016.
 */
public class AddOne implements Sequence{
	private int current;
	
	public AddOne() {
		this.current = 0;
	}

	@Override
	public int next() {
		this.current = this.current + 1;
		return this.current;
	}

	@Override
	public void reset() {
		this.current = 0;
	}
}
