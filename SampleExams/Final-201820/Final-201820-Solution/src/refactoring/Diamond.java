package refactoring;

import java.awt.Point;

public class Diamond extends Tile {

	public int yield;

	public Diamond(Point position) {
		super(position);
		this.yield = 1;
	}

	@Override
	public void mutate() {
		this.yield *= 2;
		System.out.println("Yield is now " + this.yield);
	}
}
