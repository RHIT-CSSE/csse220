package slides;

/**
 * Sample code for local variable scope.
 * 
 * @author Curt Clifton. Created Oct 7, 2008.
 */
public class Scope {
	private int x = 1;

	/**
	 * Starts the sample.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Scope().run();
	}

	/**
	 * Shows the scoping weirdness.
	 */
	private void run() {
		// int x = x * 2;
	}
}
