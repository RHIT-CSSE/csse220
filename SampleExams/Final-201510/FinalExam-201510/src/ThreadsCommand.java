import java.util.ArrayList;
import java.util.Scanner;


/**
 * See written handout for problem description
 * 
 * @author hewner
 *
 */
public class ThreadsCommand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to ThreadCommand.  Enter your commands.\n");
		
		while(true) {
			
			String currentCommand = input.next();
			if(currentCommand.equals("create")) {
				System.out.println("This command should create a new thread");

			}
			if(currentCommand.equals("stopall")) {
				System.out.println("This command should exit all currently existing threads gracefully.");

			}
			if(currentCommand.equals("exit")) {
				// this thread ends the whole program
				// you don't need to change the operation 
				// of this function
				
				System.exit(0);
			}
		}
		

	}

}
