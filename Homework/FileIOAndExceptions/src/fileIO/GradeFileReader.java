package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import exceptions.MissingGradeException;
import exceptions.NegativeGradeException;

public class GradeFileReader {
	
	/**
	 * TODO 3
	 * This method should take a file name, open the file and read all the grades contained within.
	 * The grades, when well-formed, should be one or more lines of comma-separated integers.  It
	 * is possible that the file is NOT well-formed, but more on that below.  When the file is
	 * well-formed, you should read EVERY integer on every line and calculate an average.  You
	 * should return that average.
	 * 
	 * Malformed files:
	 * There are three possibilities for a file to be malformed:
	 * 		1) The file may be empty
	 * 		2) The file may contain an empty grade (which would have a comma without a corresponding
	 * 			integer)
	 * 		3) The file may contain a negative grade
	 * 
	 * If (1), you should simply return 0.0 as the average. 
	 * If (2), you should throw a new MissingGradeException (and thus not complete the method)
	 * If (3), you should throw a new NegativeGradeException (and thus not complete the method)
	 * 
	 * NOTE: A file can contain a different number of grades on each line and is still considered
	 * well-formed!
	 * 
	 * NOTE: A line should NOT end with a comma but with an integer
	 * 
	 * Example of a well-formed file:
	 * 80,90,70,90
	 * 99,100
	 * 
	 * Examples of malformed files:
	 * 1,2,,3,4  (missing grade in 3rd position with index 2)
	 * 
	 * OR
	 * 1,2,-3,4  (contains negative grade in 3rd position with index 2)
	 * 
	 * OR
	 * ,80,90    (contains missing grade in beginning of the line)
	 * 
	 * OR
	 * 80,90,    (contains missing grade in end of the line)
	 * 
	 * @param filename - the name of the file to read
	 * @return the average of all values within the file when the file is well-formed
	 * 
	 * @throws FileNotFoundException when the filename does not exist
	 * @throws MissingGradeException when the file contains a missing grade
	 * @throws NegativeGradeException when the file contains a negative grade
	 */
	public static double readGradeFile(String filename) throws FileNotFoundException, MissingGradeException,
																			NegativeGradeException {
		return 0.0;
	}
	
	/**
	 * TODO 4
	 * NOTE: Line numbers start at 1 and index values start at 0!
	 * 
	 * This method will do one of two things with a malformed file:
	 * If change is TRUE:
	 * Given a lineNum and an index for a given file named filename, the integer is assumed to be
	 * negative and will be changed to a positive value by removing the "-" sign
	 * 
	 * If change is FALSE:
	 * Given a lineNum and an index for a given file named filename, the integer is assumed to be
	 * missing in the position given.  With the position given, it is the position of where the
	 * integer should be, so the extra comma will be removed.
	 * 
	 * CAREFUL!
	 * NOTE: This method should change the file.  You should read the file and form the entire 
	 * String of what the file should be when the alteration is made. The  close the scanner, 
	 * create a printWriter and write the string you formed and return.
	 * 
	 * Examples:
	 * lineNum=1, index=2, change=false
	 * file:
	 * 1,2,,3,4  (malformed - missing grade since change is false)
	 * 
	 * The file will now be:
	 * 1,2,3,4
	 * 
	 * 
	 * OR
	 * lineNum=2, index=2, change=true
	 * file:
	 * 1,2,3
	 * 1,2,3,-4  (malformed - negative grade since change is true)
	 * 
	 * The file will now be:
	 * 1,2,3
	 * 1,2,3,4
	 * 
	 * 
	 * OR
	 * lineNum=1, index=0, change=false
	 * file:
	 * ,2,3,4  (malformed - missing first grade)
	 * 
	 * The file will now be:
	 * 2,3,4
	 * 
	 * @param filename - the name of the file in which to alter
	 * @param lineNum - the line number (counting from 1) of the alteration
	 * @param index - the index/position in the line (counting from 0) 
	 * @param change - if true remove negative sign from position, if false, remove corresponding comma
	 */
	public static void alterGradeInFile(String filename, int lineNum, int index, boolean change) {
		Scanner scanner = null;
		//read file into a string repairing the exact value at the position specified
		scanner.close();
		
		//now write the string back to the same file to overwrite it with the repaired string
	}
}
