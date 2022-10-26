
public abstract class Bet {
	// 1.5 points for interface labeled as such (0.5 point) 
	// with 2 methods (1 point).
	private double amount;
	private double mutiplier;
	
	public Bet(double amount, double multiplier) {
		this.amount = amount;
		this.mutiplier = multiplier;
	}
	public double winAmount() {
		return this.amount * this.mutiplier;
	}
	
	abstract boolean isWinResult(int rollResult);
	abstract String description();
}
