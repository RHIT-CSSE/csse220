//package simpleExample;
//
//import java.util.ArrayList;
//
//
///**
// * This class allows us to weight balls, cynlders, and cubes of different sizes
// * Duplicated code has been eliminated by the use of the interface Weighable
// *
// * @author Jason Yoder
// *
// */
//public class ScaleSimulator {
//	private ArrayList<Weighable> objects;
//
//
//	public ScaleSimulator() {
//		objects = new ArrayList<Weighable> ();
//	}
//
//	private void initializeArray(ArrayList<Weighable> weighables) {
//		final int itemMax = 3;
//
//		// initialize
//		for (int i=1; i<= itemMax; i++) {
//			weighables.add( new Ball(i) );
//			weighables.add( new Cube(i) );
//			weighables.add( new Cylinder(i, i) );
//		}
//	}
//
//	private void reportObjectComparison(ArrayList<Weighable> weighables) {
//		if ( weighables.isEmpty() ) {
//			return;
//		}
//		Weighable heaviest = weighables.get(0);
//		for(Weighable w: weighables) {
//			if (w.calculateWeightInLbs() > heaviest.calculateWeightInLbs() ) {
//				System.out.println( w + " is heavier than " + heaviest );
//				heaviest = w;
//			} else if (w.calculateWeightInLbs() < heaviest.calculateWeightInLbs()) {
//				System.out.println( w + " is lighter than " + heaviest );
//			} else {
//				System.out.println( w + " is the same as " + heaviest );
//			}
//		}
//	}
//
//	private void runApp() {
//		this.initializeArray(objects);
//		this.reportObjectComparison(objects);
//	}
//
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		ScaleSimulator simulator = new ScaleSimulator();
//		simulator.runApp();
//	}
//
//}
