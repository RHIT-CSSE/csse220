package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Driver class containing main for running and testing 
 * Collections.sort on the Person class
 * 
 * @author CSSE Faculty
 *
 */
public class PersonDriver {
	private ArrayList<Person> people;
	
	private void runApp() {
		this.people = new ArrayList<>();
		
		this.people.add(new Person("Smith", 20));
		this.people.add(new Person("Smith", 18));
		this.people.add(new Person("Li", 22));
		this.people.add(new Person("Li", 19));
		this.people.add(new Person("Anders", 45));
		
		System.out.println("Before sorting: " + this.people);
		// TODO #1 - uncomment the following line, then go to Person.java and do TODO #2
//		Collections.sort(this.people);
		System.out.println(" After sorting: " + this.people);
		
		// TODO #3 - declare a variable called byAgeOnly using type Comparator<Person>, 
		// make it sort by non-increasing age only
		// Then uncomment the following line
//		Collections.sort(this.people, byAgeOnly);
		
		System.out.println("After sorting by age only (oldest first): " + this.people);

	} // runApp
	

	public static void main(String[] args) {
		PersonDriver app = new PersonDriver();
		app.runApp();
	} // main

}
