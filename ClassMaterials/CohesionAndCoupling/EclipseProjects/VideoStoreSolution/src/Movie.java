
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
	private static final double REGULAR_PRICE = 2.0;
	private static final double NEW_RELEASE_PRICE = 3.0;
	private static final double CHILDRENS_MOVIE_PRICE = 1.5;
	private static final double ADDITIONAL_DAY_PRICE = 1.5;
	
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
	
	public double getCharge(int daysRented) {
		double result = 0.0;
		
		//Determine amounts for each line
		switch(this.priceCode) {
			case REGULAR:  	  //REGULAR_PRICE for 2 day rental, and ADDITIONAL_DAY_PRICE for each additional day
				result +=  REGULAR_PRICE;
				if(daysRented > 2)
					result += (daysRented - 2) * ADDITIONAL_DAY_PRICE;
				break;
			case NEW_RELEASE: //NEW_RELEASE_PRICE per day
				result += daysRented * NEW_RELEASE_PRICE;
				break;
			case CHILDRENS:   //CHILDRENS_MOVIE_PRICE for 3 day rental, and ADDITIONAL_DAY_PRICE for each additional day
				result += CHILDRENS_MOVIE_PRICE;
				if(daysRented > 3)
					result += (daysRented - 3) * ADDITIONAL_DAY_PRICE;
				break;
		}//end switch
		
		return result;
	}
	
	public boolean isNewRelease() {
		return priceCode == NEW_RELEASE;
	}
	
	

}