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
		
		// create a list of everything and compare them
		ArrayList<Weighable> all = new ArrayList<Weighable>();
		for (int i=1; i<= 3; i++) {
			all.add( new Ball(i) );
			all.add( new Cube(i) );
			all.add( new Cylinder(i, i) );
		}
		reportWeightableComparison(all);
	}
	
	private static void reportWeightableComparison(ArrayList<Weighable> weighables) {
		if ( weighables.isEmpty() ) {
			return;
		}
		Weighable heaviest = weighables.get(0);
		for(Weighable w: weighables) {
			if (w.getWeightInLbs() > heaviest.getWeightInLbs() ) {
				System.out.println( w + " is heavier than " + heaviest );
				heaviest = w;
			} else if (w.getWeightInLbs() < heaviest.getWeightInLbs()) {
				System.out.println( w + " is lighter than " + heaviest );
			} else {
				System.out.println( w + " is the same as " + heaviest );
			}
		}
	}
	
}
