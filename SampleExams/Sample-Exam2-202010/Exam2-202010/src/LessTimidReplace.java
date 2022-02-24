
public class LessTimidReplace {

	private String from;
	private String to;
	
	public LessTimidReplace(String from, String to) {
		this.from = from;
		this.to = to;
	}
	
	public String getDescription() {
		return "Replaces '" + from + "' with '" + to + "'";
	}
	
	public String applyToString(String input) {
		return input.replace(from, to);
	}
	
}

