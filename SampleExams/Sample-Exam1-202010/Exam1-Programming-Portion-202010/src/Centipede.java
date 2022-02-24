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

	// add whatever new fields, methods, constructors you need to
	
	
	public void drawOn(Graphics2D g) {

		// modify this code however you need to
		
		int centerX = DEFAULT_HEAD_X;
		int centerY = DEFAULT_HEAD_Y;
		g.setColor(Color.green);

		g.fillOval(centerX - SEGMENT_DIAMETER / 2, centerY - SEGMENT_DIAMETER / 2, SEGMENT_DIAMETER, SEGMENT_DIAMETER);

		g.setColor(Color.red);
		g.fillOval(centerX - NOSE_DIAMETER / 2, centerY - 23, NOSE_DIAMETER, NOSE_DIAMETER);
		g.setColor(Color.black);
		g.fillOval(centerX - EYE_WIDTH / 2 - 8, centerY - 15, EYE_WIDTH, EYE_HEIGHT);
		g.fillOval(centerX - EYE_WIDTH / 2 + 8, centerY - 15, EYE_WIDTH, EYE_HEIGHT);

		
	}

}
