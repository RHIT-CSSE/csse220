import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * Note on the use of System.err to output error message
 * 
 * System.err is used in the program below, it is the "standard" error output stream in Java.
 * This stream is already open and ready to accept output data.
 * 
 * Typically this stream corresponds to display output or another output destination specified 
 * by the host environment or user. 
 * 
 * By convention, this output stream is used to display error messages or other information 
 * that should come to the immediate attention of a user even if the principal output stream, 
 * the value of the variable out, has been redirected to a file or other destination that is 
 * typically not continuously monitored.
 */

public class FileAverage {

	private double computeAverageForFile(String filename) throws IOException {
		double total = 0;
		int count = 0;
		FileReader f1 = new FileReader(filename);
		Scanner s1 = new Scanner(f1);

		while(s1.hasNext()) {
			try {
				total = total + s1.nextInt();
				count++;
			} catch (InputMismatchException e) {
				String nonNumber = s1.next();
				System.err.println("Non-integer " + nonNumber + " found.  Ignoring.");
			} // end try-catch	
		} // end while
		s1.close();
		f1.close();
		return total / count;
	} // computeAverageForFile
	
	//-------------------------------------------------------------------------------
	// Note: FileNotFoundException and IOException are both checked exceptions
	//-------------------------------------------------------------------------------
	
	private void runApp() {
		//TODO: Run to see one exception. Trace the code to understand. 
		// Then change to nums.txt to see the other exception. 
		
//		String inputFile = "nums_wrongname.txt"; 
		String inputFile = "nums.txt";
		try {
			double average = computeAverageForFile(inputFile);
			System.out.println("Average: " + average);
		} catch(FileNotFoundException e) {
			System.err.println("File " + inputFile + " not found.  Exiting.");
		} catch(IOException e) {
			System.err.println("Error closing file.");
		} // end try-catch	
	} // runApp
	
	//-------------------------------------------------------------------------------

	public static void main(String[] args) {
		FileAverage app = new FileAverage();
		app.runApp();
	} // main
}
