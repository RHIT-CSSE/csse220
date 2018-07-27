package chatter;

/**
 * Shouts (to the console) at random intervals
 * 
 * @author Curt Clifton, modified by Buffalo
 */
public class Ranter {
	private static final int RANGE = 5000;
	private static final int MINIMUM = 250;

	private final String message;

	/**
	 * Creates a ranter with the given message.
	 * 
	 * @param message
	 */
	public Ranter(String message) {
		this.message = message;
	}

	/**
	 * Prints the message and then sleeps.  
	 * You shouldn't need to modify this method.
	 * 
	 * @throws InterruptedException
	 */
	public void printMessageAndSleepRandomAmountofTime() throws InterruptedException {
		System.out.println(this.message);
		Thread.sleep(getRandomSleepTime());
	}

	private long getRandomSleepTime() {
		return (long) (Math.random() * RANGE + MINIMUM);
	}

}
