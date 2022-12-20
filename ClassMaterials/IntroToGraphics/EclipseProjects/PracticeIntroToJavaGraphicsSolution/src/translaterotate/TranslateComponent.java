package translaterotate;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Component on which to display a translated face
 *
 */
public class TranslateComponent extends JComponent {
	private static final long serialVersionUID = 1L;
	
	//
	// ****************************************************************************************
	//

	/**
	 * ensures: Draws the face on g2d 
	 * @param g2d the graphics object to draw on
	 */
	private void drawFace(Graphics2D g2d) {
		int faceLocX = 0;
		int faceLocY = 0;
		int faceWidth = 200;
		int faceHeight = 150;
		g2d.drawRect(faceLocX, faceLocY, faceWidth, faceHeight);
	} // drawFace
	
	//
	// ****************************************************************************************
	//

	/**
	 * ensures: Draws the left eye on g2d 
	 * @param g2d the graphics object to draw on
	 */
	private void drawLeftEye(Graphics2D g2d) {
		int leftEyeLocX = 20;
		int leftEyeLocY = 20;
		int eyeWidth = 50;
		int eyeHeight = 50;
		g2d.drawRect(leftEyeLocX, leftEyeLocY, eyeWidth, eyeHeight);
	} // drawLeftEye

	//
	// ****************************************************************************************
	//

	/**
	 * ensures: Draws the right eye on g2d 
	 * @param g2d the graphics object to draw on
	 */
	private void drawRightEye(Graphics2D g2d) {
		int rightEyeLocX = 130;
		int rightEyeLocY = 20;
		int eyeWidth = 50;
		int eyeHeight = 50;
		g2d.drawRect(rightEyeLocX, rightEyeLocY, eyeWidth, eyeHeight);		
	} // drawRightEye
	
	//
	// ****************************************************************************************
	//

	/**
	 * ensures: Draws the nose eye on g2d 
	 * @param g2d the graphics object to draw on
	 */
	private void drawNose(Graphics2D g2d) {
		int noseLocX = 80;
		int noseLocY = 50;
		int noseWidth = 40;
		int noseHeight = 50;
		g2d.drawRect(noseLocX, noseLocY, noseWidth, noseHeight);		
	} // drawNose

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
		
		int xOffset = getWidth()/2 - 100;
		int yOffset = getHeight()/2 - 75;
		g2d.translate(xOffset, yOffset);
		
		this.drawFace(g2d);
		this.drawLeftEye(g2d);
		this.drawRightEye(g2d);
		this.drawNose(g2d);
		
		g2d.translate(-xOffset, -yOffset);
	} // paintComponent	
	
} // end class TranslateComponent
