package refactoring;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

public class Dirt {

	public Point position;
	public Color color;

	public Dirt(Point position, Color color) {
		super();
		this.position = position;
		this.color = color;
	}

	public void randomColor() {
		Random random = new Random();
		this.color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
		System.out.println("Color is now " + this.color);
	}

}
