package stringTransforms;

public class UppercaseTransformer implements TransformInterface {

	public String transform(String input) {
		return input.toUpperCase();
	}
}
