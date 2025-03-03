package RoseString;

import java.util.Arrays;

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
