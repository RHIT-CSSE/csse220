/**
 * This class represents a customer renting a movie.
 * 
 * @author wilkin
 *
 */
public class Rental {
	
	private Movie movie;
	private int daysRented;
	
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return this.daysRented;
	}
	public int getFrequentRenterPoints() {
		// add bonus for a two day new release rental
		if(this.movie.isNewRelease() && daysRented > 1)
			return 2;
		else
			return 1;
	}
	
	public String toString() {
		return this.movie.getTitle() + "\t" + String.format("%.2f", getCharge());
	}

	public double getCharge() {
		return movie.getCharge(daysRented);
	}

}
