package polymorphism;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;

/*
 * A FirefighterFace has a position, width, and hatSize which are used to
 * draw a representation on a graphics context
 */
public class FirefighterFace extends Face {
	
	//This is a constant and is always the same
	private static final Color FIREFIGHTER_HAT_COLOR = Color.RED;

	public FirefighterFace(int centerX, int centerY, int width, int hatSize) {
		super( centerX,  centerY,  width,  hatSize );
	}
	
	// Draws a large circle for the outline of a face
	// then draws two black eyes
	// finally draws a smile
	public void draw(Graphics2D g) {
		super.draw(g);
		
		//Draw Firefighter Hat
		g.setColor (FIREFIGHTER_HAT_COLOR );
		g.fillRect(upperLeftX(),upperLeftY()-this.getHatSize()/2, this.getWidth(), this.getHatSize());
		g.fillRect(upperLeftX()+this.getWidth()/2 - this.getHatSize()/2,upperLeftY()- this.getHatSize()*3/2, this.getHatSize(), this.getHatSize());

	}


}
