import java.math.BigInteger;
import java.util.ArrayList;

public class IsPrimeCategorizer extends Categorizer {

	@Override
	public boolean doTest(int number) {
		return BigInteger.valueOf(number).isProbablePrime(15);
	}

	@Override
	public String getName() {
		return "Prime";
	}
}
