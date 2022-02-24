package refactoring;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

public class Dirt extends Tile {

	public Color color;

	public Dirt(Point position, Color color) {
		super(position);
		this.color = color;
	}

	@Override
	public void mutate() {
		Random random = new Random();
		this.color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
		System.out.println("Color is now " + this.color);
	}

}
