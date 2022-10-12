package refactoring;


public class HardCover {
	private String title;
	private String author;
	private int lengthPages;
	private String borrowerName;

	// ------------------------------------------------------------------------

	public HardCover(String title, String author, int lengthPages) {
		this.title = title;
		this.author = author;
		this.lengthPages = lengthPages;
		this.borrowerName = "";
	} // HardCover

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

	public String getTitle() {
		return this.title;
	} // getTitle

	// ------------------------------------------------------------------------

	public String getAuthor() {
		return this.author;
	} // getAuthor

	// ------------------------------------------------------------------------

	public int getLengthPages() {
		return lengthPages;
	} // getLengthPages

	// ------------------------------------------------------------------------

	public String getBorrowerName() {
		return this.borrowerName;
	} // getBorrowerName

	// ------------------------------------------------------------------------

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	} // setBorrowerName

} // HardCover
