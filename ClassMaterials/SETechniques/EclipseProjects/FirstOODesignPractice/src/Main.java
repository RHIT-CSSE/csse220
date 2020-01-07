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

	//TODO add instance variables for class Main
	private ArrayList<A> myAList = new ArrayList<A>();
	
	public Main() {
		// names should be "A" "B" "C" "D" "E"
		myAList.add( new A("A") );
		myAList.add( new A("B") );
		myAList.add( new A("C") );
		myAList.add( new A("D") );
		myAList.add( new A("E") );
		
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
		//TODO update the values for all the Bs associated with As to be 3
		
		for (A currentA: this.myAList) {
			currentA.report();
		}
		
		for (A currentA: this.myAList) {
			currentA.setBValue(3);
		}
		
		for (A currentA: this.myAList) {
			currentA.report();
		}
		
		
		
		
		
	}
	
	
	
	
}
