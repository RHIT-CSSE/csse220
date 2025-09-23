//package hourtimer;
//import java.awt.Graphics2D;
//
//
//public class HourTimer {
//	public static final int DEFAULT_RADIUS = 300;
//	public static final int DEFAULT_CENTER_X = 300;
//	public static final int DEFAULT_CENTER_Y = 300;
//	public static final double RATIO_OF_HAND_LENGTH_TO_RADIUS = .9;
//	public static final double RATIO_OF_HAND_WIDTH_TO_RADIUS = .1;
//
//	private int radius;
//	private int centerX;
//	private int centerY;
//	private double rotationFactor;
//
//	//
//	// ****************************************************************************************
//	//
//
//	public HourTimer() {
//		this.radius = DEFAULT_RADIUS;
//		this.centerX = DEFAULT_CENTER_X;
//		this.centerY = DEFAULT_CENTER_Y;
//		this.rotationFactor = 0;
//	} // HourTimer
//
//	//
//	// ****************************************************************************************
//	//
//
//	public HourTimer(int centerX, int centerY, int radius) {
//		this.centerX = centerX;
//		this.centerY = centerY;
//		this.radius = radius;
//		this.rotationFactor = 0;
//	} // HourTimer
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: when called by paintComponent, this draws the hour timer
//	 *
//	 * @param g2d the graphics object to draw on
//	 */
//	public void drawOn(Graphics2D g2d) {
//		g2d.translate(this.centerX, this.centerY);
//		g2d.rotate(this.rotationFactor);
//		g2d.drawOval(-this.radius, -this.radius, this.radius*2, this.radius*2);
//		int handLength = (int) (this.radius * RATIO_OF_HAND_LENGTH_TO_RADIUS);
//		double handWidthOffset = (int) (this.radius * 0.5 * RATIO_OF_HAND_WIDTH_TO_RADIUS);
//
//		g2d.drawRect((int) -handWidthOffset, -handLength, (int) (handWidthOffset*2), handLength);
//		g2d.rotate(-this.rotationFactor);
//		g2d.translate(-this.centerX, -this.centerY);
//	} // drawOn
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: sets the minute hand of the clock
//	 * <br>At 0/60 puts the hand facing upwards (north)
//	 * <br>At 30 puts the hand facing south
//	 *
//	 * @param minutes the number of minutes to represent with rotation
//	 */
//	public void setTime(double minutes) {
//		this.rotationFactor = (minutes/60)*2*Math.PI;
//	} // setTime
//
//} // HourTimer
