package hourTimer;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JComponent;

/**
 * Component on which to display HourTimer instances.
 *
 */
public class HourTimerComponent extends JComponent {
	private static final long serialVersionUID = 1L;
	
	//
	// ****************************************************************************************
	//
	
	/**
	 * ensures: Draws guide lines to make the geometry more obvious
	 *
	 * @param g2d the graphics object to draw on
	 */
	private void drawGuideLines(Graphics2D g2d){
		int componentWidth = this.getWidth();
		int componentHeight = this.getHeight();
		int middleLocX = (componentWidth / 2);
		int middleLocY = (componentHeight / 2);
		float dashLength[] = {10.0f};
		
	    BasicStroke dashed = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dashLength, 0.0f);
	    Stroke incomingStroke = g2d.getStroke();
	    g2d.setStroke(dashed);
		g2d.drawLine(0, middleLocY, componentWidth, middleLocY); // draw horizontal axis
		g2d.drawLine(middleLocX, 0, middleLocX, componentHeight); // draw vertical axis
		g2d.setStroke(incomingStroke);
	} // drawGuideLines

	//
	// ****************************************************************************************
	//

	/**
	 * ensures: calls all the drawOn operations when called by Java Swing
	 * @param g treats 'g' as a Graphics2D
	 */
	@Override
	protected void paintComponent(Graphics g) {		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		//make things look slightly prettier
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		this.drawGuideLines(g2d);

		// =======
		// Stage #1
		// The following 2 lines creates an HourTimer object
		// Go to HourTimer.java, find Stage #1.1, #1.2, and #1.3 and follow its instructions
		// =======
		HourTimer bigClock = new HourTimer();
		bigClock.drawOn(g2d);
		
		

		// =======
		// Stage #2
		// Uncomment this code (just below) when you're ready to start part 2
		// You will have to implement a 3-parameter constructor for the class HourTimer
		// Go to HourTimer.java and find the Stage #2.1
		// =======
	/*
		final int clockRadius = 50;
		final int maxClockCenterX = 600;
		final int clockCenterInc = 100;
		int startingClockCenterX = 350;
		int clockCenterY = 50;
		
		for(int clockCenterX = startingClockCenterX; clockCenterX < maxClockCenterX; clockCenterX += clockCenterInc) {
			HourTimer upperRightClock = new HourTimer(clockCenterX, clockCenterY, clockRadius);
			upperRightClock.drawOn(g2d);
		} // end for
		//draw a 20x20 clock in the upper left hand corner
		
		HourTimer upperLeftClock = new HourTimer(10, 10, 10);
		upperLeftClock.drawOn(g2d);
		
	*/
		

		// =======
		// Stage #3
		// Uncomment this code (just below) when you're ready to start part 3
		// You will have to implement the setTime method for the class HourTimer
		// Go to HourTimer.java and find the Stage #3.1
		// =======		
	/* 
		 
		final int addTenMinutes = 10;
		int clockTimeInMinutes = 0;
		clockCenterY = 550;
		startingClockCenterX = 50;
		for(int clockCenterX = startingClockCenterX; clockCenterX < maxClockCenterX; clockCenterX += clockCenterInc) {
			HourTimer lowerClock = new HourTimer(clockCenterX, clockCenterY, clockRadius);
			lowerClock.setTime(clockTimeInMinutes);
			lowerClock.drawOn(g2d);
			clockTimeInMinutes += addTenMinutes;
		} // end for
		
	*/
		
		// =======
		// Stage #4
		// Use procedural abstraction to make this paintComponent operation shorter
		// 
		// Here's how:
		// 1) In this class, create 2 private operations with empty code bodies
		//    private void doStage2(Graphics2D g2d)
		//    private void doStage3(Graphics2D g2d)
		//
		// 2) Cut and paste the code above for Stage #2 into doStage2 code body
		// 3) Where you cut Stage #2's code from (above) replace it with the call: this.doStage2(g2d);
		//
		// 4) Cut and paste the code above for Stage #3 into doStage3 code body
		// 5) Where you cut Stage #3's code from (above) replace it with the call: this.doStage3(g2d);
		//
		// 6) Enjoy the experience of making your code more easy to read and more elegant
		// =======

	} // paintComponent



	
}
