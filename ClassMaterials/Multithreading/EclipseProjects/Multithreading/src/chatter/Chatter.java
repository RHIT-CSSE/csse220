package chatter;

/**
 * This runnable class prints a message to the console at regular intervals.
 * 
 * @author Curt Clifton. Created Nov 9, 2009.
 */
public class Chatter implements Runnable {

	private final String message;
	private final long pauseInMS;

	/**
	 * Constructs an object to print the given message at the given rate.
	 * 
	 * @param message
	 * @param messagesPerMinute
	 */
	public Chatter(String message, int messagesPerMinute) {
		this.message = message;
		this.pauseInMS = 60000 / messagesPerMinute;
	}

	@Override
	public void run() {
		try {
			/*
			 * Main "brains" inside an infinite loop, so the thread keeps
			 * running:
			 */
			while (true) {
				// Work of the thread can include calls to other methods:
				String timeS = getTimeStamp();
				System.out.println(timeS + ": " + this.message);

				/*
				 * After the work is done, put the thread to sleep so other
				 * threads can work. (Or the CPU can rest if no other threads
				 * are active.)
				 */
				Thread.sleep(this.pauseInMS);
			}
		} catch (InterruptedException exception) {
			/*
			 * This Runnable object just exits when interrupted, so there isn't
			 * anything to do here.  Sometimes threads will use _very_ long sleep
			 * times, with interrupts used to wake them up and do something.  That
			 * is, we don't always exit when interrupted.
			 */
		}
	}

	/**
	 * @return a time stamp
	 */
	private String getTimeStamp() {
		long time = System.currentTimeMillis();
		String timeS = String.format("%04d", time);
		timeS = timeS.substring(timeS.length() - 4, timeS.length());
		return timeS;
	}

}
