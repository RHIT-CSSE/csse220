
public class TestThisClass {
	
	/**
	 * 
	 * You just got a new dog, but he loves to bark! Your mom is not
	 * so happy with his preference for loud barks at all hours. It's
	 * your job to train him when it's okay to bark and when it's not.
	 * 
	 * The following method tells you when the dog will get you in trouble 
	 * if he barks (or barks too much).
	 * 
	 * Here are the rules:
	 * 		You will get in trouble if the dog barks between 9pm (inclusive) and 6am (exclusive),
	 * 			no matter HOW MUCH he barks!
	 * 		You will get in trouble if he barks more than 10 times in a row,
	 * 			no matter WHEN he barks.
	 * 		You will get in trouble if he barks more than 5 times in a row during
	 * 			mom's reading hour: 7pm (inclusive) - 8pm (exclusive).
	 * 
	 * The following method is implemented for you. 
	 * 
	 * TODO: Create a test class that makes sure this method works so you know
	 * when you'll get in trouble!
	 *
	 * @param currentTime - The time of the barking, in military time (0 - 2399).
	 * @param numBarksInARow - The number of times the dog barked.
	 * @return whether you will get in trouble.
	 */
	public static boolean inTrouble(int currentTime, int numBarksInARow){
		if ((currentTime >= 2100 || currentTime < 600) && numBarksInARow > 0) {
			return true;
		}
		if (numBarksInARow > 10) {
			return true;
		}
		if (currentTime >= 1900 && currentTime < 2000 && numBarksInARow > 5) {
			return true;
		}
		return false;
	}
}
