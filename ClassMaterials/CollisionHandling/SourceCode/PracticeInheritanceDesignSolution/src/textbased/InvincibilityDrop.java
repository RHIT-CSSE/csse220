package textbased;

public class InvincibilityDrop extends AbstractDrop {

	
	public InvincibilityDrop(String name) {
		super(name);
	}

	@Override
	public void collideWith(UserControlledPlatform userPlatform) {
		
		if ( this.intersects(userPlatform ) ) {
			System.out.println(this + " collided with userPlatform and will be removed");
		}
		
	}

	@Override
	public void collideWith(BouncingPlatform platform) {
		if ( this.intersects(platform ) ) {
			System.out.println(this + " collided with bouncing platform and will be removed");
			platform.makeInvincible();
		}
		
	}
	
}
