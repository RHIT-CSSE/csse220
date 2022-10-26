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
public class AddSeveral implements Sequence{
	private int current;
	private int numToAdd;
	
	public AddSeveral(int num) {
		this.current = 0;
		this.numToAdd = num;
	}

	@Override
	public int next() {
		this.current = this.current + numToAdd;
		return this.current;
	}

	@Override
	public void reset() {
		this.current = 0;
	}
}
