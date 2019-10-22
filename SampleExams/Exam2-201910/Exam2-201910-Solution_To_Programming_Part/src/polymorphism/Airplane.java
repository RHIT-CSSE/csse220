package polymorphism;

/**
 * This class represents an airplane with associated expenses
 * related to its initial cost and flight expenses. It also 
 * has a particular name of a pilot who directs it.
 *
 */
public class Airplane extends Vehicle{
	public static final double INITIAL_COST=10000;
	public static final double COST_PER_MILE=100;
	
	public Airplane(String pilotName) {
		super(pilotName,INITIAL_COST,COST_PER_MILE);
	}
		
	public void printWarning() {
		System.out.println("Warning, clear the runway for take-off!");
	}
	
}
