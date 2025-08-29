package numberSequence;

import java.util.Scanner;

public class NumberSequenceMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Sequence sequence = null;
		sequence = new AddOne();
		// sequence = new AddOneWithinRange(3, 5);
		// TODO 1: Run this code with AddOne and again with AddOneWithinRange to see what it does.
		// TODO 2: Study the use of the Sequence interface in this code.
		// TODO 3: Uncomment the new sequences below and implement them one at a
		// time.

		// Like addOne, but adds the given number each time. This example should count by 5's.
		//sequence = new AddSeveral(5);
		
		// Generates the powers of two, starting at 1.
		// sequence = new PowersOfTwo();
		
		// Generates the sequence: 1,1,2,3,5,8 ...
		// sequence = new Fibonacci(); // non-recursive version. :)
		
		while (true) {
			System.out.println("Enter a command (nextNum/resetNum/exit):");
			String command = input.nextLine();
			if (command.equals("exit")) {
				break;
			}
			if (command.equals("nextNum")) {
				System.out.println(sequence.next());
			}
			if (command.equals("resetNum")) {
				sequence.reset();
			}
		}
		input.close();
	}
}
