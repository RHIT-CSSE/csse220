package stringTransforms;

public class RepeatTransformer implements TransformInterface{

	public String transform(String input) {
		return input + input;
	}
}
