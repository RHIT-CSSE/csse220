package paper;

public class RecursionHard {

	public static void mystery(String[] s, int x, int y) {
		if (x == y) {
			System.out.print(s[x] + " ");
			return;
		}
		int z = (x+y) / 2;
		mystery(s, x, z);
		mystery(s, z + 1, y);
	}

	public static void main(String[] args) {
		String[] s = new String[] { 
			"!",
			"again", 
			"world",
			"hello"
		};
		mystery(s, 0, 3);
	}

}
