package polymorphism;

/**
 * This class represents an rocketship with associated expenses
 * related to its initial cost and flight expenses. It also 
 * has a particular name of a pilot who directs it.
 *
 */
public class Rocketship extends Vehicle {
	public static final double INITIAL_COST=25000;
	public static final double COST_PER_MILE=500;
	
	public Rocketship(String pilotName) {
		super(pilotName,INITIAL_COST,COST_PER_MILE);
	}

	@Override
	public void printWarning() {
		System.out.println("Warning! Rocketship about to depart, get inside now!");
	}

}
