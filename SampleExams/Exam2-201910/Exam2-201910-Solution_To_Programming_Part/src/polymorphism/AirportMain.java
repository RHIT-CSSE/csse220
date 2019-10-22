package polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * This program features an airport with vehicles that take off and land.
 * 
 * Your job is to use inheritance and/or interfaces to remove 
 * as much code duplication as you can. 
 * 
 * @author Jason Yoder, Michael Hewner.
 *
 */
public class AirportMain {
	private List<Vehicle> vehicles; 

	
	private Airport localAirport;

	public static void main(String[] args) {
		new AirportMain();
	}

	public AirportMain() {
		this.localAirport = new Airport("Terre Haute");
		makeVehicles();
		reportTotalExpenses();
		giveFlightOrders();
		reportTotalExpenses();
	}

	public void makeVehicles() {
		this.vehicles = new ArrayList<Vehicle>();

		this.vehicles.add(new Airplane("Captain A") );
		this.vehicles.add(new Airplane("Captain B") );
		

		this.vehicles.add(new Helicopter("Captain C") );
		this.vehicles.add(new Helicopter("Captain D") );
		
		this.vehicles.add(new Rocketship("Captain E") );
		this.vehicles.add(new Rocketship("Captain F") );
		
		
	
	}
	
	public void giveFlightOrders() {
		// Note: You are allowed to change these 
		// indices if needed to keep the output the 
		// same as the original. (Hint: if you move 
		// all the vehicles to a single list, the indices 
		// below will change from 0,1,0,1,0,1 to 
		// 0,1,2,3,4,5)
		this.localAirport.tellVehicleToTravel(   this.vehicles.get(0), 200);
		this.localAirport.tellVehicleToTravel(   this.vehicles.get(1), 100);
		this.localAirport.tellVehicleToTravel( this.vehicles.get(2), 50);
		this.localAirport.tellVehicleToTravel( this.vehicles.get(3), 10);
		this.localAirport.tellVehicleToTravel( this.vehicles.get(4), 1000);
		this.localAirport.tellVehicleToTravel( this.vehicles.get(5), 500);
	
	
	}
	
	public void reportTotalExpenses() {
		double costs = 0;
		for (Vehicle v : this.vehicles) {
			costs += v.calculateExpenses();
		}

		System.out.println("There is a total of $"+costs+" in expenses");
	}
	

}