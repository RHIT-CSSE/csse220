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
		List<AudioBook> aBooks = new ArrayList<AudioBook>();
		List<HardCover> hBooks = new ArrayList<HardCover>();
		List<PaperBack> pBooks = new ArrayList<PaperBack>();

		// ------------------------------------------------------------------------
		
		// ----------------
		// Add Audio books
		// ----------------
		aBooks.add(new AudioBook("The Fellowship of the Ring", "J. R. R. Tolkien", "Rob Inglis", 1147));

		// ----------------
		// Add Hard cover books
		// ----------------
		hBooks.add(new HardCover("Altered Carbon", "Richard K. Morgan", 375));
		HardCover rental1 = new HardCover("The Three-Body Problem", "Cixin Liu", 400);
		rental1.setBorrowerName("Dr. Holly");
		hBooks.add(rental1);

		// ----------------
		// Add Paperbacks
		// ----------------
		pBooks.add(new PaperBack("I, Robot", "Isaac Asimov", 256));

		// ------------------------------------------------------------------------
		
		// ----------------
		// Generate Reports
		// ----------------
		for (AudioBook aBook : aBooks) {
			aBook.generateBookReport();
		} // end for

		for (HardCover hBook : hBooks) {
			hBook.generateBookReport();
		} // end for

		for (PaperBack pBook: pBooks) {
			pBook.generateBookReport();
		} // end for

		// ------------------------------------------------------------------------
		
		// ----------------
		// Generate List of All Authors
		// ----------------
		System.out.println("All authors:");
		for (AudioBook aBook : aBooks) {
			System.out.println("   " + aBook.getAuthor());
		} // end for

		for (HardCover hBook : hBooks) {
			System.out.println("   " + hBook.getAuthor());
		} // end for

		for (PaperBack pBook : pBooks) {
			System.out.println("   " + pBook.getAuthor());
		} // end for
		
	} // main

} // DriverMain