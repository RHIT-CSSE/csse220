package withDoubleDispatch;

public interface Monster {

	void collide(Monster m);
	
	void collideWithMushroom(Mushroom m);

	void collideWithCentipede(Centipede m);
	
	void collideWithScorpion(Scorpion m);
}
