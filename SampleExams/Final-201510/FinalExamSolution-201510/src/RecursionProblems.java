
/**
 * All of these problems must be solved recursively.
 * Iterative solutions are worth at most 2/5
 * 
 * @author hewner
 *
 */
public class RecursionProblems {
	
	
	/**
	 * Given a string, this method returns every character tripled in
	 * a new string.
	 * 
	 * For example:
	 * "abc" -> "aaabbbccc"
	 * "cool down" -> cccoooooolll   dddooowwwnnn"
	 * 
	 * @param input - the original string 
	 * @return a new string with every letter tripled.
	 */
	public static String tripler(String input) {
		if(input.length() == 0)
			return "";
		
		char firstLetter = input.charAt(0);
		return "" + firstLetter + firstLetter + firstLetter + tripler(input.substring(1)); 
	}
	
	/**
	 * Given a string of only (a) space characters and (b) curly brackets 
	 * (left and right), it returns true if for every opening bracket, there 
	 * is a closing bracket.  A correct string will have all of the left brances first
	 * followed by all of the right braces.
	 * 
	 * Passing an empty string, or a string of only
	 * spaces should return true.
	 * 
	 * For example, the following strings should result in true:
	 * "",   "  ",   "{}",   "{{{}}}",   "  {   { }      }  "
	 * 
	 * The following strings should result in false:
	 * "{",   "   {    ",   " {  {  }  }    }}",   "{}{}{}{}" 
	 * 
	 * 
	 * @param test - a string containing only spaces and curly brackets
	 * @return true if for every right open bracket, there is a left
	 * closed bracket.
	 */
	public static boolean isClosedBrackets(String test) {
		if(test.length() == 0)
			return true;
		else if(test.length() == 1){
			if(test.charAt(0) != ' ')
				return false;
			else
				return true;
		}
		else if(test.charAt(0) == ' ')
			return isClosedBrackets(test.substring(1));
		else if(test.charAt(test.length()-1) == ' ')
			return isClosedBrackets(test.substring(0, test.length()-1));
		else
			if(test.charAt(0) == '{' && test.charAt(test.length()-1) == '}')
				return isClosedBrackets(test.substring(1, test.length()-1));
		
		return false;
	}
	

}
