// 1.5 points for classes pointing to Bet.
// (arrow wrong, -0.5)
public class HighBet extends Bet {

	public HighBet(double amount) {
		super( amount, 3);
	}
	
	@Override
	public boolean isWinResult(int rollResult) {
		return rollResult > 4;
	}

	@Override
	public String description() {
		return "high numbers";
	}

}
