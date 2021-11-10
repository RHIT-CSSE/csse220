package comparable;

import java.util.ArrayList;
import java.util.Collections;


public class PersonDriver {
	
	private ArrayList<Person> people = new ArrayList<>();
	
	private void runApp() {
		this.people.add(new Person("Smith", 20));
		this.people.add(new Person("Smith", 18));
		this.people.add(new Person("Li", 22));
		this.people.add(new Person("Li", 19));
		this.people.add(new Person("Anders", 45));
		
		

		System.out.println("Before sorting: " + this.people);
		// TODO #1 - uncomment the following line, then go to Person.java and do TODO #2
		// Collections.sort(this.people);
		System.out.println(" After sorting: " + this.people);
	}
	

	public static void main(String[] args) {
		PersonDriver app = new PersonDriver();
		app.runApp();
	}

}
