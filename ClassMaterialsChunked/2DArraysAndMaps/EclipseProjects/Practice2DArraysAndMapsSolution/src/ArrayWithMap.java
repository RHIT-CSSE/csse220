import java.util.HashMap;

/**
 * Class: ArrayWithMap
 * @author wilkin
 * 
 * Use this for in-class examples.  I create this whole class
 * from scratch in front of them.  Comments I make as I go along
 * that leads into the next thing are in code comments below.
 * Just follow this from top-to-bottom in main and it is the
 * same sequential order I use.
 *
 */
public class ArrayWithMap {
	private static int SIZE = 5;
	
	public static void main(String[] args) {
		
		//PART 1: This code and the printNext method below
		//code we will remake using a map:
		int[] array = new int[SIZE];
		for(int i = 0; i < SIZE; i++) {
			array[i] = i*i;
		}
		
		//pretty print array
		System.out.print("The array is: {");
		for(int i = 0; i < SIZE; i++) {
			System.out.print("[" + i + "]=" + array[i]);
			printNext(i);
		}
		
		//END PART 1////////////////////////////////////////////////////
		
		
		//Part 2
		//this will be equivalent to an int array
		HashMap<Integer,Integer> myArray = new HashMap<Integer,Integer>();
		for(int i = 0; i < SIZE; i++){
			myArray.put(i, i*i);
		}
		
		System.out.println("The map array is: " + myArray.toString());
		
		
		//A Great exercise is to make them match the pretty print of a map
		//as in above to practice the get method
		System.out.print("The map array pretty printed my way is: {");
		for(int i = 0; i < 5; i++) {
			System.out.print(i + "=" + myArray.get(i));
			printNext(i);
		}
		
		//END PART 2/////////////////////////////////////////////////////

		
		//PART 3
		//Now do the same for 5 elements, but spell the word out:
		HashMap<String,Integer> myArray2 = new HashMap<String,Integer>();
		myArray2.put("zero", 0);
		myArray2.put("one", 1);
		myArray2.put("two", 4);
		myArray2.put("three", 9);
		myArray2.put("four", 16);
		
		
		
		//HOW DO WE LOOP THROUGH THIS???!!!!???
		//do this for loop, but replace it with part 4 code
		for(String key : myArray2.keySet()) {
			System.out.println(myArray2.get(key));
		}
		//END PART 3////////////////////////////////////////////////////
		
		
		//PART 4  (replace 2nd half of part 3 with this)
		//WHHAAAATTTTT???!!!???  Not in the same order!!!  
		//It's OK, this is what we expected with maps, just accept it...
		//pretty print:
		System.out.print("The map pretty printed is: {");
		for(String key : myArray2.keySet()) {
			System.out.print(key + "=" + myArray2.get(key));
			System.out.print(", ");
			//we don't have i to know when we're going off the edge...
			//can't use print next
		}
		System.out.println("}");
	}

	public static void printNext(int i) {
		if(i < SIZE - 1)
			System.out.print(", ");
		else
			System.out.print("}\n");
	}
}
