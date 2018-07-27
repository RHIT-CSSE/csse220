package withDoubleDispatch;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		monsters.add(new Mushroom());
		monsters.add(new Centipede());
		monsters.add(new Scorpion());
		
		for (Monster m1 : monsters) {
			System.out.println("M1: " + m1.getClass().getSimpleName());
			for (Monster m2 : monsters) {
				m1.collide(m2);
				//m2.collide(m1); - Can do it either way, but only do one, or you'll get duplicated collision effects
			}
		}
	}
	
	
}
