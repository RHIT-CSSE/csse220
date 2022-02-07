import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * A sample class for practicing implementing UML
 * 
 * @author yoder1
 *
 */
public class Main {

	private ArrayList<A> myAs = new ArrayList<>(); 
	
	
	public Main() {
		
		//creates As for Main object
		myAs.add( new A( "A" ) );
		myAs.add( new A( "B" ) );
		myAs.add( new A( "C" ) );
		myAs.add( new A( "D" ) );
		myAs.add( new A( "E" ) );

	}
	

	/**
	 *  Used to create
	 * 
	 * @param args Command line arguments (ignored)
	 */
	public static void main(String[] args) {
		
		Main myExample = new Main();
		myExample.setAllBValuesTo3();

	}
	
	public void setAllBValuesTo3() {
		//updates the values for all the Bs associated with As 
		for (A a: this.myAs) {
			a.setBValue(3);
		}
	}
	
	
	
	
}
