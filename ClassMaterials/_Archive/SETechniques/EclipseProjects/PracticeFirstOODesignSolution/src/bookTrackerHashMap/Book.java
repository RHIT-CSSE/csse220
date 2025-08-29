package bookTrackerHashMap;
import java.util.ArrayList;
/**
 *  
 * The Book class represents a particular Book which has a name (title) and an author.
 * In addition, the Book tracks the Kids that have read it.
 * 
 * @author Jason Yoder and Jacob Ashworth - March 2022
 *
 */
public class Book {

	private String name;
	private String author;
	
	private ArrayList<Kid> kids = new ArrayList<Kid>();
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public void addKid(Kid kid) {
		this.kids.add(kid);
	}
	
	public void printReport() {
		System.out.println(this.name +" has been read by:");
		for (Kid kid: this.kids) {
			System.out.println( kid );
		}
	}
	
	@Override
	public String toString() {
		return this.name + "( " + this.author + " )";
	}
	
	//Added
	public String getName() {
		return name;
	}
}
