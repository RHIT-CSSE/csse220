package textbased;

public abstract class AbstractDrop extends GameObject {

	public AbstractDrop(String name) {
			super(name);
	}
	
	// This guarantees that all drops can deal with these types of collisions
	
	public abstract void collideWith(UserControlledPlatform userPlatform );
	public abstract void collideWith(BouncingPlatform platform );
	
}
