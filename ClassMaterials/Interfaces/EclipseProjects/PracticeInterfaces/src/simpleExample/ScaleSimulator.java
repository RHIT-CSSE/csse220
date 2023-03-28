package simpleExample;

import java.util.ArrayList;


/**
 * This class allows us to weight balls, cylinders, and cubes of different sizes
 * Unfortunately, there is a lot of duplicated code
 * Can we develop a common interface to make this class a lot shorter?
 * 
 * @author Jason Yoder
 *
 */
public class ScaleSimulator {
	private ArrayList<Ball> balls;
	private ArrayList<Cube> cubes;
	private ArrayList<Cylinder> cylinders;


	public ScaleSimulator() {
		balls = new ArrayList<Ball>();
		cubes = new ArrayList<Cube>();
		cylinders = new ArrayList<Cylinder>();
	}
	
	private void initializeArrays() {
		final int itemMax = 3;
		
		// initialize objects
		for (int i=1; i<= itemMax; i++) {
			balls.add( new Ball(i) );
			cubes.add( new Cube(i) );
			cylinders.add( new Cylinder(i, i) );
		}
		
	}

	private void reportBallComparison(ArrayList<Ball> balls) {
		if ( balls.isEmpty() ) {
			return;
		}
		Ball heaviest = balls.get(0);
		for(Ball b: balls) {
			if (b.calculateWeightInLbs() > heaviest.calculateWeightInLbs() ) {
				System.out.println( b + " is heavier than " + heaviest );
				heaviest = b;
			} else if (b.calculateWeightInLbs() < heaviest.calculateWeightInLbs()) {
				System.out.println( b + " is lighter than " + heaviest );
			} else {
				System.out.println( b + " is the same as " + heaviest );
			}
		}
	}
	
	private void reportCubeComparison(ArrayList<Cube> cubes) {
		if ( cubes.isEmpty() ) {
			return;
		}
		Cube heaviest = cubes.get(0);
		for(Cube c: cubes) {
			if (c.calculateMassInKG() > heaviest.calculateMassInKG() ) {
				System.out.println( c + " is heavier than " + heaviest );
				heaviest = c;
			} else if (c.calculateMassInKG() < heaviest.calculateMassInKG()) {
				System.out.println( c + " is lighter than " + heaviest );
			} else {
				System.out.println( c + " is the same as " + heaviest );
			}
		}
	}

	private void reportCylinderComparison(ArrayList<Cylinder> cylinders) {
		if ( cylinders.isEmpty() ) {
			return;
		}
		Cylinder heaviest = cylinders.get(0);
		for(Cylinder c: cylinders) {
			if (c.calculateWeightInTons() > heaviest.calculateWeightInTons() ) {
				System.out.println( c + " is heavier than " + heaviest );
				heaviest = c;
			} else if (c.calculateWeightInTons() < heaviest.calculateWeightInTons()) {
				System.out.println( c + " is lighter than " + heaviest );
			} else {
				System.out.println( c + " is the same as " + heaviest );
			}
		}
	}
	
	private void runApp() {
		this.initializeArrays();

		System.out.println("---------------------------------------");
		this.reportBallComparison(balls);		

		System.out.println("---------------------------------------");
		this.reportCubeComparison(cubes);

		System.out.println("---------------------------------------");
		this.reportCylinderComparison(cylinders);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ScaleSimulator simulator = new ScaleSimulator();
		simulator.runApp();
	}	

}
