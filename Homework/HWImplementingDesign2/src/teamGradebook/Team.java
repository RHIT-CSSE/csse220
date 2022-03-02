package teamGradebook;
import java.util.ArrayList;


public class Team {
	
	// TODO: Complete this class
	// You'll need to add fields, constructors, and methods here
	// Adhere to (1), (2), and (3) below
	
	// (1) Requirements on Field Declaration Design/Engineering:
	// -- Fields of this class must be declared with the 'private' access modifier - this provides compiler enforced encapsulation
	// -- Getters/setters are not allowed for any field that is a collection, for example, no getter or setter for an ArrayList field
	//    This restriction keeps these complex internal data structures 'private', i.e., encapsulated
	
	// (2) Requirements on New Method Design/Engineering:
	// Adhere to OOD Principle 4.a by creating 'tell' methods inside of Team
	// That is, if your app needs something computed using the data stored in the Team class, 
	// then design/engineer the Team class so that it implements the computation inside a new 'public' Team method. 
	// Then a client can 'tell' Team to do that computation by calling this new Team method
	
	// (3) Requirements for Student's toString Method: 
	// Implement a toString method that returns a String containing the values in the object's fields
	// After adding fields to this class, use the Eclipse command: Source | Generate toString
	// When debugging, call this toString method on Team objects from a System.out.println command
}
