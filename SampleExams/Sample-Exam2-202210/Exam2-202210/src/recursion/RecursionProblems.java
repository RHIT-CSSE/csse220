package recursion;


public class RecursionProblems {
	
	/*
	 * For this portion of the exam, you are given 4 problems below.  There are two that will 
	 * probably require the use of a helper method and 2 that do not require a helper method 
	 * (but you may use a helper method if you wish).  To receive full credit for this part, 
	 * you must pass all the  tests for any THREE problems below.  Completing a fourth problem
	 * below will not help your exam grade.
	 */
	
	
	/**
	 * For this problem, you are asked to count the number of pairs that appear opposite one another
	 * in a string.  Values opposite one another are letters that appear at the same position in the
	 * string forwards as backwards.
	 * 
	 * For example, consider the string below:
	 * abccba
	 * 
	 * In the above string, the two a's are opposite one another, the two b's are opposite one another
	 * and the two c's as well.  So, for this problem, if input = "abccba", you would return 3 since
	 * that is the number of pairs that appear at opposite ends of the string.
	 * 
	 * Note: You may assume the length of the string is always even (and consider 0 an even number)
	 * 
	 * Some more examples:
	 * input = "123456654321"
	 * return -> 6 - there are 6 pairs that match at opposite ends of the string
	 * 
	 * input = "123456674829"
	 * return -> 3 - the only characters that are pairs in the opposite positions are 2, 4 and 6 since
	 * those characters form a pair in their opposite respective positions.  The other numbers in their
	 * respective positions do not match, and are thus not counted.
	 * 
	 * input = "abc123w21bbb"
	 * return -> 3 - the characters that have matches at opposite positions are b (only the next to last
	 * b matches the one b at index 1, or the 2nd position), 1 and 2.  The other characters do not match
	 * at their respective opposite positions
	 * 
	 * input = "11111111"
	 * return -> 4 - Every character has a match at the corresponding opposite position.
	 * 
	 * input = "1234567890"
	 * return -> 0 - there are NO characters that match at opposite positions.
	 * 
	 * @param input - the string of characters
	 * @return the number of pairs matched at the symmetric opposite positions in the input string
	 */
	public static int numPairs(String input) {
		return 0;	
	}
	
