package withDoubleDispatch;

public class Mushroom implements Monster {

	@Override
	public void collide(Monster m) {
		m.collideWithMushroom(this);
	}

	@Override
	public void collideWithMushroom(Mushroom m) {
		System.out.println("Mushroom collided with Mushroom");
	}

	@Override
	public void collideWithCentipede(Centipede m) {
		System.out.println("Mushroom collided with Centipede");
	}

	@Override
	public void collideWithScorpion(Scorpion m) {
		System.out.println("Mushroom collided with Scorpion");
	}

}
