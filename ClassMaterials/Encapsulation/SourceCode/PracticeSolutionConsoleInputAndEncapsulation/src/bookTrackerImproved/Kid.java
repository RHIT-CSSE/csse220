package bookTrackerImproved;
import java.util.ArrayList;

/**
 *  
 * The Kid class represents a particular kid which has a name and a grade level.
 * In addition, the Kid keeps tracks of all books the kid has read.
 * 
 * @author Jason Yoder and Jacob Ashworth - March 2022
 *
 */
public class Kid {

	private String name;
	private int gradeLevel;
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public Kid(String name, int gradeLevel) {
		this.name = name;
		this.gradeLevel = gradeLevel;
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public void printReport() {
		System.out.println(this.name +" has read:");
		for (Book book: this.books) {
			System.out.println( book );
		}
	}
	
	@Override
	public String toString() {
		return this.name + "( Grade: " + this.gradeLevel + " )";
	}
	
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Book> getBooks(){
		return this.books;
	}
	
	
}
