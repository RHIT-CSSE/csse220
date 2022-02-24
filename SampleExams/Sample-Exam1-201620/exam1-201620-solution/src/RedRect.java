import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class RedRect {

	private int x,y,width,height;
	
	public RedRect(int x, int y, int x2, int y2) {
		this.x = x;
		this.y = y;
		this.width = x2 - x;
		this.height = y2 - y;
	}

	public RedRect() {
		Random r = new Random();
		this.x = r.nextInt(400);
		this.y = r.nextInt(400);
		this.width = r.nextInt(100);
		this.height = r.nextInt(100);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void draw(Graphics2D g2) {
		g2.setColor(Color.red);
		g2.fillRect(x, y, width, height);
		g2.setColor(Color.black);
	}

}
