package roseString;

/**
 * An example class for demoing how to use a custom String class
 * 
 */
public class RoseStringMain {
	
	
	public static void main(String[] args) {
		char[] exampleCharArray =  {'h','e','l','l', 'o'};		
		// DONE #1 Create a custom new RoseString Class
		// DONE #2 Create a constructor that takes char[] and stores the information in class
		// DONE #3 Create a method that returns the length of the string call it length
		// DONE #4 Create a method that returns the character at a given index call it charAt
		
		// DONE #5 Create a new RoseString object with the exampleCharArray variable above
		RoseString roseString = new RoseString(exampleCharArray);
		
		// DONE #6 Print the length of the RoseString object
		System.out.println(  roseString.length() );
		
		// DONE #7 Print each of the characters in the RoseString object on one line
		for (int i = 0; i < roseString.length(); i++) {
			System.out.print(roseString.charAt(i));
		}
		System.out.println();
		
		// DONE #8 Print each of the characters in the RoseString object on separate lines
		for (int i = 0; i < roseString.length(); i++) {
			System.out.println(roseString.charAt(i));
		}
		
	}

}
