package paper;

public class RecursionMedium {

	public static String mystery(String a, String b) {
		if (a.length() == 0) {
			return b;
		}
		char  fA = a.charAt(0);
		char  fB = b.charAt(0);
		
		if ( fA == fB) {
			return fA + mystery( a.substring(1), b.substring(1) );
		} else {
			return mystery( a.substring(1), b.substring(1) );
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println( mystery("abc", "cbaz" ) );
	}

}
