package comparing;

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
		
		// TODO #3 - Create a class called ByAgeOnlyComparator, 
		// which should sort by non-increasing age only. (decreasing or neutral)
		// Then uncomment the following line to create an use an instance of it
		// To sort the people.
//		Collections.sort(this.people, new ByAgeComparator() );
		System.out.println("After sorting by age only (oldest first): " + this.people);
		
		
		// TODO #4 - declare a variable called reverseAgeComparator using type Comparator<Person>, 
		// make it sort by NON-DECREASING age only (increasing or neutral)
		
		// Then uncomment the following line
//		Collections.sort(this.people, reverseAgeComparator );
		System.out.println("After sorting by age only (youngest first): " + this.people);
		
		

	} // runApp
	

	public static void main(String[] args) {
		PersonDriver app = new PersonDriver();
		app.runApp();
	} // main

}
