package paper;

public class Recursion {

	public static int mystery(int x) {
		if (x <= 0) {
			return 0;
		}
		boolean isEven = (x % 2 == 0);
		if (isEven) {
			return mystery(x / 2) * 2;
		} else {
			return mystery(x - 5) + 5;
		}
	}

	public static void main(String[] args) {
		System.out.println(mystery(11));
	}

}
