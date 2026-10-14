
public class OddEvenBet {

	// in more modern Java, this should be an enum but
	// let's keep it simple
	public static final int ODD = 0;
	public static final int EVEN = 1;
	
	private boolean isEvenBet;
	private double amount;
	
	public OddEvenBet(int oddOrEven, double betAmount) {
		this.isEvenBet = oddOrEven == EVEN;
		this.amount = betAmount;
	}
	
	public boolean isWinResult(int rollResult) {
		boolean resultIsEven = rollResult % 2 == 0; 
		if(this.isEvenBet && resultIsEven)
			return true;
		if(!this.isEvenBet && !resultIsEven)
			return true;
		return false;
	}
	
	public double winAmount() {
		return this.amount*2;
	}
}
