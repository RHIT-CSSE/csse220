package polymorphism;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;

/*
 * A PoliceOfficerFace has a position, width, and hatSize which are used to
 * draw a representation on a graphics context
 */
public class PoliceOfficerFace extends Face {
	
	//This is a constant and is always the same
	private static final Color POLICE_OFFICER_HAT_COLOR = Color.BLUE;
	private static final Color POLICE_OFFICER_HAT_BUCKLE_COLOR = Color.YELLOW;

	public PoliceOfficerFace(int centerX, int centerY, int width, int hatSize) {
		super( centerX,  centerY,  width,  hatSize );
	}

	public void draw(Graphics2D g) {
		super.draw(g);
		
		//Draw Police Officer Hat
		g.setColor( POLICE_OFFICER_HAT_COLOR);
		g.translate(upperLeftX(),upperLeftY()-this.getWidth()/3);
		g.fillOval(0,0, this.getWidth(), this.getWidth()/2);
		g.setColor(  POLICE_OFFICER_HAT_BUCKLE_COLOR );
		g.fillOval( this.getWidth()/2 -this.getHatSize()/4 , 0, this.getHatSize()/2, this.getHatSize()/2);
		g.translate(-upperLeftX(),-upperLeftY()+this.getWidth()/3);
	}
	
}
