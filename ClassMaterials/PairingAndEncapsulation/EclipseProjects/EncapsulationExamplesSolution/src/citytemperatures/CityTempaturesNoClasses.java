/**
 * 
 */
package citytemperatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Example that solves the temperature problem without using classes
 *
 * @author hewner.
 *         Created Dec 27, 2013.
 */
public class CityTempaturesNoClasses {

	/**
	 * The main
	 *
	 * @param args not used
	 */
	public static void main(String[] args) {
		HashMap<String, ArrayList<Double>> map = new HashMap<String,ArrayList<Double>>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the city name (or exit to quit).");
			String cityName = input.nextLine().trim();
			if(cityName.equals("exit")) {
				break;
			}
			System.out.println("What is the city's temperature?");
			double temperature = input.nextDouble();
			//removes the enter
			input.nextLine();
			
			// Your code goes here
			if(map.containsKey(cityName)) {
				map.get(cityName).add(temperature);
			} else {
				ArrayList<Double> tempList = new ArrayList<Double>();
				map.put(cityName, tempList);
				tempList.add(temperature);
			}		
		}
		for(String name : map.keySet()) {
			double total = 0;
			for(double temp : map.get(name)) {
				total += temp;
			}
			double average = total/map.get(name).size();
			System.out.println(name + " " + average);
		}
		input.close();

	}

}
