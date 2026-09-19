package consoleInput;

import java.util.Scanner;

/**
 * Class for demonstrating how to read user input 
 * from the console (a.k.a. command line)
 * with the Java Scanner class. 
 * 
 * @author Ian Ludden
 */
public class ConsoleInputMain {

    public static void main(String[] args) {

        // Declare and initialize a Scanner object to read from the standard system input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for each piece of information, then read their responses
        System.out.print("Enter your full name as [GivenName] [FamilyName]: ");
        String givenName = scanner.next();
        String familyName = scanner.next();

        System.out.print("Enter your age in years: ");
        int age = scanner.nextInt();
        // alternate solution: 
        // scanner.nextLine(); // to consume the newline character after the family name
        // int age = Integer.parseInt(scanner.nextLine()); 

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        // alternate solution:
        // double height = Double.parseDouble(scanner.nextLine()); 

        // IMPORTANT: Always close your Scanner when you are done with it to avoid resource leaks
        scanner.close();

        // Print summary of user input. 
        System.out.println("Thank you for providing your information.");
        System.out.printf("Your name is %s %s, and you are %d years old and %.2fm tall.", givenName, familyName, age, height);
    }
}
