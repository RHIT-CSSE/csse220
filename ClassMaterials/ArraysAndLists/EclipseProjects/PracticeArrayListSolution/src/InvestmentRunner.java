/**
 * This program computes how long it takes for an investment to double.
 * 
 * @author Cay Horstmann.
 */
public class InvestmentRunner {

	/**
	 * Runs the computation.
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args) {
		final double INITIAL_BALANCE = 10000.0;
		final double RATE = 5.0;
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		invest.waitForBalance(2* INITIAL_BALANCE);
		int years = invest.getYears();
		System.out.println("The investment doubled after " + years + " years.");
	}

}
