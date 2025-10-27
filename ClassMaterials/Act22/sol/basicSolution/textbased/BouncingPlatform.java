package textbased;

public class BouncingPlatform extends GameObject  {
	
	public BouncingPlatform(String name) {
		super(name);
	}

	public void addDrop() {
		System.out.println(this + " collided with DamagingDrop and will be 1 drop wetter.");
	}
	
	public void heal() {
		System.out.println(this + " collided with HealingDrop and will be completely dry.");	
	}
	
	public void makeInvincible() {
		System.out.println(this + " collided with HealingDrop and will become Invincible.");
		
	}

}
