
public class OddEvenBet extends Bet {

	// in more modern Java, this should be an enum but
	// let's keep it simple
	public static final int ODD = 0;
	public static final int EVEN = 1;
	
	private boolean isEvenBet;
	
	public OddEvenBet(int oddOrEven, double betAmount) {
		super(betAmount, 2);
		this.isEvenBet = oddOrEven == EVEN;
	}
	
	@Override
	public boolean isWinResult(int rollResult) {
		boolean resultIsEven = rollResult % 2 == 0; 
		if(this.isEvenBet && resultIsEven)
			return true;
		if(!this.isEvenBet && !resultIsEven)
			return true;
		return false;
	}

	@Override
	public String description() {
		if(this.isEvenBet) {
			return "evens";
		}
		return "odds";
	}
}
