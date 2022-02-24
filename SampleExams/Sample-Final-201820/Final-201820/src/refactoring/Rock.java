package refactoring;

public class Rock {

	int dy;
	public int[] position;

	public Rock(int[] position) {
		super();
		this.dy = 1;
		this.position = position;
	}

	public void fall() {
		this.position[1] += dy;
		System.out.println("Rock is falling " + dy);
	}

	public void reverseGravity() {
		this.dy *= -1;
		System.out.println("dy is now " + this.dy);
	}

}
