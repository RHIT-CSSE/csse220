package translateRotate;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Component on which to display HourTimer instances.
 *
 */
public class TranslateComponent extends JComponent {
	private static final long serialVersionUID = -6756542264207468094L;
	
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
		
		// =======
		// TODO #1
		// Use a translate command to ensure that the face always appears in the center of the window
		// 
		// HINT: 
		// Use this.getWidth() and this.getHeight() to find the correct (x, y) location to translate to
		// =======
		g2d.translate(this.getWidth()/2, this.getHeight()/2 );

		// =======
		// This code (below) draws a face, with upper left hand corner (x, y) = (0, 0) you do not need to edit this code
		// =======
		int faceLocX = 0;
		int faceLocY = 0;
		int faceWidth = 200;
		int faceHeight = 150;

		g2d.translate(-faceWidth/2, -faceHeight/2);
		// To make drawing centered around the face's center, you'll need to
		// change the face's (x, y) drawing location, i.e., the first 2 parameters in the drawRect (below)
		// Then you'll have to make appropriate changes to the (x, y) coordinates for the left eye, right eye, and nose (below)
		g2d.drawRect(faceLocX, faceLocY, faceWidth, faceHeight);
		
		// Draw left eye
		int leftEyeLocX = 20;
		int leftEyeLocY = 20;
		int eyeWidth = 50;
		int eyeHeight = 50;
		g2d.drawRect(leftEyeLocX, leftEyeLocY, eyeWidth, eyeHeight);
		
		// Draw right eye		
		int rightEyeLocX = 130;
		int rightEyeLocY = 20;
		g2d.drawRect(rightEyeLocX, rightEyeLocY, eyeWidth, eyeHeight);
		
		// Draw nose		
		int noseLocX = 80;
		int noseLocY = 50;
		int noseWidth = 40;
		int noseHeight = 50;
		g2d.drawRect(noseLocX, noseLocY, noseWidth, noseHeight);
	
		g2d.translate(faceWidth/2, faceHeight/2);
		g2d.translate(-this.getWidth()/2, -this.getHeight()/2 );
		g2d.drawRect(10,10,10,10);
		
		
		// =======
		// TODO #2
		// Use a translate command to undo the translate done above in TODo #1
		// 
		// HINT: 
		// Use the negative of the (x, y) coordinates you computed in TODO #1
		// 		
		// WARNING: 
		// Be sure to always undo any translate you've done
		// =======
		
	} // paintComponent
	
	
}
