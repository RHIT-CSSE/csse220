
public interface Bet {
	// 1.5 points for interface labeled as such (0.5 point) 
	// with 2 methods (1 point).
	boolean isWinResult(int rollResult);
	double winAmount();
	String description();
}
