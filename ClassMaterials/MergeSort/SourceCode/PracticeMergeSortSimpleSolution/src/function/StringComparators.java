package function;

import java.util.Arrays;
import java.util.Comparator;

public class StringComparators {
	public static void main(String[] args) {
		new StringComparators();
	}
	
	public StringComparators() {
		String[] colors = new String[] {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};  
		Arrays.sort(colors);
		System.out.println("Sort [default]: " + Arrays.toString(colors));
		
		Comparator<String> bySecondLetter = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				char first = s1.charAt(1);
				char second = s2.charAt(1);
				return first - second;
			}
		};
		Arrays.sort(colors, bySecondLetter);
		System.out.println("Sort [second letter]: " + Arrays.toString(colors));
		
		Comparator<String> byFirstEPosition = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int first = s1.indexOf("e");
				int second = s2.indexOf("e");
				return first - second;
			}
		};
		Arrays.sort(colors, byFirstEPosition);
		System.out.println("Sort [first e position]: " + Arrays.toString(colors));
	}
}
