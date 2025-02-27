package salesManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is the main application to demonstrate the solution to the Vapor
 * Sales Manager Design Problem.
 * 
 * All of the code in this class is provided for you, 
 * with the exception of the paired part tasks: (see README too)
 * 1. Modify handleAddBundle to implicitly create Game objects for unknown titles. 
 * 2. Implement handleGetBestSellingBundle.
 * 3. Implement handleGetHighestRevenueGame.  
 *  
 * ***You will need to uncomment the code in each "handle" method as you go.***
 * The commented-out implementations show you some of the methods 
 * you will need to add to the Game and Bundle classes. 
 * 
 *************************************************************************************** 
 * REQUIRED HELP CITATION
 * -------------------------------------------------------------------------------------
 * TODO: cite your help here or say "only used CSSE220 materials"
 * -------------------------------------------------------------------------------------
 * TODO: List the name and email address of your partner for the paired part, or
 * say "I worked on the paired part alone."
 *************************************************************************************** 
 */

public class SalesManagerMain {
	// TODO: Feel free to add any constants here as static fields

	private ArrayList<Game> games;
	private ArrayList<Bundle> bundles;

	/**
	 * Constructor - initializes the fields of SalesManager
	 */
	public SalesManagerMain() {
		this.games = new ArrayList<Game>();
		this.bundles = new ArrayList<Bundle>();
	}

	 /* TODO: You may notice that in several methods, 
	 you need to retrieve a Game object given its title, or 
	 a Bundle object given its name. 
	 Therefore, you may want to use these private methods: */

	private Game getGameGivenTitle(String gameTitle) {
		return null;
		// TODO: When you are ready, uncomment the following code and delete the return statement above
		// for (Game game : this.games) {
		// 	if (gameTitle.equals(game.getTitle())) {
		// 		return game;
		// 	}
		// }
		// return null;
	}

	private Bundle getBundleGivenName(String bundleName) {
		return null;
		// TODO: When you are ready, uncomment the following code and delete the return statement above
		// for (Bundle bundle : this.bundles) {
		// 	if (bundleName.equals(bundle.getName())) {
		// 		return bundle;
		// 	}
		// }
		// return null;
	}

	/**
	 * Adds a game for sales record-keeping.
	 * 
	 * You can assume the game title is unique. 
	 * 
	 * @param gameTitle  title of game
	 * @param gameRating ESRB rating of game (e.g., "T" for teen)
	 * @param gamePrice  game price, in dollars
	 * @return "ok" if successful
	 */
	private String handleAddGame(String gameTitle, String gameRating, double gamePrice) {
		return "not yet implemented";
		// TODO: When you are ready, uncomment the following code and delete the return statement above
		// Game newGame = new Game(gameTitle, gameRating, gamePrice);
		// this.games.add(newGame);
		// return "ok";
	}

	/**
	 * Adds a bundle for sales record-keeping.
	 * 
	 * You can assume the bundle name is unique. 
	 * 
	 * @param bundleName  name of bundle
	 * @param bundlePrice bundle price, in dollars
	 * @param gameTitles  list of titles of games included in the bundle
	 * @return "ok" if successful
	 */
	private String handleAddBundle(String bundleName, double bundlePrice, ArrayList<String> gameTitles) {
		return "not yet implemented";
		// TODO: When you are ready, uncomment the following code and delete the return statement above
		// ArrayList<Game> games = new ArrayList<Game>();
		// for (String gameTitle : gameTitles) {
		// 	Game game = this.getGameGivenTitle(gameTitle);
		// 	// TODO (paired part): Create a new Game object if the given title does not yet exist
		// 	games.add(game);
		// }

		// Bundle newBundle = new Bundle(bundleName, bundlePrice, games);
		// this.bundles.add(newBundle);

		// for (Game game : games) {
		// 	game.addBundle(newBundle);
		// }
		
		// return "ok";
	}

	/**
	 * Adds one to the number of (individual) copies sold for the game with the
	 * given title.
	 * 
	 * @param gameTitle
	 * @return "ok" if successful, "game not found" if unsuccessful
	 */
	private String handleSellGame(String gameTitle) {
		return "not yet implemented";
		// TODO: When you are ready, uncomment the following code and delete the return statement above
		// Game game = this.getGameGivenTitle(gameTitle);
		// if (game != null) {
		// 	game.sellCopy();
		// 	return "ok";
		// }
		
		// return "game not found";
	}

	/**
	 * Adds one to the number of copies sold for the bundle with the given name.
	 * 
	 * @param bundleName
	 * @return "ok" if successful, "bundle not found" if unsuccessful
	 */
	private String handleSellBundle(String bundleName) {
		return "not yet implemented";
		// TODO: When you are ready, uncomment the following code and delete the return statement above
		// Bundle bundle = this.getBundleGivenName(bundleName);
		// if (bundle != null) {
		// 	bundle.sellCopy();
		// 	return "ok";
		// }

		// return "bundle not found";
	}

	/**
	 * Generates a String representation of a sales report for the game with the
	 * given title. See the assignment instructions for an example output.
	 * 
	 * @param gameTitle
	 * @return String representation of game sales report
	 */
	private String handlePrintGameSalesReport(String gameTitle) {
		return "not yet implemented";
		// TODO: When you are ready, uncomment the following code and delete the return statement above
		// Game game = this.getGameGivenTitle(gameTitle);
		// if (game != null) {
		// 	return game.printSalesReport();
		// }

		// return "game not found";
	}

