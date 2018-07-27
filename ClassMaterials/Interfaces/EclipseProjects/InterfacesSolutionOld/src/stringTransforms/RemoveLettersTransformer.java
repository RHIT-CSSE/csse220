package stringTransforms;

public class RemoveLettersTransformer implements TransformInterface{

	private String toRemove;

	public RemoveLettersTransformer(String toRemove) {
		this.toRemove = toRemove;
	}
	
	public String transform(String input) {
		return input.replace(toRemove, "");
	}
}
