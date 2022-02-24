
public class LessTimidAddCharacters {

	private String toAdd;
	
	public LessTimidAddCharacters(String toAdd) {
		this.toAdd = toAdd;
	}
	
	public String getDescription() {
		return "Adds '" + toAdd + "'to the end";
	}
	
	public String applyToString(String input) {
		return input + toAdd;
	}
	
}