	/**
	 * Generates a String representation of a sales report for the bundle with the
	 * given name. See the assignment instructions for an example output.
	 * 
	 * @param bundleName
	 * @return String representation of bundle sales report
	 */
	private String handlePrintBundleSalesReport(String bundleName) {
		return "not yet implemented";
		// TODO: When you are ready, uncomment the following code and delete the return statement above
		// Bundle bundle = this.getBundleGivenName(bundleName);
		// if (bundle != null) {
		// 	return bundle.printSalesReport();
		// }

		// return "bundle not found";
	}

	/**
	 * *** PAIRED PART ***
	 * 
	 * This part of the assignment may be done alone or with one partner. Be sure to
	 * note who you paired with, or that you worked alone, in a comment at the top
	 * of the file.
	 * 
	 * Returns the name of the bundle with the most copies sold. You can assume
	 * there is a clear winner (i.e., no tie for first place).
	 * 
	 * @return String name of the best-selling bundle
	 */
	private String handleGetBestSellingBundle() {
		// TODO (paired part) Your code here
		return null;
	}

	/**
	 * *** PAIRED PART ***
	 * 
	 * This part of the assignment may be done alone or with one partner. Be sure to
	 * note who you paired with, or that you worked alone, in a comment at the top
	 * of the file.
	 * 
	 * Returns the title of the game with the highest total revenue, combining
	 * revenue from individual game sales with revenue portions earned from selling
	 * bundles with that game.
	 * 
	 * The revenue from each bundle sale is evenly distributed across all games in
	 * that bundle. See the assignment instructions for more info.
	 * 
	 * You can assume there is a clear winner (i.e., no tie for first place).
	 * 
	 * @return String title of the game with the highest revenue
	 */
	private String handleGetHighestRevenueGame() {
		// TODO (paired part) Your code here
		return null;
	}

	/**
	 * Decodes a command and invokes the right method.
	 * 
	 * THIS METHOD IS WRITTEN FOR YOU - no need to edit
	 * 
	 * HINT: You might find it useful for debugging if you add 2 additional
	 * commands: display-games - performs a System.out.println of the 'games'
	 * ArrayList, and display-bundles - performs a System.out.println of the
	 * 'bundles' ArrayList.
	 * 
	 * Follow the 'if' add-student (below), and just return "ok"; after the println.
	 * 
	 * You don't have to understand how this function works, and you don't have to
	 * change it. But feel free to figure it out if you like.
	 * 
	 * @param command The command to decode
	 * @return the results of the command. "ok" if success but no result.
	 */
	public String handleCommand(String command) {
		Scanner input = new Scanner(command);
		String commandType = input.next();

		if (commandType.equals("add-game")) {
			String gameTitle = input.next();
			String gameRating = input.next();
			double gamePrice = input.nextDouble();
			input.close();
			return handleAddGame(gameTitle, gameRating, gamePrice);
		}

		if (commandType.equals("add-bundle")) {
			String bundleName = input.next();
			double bundlePrice = input.nextDouble();
			ArrayList<String> gameTitles = new ArrayList<String>();
			while (input.hasNext()) {
				gameTitles.add(input.next());
			}
			input.close();
			return handleAddBundle(bundleName, bundlePrice, gameTitles);
		}

		if (commandType.equals("sell-game")) {
			String gameTitle = input.next();
			input.close();
			return handleSellGame(gameTitle);
		}

		if (commandType.equals("sell-bundle")) {
			String bundleName = input.next();
			input.close();
			return handleSellBundle(bundleName);
		}

		if (commandType.equals("print-game-sales-report")) {
			String gameTitle = input.next();
			input.close();
			return handlePrintGameSalesReport(gameTitle);
		}
		
		if (commandType.equals("print-bundle-sales-report")) {
			String bundleName = input.next();
			input.close();
			return handlePrintBundleSalesReport(bundleName);
		}

		if (commandType.equals("best-selling-bundle")) {
			String bestSellingBundleName = handleGetBestSellingBundle();
			input.close();
			return bestSellingBundleName;
		}

		if (commandType.equals("highest-revenue-game")) {
			String highestRevenueGameTitle = handleGetHighestRevenueGame();
			input.close();
			return highestRevenueGameTitle;
		}

		if (commandType.equals("exit")) {
			System.exit(0);
		}

		input.close();
		return "Unknown command: " + commandType;
	}
	
	/**
	 * Formats a double value of US dollars as a string.
	 * 
	 * THIS METHOD IS WRITTEN FOR YOU - no need to edit. 
	 * 
	 * To call this method from inside of Game.java or Bundle.java, 
	 * type `SalesManager.doubleToDollars(variableNameOfSomeDouble)` 
	 */
	public static String doubleToDollars(double dollarValue) {
		return String.format("$%.2f", dollarValue);
	}
	
	/**
	 * Turns a list of Strings into a comma-separated String. 
	 * 
	 * THIS METHOD IS WRITTEN FOR YOU - no need to edit. 
	 * 
	 * To call this method from inside of Game.java or Bundle.java, 
	 * type `SalesManager.listToCommaSeparatedString(variableNameOfArrayList)`
	 */
	public static String listToCommaSeparatedString(ArrayList<String> list) {
		return String.join(",", list);
	}
	
	@Override
	public String toString() {
		// This method is provided to potentially help with debugging
		return "SalesManager [games=" + games + ", bundles=" + bundles + "]";
	}

	/**
	 * 
	 * Run the SalesManager in console mode (that is, input is to come from the
	 * console).
	 * 
	 * THIS METHOD IS WRITTEN FOR YOU - no need to edit
	 * 
	 * @param args Command line arguments (ignored)
	 */
	public static void main(String[] args) {
		SalesManagerMain manager = new SalesManagerMain();
		System.out.println("Welcome to the Vapor Sales Manager.  Enter commands.  Type 'exit' to end.");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String commandLine = scanner.nextLine();
			String result = manager.handleCommand(commandLine);
			System.out.println(result);
		}

	}

}
