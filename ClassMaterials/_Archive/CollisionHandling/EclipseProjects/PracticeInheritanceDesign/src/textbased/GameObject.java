package textbased;

public abstract class GameObject {
	
	public static final double ODDS_OF_COLLIDING=0.01;
	private String name;
	
	public GameObject(String name) {
		this.name= name;
	}
	
	// 1% chance
	public boolean intersects( GameObject other) {
		return Math.random() < ODDS_OF_COLLIDING;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.name;
	}

}
