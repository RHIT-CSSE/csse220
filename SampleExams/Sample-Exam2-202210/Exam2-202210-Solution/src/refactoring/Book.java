package refactoring;

public abstract class Book {
	protected String title;
	protected String author;
	protected String borrowerName;
	
	// ------------------------------------------------------------------------
	
	public Book() {
	} // Book

	// ------------------------------------------------------------------------
	
	abstract public void generateBookReport();

	// ------------------------------------------------------------------------

	public String getTitle() {
		return this.title;
	} // getTitle

	// ------------------------------------------------------------------------

	public String getAuthor() {
		return this.author;
	} // getAuthor

	// ------------------------------------------------------------------------

	public String getBorrowerName() {
		return this.borrowerName;
	} // getBorrowerName

	// ------------------------------------------------------------------------

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	} // setBorrowerName
} // Book