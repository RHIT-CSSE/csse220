import java.util.ArrayList;

public class GreaterCategorizer extends Categorizer {

	int cutoff;
	
	public GreaterCategorizer(int cutoff) {
		this.cutoff = cutoff;
	}
	
	@Override
	public boolean doTest(int number) {
		return number > cutoff;
	}

	@Override
	public String getName() {
		return ">" + cutoff;
	}

}
