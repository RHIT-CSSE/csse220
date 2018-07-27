package withDoubleDispatch;

public class Centipede implements Monster {

	@Override
	public void collide(Monster m) {
		m.collideWithCentipede(this);
	}

	@Override
	public void collideWithMushroom(Mushroom m) {
		System.out.println("Centipede collided with Mushroom");
	}

	@Override
	public void collideWithCentipede(Centipede m) {
		System.out.println("Centipede collided with Centipede");
	}

	@Override
	public void collideWithScorpion(Scorpion m) {
		System.out.println("Centipede collided with Scorpion");
	}

}
