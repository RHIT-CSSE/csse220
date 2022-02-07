/**
 * Calculates the years to double an investment for a variety of interest rates.
 * @author Curt Clifton, modified by Delvin Defoe. Created Sep 21, 2008, 
 * updated on Dec 2, 2013.
 */
public class Rates {

	/**
	 * Calculates the results.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		final double STARTING_RATE = 0.1;
		final double ENDING_RATE = 2.0;
		final double STEP_SIZE = 0.1;
		final double AMOUNT = 100.0;

		System.out.println("Rate  Years to Double");
		System.out.println("----  ---------------");
		/*
		 * DONE in class 
		 * Use a for loop to prints results like the following table:

		    Rate  Years to Double
		    ----  ---------------
		    0.1%    694
		    0.2%    347
		    0.3%    232
		    0.4%    174
		    0.5%    139
		    0.6%    116
		    0.7%    100
		    0.8%     87
		    0.9%     78
		    1.0%     70
		    1.1%     64
		    1.2%     59
		    1.3%     54
		    1.4%     50
		    1.5%     47
		    1.6%     44
		    1.7%     42
		    1.8%     39
		    1.9%     37

 			This should be done for rates up to 8.0% (in increments of 0.1 percent, 
 			as shown in the above example). Use an instance of the provided 
 			Investment class to do the calculation for each line of the table. 
		 */
		for (double rate = STARTING_RATE; rate <= ENDING_RATE; rate += STEP_SIZE) {
			Investment inv = new Investment(AMOUNT, rate);
			inv.waitForBalance(2 * AMOUNT);
			int years = inv.getYears();
			System.out.printf("%3.1f%%  %5d%n", rate, years);
		}
	}

}
