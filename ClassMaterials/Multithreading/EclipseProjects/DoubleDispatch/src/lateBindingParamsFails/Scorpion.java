package lateBindingParamsFails;

public class Scorpion extends Monster {

	@Override
	public void collide(Mushroom m) {
		System.out.println("Scorpion collided with Mushroom");
	}

	@Override
	public void collide(Centipede m) {
		System.out.println("Scorpion collided with Centipede");
	}

	@Override
	public void collide(Scorpion m) {
		System.out.println("Scorpion collided with Scorpion");
	}

}
