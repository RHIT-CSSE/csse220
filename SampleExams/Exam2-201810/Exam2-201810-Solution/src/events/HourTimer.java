package events;
import java.awt.Graphics2D;

/**
 * You should not need to modify this class in any way.
 * Just how the clock face gets drawn;
 * 
 * @author hewner
 *
 */
public class HourTimer {

	
	public static final int DEFAULT_RADIUS = 300;
	public static final int DEFAULT_CENTER_X = 300;
	public static final int DEFAULT_CENTER_Y = 300;
	public static final double RATIO_OF_HAND_LENGTH_TO_RADIUS = .9;
	public static final double RATIO_OF_HAND_WIDTH_TO_RADIUS = .1;
	
	private int radius;
	private int centerX;
	private int centerY;
	private double rotation;
	
	public HourTimer() {
		this.radius = DEFAULT_RADIUS;
		this.centerX = DEFAULT_CENTER_X;
		this.centerY = DEFAULT_CENTER_Y;
		this.rotation = 0;
	}
	
	public HourTimer(int centerX, int centerY, int radius) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.rotation = 0;
	}

	public void drawOn(Graphics2D g) {
		g.translate(this.centerX, this.centerY);
		g.rotate(this.rotation);
		g.drawOval(-this.radius, -this.radius, this.radius*2, this.radius*2);
		int handLength = (int) (this.radius * RATIO_OF_HAND_LENGTH_TO_RADIUS);
		double handWidthOffset = (int) (this.radius * 0.5 * RATIO_OF_HAND_WIDTH_TO_RADIUS);
		
		g.drawRect((int) -handWidthOffset, -handLength, (int) (handWidthOffset*2), handLength);
		g.rotate(-this.rotation);
		g.translate(-this.centerX, -this.centerY);
	}
	
	/**
	 * 
	 * Set time sets the position of the hand of the clock.
	 * 0/12 puts the hand facing upwards.
	 * 6 puts the hand facing downwards, etc.  
	 * 
	 * @param minutes the number of minutes to represent with rotation
	 */
	public void setHour(double hour) {
		this.rotation = (hour/12)*2*Math.PI; 
	}
	
}
