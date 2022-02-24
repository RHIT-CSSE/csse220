
public class PolymorphismMain {

	public static void main(String[] args) {
		IsOddCategorizer odd = new IsOddCategorizer();
		IsPrimeCategorizer prime = new IsPrimeCategorizer();
		GreaterCategorizer greater = new GreaterCategorizer(20);
		
		for(int i = 1; i < 30; i++) {
			odd.addNumber(i);
			prime.addNumber(i);
			greater.addNumber(i);
		}
		
		odd.displaySummary();
		System.out.println();
		prime.displaySummary();
		System.out.println();
		greater.displaySummary();

	}

}
