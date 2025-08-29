
/**
 * This is a simple data class (currently) to store a single movie
 * in the video store.  
 * 
 * @author wilkin
 *
 */
public class Movie {
	
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String title;
	private int priceCode;
	
	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}
	
	public int getPriceCode() {
		return this.priceCode;
	}
	
	public void setPriceCode(int incomingPriceCode) {
		this.priceCode = incomingPriceCode;
	}
	
	public String getTitle() {
		return this.title;
	}

}
