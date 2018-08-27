package refactoring;

public class Diamond {

	public int tileX;
	public int tileY;
	public int yield;

	public Diamond(int tileX, int tileY) {
		super();
		this.tileX = tileX;
		this.tileY = tileY;
		this.yield = 1;
	}

	public void doubleYield() {
		this.yield *= 2;

		System.out.println("Yield is now " + this.yield);
	}
}
