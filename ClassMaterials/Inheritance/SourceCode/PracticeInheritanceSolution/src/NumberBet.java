
public class NumberBet extends Bet {

	private int numberBetOn;
	
	public NumberBet(int numberBetOn, double betAmount) {
		super(betAmount, 6);
		this.numberBetOn = numberBetOn;
	}

	public boolean isWinResult(int rollResult) {
		return rollResult == this.numberBetOn;
	}
	
	public String description() {
		return "the number " + numberBetOn;
	}
}
