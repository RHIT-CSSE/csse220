package chatter;

/**
 * This is the main starting point for the Chatter example.
 *
 * @author Curt Clifton.
 *         Created Nov 9, 2009.
 */
public class Main {

	/**
	 * Starts the chatter.
	 *
	 * @param args ignored
	 */
	public static void main(String[] args) {
		// TODO: Experiment with different rates of chattering.
		// TODO: What happens if the rates are the same?
		Runnable r1 = new Chatter("foo", 60);
		Runnable r2 = new Chatter("bar", 120);
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		
		t1.start();
		t2.start();
		
		
		// TODO: add another object that shouts at random intervals
		// FIXME: remove for template
		Runnable r3 = new Ranter("Sardines!");
		Thread t3 = new Thread(r3);
		t3.start();
		
		Runnable r4 = new ShortTalker();
		Thread t4 = new Thread(r4);
		t4.start();
	}

}
