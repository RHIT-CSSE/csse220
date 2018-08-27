package polymorphism;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;

/*
 * A PoliceOfficerFace has a position, width, and hatSize which are used to
 * draw a representation on a graphics context
 */
public class PoliceOfficerFace  {
	
	//Center of the face 
	int centerX;
	int centerY;
	//width of the face
	private int width;
	//diameter of eyes 
	int eyeSize;
	//determines the dimensions of the hat drawn
	private int hatSize;
	
	//should stay fixed at 1/10 of the width
	private static final int EYE_TO_WIDTH_RATIO = 10;
	
	//This is a constant and is always the same
	private static final Color POLICE_OFFICER_HAT_COLOR = Color.BLUE;
	private static final Color POLICE_OFFICER_HAT_BUCKLE_COLOR = Color.YELLOW;

	public PoliceOfficerFace(int centerX, int centerY, int width, int hatSize) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.width = width;
		this.eyeSize = width /10;
		this.hatSize = hatSize;
	}
	
	//return the size of the Firefighter's hat
	public int getHatSize() {
		return this.hatSize;
	}
	
	//set the size of the Police Officer's hat
	public void setHatSize(int size) {
		this.hatSize = size;
	}
	
	//Shift the relative position of the face by 
	//and x and y amount
	public void move( int x, int y) {
		this.centerX += x;
		this.centerY += y;
	}
	
	//the X coordinate for the upper left corner of the bounding rectangle
	//of the circle defining the outline of the face
	public int upperLeftX() {
		return this.centerX - this.getWidth()/2;
	}
	
	//the Y coordinate for the upper left corner of the bounding rectangle
	//of the circle defining the outline of the face
	public int upperLeftY() {
		return this.centerY - this.getWidth()/2;
	}
	
	// Draws a large circle for the outline of a face
	// then draws two black eyes
	// finally draws a smile
	public void draw(Graphics2D g) {
		//***************************
		//START DRAWING FACE
		//draw outline of face
		g.setColor(Color.BLACK);
		g.drawOval(upperLeftX(),upperLeftY(), this.getWidth(), this.getWidth());
		//draw eyes
		g.fillOval(upperLeftX() + this.eyeSize*3 ,upperLeftY() + this.eyeSize*3, this.eyeSize, this.eyeSize);
		g.fillOval(upperLeftX() + this.getWidth() - this.eyeSize*4 ,upperLeftY() + this.eyeSize*3, this.eyeSize, this.eyeSize);
		//draw smile
		Arc2D.Double smile = new Arc2D.Double(upperLeftX()+this.getWidth()/10, upperLeftY(), this.getWidth()*8/10, this.getWidth()*8/10, 200, 140, Arc2D.OPEN);
		g.draw( smile);
		// STOP DRAWING FACE
		//***************************
		
		//Draw Police Officer Hat
		g.setColor( POLICE_OFFICER_HAT_COLOR);
		g.translate(upperLeftX(),upperLeftY()-this.getWidth()/3);
		g.fillOval(0,0, this.getWidth(), this.getWidth()/2);
		g.setColor(  POLICE_OFFICER_HAT_BUCKLE_COLOR );
		g.fillOval( this.getWidth()/2 -this.getHatSize()/4 , 0, this.getHatSize()/2, this.getHatSize()/2);
		g.translate(-upperLeftX(),-upperLeftY()+this.getWidth()/3);
	}
	
	//return the width of the face
	public int getWidth() {
		return width;
	}
	
}
