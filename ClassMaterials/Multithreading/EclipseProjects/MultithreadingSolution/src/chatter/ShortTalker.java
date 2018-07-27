package chatter;

/**
 * This runnable class should print:
 * 
 * Message 1 of 3
 * 
 * wait 2 seconds
 * 
 * Message 2 of 3
 * 
 * wait 2 seconds
 * 
 * Message 3 of 3....I'm exiting forever
 * 
 * and then it should exit
 * 
 * @author Buffalo
 */
public class ShortTalker implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Message 1 of 3");
			Thread.sleep(2000);
			System.out.println("Message 2 of 3");
			Thread.sleep(2000);
			System.out.println("Message 3 of 3...I'm exiting forever");
			
		} catch (InterruptedException exception) {
		}
	}

}
