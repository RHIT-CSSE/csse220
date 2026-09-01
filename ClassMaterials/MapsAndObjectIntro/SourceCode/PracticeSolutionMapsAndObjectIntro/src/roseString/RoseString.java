package roseString;

import java.util.Arrays;

/**
 * This class stores a sequence of chars.
 * It allows a user to access the length of the sequence and the char at a specific index.
 * It is meant to show how a String class could be created from scratch.
 * 
 */
public class RoseString {
	
	private char[] charArray;
	
	public RoseString( char[] providedCharArray) {
		charArray = new char[providedCharArray.length];
		for (int i = 0; i < providedCharArray.length; i++) {
			this.charArray[i] = providedCharArray[i];
		}
	}
	
	public int length() {
		return charArray.length;
	}
	
	public char charAt(int index) {
		return charArray[index];
	}
	
}
