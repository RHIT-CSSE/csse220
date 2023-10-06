package translateRotate;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Component on which to display HourTimer instances.
 *
 */
public class RotateComponent extends JComponent {
	private static final long serialVersionUID = 8417160389516538357L;
	
	//
	// ****************************************************************************************
	//

	/**
	 * ensures: calls all the draw operations to get the face drawn when invoked by Java Swing
	 * @param g treats 'g' as a Graphics2D
	 */
	@Override
	protected void paintComponent(Graphics g) {		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;		
		
		g2d.translate(200,200);
		
		// =======
		// Note #1		
		// Drawing a Rect at g2d's (0, 0) so you can see the initial position of the face without rotation
		// =======
		int rectWidth = 200;
		int rectHeight = 150;
		int rectLocX = 0;
		int rectLocY = 0;
		Color incomingColor = g2d.getColor();
		g2d.setColor(Color.PINK);
		g2d.drawRect(rectLocX, rectLocY, rectWidth, rectHeight);
		// Reset g2d's color back to its original incoming color
		g2d.setColor(incomingColor);


		// =======
		// TODO #1: 
		// Play with rotation by changing 'degreesToRotate' (below) so you get a feel how it works
		// =======
		
		// =======
		// TODO #2: Modify the code so that it rotates around the center of the face, 
		// rather than the face's upper left corner
		//
		// HINT 1: 
		// You'll have to adjust the drawing code
		// In particular, you'll have to change the face's (x, y) drawing coordinates
		// See slide from class on how to center an object 
		// 
		// HINT 2: 
		// You may have to adjust the translate or the Pink rectangle too
		// =======
		g2d.translate(100, 75 );
		
		double degreesToRotate = this.getWidth();
		g2d.rotate(Math.toRadians(degreesToRotate));

		g2d.translate(-100, -75 );
		
		// =======
		// Draws a face, with upper left hand corner at (x, y) = (0, 0) you need to edit this code for TODO #2
		// =======
		int faceWidth = 200;
		int faceHeight = 150;
		int faceLocX = 0;
		int faceLocY = 0;
		// To make drawing centered around the face's center, you'll need to
		// change the face's (x, y) drawing location, i.e., the first 2 parameters in the drawRect (below)
		// Then you'll have to make appropriate changes to the (x, y) coordinates for the left eye, right eye, and nose (below)
		g2d.drawRect(faceLocX, faceLocY, faceWidth, faceHeight);
		
		// Draw left eye
		int eyeWidth = 50;
		int eyeHeight = 50;
		int leftEyeLocX = 20;
		int leftEyeLocY = 20;
		g2d.drawRect(leftEyeLocX, leftEyeLocY, eyeWidth, eyeHeight);
		
		// Draw right eye		
		int rightEyeLocX = 130;
		int rightEyeLocY = 20;
		g2d.drawRect(rightEyeLocX, rightEyeLocY, eyeWidth, eyeHeight);
		
		// Draw nose	
		int noseWidth = 40;
		int noseHeight = 50;	
		int noseLocX = 80;
		int noseLocY = 60;
		g2d.drawRect(noseLocX, noseLocY, noseWidth, noseHeight);
		
		// WARNING: be sure to always undo any rotations & translations you may have done
		// Do these in reverse order 
		
		g2d.translate(100, 75 );
		
		
		g2d.rotate(-Math.toRadians(degreesToRotate));
		
		
		g2d.translate(-100, -75 );
		
		g2d.translate(-200, -200);
		
		
		g2d.drawRect(10,10,10,10);
		
		
		
	} // RotateComponent	
	
}
