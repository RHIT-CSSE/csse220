import java.util.ArrayList;

public class IsOddCategorizer extends Categorizer {

	@Override
	public boolean doTest(int number) {
		return number % 2 == 1;
	}

	@Override
	public String getName() {
		return "Odd";
	}
}
