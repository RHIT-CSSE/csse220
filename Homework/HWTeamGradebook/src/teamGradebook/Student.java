package teamGradebook;
import java.util.ArrayList;


public class Student {
	// TODO: Complete this class	
	// You'll need to add fields, constructors, and methods here
	// Adhere to (1), (2), and (3) below

	public Student() {
		//Make sure this constructor exists in order to pass certain tests.
	}

	// (1) Requirements on Field Declaration Design/Engineering:
	// -- Fields of this class must be declared with the 'private' access modifier - this provides compiler enforced encapsulation
	// -- Getters/setters are not allowed for any field that is a collection, for example, no getter or setter for an ArrayList field
	//    This restriction keeps these complex internal data structures 'private', i.e., encapsulated
	
	// (2) Requirements on New Method Design/Engineering:
	// Adhere to OOD Principle 4.a by creating 'tell' methods inside of Student
	// That is, if your app needs something computed using the data stored in the Student class, 
	// then design/engineer the Student class so that it implements the computation inside a new 'public' Student method. 
	// Then a client can 'tell' Student to do that computation by calling this new Student method

	//(3)  Requirements for Student's toString Method: 
	// Implement a toString method that returns a String containing the values in the object's fields
	// After adding fields to this class, use the Eclipse command: Source | Generate toString
	// When debugging, call this toString method on Student objects from a System.out.println command
}
