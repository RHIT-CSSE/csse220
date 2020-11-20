import java.util.ArrayList;
import java.util.Collection;

/**\
 * 
 * You should not need to modify or submit this class.
 * 
 * This is code for four methods, THREE of which have errors.
 * You should create a second file called TestThisClassTest.java
 * which provides at least FOUR test cases (assertions) for each method.
 * 
 * The methods with errors should be left with errors, but the
 * code should expose the problem with them.
 * 
 * Each problem is worth 5 points:
 * 
 * 4 x 1pt each test case (4 assertions minimum, must test different categories)
 * 1 points for CODE COMMENTS explaining WHY cases are DIFFERENT and identifying failing conditions
 * 
 * Total possible: 20 points.
 * 
 * 
 * @author Jason Yoder, Aaron Wilkin, and Joe Hollingsworth
 *
 */

public class TestThisClass {

	
	/**
	 * Given a string, returns the number of Xs.  Both
	 * uppercase and lowercase Xs should be included in the 
	 * count.
	 *
	 * @param the string
	 */
	public static int numberOfXs(String input) {
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			int x = input.charAt(i) / 8;
			if(x == 15 || x == 11)
				count++;
		}
		return count;
	}
	
	
	
	/**
	 * Given an input string, count the number of occurrences of 
	 * the string "Chocula", case-sensitive.
	 * 
	 */
	public static int countChocula(String input) {
		int choculas=0;
		for (int i=0; i< input.length()-7; i++) {
			if ( input.substring(i,i+7).equals("Chocula")) {
				choculas++;
			}
		}
		return choculas;	
	}
	
	
	/**
	 * Given a length and width of a floor in feet and the cost of
	 * paint in dollar per square foot, calculate the cost to paint the room.
	 * 
	 * If any non-positive values are used for any parameters the result should be -1.
	 * The cost in dollars should be rounded up to the nearest whole dollar.
	 * 
	 *
	 * @param length, width, dollarsPerSqFoot
	 */
	public static int paintCost(int length, int width, int dollarsPerSqFoot) {
		if ( Math.min(length, Math.min( width,  dollarsPerSqFoot)) < 0)   {
			return -1;
		}
		return length*width*dollarsPerSqFoot;
	}
	
	
	/**
	 * Given an ArrayList of String describing Pizza, the cost should be calculated as follows:
	 * Zero toppings means the pizza costs $8. The first two toppings are $2 each and after that
	 * each other topping costs $1. There is a special if there are exactly the toppings:
	 * "pepperoni", "onions" and "sausage" (order does not matter) and then the cost is $12.
	 * 
	 *
	 * @param toppings
	 */
	public static int pizzaCostCalculator(ArrayList<String> toppings) {
		ArrayList<String> special = new ArrayList<String>();
		special.add("pepperoni");
		special.add("onions");
		special.add("sausage");
		
		int numToppings = toppings.size();
		
		if (numToppings == 0) {
			return 8;
		} else if (numToppings < 3) {
			return 8 + 2 *numToppings;
		} else if (numToppings == 3) {
			if (  toppings.containsAll( special  )) {
				return 12;
			} else {
				return 13;
			}
		} else {
			return 12 + (numToppings - 2);
		}

		
		
	}
		
	
	
}
