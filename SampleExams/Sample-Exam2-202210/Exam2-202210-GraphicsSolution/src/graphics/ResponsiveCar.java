package graphics;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 * This class represents a draw-able Turtle which has operations to move forward
 * and turn around. In its full form it can also selectively leave trails behind
 * it.
 * 
 * @author YOUR_NAME
 *
 */
public class ResponsiveCar {

	// ------
	// Provided CONSTANTS
	// ------
	private static final int DEFAULT_SIZE = 100;
	private static final int DEFAULT_CENTER_X = 200;
	private static final int DEFAULT_CENTER_Y = 200;
	public static final String imgFilename = "img/car.png";

	// ------
	// Provided instance variables
	// ------
	private BufferedImage carImage;
	private int centerX;
	private int centerY;
	private int angle = 0;

	// ------
	// TODO: Add instance variables as needed
	// ------
	
	//////////////////////////////////////////////
	// Part 3
	private ArrayList<Line2D> carTrails = new ArrayList<Line2D>();
	//////////////////////////////////////////////
	
	//
	// ************************************************************************
	//
	
	// You do NOT need to be modify this method
	/**
	 * ensures image returned is a vertical flip of incomingImage
	 * @param incomingImage
	 * @return a vertically flipped version of incomingImage
	 */
	private BufferedImage verticalFlip(BufferedImage incomingImage) {
        int width = incomingImage.getWidth();
        int height = incomingImage.getHeight();
        BufferedImage flippedImage = new BufferedImage(width, height, incomingImage.getColorModel().getTransparency());
        Graphics2D g = flippedImage.createGraphics();
        g.drawImage(incomingImage, 0, 0, width, height, 0, height, width, 0, null);
        g.dispose();
        return flippedImage;
    } // verticalFlip
	
	//
	// ************************************************************************
	//
	
	// This constructor does NOT need to be modified
	public ResponsiveCar() {
		this(DEFAULT_CENTER_X, DEFAULT_CENTER_Y);
	} // ReactiveTurtle
	
	//
	// ************************************************************************
	//
	
	// This constructor does NOT need to be modified
	public ResponsiveCar(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
		try {
			this.carImage = ImageIO.read(new File(imgFilename));
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // ResponsiveCar
	
	//
	// ************************************************************************
	//
	
	// TODO: You may want to add or modify this code
	public void drawOn(Graphics2D g2d) {
		drawCar(g2d);
		
		//////////////////////////////////////////////
		// Part 3
		drawTrails(g2d);
		//////////////////////////////////////////////
	} // drawOn
	
	//
	// ************************************************************************
	//
	
	// TODO: You may want to add or modify this code
	public void moveForward(int distance) {		
		//////////////////////////////////////////////
		// Part 3
		int prevCenterX = this.centerX;
		int prevCenterY = this.centerY;
		//////////////////////////////////////////////
		
		// Provided code you do not need to change this code
		this.centerX += (int) (distance * Math.cos(Math.toRadians(angle)));
		this.centerY += (int) (distance * Math.sin(Math.toRadians(angle)));
		// END provided code

		carTrails.add(new Line2D.Double(prevCenterX, prevCenterY, centerX, centerY));
	} // moveForward
	
	//
	// ************************************************************************
	//
	
	// You do NOT need to be modify this method
	public void turn(int angle) {
		this.angle = this.angle + angle;
	} // turn
	
	//
	// ************************************************************************
	//
	
	// You do NOT need to be modify this method
	public void setDirection(int angle) {
		this.angle = angle;
	} // setDirection
	
	//
	// ************************************************************************
	//
	
	// You do NOT need to be modify this method
	private void drawCar(Graphics2D g2d) {
		// ------
		// Provided code - you do not need to change this code, but you can if you want
		// ------

		// this method ensure you do not need to untranslate/unrotate at then end of this method
		g2d = (Graphics2D) g2d.create();		

		BufferedImage imageToDraw = this.carImage;
		if (this.angle == 180) {
			imageToDraw = this.verticalFlip(this.carImage);
		} // end if
		g2d.translate(this.centerX, this.centerY);
		g2d.rotate(Math.toRadians(this.angle));
		g2d.drawImage(imageToDraw, -(DEFAULT_SIZE/2), -(DEFAULT_SIZE/2), DEFAULT_SIZE, DEFAULT_SIZE, null);
	} // drawCar
	
	//
	// ************************************************************************
	//
	
	
	//////////////////////////////////////////////
	//Part 3
	private void drawTrails(Graphics2D g2d) {
		for (Line2D line : this.carTrails) {
			int x1 = (int) line.getX1();
			int y1 = (int) line.getY1();
			int x2 = (int) line.getX2();
			int y2 = (int) line.getY2();
			g2d.drawLine(x1, y1, x2, y2);
		} // end for

	} // drawTrails
	//////////////////////////////////////////////

}
