// 1.5 points for classes pointing to Bet.
// (arrow wrong, -0.5)
public class HighBet implements Bet {

	double amount;
	public HighBet(double amount) {
		this.amount = amount;
	}
	
	@Override
	public boolean isWinResult(int rollResult) {
		return rollResult > 4;
	}

	@Override
	public double winAmount() {
		return this.amount * 3;
	}

	@Override
	public String description() {
		return "high numbers";
	}

}
