package lateBindingParamsFails;

public class Mushroom extends Monster {


	@Override
	public void collide(Mushroom m) {
		System.out.println("Mushroom collided with Mushroom");
	}

	@Override
	public void collide(Centipede m) {
		System.out.println("Mushroom collided with Centipede");
	}

	@Override
	public void collide(Scorpion m) {
		System.out.println("Mushroom collided with Scorpion");
	}

}
