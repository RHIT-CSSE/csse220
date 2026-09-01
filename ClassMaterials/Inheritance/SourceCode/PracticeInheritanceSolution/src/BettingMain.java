import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BettingMain {

	private double currentMoney;
	
	// 1.5 point for Main pointing to list of bets. 
	// (wrong arrow, 0.5, missing *, -0.5)
	private ArrayList<Bet> bets;
	
	public BettingMain() {
		this.currentMoney = 10; // start the game with 10 dollars
		this.bets = new ArrayList<Bet>();
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
		if(commandType.equals("high-bet")) {
			double betAmount = input.nextDouble();
			handled = true;
			handleHighBet(betAmount);
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
		for(Bet bet : this.bets) {
			String startText = "Your bet on " + bet.description();
			if(bet.isWinResult(rollResult)) {
				System.out.println( startText + " won " + bet.winAmount());
				this.currentMoney = this.currentMoney + bet.winAmount();
			} else {
				System.out.println(startText + " lost");
			}
		}
		this.bets.clear();
		return null;
	}

	private void handleHighBet(double betAmount) {
		// there some duplication here too
		// but fixing it is trickier
		if(betAmount > this.currentMoney) {
			System.out.println("not enough money");
			return;
		}
		// 0.5 point for dependencies on HighBet, etc.
		this.bets.add(new HighBet(betAmount));
		this.currentMoney = this.currentMoney - betAmount;
		System.out.println("ok");
	}

	
	private void handleOddEvenBet(int oddOrEven, double betAmount) {
		if(betAmount > this.currentMoney) {
			System.out.println("not enough money");
			return;
		}
		this.bets.add(new OddEvenBet(oddOrEven, betAmount));
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
		this.bets.add(new NumberBet(numberBetOn, betAmount));
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
