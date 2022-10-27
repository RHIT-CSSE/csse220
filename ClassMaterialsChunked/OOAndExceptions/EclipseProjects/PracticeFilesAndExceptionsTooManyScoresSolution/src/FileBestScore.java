import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * Imagine a game where players player 3 or 4 rounds, and their overall score
 * is the sum of the rounds.
 * 
 * This program is designed to compute the best player from a file that looks
 * like this:
 * 
 * PlayerA 3,4,5
 * PlayerB 4,5,1,2
 * PlayerC 4,4,4,4
 * 
 * The program works correctly except for 2 things:
 * 
 * 1.  Cheating players sometimes do more than 4 rounds.  The program should
 * print a warning when a cheating player is uncovered - but continue the
 * computation ignoring the cheating player.  
 * 
 * Do this by making the function computeTotal throw a IllegalArgumentException
 * when given a cheating record.  computeBestScore should catch the exception,
 * print a warning, and continue the computation.
 *
 * 2.  If the user enters an invalid file name, the program crashes.  Instead
 * the program should say that the file does not exist and let the user enter
 * a new name (as many times as necessary).  Catch a FileNotFoundException
 * in main to do this.
 *
 * @author hewner.
 *         Created Apr 21, 2017. Updated 2021
 */
public class FileBestScore {	

	private int computeTotal(String allScoresString) throws TooManyScoresException {
		String[] allScoresArray = allScoresString.split(",");
		int total = 0;
		
		if (allScoresArray.length > 4) {
			throw new TooManyScoresException(allScoresArray.length, 4);
		}
		
		
		for(String score : allScoresArray) {
			total += Integer.parseInt(score.trim());
		} // end for
		return total;
	} // computeTotal

	//-------------------------------------------------------------------------------

	private void computeBestScore(String filename) throws FileNotFoundException, IOException {
		FileReader f1 = new FileReader(filename);
		Scanner s1 = new Scanner(f1);
		int bestScore = 0;
		String bestPlayer = null;
		
		while(s1.hasNext()) {
			String name = s1.next();
			String allScoresString = s1.nextLine();
			try {
				int total = computeTotal(allScoresString);
				if(total > bestScore) {
					bestScore = total;
					bestPlayer = name;
				} // end if
			} catch (TooManyScoresException e) {
				System.err.println(name + " caught cheating with " +
						e.getMessage() + " Skipping.");
				
			}
			
		} // end while
		s1.close();
		f1.close();
		System.out.println("Best player " + bestPlayer + " with total score " + bestScore);
	} // computeBestScore
	
	//-------------------------------------------------------------------------------

	private void runApp()  {
		Scanner s = new Scanner(System.in);
		
		boolean isDone = false;
		while ( !isDone ) {
			String filename = null;
			System.out.println("What file should I load?  (e.g. scores.txt)");
			filename = s.nextLine();
			try {
				computeBestScore(filename);
				isDone = true;
			} catch (FileNotFoundException e) {
				System.err.println("File not found. Please try again.");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		s.close();		
		System.out.println("App terminated");
	} // runIt
	
	//-------------------------------------------------------------------------------

	public static void main(String[] args)  {
		FileBestScore app = new FileBestScore();
		app.runApp();
	} // main
}
