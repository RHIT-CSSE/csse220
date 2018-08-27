package gravity;

public class FastRect extends GravityRect {

	public FastRect(int x, int y) {
		super(x, y);
	}
	
	public int dropSpeed() {
		return super.dropSpeed()*3;
	}
}
