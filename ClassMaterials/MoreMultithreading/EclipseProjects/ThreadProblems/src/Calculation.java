
/**
 * 
 * You don't really need to look at or modify this class.
 *
 * @author hewner.
 *         Created Nov 7, 2016.
 */
public class Calculation {

	public static void doCalculation(String jobName) {
		try {
			System.out.println("Starting " + jobName);
			Thread.sleep(300);
			System.out.println("Finishing " + jobName);
			Thread.sleep(50);
		} catch (InterruptedException exception) {
			throw new RuntimeException("Unexpected interrupt!");
		}

	}

}
