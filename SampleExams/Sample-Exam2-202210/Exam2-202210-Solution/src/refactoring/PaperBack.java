package refactoring;

public class PaperBack extends Book {
	private int lengthPages;

	// ------------------------------------------------------------------------
	
	public PaperBack(String title, String author, int lengthPages) {
		super();
		this.title = title;
		this.author = author;
		this.borrowerName = "";
		this.lengthPages = lengthPages;
	} // PaperBack

	// ------------------------------------------------------------------------

	public void generateBookReport() {
		String statusMsg = "";
		
		System.out.printf("|%.50s|\n", "+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.printf("|%.50s|\n", "+ Hard Cover Book +++++++++++++++++++++++++++");
		System.out.printf("|%.50s|\n", "                                             ");
		System.out.printf("|    Title: %-33s |\n", this.title);
		System.out.printf("|   Author: %-33s |\n", this.author);
		System.out.printf("|    Pages: %-33d |\n", this.lengthPages);
		if (this.borrowerName.equals("")) {
			statusMsg = "Checked in";		
		} else {
			statusMsg = "Checked out to " + this.borrowerName;		
		} // end if		
		System.out.printf("|   Status: %-33s |\n", statusMsg);
		System.out.printf("|%.50s|\n", "                                             ");
		System.out.printf("|%.50s|\n", "+ End Report ++++++++++++++++++++++++++++++++");
		System.out.printf("|%.50s|\n\n\n", "+++++++++++++++++++++++++++++++++++++++++++++");
	} // generateBookReport
	
	// ------------------------------------------------------------------------

	public int getLengthPages() {
		return lengthPages;
	} // getLengthPages
	
} // SurfaceBook
