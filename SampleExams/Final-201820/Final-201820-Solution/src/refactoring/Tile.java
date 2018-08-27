package refactoring;

import java.awt.Point;

public abstract class Tile {
	public Point position;

	public abstract void mutate();
	
	public Tile(Point position){
		this.position = position;
	}
}
