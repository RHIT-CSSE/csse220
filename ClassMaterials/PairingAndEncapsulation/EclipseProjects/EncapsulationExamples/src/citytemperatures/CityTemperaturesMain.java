package citytemperatures;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * Gets in a list of readings of temperatures for particular cities.
 * Then prints out all the cities and the average temperature for
 * each one.
 * 
 * Note that the order cities are printed out at the end does not matter.
 * 
 * Example:
 * 
Enter the city name (or exit to quit).
Buffalo
What is the city's temperature?
10
Enter the city name (or exit to quit).
Terre Haute
What is the city's temperature?
25
Enter the city name (or exit to quit).
Buffalo
What is the city's temperature?
20
Enter the city name (or exit to quit).
exit
Terre Haute 25.0
Buffalo 15.0
 * 
 * @author hewner
 *
 */
public class CityTemperaturesMain {
	
	/**
	 * 
	 * Requests temperatures and prints averages
	 *
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		//TODO: Maybe add some code here
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
			
			// TODO: add some code here		
		}
		//TODO: add some code here
		input.close();
	}
}