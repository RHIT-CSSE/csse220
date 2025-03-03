
/**
 * Create instances of StudentGradebook and invoke methods on them.
 * 
 * @author <YOUR_NAME_GOES HERE>. Created Dec 9, 2013.
 */
public class StudentGradebookMain {

	/**
	 * Program starts here.
	 * 
	 * @param args
	 *            Ignore the args.
	 */
	public static void main(String[] args) {

		 //DONE: Uncomment this code to get started with StudentGradebook
		 
		 StudentGradebook one = new StudentGradebook("John Doe");
		 StudentGradebook two = new StudentGradebook(); //default name is Studenty McStudenton
		 
		 one.addAssignment("TwelveProblems", 95);
		 two.addAssignment("TwelveProblems", 80);
		  
		 one.addAssignment("TwelveProblems", 99); two.addAssignment("WordGames", 78);
		 
		 one.addAssignment("TeamGradebook", 92); two.addAssignment("Faces", 0);
		  
		 one.printGradeReport(); System.out.println(); //blank line
		 two.printGradeReport();
		

		/*
		 * This code should print out:
		 * 
		 * John Doe TwelveProblems - 95 WordGames - 99 Faces - 92
		 * 
		 * Studenty McStudenton TwelveProblems - 80 WordGames - 78 Faces - 0
		 * 
		 * 
		 * If you finish early, add a new function to compute the student's
		 * average and print it as part of printGradeReport. 
		 * 
		 * If you do so it should show the following:
		 * 
		 * John Doe TwelveProblems - 95 WordGames - 99 Faces - 92 - Average: 95.33333333333333
		 * 
		 * Studenty McStudenton TwelveProblems - 80 WordGames - 78 Faces - 0 - Average: 52.666666666666664
		 * 
		 * 
		 */

	}

}
