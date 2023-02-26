import java.util.ArrayList;

/**
 * Class: TestThisClass
 * 
 * Do not modify or submit this class. 
 * Be sure to include a Help Citation in the file that you do submit.
 * 
 * @author CSSE Faculty
 *
 */
public class TestThisClass {

	/**
	 * ensures: returns an exact count of the number of 'X' or 'x' characters appearing in inputString
	 * @param inputString is analyzed for 'x' and 'X' characters
	 * @return exact count of 'x' and 'X' characters found in inputString
	 */
	public static int numberOfXs(String inputString) {
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			int x = inputString.charAt(i) / 8;
			if (x == 15 || x == 11) {
				count++;
			}  // end if
		} // end for
		return count;
	} // numberOfXs


	/**
	 * ensures: returns an exact count of the number of times "Chocula" appears in inputString
	 * @param inputString is analyzed for "Chocula" - case sensitive, e.g., "chocula" will not be counted
	 * @return exact count of "Chocula" found in inputString
	 */
	public static int countChocula(String inputString) {
		int choculas = 0;
		for (int i = 0; i < inputString.length() - 7; i++) {
			if (inputString.substring(i, i + 7).equals("Chocula")) {
				choculas++;
			} // end if
		} // end for
		return choculas;
	} // countChocula


	/**
	 * ensures: returns -1 if any input parameter is not positive, otherwise
	 * <br> returns the cost in dollars to paint a room's floor based on the input parameters 
	 * @param length is the length of the room in feet
	 * @param width is the width of the room in feet
	 * @param dollarsPerSqFoot is the cost to paint 1 square foot of a surface
	 * @return cost to paint a room's floor or -1 if any input parameter is not positive
	 */
	public static int paintCost(int length, int width, int dollarsPerSqFoot) {
		if (Math.min(length, Math.min(width, dollarsPerSqFoot)) < 0) {
			return -1;
		} // end if
		return length * width * dollarsPerSqFoot;
	} // paintCost


	/**
	 * ensures: returns the cost in dollars for a pizza made with the toppings found in toppingsList
	 * <br> cost = $8 for zero toppings
	 * <br> For greater than 0 toppings in toppingsList:
	 * <br>    cost = $8 + $2 each for toppings #1 and #2 and then add $1 each for toppings #3, #4, etc.
	 * <br> cost = $12 for a 'special'
	 * <br>    a 'special' only has these 3 toppings (in any order): "pepperoni", "onions" and "sausage"
	 * @param toppingsList contains 0 or more pizza toppings
	 * @return the cost of a pizza based on the toppings found in toppingsList
	 */
	public static int pizzaCostCalculator(ArrayList<String> toppingsList) {
		ArrayList<String> special = new ArrayList<String>();
		special.add("pepperoni");
		special.add("onions");
		special.add("sausage");

		int numToppings = toppingsList.size();

		if (numToppings == 0) {
			return 8;
		} else if (numToppings < 3) {
			return 8 + 2 * numToppings;
		} else if (numToppings == 3) {
			if (toppingsList.containsAll(special)) {
				return 12;
			} else {
				return 13;
			} // end if
		} else {
			return 12 + (numToppings - 2);
		} // end if
	} // pizzaCostCalculator

} // end class TestThisClass
