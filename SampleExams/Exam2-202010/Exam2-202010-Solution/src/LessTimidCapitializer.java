
public class LessTimidCapitializer implements LessTimidEnhancer {

	public String getDescription() {
		return "Make string all captials";
	}
	
	public String applyToString(String input) {
		return input.toUpperCase();
	}
	
}
