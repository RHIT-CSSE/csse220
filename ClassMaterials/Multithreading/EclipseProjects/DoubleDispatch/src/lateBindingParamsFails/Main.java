package lateBindingParamsFails;

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
				
				//Can't do m1.collide here, it causes a compilation error because it 
				//only sees m2 as a Monster, and there is no matching method.
				//If we did add collide(Monster m), that would always get called.	
				m1.collide(m2);
				
			}
		}
	}
	
//	public static void main(String[] args) {
//		ArrayList<Monster> monsters = new ArrayList<Monster>();
//		monsters.add(new Mushroom());
//		monsters.add(new Centipede());
//		monsters.add(new Scorpion());
//		
//		for (Monster m1 : monsters) {
//			System.out.println("M1: " + m1.getClass().getSimpleName());
//			for (Monster m2 : monsters) {
//				
//				m1.collide(m2);
//				
//			}
//		}
//	}
//	
	
}
