package citytemperatures;

import java.util.ArrayList;

/**
 * Code for representing a single city's tempatures
 *
 * @author hewner.
 *         Created Dec 27, 2013.
 */
public class City {
	private ArrayList<Double> temps;
	private String name;
	
	/**
	 * Create a new city with the given name
	 *
	 * @param name
	 */
	public City(String name) {
		this.name = name;
		this.temps = new ArrayList<Double>();
	}
	
	/**
	 * 
	 * Adds a new temperature to the list
	 *
	 * @param temperature temp to add
	 */
	public void addTemp(double temperature) {
		this.temps.add(temperature);
	}
	/**
	 * 
	 * Gets the current average temperature of the city
	 *
	 * @return average temperature
	 */
	public double getAverageTemp() {
		double total = 0;
		for(double tempature : this.temps) {
			total += tempature;
		}
		return total/this.temps.size();
	}
	

	@Override
	public String toString() {
		return this.name + " " + this.getAverageTemp();
	}
}
