

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileAverage {

	public static void main(String[] args) {

		//TODO: Run to see one exception. Trace the code to understand. 
		// Then change to nums.txt to see the other exception. 
		String filename = "nums.txt"; 
		try {
			double average = computeAverageForFile(filename);
			System.out.println("Average: " + average);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("File " + filename + " not found.  Exiting.");
		} catch(IOException e) {
			System.err.println("Error closing file.");
		}
	}

	public static double computeAverageForFile(String filename) throws IOException {
		double total = 0;
		int count = 0;
		FileReader file = new FileReader(filename);
		Scanner s = new Scanner(file);

		while(s.hasNext()) {
			try {
				int next = s.nextInt();
				System.out.println( next  );
				total = total + next;
				count++;
			} catch (InputMismatchException e) {
				String nonNumber = s.next();
				System.err.println("Non-number " + nonNumber + " found.  Ignoring.");
			}
		}
		file.close();
		double average = total/count;
		return average;
	}

}
