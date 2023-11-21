package bookTrackerHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * This class is the main application that is used to allow a user to track books, kids, and generate reports on them
 * 
 * @author Jason Yoder and Jacob Ashworth
 *
 */
public class BookMain {

	// Note that this information could also be stored via an ArrayList, BUT 
	// the HashMap makes it possible to look up the desired object with a for loop
	private HashMap<String, Kid> nameToKidMap = new HashMap<String, Kid>();
	private HashMap<String, Book> nameToBookMap = new HashMap<String, Book>();

	/**
	 * This is where the program starts. It instantiates an instance of the application and then runs it.
	 * @param args
	 */
	public static void main(String[] args) {
		BookMain app = new BookMain();
		app.runApp();
	}

	/**
	 * This method is in charge of setting up the application and running the main loop.
	 * The loop allows repeated commands until the user decides to exit.
	 */
	public void runApp() {
		// Accept User Commands
		setupKidsAndBooks();
		System.out.println(
				"Welcome to BookMain.  Enter commands.  Type 'exit' to end.  Type 'help' for a list of commands.");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String commandLine = scanner.nextLine();
			handleCommand(commandLine);
		}

	}

	/**
	 * Create Books and Kids to populate the list initially to make it easier to demo it.
	 * 
	 */
	public void setupKidsAndBooks() {
		String[] kidNames = { "Bob", "Joe", "Steve", "Maria", "Katy", "Zoe" };
		int[] kidLevels = { 0, 1, 4, 2, 4, 3 };

		String[] bookNames = { "Hunger Games", "Harry Potter", "HHGTTG" };
		String[] authorNames = { "Suzanne Collins", "J. K. Rowling", "Douglas Adams" };

		for (int i = 0; i < kidNames.length; i++) {
			nameToKidMap.put(kidNames[i], new Kid(kidNames[i], kidLevels[i]));
		}
		for (int i = 0; i < bookNames.length; i++) {
			nameToBookMap.put(bookNames[i], new Book(bookNames[i], authorNames[i]));
		}
		
		//setup a few books that Kids have read
		handleCommand("read-book Joe READS Harry Potter");
		handleCommand("read-book Joe READS Hunger Games");
		handleCommand("read-book Maria READS HHGTTG");
		handleCommand("read-book Maria READS Hunger Games");
		
	}

	/**
	 * This method takes in commands from the user as typed into the console.
	 * 
	 * @param command
	 */
	public void handleCommand(String command) {
		Scanner input = new Scanner(command);
		String commandType = input.next();

		if (commandType.equals("read-book")) {
			
			String line = input.nextLine().trim();
			
			int locationOfRead = line.indexOf(" READS ");
			if (locationOfRead == -1) {
				System.err.println("Required keyword \"READS\" not found in command read-book, skipping command...");
				input.close();
				return;
			}
			String studentName = line.substring(0,locationOfRead);
			String bookName = line.substring(locationOfRead + 7);
			input.close();
			
			handleNewReading(bookName, studentName);
			return;
		}
		if (commandType.equals("print-book-report")) {
			String bookName = input.nextLine().trim();
			input.close();
			handlePrintReportForBook(bookName);
			return;
		}
		if (commandType.equals("print-kid-report")) {
			String kidName = input.nextLine().trim();
			input.close();
			handlePrintReportForKid(kidName);
			return;
		}
		if (commandType.equals("print-books")) {
			input.close();
			handlePrintBookNames();
			return;
		}
		if (commandType.equals("print-kids")) {
			input.close();
			handlePrintKidNames();
			return;
		}
		if (commandType.equals("help")) {
			input.close();
			System.out.println("Available Commands:");
			System.out.println("read-book <Kid> READS <Book>: Updates the system to show that <Kid> has read <Book>");
			System.out.println("print-book-report <Book>: Lists all kids that have read <Book>");
			System.out.println("print-kid-report <Kid>: Lists all books read by <Kid>");
			System.out.println("print-books: Lists all books in the system");
			System.out.println("print-kids: Lists all kids in the system");
			return;
		}

		if (commandType.equals("exit")) {
			System.out.println("Exiting...");
			System.exit(0);
		}

		input.close();
		System.out.print("Unknown command: " + commandType);
	}

	/**
	 * Update system so that the Book's been updated to include Kid and vice versa
	 * 
	 * @param bookName
	 * @param kidName
	 */
	public void handleNewReading(String bookName, String kidName) {
		Book thisBook = null;
		Kid thisKid = null;

		thisBook = this.nameToBookMap.get(bookName);
		thisKid = this.nameToKidMap.get(kidName);
		
		if (thisBook != null && thisKid != null) {
			thisKid.addBook(thisBook);
			thisBook.addKid(thisKid);
		} else {
			if (thisBook == null) {
				System.err.println("Error: Book with name "+bookName+" not found, unable to add reading.");
			}
			if (thisKid == null) {
				System.err.println("Error: Kid with name "+kidName+" not found, unable to add reading.");
			}
		}

		
	}
	/**
	 * Finds the Kid based on its name and then prints a report on the kid.
	 * 
	 * @param kidName
	 */
	public void handlePrintReportForKid(String kidName) {
		Kid thisKid = this.nameToKidMap.get(kidName);
		if (thisKid == null) {
			System.out.println("Kid does not exist");
		} else {
			thisKid.printReport();
		}
	}

	/**
	 * Finds the Book based on its name and then prints a report on the book.
	 * 
	 * @param BookName
	 */
	public void handlePrintReportForBook(String bookName) {
		Book thisBook = this.nameToBookMap.get(bookName);
		if (thisBook == null) {
			System.out.println("Book does not exist");
		} else {
			thisBook.printReport();
		}
	}

	/**
	 * Use simply to show the list of available Kids
	 */
	public void handlePrintKidNames() {
		System.out.print("Kids: ");
		for (String kidName : this.nameToKidMap.keySet() ) {
			System.out.print(kidName + ", ");
		}
		System.out.println("");
	}

	/**
	 * Use simply to show the list of available Books
	 */
	public void handlePrintBookNames() {
		System.out.print("Books: ");
		for (String bookName : this.nameToBookMap.keySet() ) {
			System.out.print(bookName + ", ");
		}
		System.out.println("");
	}
}
