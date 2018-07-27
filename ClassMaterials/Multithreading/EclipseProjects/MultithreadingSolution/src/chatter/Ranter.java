package chatter;

// FIXME: remove class for template
/**
 * Shouts (to the console) at random intervals
 * 
 * @author Curt Clifton. Created Nov 9, 2009.
 */
public class Ranter implements Runnable {
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

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(this.message);
				Thread.sleep(getRandomSleepTime());
			}
		} catch (InterruptedException e) {
			// nothing to do here
		}
	}

	private long getRandomSleepTime() {
		return (long) (Math.random() * RANGE + MINIMUM);
	}

}
