package refactoring;

import java.awt.Point;

public class Rock extends Tile {

	int dy = 1;

	public Rock(Point position) {
		super(position);
	}

	public void fall() {
		this.position.y += dy;
		System.out.println("Rock is falling " + dy);
	}

	@Override
	public void mutate() {
		this.dy *= -1;
		System.out.println("dy is now " + this.dy);
	}

}
