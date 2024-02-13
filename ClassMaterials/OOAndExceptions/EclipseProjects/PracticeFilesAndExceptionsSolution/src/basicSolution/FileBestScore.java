

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
 *         Created Apr 21, 2017.
 */
public class FileBestScore {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		String filename = null;
		while(true) {
			try {
				System.out.println("What file should I load?  (e.g. scores.txt)");
				filename = s.nextLine();
				computeBestScore(filename);
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File " + filename + " does not exist.  Please try again.");
			}
		}
	}

	public static void computeBestScore(String filename) throws FileNotFoundException, IOException {
		FileReader file = new FileReader(filename);
		Scanner s = new Scanner(file);
		int bestScore = 0;
		String bestPlayer = null;
		
		while(s.hasNext()) {
			String name = s.next();
			String allScoresString = s.nextLine();
			try {
				int total = computeTotal(allScoresString);
				if(total > bestScore) {
					bestScore = total;
					bestPlayer = name;
				}
			} catch (IllegalArgumentException e) {
				System.err.println("Invalid player " + name + ": " + e.getMessage());
			}
		}
		file.close();
		System.out.println("Best player " + bestPlayer + " with total score " + bestScore);
	}

	public static int computeTotal(String allScoresString) {
		String[] allScoresArray = allScoresString.split(",");
		if(allScoresArray.length > 4) {
			throw new IllegalArgumentException(allScoresArray.length + " scores");
		}
		int total = 0;
		for(String score : allScoresArray) {
			total = total + Integer.parseInt(score.trim());
		}
		return total;
	}

}
