package comparing;


/**
 * A Person class, designed for use with comparable.
 * 
 * TODO #2: Modify this class so that is implements Comparable<Person>
 * 
 * People objects should be sorted in non-decreasing order by
 *  1) their last name
 *  2) their age, but only if the 2 People objects being compared have the same last name
 * 
 * So the output of the driver main should be:
 *  [(Anders, 45), (Li, 22), (Li, 19), (Smith, 20), (Smith, 18)]
 * 
 * @author CSSE Faculty
 *
 */
public class Person implements Comparable<Person> {	
	private String lastName;
	private int age;
	
	public Person(String lastName, int age) {
		this.lastName = lastName;
		this.age = age;
	} // Person
	
	public String toString() {
		return "("+ this.lastName + ", " + age + ")";
	} // toString

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		// a.compareTo(b)  a < b must return -1
		// a == b 0
		// a > b 1
		if (this.lastName.compareTo(o.lastName) == 0) {
			// fact: lastNames are equal
			return this.age - o.age;
		} else {
			return this.lastName.compareTo(o.lastName);
		} // end if
	}

	public int getAge() {
		return this.age;
	}

}








