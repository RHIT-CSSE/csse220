package lateBindingParamsFails;

public class Centipede extends Monster {

	@Override
	public void collide(Mushroom m) {
		System.out.println("Centipede collided with Mushroom");
	}

	@Override
	public void collide(Centipede m) {
		System.out.println("Centipede collided with Centipede");
	}

	@Override
	public void collide(Scorpion m) {
		System.out.println("Centipede collided with Scorpion");
	}

}
