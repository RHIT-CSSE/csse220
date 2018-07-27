package withDoubleDispatch;

public class Scorpion implements Monster {

	@Override
	public void collide(Monster m) {
		m.collideWithScorpion(this);
	}

	@Override
	public void collideWithMushroom(Mushroom m) {
		System.out.println("Scorpion collided with Mushroom");
	}

	@Override
	public void collideWithCentipede(Centipede m) {
		System.out.println("Scorpion collided with Centipede");
	}

	@Override
	public void collideWithScorpion(Scorpion m) {
		System.out.println("Scorpion collided with Scorpion");
	}

}
