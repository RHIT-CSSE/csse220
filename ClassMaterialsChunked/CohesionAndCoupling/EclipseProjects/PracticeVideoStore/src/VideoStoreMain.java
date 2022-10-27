import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that contains the main method to run the VideoStore project
 * 
 * @author wilkin
 *
 */
public class VideoStoreMain {

	public static void main(String[] args) {
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		String input = "";
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("Enter movie name (-1 to quit entering movies)");
			input = scanner.nextLine().trim();
			if(!input.equals("-1")) {
				String movieName = input;
				System.out.println("Enter: 0 for REGULAR movie; 1 for NEW_RELEASE; 2 for CHILDREN'S movie");
				input = scanner.nextLine().trim();
				movies.add(new Movie(movieName, Integer.parseInt(input)));
			}
		} while (!input.equals("-1"));
		
		do{
			System.out.println("Enter customer name (-1 to quit entering customers)");
			input = scanner.nextLine();
			if(!input.equals("-1")) {
				String custName = input;
				Customer cust = new Customer(custName);
				customers.add(cust);
				System.out.println("List of movies: ");
				for(int i = 0; i < movies.size(); i++) {
					System.out.println("\t" + i + "  --  " + movies.get(i).getTitle());
				}
				
				do {
					System.out.println("Enter the number of the movie that " + custName + " wishes to rent (\"stop\"" +
										" to move to the next customer): ");
					input = scanner.nextLine().toLowerCase();
					if(!input.equals("stop")) {
						int numDays = (int)(Math.random() * 10.0) + 1;
						int index = Integer.parseInt(input);
						cust.addRental(new Rental(movies.get(index), numDays));
						System.out.println("Customer " + custName + " has rented " + movies.get(index).getTitle() + " for " +
											numDays + " days.");
					}
				} while (!input.equals("stop"));
			}
		} while(!input.equals("-1"));
		
		System.out.println("_______________________STATEMENTS_______________________\n");
		for(Customer cust : customers) {
			System.out.println("Statement for " + cust.getName() + ":");
			System.out.println(cust.statement() + "\n\n");
		}
		
		
		scanner.close();
	}
}
