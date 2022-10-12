package refactoring;


public class AudioBook {
	private String title;
	private String author;
	private String narrator;
	private int lengthMinutes;
	private String borrowerName;

	// ------------------------------------------------------------------------
	
	public AudioBook(String title, String author, String narrator, int lengthMinutes) {
		this.title = title;
		this.author = author;
		this.narrator = narrator;
		this.lengthMinutes = lengthMinutes;
		this.borrowerName = "";
	} // AudioBook

	// ------------------------------------------------------------------------

	public void generateBookReport() {
		String borrowStatus = "";
		String length = "";
		
		
		System.out.printf("|%.50s|\n", "+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.printf("|%.50s|\n", "+ Audiobook +++++++++++++++++++++++++++++++++");
		System.out.printf("|%.50s|\n", "                                             ");
		System.out.printf("|    Title: %-33s |\n", this.title);
		System.out.printf("|   Author: %-33s |\n", this.author);
		System.out.printf("| Narrator: %-33s |\n", this.narrator);
		length = this.lengthMinutes/60 + " hours " + this.lengthMinutes % 60 + " minutes";
		System.out.printf("|   Length: %-33s |\n", length);
		if (this.borrowerName.equals("")) {
			borrowStatus = "Checked in";		
		} else {
			borrowStatus = "Checked out to " + this.borrowerName;		
		} // end if		
		System.out.printf("|   Status: %-33s |\n", borrowStatus);
		System.out.printf("|%.50s|\n", "                                             ");
		System.out.printf("|%.50s|\n", "+ End Report ++++++++++++++++++++++++++++++++");
		System.out.printf("|%.50s|\n\n\n", "+++++++++++++++++++++++++++++++++++++++++++++");
	} // generateBookReport

	// ------------------------------------------------------------------------

	public String getTitle() {
		return this.title;
	} // getTitle
	
	// ------------------------------------------------------------------------

	public String getAuthor() {
		return this.author;
	} // getAuthor
	
	// ------------------------------------------------------------------------

	public String getNarrator() {
		return this.narrator;
	} // getNarrator

	// ------------------------------------------------------------------------

	public int getLengthMinutes() {
		return this.lengthMinutes;
	} // getLengthMinutes

	// ------------------------------------------------------------------------

	public String getBorrowerName() {
		return this.borrowerName;
	} // getBorrowerName

	// ------------------------------------------------------------------------

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	} // setBorrowerName

} // AudioBook
