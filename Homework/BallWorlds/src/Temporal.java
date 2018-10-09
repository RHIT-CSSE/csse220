

/**
 * Represents things that vary with the passing of time.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public interface Temporal {

	/**
	 * Signals to this object that an "moment" of time has passed and the object
	 * should update to its next state in time.
	 */
	void timePassed();

	/**
	 * Signals to this object that it's useful life is over.
	 */
	void die();

	/**
	 * Sets whether this object should be paused. When paused, the object
	 * shouldn't change state as timePassed() is called.
	 * 
	 * @param isPaused
	 *            pause the object if true
	 */
	void setIsPaused(boolean isPaused);

	/**
	 * Returns whether or not this object is paused.
	 * 
	 * @return paused status
	 */
	boolean getIsPaused();
}
