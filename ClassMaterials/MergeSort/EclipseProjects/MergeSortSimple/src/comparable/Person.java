package comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A person class, designed for use with comparable.
 * 
 * TODO: Modify this class to be sortable.
 * 
 * People should be sorted first by their last name, then by their age.
 * So the output of the sample main should be:
 * 
 * [Anders - 45, Li - 19, Li - 22, Smith - 18, Smith - 20]
 * 
 * @author hewner
 *
 */
public class Person {
	
	private String lastName;
	private int age;
	
	public Person(String lastName, int age) {
		this.lastName = lastName;
		this.age = age;
	}
	
	public String toString() {
		return this.lastName + " - " + age;
	}
	
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Smith", 18));
		people.add(new Person("Li", 22));
		people.add(new Person("Smith", 20));
		people.add(new Person("Li", 19));
		people.add(new Person("Anders", 45));
		
		Collections.sort(people);
		
		System.out.println(people);
	}

}
