package paper;
/**
  *   Goal is to assess if students understand how exceptions operate
  * 
  *   Questions to assess:
  *   1. do they know that when exceptions are thrown that the current methods stops executing
  *   2. do they know that the code continues after the exception is caught
  *   3. do they understand that exceptions can be caught from previous method callers
  *   4. optional:   do they understand that finally code runs in all cases?
  *   
  * 
  */



public class Main {
	public static void process(String word) throws IllegalArgumentException{
		if (word.length() == 0) {
			throw new IllegalArgumentException();
		}
	    try {
	    	System.out.println( firstHalf(word)   );
	    	System.out.println( middleChar(word)   );
	    } catch (IllegalArgumentException e) {
	        System.out.println( "bad arg"   );
	    } catch (ArithmeticException e) {
	        System.out.println( "bad math"   );
	    }
	}
	
	public static String firstHalf(String x) throws ArithmeticException {
		if (x.length() % 2 != 0) {
	        throw new ArithmeticException();
	    }  
		return x.substring(0, x.length()/2);
	}
	
	public static char middleChar(String y) throws ArithmeticException {
		if (y.length() % 2 != 1) {
	        throw new ArithmeticException();
	    }
		return y.charAt( y.length()/2 );
	}
	
	public static void main(String[] args) {
		try {
			System.out.println( middleChar( "abc" )  ) ;
	        process( "abc" )   ;
	        process( "abcd" )  ;
	        process( "" )      ;
	        System.out.println("Finished!");
	
	    } catch (IllegalArgumentException e) {
	        System.out.println("Invalid word");
	    }
	}
}
