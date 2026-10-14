package memoization;
/**
 * This class provides a simple way to track how long
 * something takes to run, much like a StopWatch.
 * 
 * @author Jason Yoder
 *
 */
public class StopWatch {
	
	private long startTime;
	private long stopTime;
	
	public StopWatch() {
		this.startTime = -1;
		this.stopTime = -1;
	}
	
	/**
	 * Records the start time of the StopWatch
	 */
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	/**
	 * Records the stop time of the StopWatch
	 */
	public void stop() {
		this.stopTime = System.currentTimeMillis();
	}
	
	/**
	 * 
	 * @return double value representing difference from start to end in seconds
	 */
	public double getTimeTakenInSeconds() {
		if (this.startTime == -1) {
			throw new RuntimeException("start() has not been called yet!");
		}
		if (this.stopTime == -1) {
			throw new RuntimeException("stop() has not been called yet!");
		}
		if (this.stopTime-this.startTime < 0) {
			throw new RuntimeException("End time BEFORE start time. Be sure to call stop() AFTER calling start()");
		}
		return (this.stopTime-this.startTime) / 1000.0;
	}

}
