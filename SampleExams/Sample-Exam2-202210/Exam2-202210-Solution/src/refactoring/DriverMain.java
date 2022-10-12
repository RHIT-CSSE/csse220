package refactoring;

import java.util.ArrayList;
import java.util.List;

/**
 * This program features books
 * 
 * Your job is to use inheritance with a class or inheritance with an abstract
 * class to remove as much code duplication as you can from the 3 book classes
 * (AudioBook, HardCover, PaperBack) and the main program (below)
 * 
 * @author --- put your name here ---
 *
 */
public class DriverMain {

	public static void main(String[] args) {
		List<Book> allBooks = new ArrayList<Book>();

		// ------------------------------------------------------------------------
		
		// ----------------
		// Add Audio books
		// ----------------
		allBooks.add(new AudioBook("The Fellowship of the Ring", "J. R. R. Tolkien", "Rob Inglis", 1147));

		// ----------------
		// Add Hard cover books
		// ----------------
		allBooks.add(new HardCover("Altered Carbon", "Richard K. Morgan", 375));
		HardCover rental1 = new HardCover("The Three-Body Problem", "Cixin Liu", 400);
		rental1.setBorrowerName("Dr. Holly");
		allBooks.add(rental1);

		// ----------------
		// Add Paperbacks
		// ----------------
		allBooks.add(new PaperBack("I, Robot", "Isaac Asimov", 256));

		// ------------------------------------------------------------------------
		
		// ----------------
		// Generate Reports
		// ----------------
		for (Book aBook : allBooks) {
			aBook.generateBookReport();
		} // end for

		// ------------------------------------------------------------------------
		
		// ----------------
		// Generate List of All Authors
		// ----------------
		System.out.println("All authors:");
		for (Book aBook : allBooks) {
			System.out.println("   " + aBook.getAuthor());
		} // end for
		
	} // main

} // DriverMain