import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Centipede {

	private static final int SEGMENT_DIAMETER = 40;
	private static final int DEFAULT_HEAD_X = 30;
	private static final int DEFAULT_HEAD_Y = 30;
	private static final int EYE_WIDTH = 12;
	private static final int EYE_HEIGHT = 8;
	private static final int NOSE_DIAMETER = 14;

	private int headX;
	private int headY;
	private int right;
	private int down;
	private Color[] colors;
	private double rotation;

	public Centipede() {
		headX = DEFAULT_HEAD_X;
		headY = DEFAULT_HEAD_Y;
		right = 4;
		down = 4;
		colors  = new Color[right + down - 1];
		rotation = 90;
		for(int i = 0; i < colors.length; i++) {
			colors[i] = Color.green;
		}
	}

	public Centipede(int headX, int headY, int down, int right) {
		this.headX = headX;
		this.headY = headY;
		this.right = right;
		this.down = down;
		rotation = 90;
		colors  = new Color[right + down - 1];
		for(int i = 0; i < colors.length; i++) {
			colors[i] = Color.green;
		}
	}

	public void drawOn(Graphics2D g) {

		int centerX = headX;
		int centerY = headY;
		g.setColor(colors[0]);

		g.fillOval(centerX - SEGMENT_DIAMETER / 2, centerY - SEGMENT_DIAMETER / 2, SEGMENT_DIAMETER, SEGMENT_DIAMETER);

		g.setColor(Color.red);
		g.fillOval(centerX - NOSE_DIAMETER / 2, centerY - 23, NOSE_DIAMETER, NOSE_DIAMETER);
		g.setColor(Color.black);
		g.fillOval(centerX - EYE_WIDTH / 2 - 8, centerY - 15, EYE_WIDTH, EYE_HEIGHT);
		g.fillOval(centerX - EYE_WIDTH / 2 + 8, centerY - 15, EYE_WIDTH, EYE_HEIGHT);

		centerY += SEGMENT_DIAMETER;
		for (int i = 0; i < down - 2; i++) {
			g.setColor(colors[i + 1]);
			g.fillOval(centerX - SEGMENT_DIAMETER / 2, centerY - SEGMENT_DIAMETER / 2, SEGMENT_DIAMETER,
					SEGMENT_DIAMETER);
			centerY += SEGMENT_DIAMETER;
		}
		g.translate(centerX, centerY);
		int oldCenterX = centerX;
		int oldCenterY = centerY;
		centerX = 0;
		centerY = 0;
		g.rotate(Math.toRadians(90 - this.rotation));
		for (int i = 0; i < right; i++) {
			
			g.setColor(colors[i - 1 + down]);
			g.fillOval(centerX - SEGMENT_DIAMETER / 2, centerY - SEGMENT_DIAMETER / 2, SEGMENT_DIAMETER,
					SEGMENT_DIAMETER);
			centerX += SEGMENT_DIAMETER;
		}
		g.rotate(-Math.toRadians(90 - this.rotation));
		g.translate(-oldCenterX, - oldCenterY);
	}

	public void setColor(Color color, int segment) {
		colors[segment - 1] = color;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
		
	}

}
