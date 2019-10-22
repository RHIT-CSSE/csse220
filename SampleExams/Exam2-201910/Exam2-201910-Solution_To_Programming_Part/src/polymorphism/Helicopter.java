package polymorphism;
/** 
 * 
 * This class represents an helicopter with associated expenses
* related to its initial cost and flight expenses. It also 
* has a particular name of a pilot who directs it.
*/
public class Helicopter extends Vehicle {
	public static final double INITIAL_COST=5000;
	public static final double COST_PER_MILE=200;
	
	public Helicopter(String pilotName) {
		super(pilotName,INITIAL_COST,COST_PER_MILE);
	}

	@Override
	public void printWarning() {
		System.out.println("Warning! Helicopter blades are extremely dangerous!");
	}

}
