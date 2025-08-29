package examples;

public class CodingBatExamples {

	
	public static void main(String[] args) {
		
		
		System.out.println( "bunnyEars( 10 ) returned " + bunnyEars( 10 )   );
		
		
	}
	
	
	public static int bunnyEars(int bunnies) {
		// BASE case
		if (bunnies == 0) {
			return 0;
		}
		// recursive case with problems made smaller

		return 2 + bunnyEars(bunnies - 1);

	}

}
