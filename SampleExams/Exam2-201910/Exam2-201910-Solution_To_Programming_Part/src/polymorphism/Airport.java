package polymorphism;

/**
 * This class represents an airport which can direct status updates and tell
 * various vehicles to travel some distance
 *
 */
public class Airport {

	private String name;
	
	public Airport(String string) {
		this.name = string;
	}
	
	public void tellVehicleToTravel(Vehicle a, int milesToTravel) {
		System.out.println( a.getClass().getSimpleName() +  ", piloted by "+ a.getPilotName()  +", departing from " + this.name + " for "+milesToTravel+ " miles");
		a.travel(milesToTravel);
	}

}
