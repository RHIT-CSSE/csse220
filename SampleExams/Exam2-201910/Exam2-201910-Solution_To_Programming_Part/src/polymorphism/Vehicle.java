package polymorphism;

public abstract class Vehicle {


	
	private int milesTraveled;
	private String pilotName;
	private double initialCost;

	private double costPerMile;
	
	public Vehicle(String pilotName, double initialCost, double costPerMile) {
		this.pilotName = pilotName;
		this.initialCost = initialCost;
		this.costPerMile = costPerMile;
	}
	
	public double calculateExpenses() {
		return this.initialCost + this.milesTraveled*this.costPerMile;
	}
	
	public void travel(int milesToDestination) {
		printWarning();
		this.milesTraveled += milesToDestination;
	}
	
	public abstract void printWarning();

	public double getMilesTraveled() {
		return this.milesTraveled;
	}
	
	public String getPilotName() {
		return this.pilotName;
	}
	
}
