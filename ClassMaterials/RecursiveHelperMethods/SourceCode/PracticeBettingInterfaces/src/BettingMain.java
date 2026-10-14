import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * 
 * This system works but there's code duplication that
 * makes it difficult to add new kinds of bets.
 * 
 * TODO #1
 * Take a look at the "handle roll" method.  You should see
 * quite easily that there is duplicate code.
 * 
 * Create a new interface that makes it possible to remove
 * that duplication.  To do this, you'll need to make two
 * existing classes in the system implement that interface.
 * 
 * You'll need to modify code in several places (in 
 * particular handleRoll but elsewhere too).  You should
 * also modify the fields of BettingMain.
 * 
 * TODO #2
 * Add a new kind of bet - a "high-bet" that is successful
 * on a 5 or 6.  This bet should pay out 3*bet amount.
 * 
 * Your new bet should implement the interface, and should
 * be easy to add.
 * 
 * TODO #3 if you have time.
 * Make a way to get a description of a bet, and then 
 * display it on win/lose.  For example:
 * 
 * "Your bet on odd numbers lost."
 * "Your bet on the number 6 won $12"
 * 
 * You'll have to add a method to the interface for this
 * to work easily.
 */
public class BettingMain {

	private double currentMoney;
	
	private ArrayList<NumberBet> numberBets;
	private ArrayList<OddEvenBet> oddEvenBets;
	
	public BettingMain() {
		this.currentMoney = 10; // start the game with 10 dollars
		this.numberBets = new ArrayList<NumberBet>();
		this.oddEvenBets = new ArrayList<OddEvenBet>();
	}
	
	/**
	 * Decodes a command and invokes the right method, maybe creating objects.
	 * 
	 * @param command The command to decode
	 * @return the results of the command.  "ok" if success but no result.
	 */
	public void handleCommand(String command) {
		Scanner input = new Scanner(command);
		String commandType = input.next();
		boolean handled = false;
		
		if(commandType.equals("number-bet")) {
			double betAmount = input.nextDouble();
			int numberBetOn = input.nextInt();
			handled = true;
			handleNumberBet(betAmount, numberBetOn);
		}
		
		if(commandType.equals("odd-bet")) {
			double betAmount = input.nextDouble();
			handled = true;
			handleOddEvenBet(OddEvenBet.ODD, betAmount);
		}
		
		if(commandType.equals("even-bet")) {
			double betAmount = input.nextDouble();
			handled = true;
			handleOddEvenBet(OddEvenBet.EVEN, betAmount);
		}
		
		if(commandType.equals("roll")) {
			handled = true;
			handleRoll();
		}
		
		input.close();
		
		if(commandType.equals("exit")) {
			System.exit(0);
		}
		
		if(!handled) {
			System.out.println("Unknown command " + commandType);
		} else {
			System.out.println("You have $" + this.currentMoney);
		}
		
		return;
	}

	private String handleRoll() {
		Random r = new Random();
		// generate a random number between 1 and 6
		int rollResult = r.nextInt(6) + 1;
		System.out.println("Rolled a " + rollResult);
		for(OddEvenBet bet : this.oddEvenBets) {
			if(bet.isWinResult(rollResult)) {
				System.out.println("You won " + bet.winAmount());
				this.currentMoney = this.currentMoney + bet.winAmount();
			} else {
				System.out.println("You lost a bet");
			}
		}
		for(NumberBet bet : this.numberBets) {
			if(bet.isWinResult(rollResult)) {
				System.out.println("You won " + bet.winAmount());
				this.currentMoney = this.currentMoney + bet.winAmount();
			} else {
				System.out.println("You lost a bet");
			}
		}
		this.numberBets.clear();
		this.oddEvenBets.clear();
		return null;
	}

	private void handleOddEvenBet(int oddOrEven, double betAmount) {
		if(betAmount > this.currentMoney) {
			System.out.println("not enough money");
			return;
		}
		this.oddEvenBets.add(new OddEvenBet(oddOrEven, betAmount));
		this.currentMoney = this.currentMoney - betAmount;
		System.out.println("ok");
	}

	private void handleNumberBet(double betAmount, int numberBetOn) {
		if(numberBetOn > 6 || numberBetOn < 1){
			System.out.println("invalid number");
			return;
		}
		if(betAmount > this.currentMoney) {
			System.out.println("not enough money");
			return;
		}
		this.numberBets.add(new NumberBet(numberBetOn, betAmount));
		this.currentMoney = this.currentMoney - betAmount;
		System.out.println("ok");
	}

	/**
	 * 
	 * Run the betting example.
	 * 
	 * @param args Command line arguments (ignored)
	 */
	public static void main(String[] args) {
		BettingMain book = new BettingMain();
		System.out.println("Welcome to betting.  Enter commands.  Type 'exit' to end.\n");
		System.out.println("For example:");
		System.out.println("To bet $1.50 on odd, type 'odd-bet 1.5'");
		System.out.println("To bet $1.50 on a six, type 'number-bet 1.5 6'");
		System.out.println("To roll the dice (1-6), type 'roll'");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String commandLine = scanner.nextLine();
			book.handleCommand(commandLine);
		}
		
	}	
}
