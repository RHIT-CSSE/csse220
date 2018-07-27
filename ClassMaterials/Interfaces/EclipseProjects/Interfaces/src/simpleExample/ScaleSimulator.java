package simpleExample;

import java.util.ArrayList;


/**
 * This class allows us to weight balls and cubes of different sizes
 * Unfortunately, there is a lot of duplicated code
 * Can we develop a common interface to make this class a lot shorter?
 * 
 * @author Jason Yoder
 *
 */
public class ScaleSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create a list of balls and compare them
		ArrayList<Ball> balls = new ArrayList<Ball>();
		for (int i=1; i<= 3; i++) {
			balls.add( new Ball(i) );
		}
		System.out.println("---------------------------------------");
		reportBallComparison(balls);
		
		
		// create a list of cubes and compare them
		ArrayList<Cube> cubes = new ArrayList<Cube>();
		for (int i=1; i<= 3; i++) {
			cubes.add( new Cube(i) );
		}
		System.out.println("---------------------------------------");
		reportCubeComparison(cubes);
		
		
		// create a list of cylinders and compare them
		ArrayList<Cylinder> cylinders = new ArrayList<Cylinder>();
		for (int i=1; i<= 3; i++) {
			cylinders.add( new Cylinder(i, i) );
		}
		
		//compare balls and cubes
		System.out.println("---------------------------------------");
		reportCylinderComparison(cylinders);
		
		//How could I compare all of these?
		

	}
	



	private static void reportBallComparison(ArrayList<Ball> balls) {
		if ( balls.isEmpty() ) {
			return;
		}
		Ball heaviest = balls.get(0);
		for(Ball b: balls) {
			if (b.getWeightInLbs() > heaviest.getWeightInLbs() ) {
				System.out.println( b + " is heavier than " + heaviest );
				heaviest = b;
			} else if (b.getWeightInLbs() < heaviest.getWeightInLbs()) {
				System.out.println( b + " is lighter than " + heaviest );
			} else {
				System.out.println( b + " is the same as " + heaviest );
			}
		}
	}
	
	private static void reportCubeComparison(ArrayList<Cube> cubes) {
		if ( cubes.isEmpty() ) {
			return;
		}
		Cube heaviest = cubes.get(0);
		for(Cube c: cubes) {
			if (c.getMassInKG() > heaviest.getMassInKG() ) {
				System.out.println( c + " is heavier than " + heaviest );
				heaviest = c;
			} else if (c.getMassInKG() < heaviest.getMassInKG()) {
				System.out.println( c + " is lighter than " + heaviest );
			} else {
				System.out.println( c + " is the same as " + heaviest );
			}
		}
	}

	private static void reportCylinderComparison(ArrayList<Cylinder> cylinders) {
		if ( cylinders.isEmpty() ) {
			return;
		}
		Cylinder heaviest = cylinders.get(0);
		for(Cylinder c: cylinders) {
			if (c.getWeightInTons() > heaviest.getWeightInTons() ) {
				System.out.println( c + " is heavier than " + heaviest );
				heaviest = c;
			} else if (c.getWeightInTons() < heaviest.getWeightInTons()) {
				System.out.println( c + " is lighter than " + heaviest );
			} else {
				System.out.println( c + " is the same as " + heaviest );
			}
		}
	}
}
