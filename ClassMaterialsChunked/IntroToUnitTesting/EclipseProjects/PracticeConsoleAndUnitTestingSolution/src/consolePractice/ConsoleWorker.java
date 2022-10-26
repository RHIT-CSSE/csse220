package consolePractice;
import java.util.Scanner;

/**
 * This is an example of using a Scanner to read console input.
 * 
 * @author Delvin Defoe. Created Sep 16, 2015.
 */
public class ConsoleWorker {
	
	private Scanner inputScanner;
	private String name;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private double annualSalary;
	
	/**
	 * Constructs a new ConsoleWorker, initializing the input scanner
	 *
	 */
	public ConsoleWorker(){
		this.inputScanner = new Scanner(System.in);
	}
	
	/**
	 * Returns the user's name
	 *
	 * @return user name
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Returns the user's birth month
	 *
	 * @return user birth month
	 */
	public int getBirthMonth(){
		return this.birthMonth;
	}
	
	/**
	 * Returns the user's birth day
	 *
	 * @return user birth day
	 */
	public int getBirthDay(){
		return this.birthDay;
	}
	
	/**
	 * Returns the user's birth year
	 *
	 * @return user birth year
	 */
	public int getBirthYear(){
		return this.birthYear;
	}
	
	/**
	 * Returns the user's annual salary
	 *
	 * @return user annual salary
	 */
	public double getAnnualSalary(){
		return this.annualSalary;
	}
	
	/**
	 * 
	 * Sets user's given name 
	 *
	 */
	public void setName(){
		System.out.print("What is your name? ");
		this.name = this.inputScanner.nextLine().trim();
	}

	
	/**
	 * 
	 * Sets the user's birth month as an integer.
	 *
	 */
	private void setBirthMonth() {
		Boolean validInput = false;
		do {
			//
			// Use do-while because we always want to go through the loop body one time
			//
			System.out.print("Please enter a birth month [1..12]: ");
			String catcher = this.inputScanner.next();
			try {
				//
				// NumberFormatException is thrown by 'parseInt' if what is in String 'catcher' is not an integer
				// This try-catch will catch the NumberFormatException and print a message to the Console (see below)
				// 
				this.birthMonth = Integer.parseInt(catcher);
				
				//
				// An integer was input by user, now check that is valid
				if ((this.birthMonth >= 1) && (this.birthMonth <= 12)) {
					validInput = true;
				} else {
					System.out.println(this.birthMonth + " is not in the range [1..12]");
				} // end if
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage() + " is not a valid number for representing a month");
			} // end try-catch
		} while (!validInput);

	} // setBirthMonth
	
	/**
	 * 
	 * Sets user's birth day (of month) as an integer
	 *
	 */
	public void setBirthDay(){
		System.out.print("Enter your day of birth as an integer: ");
		this.birthDay = this.inputScanner.nextInt();
	}
	
	/**
	 * 
	 * Sets user's birth year as an integer.
	 *
	 */
	public void setBirthYear(){

		System.out.print("Enter your year of birth as an integer: ");
		this.birthYear = this.inputScanner.nextInt();
	}
	
	/**
	 * 
	 * Sets the user's annual salary
	 *
	 */
	public void setAnualSalary(){
		System.out.print("Enter your annual salary as a double: ");
		this.annualSalary = this.inputScanner.nextDouble();
	}

	/**
	 * Starts here.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		ConsoleWorker worker = new ConsoleWorker();

		// TODO uncomment the code below and implement 
		// the missing methods, adding appropriate prompts 
		// before each input.
		worker.setName();
		worker.setBirthMonth();
		worker.setBirthDay();
		worker.setBirthYear();
		worker.setAnualSalary();

		System.out.printf("%s was born %02d/%02d/%d and earns $%03.2f.%n", worker.getName(), worker.getBirthMonth(),
				worker.getBirthDay(), worker.getBirthYear(), worker.getAnnualSalary());

	}

}