	/**
	 * This problem is a static method that accomplishes the same thing as the (non-static) equals
	 * method of the String class.  You will be given two Strings named input1 and input2.  You are
	 * to use recursion to determine if these strings are equal, meaning that every character within 
	 * input1 matches every character in input2, letter-for-letter and position-for-position.  This
	 * method should return true when the String equals method would return true and false otherwise.
	 * You MUST use recursion for this, and you may not use the String's equals method.  You may not 
	 * use a loop in this problem for any reason, it must be fully recursive.
	 * 
	 * Note (with hint), the strings may be of different sizes, so make sure your base case(s) can 
	 * handle that situation.  
	 * 
	 * Examples:
	 * input1 = "Hello", input2 = "Hello"  -> return true
	 * 
	 * input1 = "12345", input2 = "12345"  -> return true.
	 * 
	 * input1 = "1a2b3c4d", input2 = "1a2b3c4d"  -> return true
	 * 
	 * input1 = "", input2 = ""  -> return true
	 * 
	 * input1 = "1234", input2 = "123456"  -> return false
	 * 
	 * input1 = "Hello", input2 = "hello"  -> return false
	 * 
	 * input1 = "a", input2 = "b"  -> return false
	 * @param input1
	 * @param input2
	 * @return
	 */
	public static boolean equals(String input1, String input2) {
		return false;
	}
	
	
	/**
	 * This problem is a slightly more complicated variant of the equals problem above.  For this problem,
	 * you will return true when both strings are equal as before.  However, now you are also given a
	 * threshold, which is a number that tells you how many mismatches are allowed for you to still return
	 * true.  In other words, you are to make sure that all the characters match in input1 and input2.  If
	 * there are any positions where the characters at the same respective position deosn't match, as long
	 * as the total number of mismatches is less than or equal to the threshold of given mismatches, you
	 * still return true.  If more letters mismatch than the threshold allows, you will return false.
	 * 
	 * You will want a helper method for this problem.  And you must handle the case where the input strings
	 * are not the same size.
	 * 
	 * Examples:
	 * input1 = "Hello", input2 = "Hello", threshold = 0   (note, when threshold is 0, it is the exact same
	 * as the equals method above)  -> return true, they all match within the given threshold
	 * 
	 * input1 = "abcdefg", input2 = "abzdxfg", threshold = 2  -> return true - while there are two positions
	 * in the input strings where the letters don't match, that is still within the allowed threshold, so
	 * return true
	 * 
	 * input1 = "1234567", input2 = "abc4567", threshold = 4  -> return true - while there are three
	 * positions in the strings that do not match, that is within the given threshold of 4, so return true
	 * 
	 * input1 = "hello there", input2 = "hello again", threshold = 5  -> return true - while there are 5
	 * positions in the strings that do not match, that is still within the given threshold
	 * 
	 * input1 = "abcdef", input2 = "abc", threshold = 3  -> return true - this is a case where the strings
	 * are of different length, but they still only differ by 3 characters, which is within the threshold
	 * 
	 * input1 = "ab", input2 = "abcdefgh", threshold = 6  -> return true - similar to the above, they differ
	 * in length, but the number of characters that do not match is within the threshold
	 * 
	 * input1 = "", input2 = "abc", threshold = 3  -> return true - they only differ by 3, the threshold
	 * 
	 * input1 = "1234", input2 = "", threshold = 4  -> return true - they only differ by 4, the threshold
	 * 
	 * 
	 * 
	 * 
	 * input1 = "abcdef", input2 = "zzcdef", threshold = 1  -> return false - there are two positions
	 * that there is a mismatch, and the threshold only allows for 1, so return false
	 * 
	 * input1 = "1234567", input2 = "1234abc", threshold = 2  -> return false - here, there are three 
	 * mismatches, one too many for a threshold of 2
	 * 
	 * input1 = "abc", input2 = "abcdefg", threshold = 3  -> return false - there are 4 mismatches and 
	 * only a threshold of 3
	 * 
	 * input1 = "1234567", input2 = "123", threshold = 3  -> return false - there are 4 mismatches and
	 * only a threshold of 3
	 * 
	 * input1 = "hello", input2 = "there", threshold = 4  -> return false - there are 5 mismatches and
	 * only a threshold of 4 
	 * 
	 * 
	 * 
	 * @param input1 - the first input string
	 * @param input2 - the second input string
	 * @param threshold - the threshold of allowable mismatches
	 * @return true if the strings differ by no more than threshold letters/positions and false otherwise
	 */
	public static boolean almostEquals(String input1, String input2, int threshold) {
		return false;
	}
	
	
	
	
	/**
	 * For this problem, we have already started it for you by writing the method below.  It calls a
	 * recursive helper method (that we also set up) to find a word in a particular circumstance.  You
	 * can view this problem as a "simple" crossword checker with a small twist.  The "simple" part is 
	 * that you ONLY need to find the word horizontally (all in the same row).  The "twist" is that the 
	 * word can start on one row and continue to the next.  So, you only need to worry about the simple
	 * case where the word starts in a particular row and you will check letter for letter if the word
	 * appears in that row and the word may finish in the next row.
	 * 
	 * Examples will be given below, for a description of what you will do exactly, see the mthod below:
	 * 
	 * puzzle = [ a, b, h, e, l, l, o,
	 *            c, t, h, e, r, e, d,
	 *            h, o, w, e, a, r, e,
	 *            f, g, h, i, t, h, i,
	 *            n, g, s, j, k, t, o,
	 *            d, a, y, l, m, n, o ]
	 *        
	 * word = "hello" -> return true  (found in the first row)
	 * 
	 * word = "there" -> return true  (found in the second row with index 1)
	 * 
	 * word = "how"  -> return true  (found in the third row with index 2)
	 * 
	 * word = "are"  -> return true  (found in the third row with index 2)
	 * 
	 * word = "things"  -> return true  (found word with "thi" started in the 4th row with index 3, and 
	 * the rest of the word finished immediately in the next row with index 4 with the letters "ngs")
	 * 
	 * word = "today"  -> returns true  (found word with "to" started in the 5th row with index 4 and
	 * the rest of the word finished immediately in the next row with index 5 with the letters "day")
	 * 
	 * word = "red"  -> return true  (found in 2nd row with index 1)
	 * 
	 * word = "mno"  -> return true  (found as the last three letters of the puzzle)
	 * 
	 * word = "mnop"  -> return false  (not found, even though "mno" found at end of puzzle, the rest
	 * was not found)
	 * @param puzzle
	 * @param word
	 * @return
	 */
	public static boolean horizontalWordFinder(char[][] puzzle, String word) {
		//DO NOT CHANGE THIS METHOD
		for(int row = 0; row < puzzle.length; row++) {
			for(int col = 0; col < puzzle[0].length; col++) {
				if(word.charAt(0) == puzzle[row][col]) {
					//IF YOU MUST, YOU MAY CHANGE PARAMETERS PER INSTRUCTIONS
					boolean check = horizontalWordFinderHelper(puzzle, word, 0, row, col);
					if(check)
						return true;
				}
			}
		}
		//if made it here, it was not found, return false...
		return false;
	}
	
	/**
	 * This is the method you will complete.  See the examples above.  For this problem, you are not allowed
	 * to use a loop for any reason, you may only use recursion to find the word.  Hint: this method will
	 * ONLY ever be called when the first letter of the string called "word" is found in the puzzle.  Since
	 * you know this, all you must do is find the word starting at the current row and column.  You will
	 * return true if you find the word, and false if you do not.  The word should either be completely
	 * found in the current row, or partially found in the current row (at the end of the row) and finished
	 * in the next row.  Hint: be very cautious about cases across rows and especially in the last row; a
	 * word might start at the very end of the puzzle, but not finish, and you should make sure you don't
	 * attempt to access a row that doesn't exist.
	 * 
	 * You have some extra data.  You may change the parameters (names, types, order they appear, etc.)
	 * however you wish, just make sure to change the corresponding method call above in the method we
	 * wrote for you.  Technically speaking, you should not have to change any parameters to solve this
	 * but you may if you wish.
	 * 
	 * We gave values for every part that you need to consider.  Above, the method takes a 2-D char array
	 * and a String called "word".  Here, we also have wordInd, which is the current index in word, which
	 * will always start at 0.  You also have curRow and curCol which are the current row index and current
	 * column index, respectively, in the puzzle array.  When you are checking a word all in the same row,
	 * the curRow need not change.  If you are checking across rows, curRow may change in that case.
	 * 
	 * You are to return true if you can find the word by searching linearly starting from the first 
	 * character in the String word, and finding each character to the last consecutively in the puzzle
	 * 
	 * 
	 * @param puzzle - the 2-D array of char that represents the crossword puzzle
	 * @param word - the word to find in puzzle
	 * @param wordInd - the current index being inspected in word, always starts at 0
	 * @param curRow - the current row index in the puzzle array
	 * @param curCol - the current column index in the puzzle array
	 * @return  true if the word is found in puzzle checking that each letter in the String word is
	 * found in the puzzle with all letters being consecutive
	 */
	private static boolean horizontalWordFinderHelper(char[][] puzzle, String word, int wordInd, int curRow, int curCol) {
		return false;
	}
	
}
