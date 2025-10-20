package advancedSolutionCustomException;
/**
 * This class represents the problem of when too many scores
 * are provided when playing the FileBestScore game
 * 
 * @author Jason Yoder
 *
 */
public class TooManyScoresException extends Exception {
	
	private int actual, allowed;
	
	public TooManyScoresException(int actual, int allowed) {
		this.actual = actual;
		this.allowed = allowed;
	}
	@Override
	public String getMessage() {
		int tooManyNumber = this.actual - this.allowed;
		return tooManyNumber + " too many scores. ";
	}
}
