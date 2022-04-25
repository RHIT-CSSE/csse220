package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class: LevelIO
 * @author CSSE 220 Student
 * <br>Purpose: Demonstration of how to read and write files containing arcade game levels 
 * <br>Restrictions: restricted to reading and writing .txt files
 * <br>For example: 
 * <pre>
 *    LevelIO app = new LevelIO();
 * </pre>
 */
public class LevelIO {
	
	
	/***************************************************************************
		For the writeFile method
		
		Use the java.io class PrintWriter to write out the following
		arcade game board (below) to the file supplied by the filename parameter
		
Title: Sample arcade game level: a 20 x 20 field of play not counting boundaries
|--------------------|
|....................|
|..------............|
|.............----...|
|....................|
|....................|
|....................|
|............A.......|
|......---------.....|
|....................|
|....................|
|.......A............|
|.-------............|
|....................|
|....................|
|.-------............|
|....................|
|....................|
|.........------.....|
|....................|
|...H.............A..|
|--------------------|

	 ***************************************************************************/
	
	
	
	/*************************************************************************** 
		For the readFile method
		
		Use the java.io File class and the java.util Scanner class to read in the 
		file supplied by the filename parameter.
		For each line read in, use System.out to write the line to the console window
	 
	 ***************************************************************************/


	
	//-----------------------------------------------------------------------------------
	
	/**
	 * ensures: 1st writes a text file, then reads it back in
	 */
	public void runApp() {
		String filename = "levels/IMPOSSIBLE.txt";
		

		// TODO #1 Uncomment the calls to the writeFile and readFile methods (below)
		// TODO #2 Have Eclipse generate the stubs for these two methods
		// TODO #3 Implement both writeFile and readFile methods - read instructions above
		
		//writeFile(filename);
		readFile(filename);
	} // runApp

	//-----------------------------------------------------------------------------------

	private void readFile(String filename) {
		try {
			Scanner scanner = new Scanner( new File(filename));
			while ( scanner.hasNext() ) {
				System.out.println( scanner.nextLine()  );
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Sorry that is not a valid level! Exiting..");
			System.exit(0);
		}
		
	}

	private void writeFile(String filename) {
		try {
			PrintWriter pw = new PrintWriter( new File(filename) );
			pw.println("---------------");
			pw.println("..B..........A.");
			pw.println(".......--......");
			pw.println("...H...........");
			pw.println("---------------");
			pw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Level not found. Exiting...");
			System.exit(0);
		}
	}

	/**
	 * ensures: runs the app
	 * @param args parameter ignored
	 */
	public static void main(String[] args) {
		LevelIO app = new LevelIO();
		app.runApp();
	} // main
}

	
