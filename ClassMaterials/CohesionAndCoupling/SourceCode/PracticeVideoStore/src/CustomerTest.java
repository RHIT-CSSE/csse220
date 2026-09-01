import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * This example is from Martin Fowler's Refactoring: Improving the Design of Existing Code.
 * 
 * @author Matt Boutell
 *
 */


public class CustomerTest {

	private Customer bob;
	private Customer mary;
	private Rental rental1;
	private Rental rental2;
	private Rental rental3;
	private Movie movie1;
	private Movie movie2;
	private Movie movie3;
	
	@Before
	public void setUp() throws Exception {
		this.bob = new Customer("Bob");
		this.mary = new Customer("Mary");
		this.movie1 = new Movie("Star Wars Episode 7", Movie.NEW_RELEASE);
		this.movie2 = new Movie("Fellowship of the Ring", Movie.REGULAR);
		this.movie3 = new Movie("The Lion, the Witch, and the Wardrobe", Movie.CHILDRENS);
		this.rental1 = new Rental(this.movie1, 10);
		this.rental2 = new Rental(this.movie2, 2);
		this.rental3 = new Rental(this.movie3, 3);
	}

	@Test
	public void testGetName() {
		assertEquals("Bob", bob.getName());
		assertEquals("Mary", mary.getName());
	}

	@Test
	public void testGetFrequentRenterPoints() {
		// CONSIDER: someday
	}

	@Test
	public void testIncreaseFrequentRenterPoints() {
		// CONSIDER: someday	
	}

	@Test
	public void testStatementWithAddRental() {
		this.bob.addRental(this.rental1);
		String expected = "Rental Record for Bob\n\tStar Wars Episode 7	30.00\nAmount owed is 30.00\nYou earned 2 frequent renter points";
		assertEquals(expected, this.bob.statement());
		
		this.bob.addRental(this.rental2);
		expected = "Rental Record for Bob\n\tStar Wars Episode 7	30.00\n\tFellowship of the Ring	2.00\nAmount owed is 32.00\nYou earned 3 frequent renter points";
		assertEquals(expected, this.bob.statement());

		this.mary.addRental(this.rental3);
		expected = "Rental Record for Mary\n\tThe Lion, the Witch, and the Wardrobe	1.50\nAmount owed is 1.50\nYou earned 1 frequent renter points";
		assertEquals(expected, this.mary.statement());
	}
}
