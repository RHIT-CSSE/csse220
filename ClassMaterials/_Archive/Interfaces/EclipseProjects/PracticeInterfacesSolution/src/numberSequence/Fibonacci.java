package numberSequence;

public class Fibonacci implements Sequence {

	int prev = -1;
	int prevPrev = 0;

	public Fibonacci() {
		this.prev = -1; // -1 is a special start state
		this.prevPrev = 0;
	}
	
	@Override
	public int next() {
		if(this.prev == -1) {
			this.prev = 1;
			this.prevPrev = 0;
			return 1;
		}
		int result = this.prev + this.prevPrev;
		this.prevPrev = this.prev;
		this.prev = result;
		return result;
	}

	@Override
	public void reset() {
		this.prev = -1;

	}

}