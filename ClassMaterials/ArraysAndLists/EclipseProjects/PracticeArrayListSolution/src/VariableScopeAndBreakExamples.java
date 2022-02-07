
public class VariableScopeAndBreakExamples {

	public static void main(String[] args) {
		
		//Variable Scope
		//uncomment this and remove declarations below to
		//allow this code to run
		//String ans;
		int x = 1;
		if ( x == 0) {
			String ans = "X is zero!";
		} else {
			String ans = "X is NOT zero!";
		}
		System.out.println(  ans  );
				
		//  break; statement allows you to 
		//  exit the current loop
		int y = 0;
		while ( true ) {
			if(y == 10) {
				break;
			}
			System.out.println(  y  );
			y++;
		}
		
		
		
	}
	
	
	
}
