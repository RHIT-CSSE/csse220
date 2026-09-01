package fileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class: LevelIO
 * @author CSSE Faculty
 * <br>Purpose: Demonstration of how to read and write files containing arcade game levels 
 * <br>Restrictions: restricted to reading and writing .txt files
 * <br>For example: 
 * <pre>
 *    LevelIO app = new LevelIO();
 * </pre>
 */
public class LevelIO {
	
	/**
	 * ensures: inputFilename is opened, read, and output to the console
	 * @param inputFilename
	 */
	private void readFile(String inputFilename) {
		Scanner scanner = null;
		File f1 = null;
		try {
			f1 = new File(inputFilename);
			scanner = new Scanner(f1);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			File parentFolder = f1.getParentFile();
			System.out.println("Folder searched for the file not found: " + parentFolder.getAbsolutePath());
			System.exit(1);
		} // end try-catch
		
		String title = scanner.nextLine();
		System.out.println("Title: " + title);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		} // end while
		
		scanner.close();	
	} // readFile
	
	//-----------------------------------------------------------------------------------

	/**
	 * ensures: outputFilename is opened and a sample arcade game board is written
	 * @param outputFilename
	 * Uses PrintWriter class from java.io which:
	 * Prints formatted representations of objects to a text-output stream
	 */
	private void writeFile(String outputFilename) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(outputFilename);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		} // end try-catch
		
		// hyphen - floor or ceiling boundary
		// vertical bar - side wall boundary
		// period - empty space
		// H - Hero
		// A - Alien
		pw.println("Sample arcade game level: a 20 x 20 field of play not counting boundaries");
		pw.println("|--------------------|"); // Boundary
		pw.println("|....................|"); // 1
		pw.println("|..------............|"); // 2
		pw.println("|.............----...|"); // 3
		pw.println("|....................|"); // 4
		pw.println("|....................|"); // 5
		pw.println("|....................|"); // 6
		pw.println("|............A.......|"); // 7
		pw.println("|......---------.....|"); // 8
		pw.println("|....................|"); // 9
		pw.println("|....................|"); // 10
		pw.println("|.......A............|"); // 11
		pw.println("|.-------............|"); // 12
		pw.println("|....................|"); // 13
		pw.println("|....................|"); // 14
		pw.println("|.-------............|"); // 15
		pw.println("|....................|"); // 16
		pw.println("|....................|"); // 17
		pw.println("|.........------.....|"); // 18
		pw.println("|....................|"); // 19
		pw.println("|...H.............A..|"); // 20
		pw.println("|--------------------|"); // Boundary
		pw.close();
	} // writeFile

	//-----------------------------------------------------------------------------------
	
	/**
	 * ensures: 1st writes a text file, then reads it back in
	 */
	public void runApp() {
		String filename = "levels/level1.txt";
		writeFile(filename);
		readFile(filename);
	} // runApp

	//-----------------------------------------------------------------------------------

	/**
	 * ensures: runs the app
	 * @param args parameter ignored
	 */
	public static void main(String[] args) {
		LevelIO app = new LevelIO();
		app.runApp();
	} // main
}
