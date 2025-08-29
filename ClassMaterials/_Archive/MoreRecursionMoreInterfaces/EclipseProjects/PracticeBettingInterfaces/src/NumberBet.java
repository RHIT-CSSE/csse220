
public class NumberBet {

	private int numberBetOn;
	private double amount;
	
	public NumberBet(int numberBetOn, double betAmount) {
		this.numberBetOn = numberBetOn;
		this.amount = betAmount;
	}

	public boolean isWinResult(int rollResult) {
		return rollResult == this.numberBetOn;
	}
	
	public double winAmount() {
		return this.amount*6;
	}
}
