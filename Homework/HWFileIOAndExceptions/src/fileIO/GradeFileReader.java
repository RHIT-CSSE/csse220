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
	 * TODO 2.1
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
	 * NOTE: From the main method, you should test this method incrementally using the simplest
	 * option of files first, get it working with those and move on to the more complex cases
	 * only when you have gotten the previous working.
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
		return 0;
	}
	
	/**
	 * NOTE: Line numbers start at 1 and index values start at 0!
	 * 
	 * This method will fix a missing grade AND negative grades depending on the boolean value
	 * of the "change" parameters
	 * 
	 * This method will do one of two things with a malformed file:
	 * If change is FALSE:
	 * Given a lineNum and an index for a given file named filename, the integer is assumed to be
	 * missing in the position given.  With the position given, it is the position of where the
	 * integer should be, so the extra comma will be removed.
	 * 
	 * If change is TRUE:
	 * Given a lineNum and an index for a given file named filename, the integer is assumed to be
	 * negative and will be changed to a positive value by removing the "-" sign
	 * 
	 * CAREFUL!
	 * NOTE: This method WILL change the file.  It will read the file and form the entire 
	 * String of what the file should be when the alteration is made and write that new String
	 * to the same file.
	 * 
	 * NOTE:
	 * The line number (starting at 1) is fairly self explanatory in the sense that it should be
	 * the line number where the alteration is to be made.  The "index" is not the character
	 * position in the line.  Rather, starting at 0, it is the position relative to the commas
	 * in the line.  For example, in the line:
	 * 100,200,300,400
	 * There are 4 values.  Index 0 of the value 100, index 1 is the value 200, index 2 is 300
	 * and index 3 is 400.
	 * 
	 * NOTE ALSO: This method should NOT be called with a line and position that is well-formed.
	 * This method assumes if you call it, the position you give it is malformed.  You would
	 * not call this method for a well-formed file.
	 * 
	 * Examples:
	 * lineNum=1, index=2, change=false
	 * file:
	 * 11,222,,33,4  (malformed - missing grade since change is false)
	 * 
	 * The file will now be:
	 * 11,2222,33,4
	 * 
	 * 
	 * OR
	 * lineNum=2, index=2, change=true
	 * file:
	 * 100,200,300
	 * 111,22222,33333,-44  (malformed - negative grade since change is true)
	 * 
	 * The file will now be:
	 * 100,200,300
	 * 111,22222,33333,44
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
	 * 
	 * OR
	 * lineNum=1, index=3, change=false
	 * file:
	 * 2,3,4,  (malformed - missing last grade)
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
		try {
			scanner = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("File " + filename + " not found!");
			e.printStackTrace();
			return;
		}
		String toWrite = "";
		String line = scanner.nextLine();
		int curLine = 1;
		while(scanner.hasNextLine() && curLine < lineNum) {
			toWrite += (curLine == 1) ? (line) : ("\n"+line);
			line = scanner.nextLine();
			curLine++;
		}
		if(curLine > 1)
			toWrite += "\n";
		
		String[] splitLine = line.split(",");
		
		boolean started = false;
		for(int i = 0; i < splitLine.length; i++) {
			String current = splitLine[i];
			if(i == index && change)
				current = current.substring(1); //remove negative sign
			
			if(i != index || change) {
				if(!started) {
					toWrite += current;
					started = true;
				}
				else
					toWrite += "," + current;
			}
		}
		
		while(scanner.hasNextLine()) {
			toWrite += "\n" + scanner.nextLine();
		}
		
		scanner.close();
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		pw.write(toWrite);
		pw.close();
	}
}
