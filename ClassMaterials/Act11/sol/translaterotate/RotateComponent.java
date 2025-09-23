//package translaterotate;
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import javax.swing.JComponent;
//
///**
// * Component on which to display a rotated face
// *
// */
//public class RotateComponent extends JComponent {
//	private static final long serialVersionUID = 1L;
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: draws a Rect on g2d centered around the g2d's (0, 0) so you can see the initial position of the face without rotation
//	 * @param g2d the graphics object to draw on
//	 */
//	private void drawUnrotatedRect(Graphics2D g2d) {
//		int rectWidth = 200;
//		int rectHeight = 150;
//		// Modify the (rectLocX, rectLocY) so that drawing will be centered at frame's (0, 0)
//		int rectLocX = -(rectWidth / 2);
//		int rectLocY = -(rectHeight / 2);
//		Color incomingColor = g2d.getColor();
//		g2d.setColor(Color.PINK);
//		g2d.drawRect(rectLocX, rectLocY, rectWidth, rectHeight);
//		// Reset g2d's color back to its original incoming color
//		g2d.setColor(incomingColor);
//	} // drawUnrotatedRect
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: Draws the face on g2d
//	 * @param g2d the graphics object to draw on
//	 * @param faceLocX
//	 * @param faceLocY
//	 * @param faceWidth
//	 * @param faceHeight
//	 */
//	private void drawCenteredFace(Graphics2D g2d, int faceLocX, int faceLocY, int faceWidth, int faceHeight) {
//		g2d.drawRect(faceLocX, faceLocY, faceWidth, faceHeight);
//	} // drawCenteredFace
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: face's left eye is drawn on g2d w.r.t. faceLocX and faceLocY
//	 * @param g2d the graphics object to draw on
//	 * @param faceLocX
//	 * @param faceLocY
//	 */
//	private void drawLeftEye(Graphics2D g2d, int faceLocX, int faceLocY) {
//		int eyeWidth = 50;
//		int eyeHeight = 50;
//		int leftEyeLocX = (faceLocX + 20);
//		int leftEyeLocY = (faceLocY + 20);
//		g2d.drawRect(leftEyeLocX, leftEyeLocY, eyeWidth, eyeHeight);
//	} // drawLeftEye
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: face's right eye is drawn on g2d w.r.t. faceLocX and faceLocY
//	 * @param g2d the graphics object to draw on
//	 * @param faceLocX
//	 * @param faceLocY
//	 */
//	private void drawRightEye(Graphics2D g2d, int faceLocX, int faceLocY) {
//		int eyeWidth = 50;
//		int eyeHeight = 50;
//		int rightEyeLocX = (faceLocX + 130);
//		int rightEyeLocY = (faceLocY + 20);
//		g2d.drawRect(rightEyeLocX, rightEyeLocY, eyeWidth, eyeHeight);
//	} // drawRightEye
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: face's nose is drawn on g2d w.r.t. faceLocX and faceLocY
//	 * @param g2d g2d the graphics object to draw on
//	 * @param faceLocX
//	 * @param faceLocY
//	 */
//	private void drawNose(Graphics2D g2d, int faceLocX, int faceLocY) {
//		int noseWidth = 40;
//		int noseHeight = 50;
//		int noseLocX = (faceLocX + 80);
//		int noseLocY = (faceLocY + 50);
//		g2d.drawRect(noseLocX, noseLocY, noseWidth, noseHeight);
//	} // drawNose
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: calls all the draw operations to get the face drawn when invoked by Java Swing
//	 * @param g treats 'g' as a Graphics2D
//	 */
//	@Override
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		Graphics2D g2d = (Graphics2D) g;
//
//		g2d.translate(300,275);
//		this.drawUnrotatedRect(g2d);
//
//		double degreesToRotate = 30;
//		g2d.rotate(Math.toRadians(degreesToRotate));
//
//		int faceWidth = 200;
//		int faceHeight = 150;
//		// Apply centering algorithm to get correct faceLocX and faceLocY
//		int faceLocX = -(faceWidth / 2);
//		int faceLocY = -(faceHeight / 2);
//
//		this.drawCenteredFace(g2d, faceLocX, faceLocY, faceWidth, faceHeight);
//		this.drawLeftEye(g2d, faceLocX, faceLocY);
//		this.drawRightEye(g2d, faceLocX, faceLocY);
//		this.drawNose(g2d, faceLocX, faceLocY);
//
//		g2d.rotate(-Math.toRadians(degreesToRotate));
//		g2d.translate(-300, -275);
//	} // paintComponent
//
//} // end class RotateComponent
