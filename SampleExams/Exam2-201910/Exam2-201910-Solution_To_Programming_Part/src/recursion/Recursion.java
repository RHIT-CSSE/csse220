package recursion;

/**
 * 
 * These problems should ALL be solved recursively - not with the use of rarely
 * used library functions, for loops, or while loops.
 * 
 * You can use a recursive helper function on any problem 
 * if that makes it easier for you.
 * 
 * Solve any 3 of these 4 problems for full credit. No bonus points for doing
 * the 4th. :)
 * 
 */

public class Recursion {
	
	/**  Take a String made of 'A's separated by spaces and 
	 *    returns the longest streak of As.
	 * 
	 *    Examples:
	 *    
	 *    longestStreakOfAs("A")  -> returns 1
	 *    longestStreakOfAs("A A A")  -> returns 1
	 *    longestStreakOfAs("A AA")  -> returns 2
	 *    longestStreakOfAs("AA A")  -> returns 2
	 *    longestStreakOfAs("AAA A")  -> returns 3
	 *    longestStreakOfAs("")  -> returns 0
	 * 
	 */
	public static int longestStreakOfAs(String string) {
		return longestStreakOfAsHelper(string, 0, 0);
	}	
	
	public static int longestStreakOfAsHelper(String string, int currentStreak, int pos) {
		if(pos == string.length()) return currentStreak;
		if(string.charAt(pos) == 'A') return longestStreakOfAsHelper(string, currentStreak + 1, pos + 1);
		return Math.max(currentStreak, longestStreakOfAsHelper(string, 0, pos + 1));
	}
	
	/**  Takes a String and rotates the letters from the beginning to the end a certain number of times
	 * 
	 *  Examples:
	 *  rotateStringNPlaces("yoder",1)  ->   odery
	 *  rotateStringNPlaces("yoder",2)  ->   deryo
	 *  rotateStringNPlaces("yoder",3)  ->   eryod
	 *  rotateStringNPlaces("yoder",4)  ->   ryode
	 *  rotateStringNPlaces("yoder",5)  ->   yoder
	 * 
	 */
	public static String rotateStringNPlaces(String string, int n) {
		if (string.length()==0) {
			return "";
		} else if (n ==0) {
			return string;
		} else {
			return rotateStringNPlaces( string.substring(1) + string.charAt(0) , n-1);
		}
	}
	

	/**
	 * More A words than all others combined.
	 * You are given an array of strings. You should determine if more of
	 * the strings start with A or all of the non-A letters combined. If there are more
	 * words that start with "A" then you should return true, otherwise return false.
	 * 
	 * Examples:   moreAsThanAllOthers( {"Apple","Adam","Ban","Banana","Charlie"} ) -> false
	 * 			   moreAsThanAllOthers( {"Apple","Adam","Ban","Banana","Alex"} )    -> true
	 *             moreAsThanAllOthers( {"Apple","Bob","Chuck","Dan","Eli"} ) -> false
	 * 
	 * Reminder: no loops on any of these problems. You may use a recursive
	 * helper method if you like, but it isn't required.
	 * 
	 * Hint: you will want a helper method(s) for this problem
	 * 
	 * @param nums - array of strings
	 * @return boolean - true or false depending on how many words start with A
     */
	public static boolean moreAsThanAllOthers(String[] words) {
		int aLetters = numberAWords(words,0);
		return (words.length - aLetters) < aLetters;
	}
	
	public static int numberAWords(String[] words, int index) {
		if (index >= words.length) {
			return 0;
		} else if (words[index].charAt(0) == 'A') {
			return 1 +  numberAWords( words, index+1);
		} else {
			return numberAWords( words, index+1);
		}
	}


	
	/** Returns the total number of times that consecutive Qs appear in a String.
	 * 
	 * Only consider capital Qs, there is nothing special you have to with upper/lowercase.
	 * 
	 * "QQbbccdd"  returns 1
	 * "QQQQQ" returns 4
	 * "QbcdQfghQjk" returns 0
	 * 
	 * 
	 * @param String : single word
	 * @return number of consecutive Qs that appear
	 * 
	 */
	public static int totalConsecutiveQs(String s) {
		return tcqHelper( s, false);
	}
	public static int tcqHelper(String s, boolean prevWasQ) {
		if (s.length() == 0) {
			return 0;
		} else if (  s.charAt(0)!= 'Q'  ) {
			return tcqHelper(s.substring(1), false);
		} else if (prevWasQ) {
			return 1 + tcqHelper(s.substring(1), true);
		} else {
			return tcqHelper(s.substring(1), true);
		}
	}
	

}
